/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.RegistroEstacionamiento;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class ListaRegistroEstacionamiento extends ControladorGenerico<RegistroEstacionamiento> implements Serializable{
    
    public List<RegistroEstacionamiento> buscarPorID(int id) {
        return getListado().stream().filter(c -> c.getId() == id).collect(Collectors.toList());
    }
    
    public List<RegistroEstacionamiento> buscarPorPlacaVehiculo(String placa) {
        return getListado().stream().filter(c -> c.getVehiculo().getPlaca().equals(placa)).collect(Collectors.toList());
    }
    
    public int generarId() {
        if(getListado().size() > 0) {
            return getListado().get(getListado().size() -1 ).getId() + 1;
        }
        return 1;
    }
    
    public List<RegistroEstacionamiento> getRegistrosActivos() {
        return getListado().stream().filter(c -> c.getEstado().equals("En el Parqueadero")).collect(Collectors.toList());
    }
    
    public RegistroEstacionamiento obtenerRegistroEscogido(String placa) {
        for (RegistroEstacionamiento registro : getRegistrosActivos()) {
            if (registro.getVehiculo().getPlaca().equals(placa)) {
                return registro;
            }
        }
        return null;
    }
        
}
