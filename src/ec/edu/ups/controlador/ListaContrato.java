/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contrato;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ListaContrato extends ControladorGenerico<Contrato> {
    
    public List<Contrato> buscarPorNombreCliente(String nombre) {
        return getListado().stream().filter(c -> c.getCliente().getNombre().equals(nombre)).collect(Collectors.toList());
    }
    
    public List<Contrato> buscarPorCedulaCliente(String cedula) {
        return getListado().stream().filter(c -> c.getCliente().getCedula().equals(cedula)).collect(Collectors.toList());
    }
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }
    
}
