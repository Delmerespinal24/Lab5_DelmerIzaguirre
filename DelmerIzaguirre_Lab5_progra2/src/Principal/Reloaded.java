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
public class Reloaded extends Baleada{
    
    private int precio = 55;
    private ArrayList<String> ingredientes;
    
    public Reloaded() {
        super();
        ingredientes = super.Ingredientes();
        ingredientes.add("Mantequilla");
        ingredientes.add("Frifoles");
        ingredientes.add("Huevo");
        ingredientes.add("Platano");
    }

    public int getPrecio() {
        return precio;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
    
    
    
    @Override
    public String toString() {
        return "Baleada reloaded";
    }
}
