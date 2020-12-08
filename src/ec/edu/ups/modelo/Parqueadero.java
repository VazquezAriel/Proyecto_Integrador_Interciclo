/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorGenerico;

/**
 *
 * @author ariel
 */
public class Parqueadero {
    
    private int id;
    private String direccion;
    private double costoPorHora;
    private int totalEspacios;
    private int espaciosDisponibles;
    private ControladorGenerico<Contrato> contratos;
    private ControladorGenerico<RegistroEstacionamiento> registroEstacionamientos;
    private ControladorGenerico<Factura> facturas;

    public Parqueadero() {
    }

    public Parqueadero(int id, String direccion, double costoPorHora, int totalEspacios) {
        this.id = id;
        this.direccion = direccion;
        this.costoPorHora = costoPorHora;
        this.totalEspacios = totalEspacios;
        this.espaciosDisponibles = 0;
        this.contratos = new ControladorGenerico<>() ;
        this.registroEstacionamientos = new ControladorGenerico<>();
        this.facturas = new ControladorGenerico<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ControladorGenerico<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ControladorGenerico<Contrato> contratos) {
        this.contratos = contratos;
    }

    public ControladorGenerico<RegistroEstacionamiento> getRegistroEstacionamientos() {
        return registroEstacionamientos;
    }

    public void setRegistroEstacionamientos(ControladorGenerico<RegistroEstacionamiento> registroEstacionamientos) {
        this.registroEstacionamientos = registroEstacionamientos;
    }

    public ControladorGenerico<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ControladorGenerico<Factura> facturas) {
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
}
