/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Parqueadero;
import ec.edu.ups.modelo.Usuario;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ControladorUsuario extends ControladorGenerico<Usuario> {

    private Usuario usuarioLogueado;

    public boolean validarUsuario(String usuario, String contraseña) {

        for (Usuario u : getListado()) {
            if (u.getUsuario().equals(usuario) && u.getContraseña().equals(contraseña)) {
                this.usuarioLogueado = u;
                return true;
            }
        }
        return false;
    }

    public int generarId() {
        if (getListado().size() > 0) {
            return getListado().get(getListado().size() - 1).getId() + 1;
        }
        return 1;
    }

    public Usuario getUsuarioLogeado() {
        return usuarioLogueado;
    }

    public void setUsuarioLogueado(Usuario usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
    }

    public List<Usuario> buscarPorParqueadero(Parqueadero parqueadero) {
        return getListado().stream().filter(p -> p.getParqueadero().equals(parqueadero)).collect(Collectors.toList());
    }

    public List<Usuario> buscarPorNombre(String nombre) {
        return getListado().stream().filter(p -> p.getNombre().equals(nombre)).collect(Collectors.toList());
    }

    public List<Usuario> buscarPorApellido(String apellido) {
        return getListado().stream().filter(p -> p.getApellido().equals(apellido)).collect(Collectors.toList());
    }
}
