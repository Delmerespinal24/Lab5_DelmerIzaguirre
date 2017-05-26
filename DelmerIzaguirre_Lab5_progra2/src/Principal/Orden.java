/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Date;

/**
 *
 * @author Owner
 */
public class Orden {
    private Cliente cliente;
    private Baleada baleada;
    private int NumeroOrden;
    private Date fecha;

    public Orden(Cliente cliente, Baleada baleada, int NumeroOrden, Date fecha) {
        this.cliente = cliente;
        this.baleada = baleada;
        this.NumeroOrden = NumeroOrden;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Baleada getBaleada() {
        return baleada;
    }

    public void setBaleada(Baleada baleada) {
        this.baleada = baleada;
    }

    public int getNumeroOrden() {
        return NumeroOrden;
    }

    public void setNumeroOrden(int NumeroOrden) {
        this.NumeroOrden = NumeroOrden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return baleada.toString();
    }
    
    
}
