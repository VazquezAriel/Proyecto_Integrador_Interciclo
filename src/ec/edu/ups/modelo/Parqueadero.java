/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ariel
 */
public class Parqueadero implements Serializable{
    
    private int id;
    private String nombre;
    private String direccion;
    private double costoPorHora;
    private int totalEspacios;
    private int espaciosDisponibles;
    private List<Contrato> contratos;
    private List<RegistroEstacionamiento> registroEstacionamientos;
    private List<Factura> facturas;

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

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(List<Contrato> contratos) {
        this.contratos = contratos;
    }

    public List<RegistroEstacionamiento> getRegistroEstacionamientos() {
        return registroEstacionamientos;
    }

    public void setRegistroEstacionamientos(List<RegistroEstacionamiento> registroEstacionamientos) {
        this.registroEstacionamientos = registroEstacionamientos;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
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
    
    
}
