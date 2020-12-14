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
public class Factura implements Serializable{
    
    private int id;
    private Cliente cliente;
    private double descuento;
    private LocalDate fecha;
    private double costoTotal;

    public Factura() {
    }

    public Factura(int id, Cliente cliente, double descuento, LocalDate fecha, double costoTotal) {
        this.id = id;
        this.cliente = cliente;
        this.descuento = descuento;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
}
