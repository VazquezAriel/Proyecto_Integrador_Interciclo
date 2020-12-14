/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ListaContrato;
import ec.edu.ups.controlador.ListaFacturas;
import ec.edu.ups.controlador.ListaRegistroEstacionamiento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ariel
 */
public class Parqueadero implements Serializable {

    private int id;
    private String nombre;
    private String direccion;
    private double costoPorHora;
    private int totalEspacios;
    private int espaciosDisponibles;
    private ListaContrato contratos;
    private ListaRegistroEstacionamiento registros;
    private ListaFacturas facturas;
    private List<Estacionamiento> estacionamientos;

    public Parqueadero() {
    }

    public Parqueadero(int id) {
        this.id = id;
    }

    public Parqueadero(int id, String nombre, String direccion, double costoPorHora, int totalEspacios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.costoPorHora = costoPorHora;
        this.totalEspacios = totalEspacios;
        this.estacionamientos = new ArrayList<>();
        this.contratos = new ListaContrato();
        this.registros = new ListaRegistroEstacionamiento();
        this.facturas = new ListaFacturas();

        for (int i = 0; i < totalEspacios; i++) {
            estacionamientos.add(new Estacionamiento(i + 1));
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public int getTotalEspacios() {
        return totalEspacios;
    }

    public void setTotalEspacios(int totalEspacios) {
        this.totalEspacios = totalEspacios;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public ListaContrato getContratos() {
        return contratos;
    }

    public ListaRegistroEstacionamiento getRegistros() {
        return registros;
    }

    public ListaFacturas getFacturas() {
        return facturas;
    }

    public List<Estacionamiento> getEstacionamientos() {
        return estacionamientos;
    }

    public void setEstacionamientos(List<Estacionamiento> estacionamientos) {
        this.estacionamientos = estacionamientos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Parqueadero other = (Parqueadero) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void agregarEstacionamiento() {
        if (!estacionamientos.isEmpty()) {
            estacionamientos.add(new Estacionamiento(estacionamientos.get(estacionamientos.size() - 1).getNumero() + 1));
        } else {
            estacionamientos.add(new Estacionamiento(1));
        }
        totalEspacios++;
    }

    public boolean eliminarEstacionamiento(Estacionamiento estacionamiento) {
        if (estacionamiento.getEstado().equals("Ocupado") || estacionamiento.getEstado().equals("Rentado")) {
            return false;
        } else {
            estacionamientos.remove(estacionamiento);
            totalEspacios--;
            return true;
        }

    }

    public Estacionamiento buscarEstacionamiento(String nombre) {
        return estacionamientos.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public boolean actualizarEstacionamiento(Estacionamiento estacionamiento) {
        if (estacionamientos.contains(estacionamiento)) {
            estacionamientos.set(estacionamientos.indexOf(estacionamiento), estacionamiento);
        }
        return false;
    }

    public List<Estacionamiento> getEstacionamientosDisponibles() {
        return estacionamientos.stream().filter(e -> e.getEstado().equals("Disponible")).collect(Collectors.toList());
    }

    public long numeroDeVehiculosEstacionados() {
        return estacionamientos.stream().filter(estacionamiento -> (estacionamiento.getVehiculo() != null)).filter(estacionamiento -> (estacionamiento.getVehiculo().getTipo().equals("Vehiculo"))).count();

    }

    public long numeroDeMotocicletasEstacionadas() {
        return estacionamientos.stream().filter(estacionamiento -> (estacionamiento.getVehiculo() != null)).filter(estacionamiento -> (estacionamiento.getVehiculo().getTipo().equals("Motocicleta"))).count();
    }
}
