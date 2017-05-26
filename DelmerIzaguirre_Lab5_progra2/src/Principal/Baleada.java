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
public abstract class Baleada {

    DefaultMutableTreeNode Ingredientes = new DefaultMutableTreeNode("Ingredientes");

    public Baleada() {
       
    }
    

    public DefaultMutableTreeNode  Ingredientes() {
        DefaultMutableTreeNode T = new DefaultMutableTreeNode("Tortillas");
        Ingredientes.add(T);
        return Ingredientes;
    }
   
    
    @Override
    public abstract String toString();

    public abstract DefaultMutableTreeNode getIngredientes();
    public abstract int getPrecio();
}
