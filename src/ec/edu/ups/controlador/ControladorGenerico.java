/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel
 */
public class ControladorGenerico<T> implements Serializable{
    
    private List<T> listado;

    public ControladorGenerico(){
        listado = new ArrayList<T>();
    }
    
    public void cargarDatos(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream archivo = new FileInputStream(ruta);
        ObjectInputStream datos = new ObjectInputStream(archivo);
        listado = (List<T>) datos.readObject();
    }

    public void guardarDatos(String ruta) throws FileNotFoundException, IOException {
        FileOutputStream archivo = new FileOutputStream(ruta);
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(listado);
    }

    public boolean crear(T objeto) {
        return listado.add(objeto);
    }

    public T buscar(T objetoBuscado) {
        return listado.stream().filter(objeto -> objeto.equals(objetoBuscado)).findFirst().orElse(null);
    }

    public boolean actualizar(T objetoActalizado) {
        if (listado.contains(objetoActalizado)) {
            listado.set(listado.indexOf(objetoActalizado), objetoActalizado);
        }
        return false;
    }

    public boolean eliminar(T objeto) {
        return listado.remove(objeto);
    }

    public List<T> getListado() {
        return listado;
    }

    public void setListado(List<T> listado) {
        this.listado = listado;
    }
    
}
