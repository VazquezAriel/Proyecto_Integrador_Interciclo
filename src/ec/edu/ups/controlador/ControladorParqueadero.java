/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Parqueadero;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ControladorParqueadero extends ControladorGenerico<Parqueadero>{

    private Parqueadero parqueaderoActual;
    
    public List<Parqueadero> buscarPorNombre(String nombre) {
        return getListado().stream().filter(p -> p.getNombre().equals(nombre)).collect(Collectors.toList());
    }
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }

    public Parqueadero getParqueaderoActual() {
        return parqueaderoActual;
    }

    public void setParqueaderoActual(Parqueadero parqueaderoActual) {
        this.parqueaderoActual = parqueaderoActual;
    }
    
}
