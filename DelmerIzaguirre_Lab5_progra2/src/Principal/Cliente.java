package Principal;

import java.util.*;

public class Cliente { 

    private String Nombre;
    private int Telefono;
    private Double Efectivo;
    private String Direccion;

    public Cliente() { 
    }

    public Cliente( String Nombre,  int Telefono,  Double Efectivo, String Direccion  ){
        this.Nombre=Nombre; 
        this.Telefono=Telefono; 
        this.Efectivo=Efectivo; 
        this.Direccion=Direccion; 
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(Double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return Nombre;
    }

   

}
