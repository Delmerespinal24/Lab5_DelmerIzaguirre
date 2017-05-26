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
public class Especiales extends Baleada{

    private DefaultMutableTreeNode ingredientes;
    private int precio = 35;
    
    
    public Especiales() {
        super();
        ingredientes = super.Ingredientes();
        DefaultMutableTreeNode M = new DefaultMutableTreeNode("Mantequilla");
        DefaultMutableTreeNode F = new DefaultMutableTreeNode("Frijoles");
        DefaultMutableTreeNode H = new DefaultMutableTreeNode("Huevo");
        ingredientes.add(M);
        ingredientes.add(F);
        ingredientes.add(H);
        
        
    }

    public int getPrecio() {
        return precio;
    }

    public DefaultMutableTreeNode getIngredientes() {
        return ingredientes;
    }
    
    
    
    
    
     @Override
    public String toString() {
        return "Baleada especial";
    }
    
}
