/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Administrador;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ariel
 */
public class ControladorAdmin {

    private Administrador administrador ;

    private ControladorAdmin() {
    }

    public static ControladorAdmin getInstance() {
        return AdministradorHolder.INSTANCE;
    }

    private static class AdministradorHolder {

        private static final ControladorAdmin INSTANCE = new ControladorAdmin();
    }

    public void cargarDatos(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        administrador = (Administrador) datos.readObject();
        if (administrador == null) {
            administrador = new Administrador("admin", "admin", "admin");
        }
    }

    public void guardarDatos(String ruta) throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(administrador);
    }

    public boolean validarAdministrador(String usuario, String contraseña) {
        return (administrador.getUsuario().equals(usuario) && administrador.getContraseña().equals(contraseña));
    }

    public Administrador getAdministrador() {
        return administrador;
    }
    
    public void ActualizarDatos(String usuario, String contraseña, String nombre) {
        administrador.setUsuario(usuario);
        administrador.setContraseña(contraseña);
        administrador.setNombre(nombre);
    }

}
