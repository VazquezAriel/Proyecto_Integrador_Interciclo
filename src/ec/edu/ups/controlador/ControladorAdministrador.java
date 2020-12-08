/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Administrador;

/**
 *
 * @author ariel
 */
public class ControladorAdministrador extends ControladorGenerico<Administrador>{
    
    private Administrador administradorLogeado;
    
    public boolean validarAdministrador(String usuario, String contraseña) {
        
        for (Administrador administrador : getListado()) {
            if (administrador.getUsuario().equals(usuario) && administrador.getContraseña().equals(contraseña)) {
                this.administradorLogeado = administrador;
                return true;
            }
        }
        return false;
    }

    public Administrador getAdministradorLogeado() {
        return administradorLogeado;
    }
    
}
