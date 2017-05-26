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
public class Binarias extends Baleada{
    private ArrayList<String> ingredientes;
    private int precio = 22;
    
    public Binarias() {
        super();
        ingredientes = super.Ingredientes();
        ingredientes.add("Mantequilla");
        ingredientes.add("Frifoles");
        
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }
    

    public int getPrecio() {
        return precio;
    }
    
    
    @Override
    public String toString() {
        return "Baleada Binaria";
    }
    
}
