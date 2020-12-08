/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Contrato {
    
    private int id;
    private Vehiculo vehiculo;
    private int duracionEnDias;
    private LocalDate inicioContrato;
    private LocalDate finContrato;

    public Contrato() {
    }

    public Contrato(int id, Vehiculo vehiculo, int duracionEnDias, LocalDate inicioContrato, LocalDate finContrato) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.duracionEnDias = duracionEnDias;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDuracionEnDias() {
        return duracionEnDias;
    }

    public void setDuracionEnDias(int duracionEnDias) {
        this.duracionEnDias = duracionEnDias;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(LocalDate inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public LocalDate getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(LocalDate finContrato) {
        this.finContrato = finContrato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
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
        final Contrato other = (Contrato) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
