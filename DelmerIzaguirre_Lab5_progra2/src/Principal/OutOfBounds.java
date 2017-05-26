/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Owner
 */
public class OutOfBounds extends Baleada{
    
    private DefaultMutableTreeNode ingredientes;
    private int precio = 85;
    
    public OutOfBounds() {
        super();
        ingredientes = super.Ingredientes();
        DefaultMutableTreeNode M = new DefaultMutableTreeNode("Mantequilla");
        DefaultMutableTreeNode F = new DefaultMutableTreeNode("Frijoles");
        DefaultMutableTreeNode H = new DefaultMutableTreeNode("Huevo");
        DefaultMutableTreeNode P = new DefaultMutableTreeNode("Platano");
        DefaultMutableTreeNode C = new DefaultMutableTreeNode("Chorizo");
        ingredientes.add(M);
        ingredientes.add(F);
        ingredientes.add(H);
        ingredientes.add(P);
        ingredientes.add(C);
    
        
 
        
    }

    public DefaultMutableTreeNode getIngredientes() {
        return ingredientes;
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
