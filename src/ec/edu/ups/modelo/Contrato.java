/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Contrato implements Serializable {

    private int id;
    private Cliente cliente;
    private int duracionEnDias;
    private double descuento;
    private double costoTotal;
    private LocalDate inicioContrato;
    private LocalDate finContrato;
    private Estacionamiento estacionamiento;
    private boolean facturado;

    public Contrato() {
    }

    public Contrato(int id) {
        this.id = id;
    }

    public Contrato(int id, Cliente cliente, int duracionEnDias, double descuento, double costoTotal, LocalDate inicioContrato, LocalDate finContrato, Estacionamiento estacionamiento) {
        this.id = id;
        this.cliente = cliente;
        this.duracionEnDias = duracionEnDias;
        this.descuento = descuento;
        this.costoTotal = costoTotal;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
        this.estacionamiento = estacionamiento;
        this.facturado = false;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public boolean isFacturado() {
        return facturado;
    }

    public void setFacturado(boolean facturado) {
        this.facturado = facturado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
