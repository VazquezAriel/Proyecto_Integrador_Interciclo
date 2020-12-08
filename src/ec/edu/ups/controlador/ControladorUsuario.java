/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;

/**
 *
 * @author ariel
 */
public class ControladorUsuario extends ControladorGenerico<Usuario>{
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

    public Usuario getUsuarioLogeado() {
        return usuarioLogueado;
    }
}
