/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.RegistroEstacionamiento;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ListaRegistroEstacionamiento extends ControladorGenerico<RegistroEstacionamiento>{
    
    public List<RegistroEstacionamiento> buscarPorID(int id) {
        return getListado().stream().filter(c -> c.getId() == id).collect(Collectors.toList());
    }
    
    public List<RegistroEstacionamiento> buscarPorPlacaVehiculo(String placa) {
        return getListado().stream().filter(c -> c.getVehiculo().getPlaca().equals(placa)).collect(Collectors.toList());
    }
    
}
