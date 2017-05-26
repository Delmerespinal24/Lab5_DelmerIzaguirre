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
public class Binarias extends Baleada{
    private DefaultMutableTreeNode ingredientes;
    private int precio = 22;
    
    public Binarias() {
        super();
        ingredientes = super.Ingredientes();
        DefaultMutableTreeNode M = new DefaultMutableTreeNode("Mantequilla");
        DefaultMutableTreeNode F = new DefaultMutableTreeNode("Frijoles");
        ingredientes.add(M);
        ingredientes.add(F);
        
    }

    public DefaultMutableTreeNode getIngredientes() {
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
