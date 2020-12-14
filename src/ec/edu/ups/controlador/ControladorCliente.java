/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ControladorCliente extends ControladorGenerico<Cliente>{
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }
    
    public List<Cliente> buscarPorCedula(String cedula) {
        return getListado().stream().filter(p -> p.getCedula().equals(cedula)).collect(Collectors.toList());
    }
    
    public List<Cliente> buscarPorNombre(String nombre) {
        return getListado().stream().filter(p -> p.getNombre().equals(nombre)).collect(Collectors.toList());
    }
    
    public List<Cliente> buscarPorApellido(String apellido) {
        return getListado().stream().filter(p -> p.getApellido().equals(apellido)).collect(Collectors.toList());
    }
    
    public Cliente obtenerCliente(String cedula) {
        for (Cliente cliente : getListado()) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }
}
