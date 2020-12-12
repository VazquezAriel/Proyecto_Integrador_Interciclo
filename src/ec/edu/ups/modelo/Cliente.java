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
public class Cliente extends Persona{
    
    private String cedula;

    public Cliente() {
    }

    public Cliente(int id) {
        super(id);
    }

    public Cliente(String cedula, int id, String nombre, String apellido, String direccion, String telefono, String email) {
        super(id, nombre, apellido, direccion, telefono, email);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
