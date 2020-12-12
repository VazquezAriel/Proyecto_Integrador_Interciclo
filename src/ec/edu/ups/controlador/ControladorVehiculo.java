/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Vehiculo;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ControladorVehiculo extends ControladorGenerico<Vehiculo> {
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }
    
    public List<Vehiculo> buscarPorPlaca(String placa) {
        return getListado().stream().filter(v -> v.getPlaca().equals(placa)).collect(Collectors.toList());
    }
    
    public List<Vehiculo> buscarPorColor(String color) {
        return getListado().stream().filter(v -> v.getColor().equals(color)).collect(Collectors.toList());
    }
}
