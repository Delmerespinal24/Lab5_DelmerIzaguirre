/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class OutOfBounds extends Baleada{
    
    private ArrayList<String> ingredientes;
    private int precio = 85;
    
    public OutOfBounds() {
        super();
        ingredientes = super.Ingredientes();
        ingredientes.add("Mantequilla");
        ingredientes.add("Frifoles");
        ingredientes.add("Huevo");
        ingredientes.add("Platano");
        ingredientes.add("Chorizo");
        
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
     @Override
    public String toString() {
        return "Baleada OutOfBounds";
    }
    
}
