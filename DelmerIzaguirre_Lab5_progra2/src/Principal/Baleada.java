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
public abstract class Baleada {

    ArrayList<String> Ingredientes = new ArrayList<String>();

    public Baleada() {
       
    }
    

    public ArrayList<String> Ingredientes() {
        Ingredientes.add("Tortillas");
        return Ingredientes;
    }
   
    
    @Override
    public abstract String toString();

    public abstract ArrayList<String> getIngredientes();
    public abstract int getPrecio();
}
