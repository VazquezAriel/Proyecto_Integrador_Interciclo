/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorGenerico;

/**
 *
 * @author ariel
 */
public class Administrador extends Persona{
    
    private String usuario;
    private String contraseña;
    private ControladorGenerico<Parqueadero> parqueaderos;
    private ControladorGenerico<Usuario> trabajadores;

    public Administrador() {
    }

    public Administrador(String usuario, String contraseña, int id, String nombre, String apellido, String direccion, String telefono, String email) {
        super(id, nombre, apellido, direccion, telefono, email);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.parqueaderos = new ControladorGenerico<>();
        this.trabajadores = new ControladorGenerico<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ControladorGenerico<Parqueadero> getParqueaderos() {
        return parqueaderos;
    }

    public void setParqueaderos(ControladorGenerico<Parqueadero> parqueaderos) {
        this.parqueaderos = parqueaderos;
    }

    public ControladorGenerico<Usuario> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ControladorGenerico<Usuario> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
}
