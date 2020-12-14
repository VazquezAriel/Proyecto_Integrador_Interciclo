/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 *
 * @author ariel
 */
public class Vehiculo implements Serializable{
    
    private int id;
    private String placa;
    private String color;
    private String tipo;
    private boolean parqueado;

    public Vehiculo(int id) {
        this.id = id;
    }

    public Vehiculo(int id, String placa, String color, String tipo) {
        this.id = id;
        this.placa = placa;
        this.color = color;
        this.tipo = tipo;
        this.parqueado = false;
    }

    public boolean isParqueado() {
        return parqueado;
    }

    public void setParqueado(boolean parqueado) {
        this.parqueado = parqueado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
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
        final Vehiculo other = (Vehiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
