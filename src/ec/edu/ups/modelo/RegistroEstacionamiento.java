/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.time.LocalTime;

/**
 *
 * @author ariel
 */
public class RegistroEstacionamiento {
    
    private int id;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private Vehiculo vehiculo;
    private String estado;
    private double costoTotal;

    public RegistroEstacionamiento() {
    }

    public RegistroEstacionamiento(LocalTime horaEntrada, LocalTime horaSalida, Vehiculo vehiculo, String estado, double costoTotal) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.vehiculo = vehiculo;
        this.estado = estado;
        this.costoTotal = costoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final RegistroEstacionamiento other = (RegistroEstacionamiento) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
}
    
    
    
