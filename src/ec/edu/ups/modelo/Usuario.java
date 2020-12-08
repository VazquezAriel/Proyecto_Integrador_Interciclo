/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ariel
 */
public class Usuario extends Persona{
    
    private String usuario;
    private String contraseña;
    private Parqueadero parqueadero;

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, Parqueadero parqueadero, int id, String nombre, String apellido, String direccion, String telefono, String email) {
        super(id, nombre, apellido, direccion, telefono, email);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.parqueadero = parqueadero;
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

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

}
