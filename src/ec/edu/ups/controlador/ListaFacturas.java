/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ListaFacturas extends ControladorGenerico<Factura> implements Serializable{
    
    public List<Factura> buscarPorID(int id) {
        return getListado().stream().filter(f -> f.getId() == id).collect(Collectors.toList());
    }
    
    public List<Factura> buscarPorNombreCliente(String nombre) {
        return getListado().stream().filter(f -> f.getCliente().getNombre().equals(nombre)).collect(Collectors.toList());
    }
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }
    
    public List<Factura> desdeHasta(LocalDate fechaInicio, LocalDate fechaFin) {
        return new ArrayList<>();
    }
    
}
