/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ListaFacturas extends ControladorGenerico<Factura>{
    
    public List<Factura> buscarPorID(int id) {
        return getListado().stream().filter(f -> f.getId() == id).collect(Collectors.toList());
    }
    
    public List<Factura> buscarPorNombreCliente(String nombre) {
        return getListado().stream().filter(f -> f.getCliente().getNombre().equals(nombre)).collect(Collectors.toList());
    }
    
}
