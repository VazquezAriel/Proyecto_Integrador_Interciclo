/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ariel
 */
public class Estacionamiento implements Serializable{
    
    private String nombre;
    private int numero;
    private String estado;
    private Vehiculo vehiculo;
    private int cantidadParqueos;
    private double dineroGenerado;

    public Estacionamiento(String nombre) {
        this.nombre = nombre;
    }

    public Estacionamiento(int numero) {
        this.numero = numero;
        this.nombre = "P" + numero;
        this.estado = "Disponible";
        this.cantidadParqueos = 0;
        this.dineroGenerado = 0.0;
        this.vehiculo = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadParqueos() {
        return cantidadParqueos;
    }

    public void setCantidadParqueos(int cantidadParqueos) {
        this.cantidadParqueos = cantidadParqueos;
    }

    public double getDineroGenerado() {
        return dineroGenerado;
    }

    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }
    
    public void aumentarDineroGenerado(double dinero) {
        this.dineroGenerado += dinero;
    }
    
    public void aumentarCantidadParqueos() {
        this.cantidadParqueos++;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Estacionamiento other = (Estacionamiento) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
