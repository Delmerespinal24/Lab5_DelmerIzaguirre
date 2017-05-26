/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Owner
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_cliente = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_nombre = new javax.swing.JTextField();
        t_telefono = new javax.swing.JTextField();
        t_efectivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_direccion = new javax.swing.JTextArea();
        agregar = new javax.swing.JButton();
        menu_ordenes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_clientes = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        num_orden = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_baleada = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_empresa = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        nueva_orden = new javax.swing.JMenuItem();
        nuevo_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        menu_cliente.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Numero de telefono");

        jLabel3.setText("Efectivo");

        jLabel4.setText("Direccion");

        t_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_nombreKeyTyped(evt);
            }
        });

        t_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_telefonoKeyTyped(evt);
            }
        });

        t_efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_efectivoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Agregar un cliente");

        ta_direccion.setColumns(20);
        ta_direccion.setRows(5);
        jScrollPane1.setViewportView(ta_direccion);

        agregar.setText("Agregar Cliente");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_clienteLayout = new javax.swing.GroupLayout(menu_cliente.getContentPane());
        menu_cliente.getContentPane().setLayout(menu_clienteLayout);
        menu_clienteLayout.setHorizontalGroup(
            menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_clienteLayout.createSequentialGroup()
                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_clienteLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5))
                    .addGroup(menu_clienteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar)
                            .addGroup(menu_clienteLayout.createSequentialGroup()
                                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(t_telefono)
                                        .addComponent(t_efectivo))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        menu_clienteLayout.setVerticalGroup(
            menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_clienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(44, 44, 44)
                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(menu_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jl_clientes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_clientes);

        jButton1.setText("Agregar orden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Seleccione el cliente");

        num_orden.setEditable(false);
        num_orden.setText("7");

        jLabel7.setText("Numero de orden: ");

        cb_baleada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baleada binarias", "Baleada especiales", "Baleada reloaded", "Baleada OutOfBounds" }));

        javax.swing.GroupLayout menu_ordenesLayout = new javax.swing.GroupLayout(menu_ordenes.getContentPane());
        menu_ordenes.getContentPane().setLayout(menu_ordenesLayout);
        menu_ordenesLayout.setHorizontalGroup(
            menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_ordenesLayout.createSequentialGroup()
                .addGroup(menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_ordenesLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(num_orden, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_ordenesLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6))
                    .addGroup(menu_ordenesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_baleada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menu_ordenesLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        menu_ordenesLayout.setVerticalGroup(
            menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_ordenesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGroup(menu_ordenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_ordenesLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cb_baleada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_ordenesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Clientes");
        jt_empresa.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(jt_empresa);

        jButton2.setText("Terminada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Lista de lavaplatos");

        jList1.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jList1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Baleadas Binarias");

        jMenu3.setText("Inicio");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nueva_orden.setText("Nueva Orden");
        nueva_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueva_ordenActionPerformed(evt);
            }
        });
        jMenu3.add(nueva_orden);

        nuevo_cliente.setText("Nuevo Cliente");
        nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(nuevo_cliente);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Otros");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addGap(66, 66, 66)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel9)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nueva_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_ordenActionPerformed
        // TODO add your handling code here:

        if (menu_cliente.getComponentCount() > 0);
        menu_ordenes.setModal(true);
        menu_ordenes.pack();
        menu_ordenes.setLocationRelativeTo(this);
        menu_ordenes.setVisible(true);
        num_orden.setText("" + orden);


    }//GEN-LAST:event_nueva_ordenActionPerformed

    private void t_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_nombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c > ' ' || c < ' ')) {
            evt.consume();
        }
    }//GEN-LAST:event_t_nombreKeyTyped

    private void t_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_telefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_t_telefonoKeyTyped

    private void t_efectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_efectivoKeyTyped
        // TODO add your handling code here:
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_t_efectivoKeyTyped

    private void nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_clienteActionPerformed
        // TODO add your handling code here:
        menu_cliente.setModal(true);
        menu_cliente.pack();
        menu_cliente.setLocationRelativeTo(this);
        menu_cliente.setVisible(true);

    }//GEN-LAST:event_nuevo_clienteActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:

        if (t_nombre.getText().equals("") || t_telefono.getText().equals("") || t_efectivo.getText().equals("") || ta_direccion.getText().equals("")) {

            JOptionPane.showMessageDialog(menu_cliente, "Debe llenar los campos");
        } else {

            String nombre = t_nombre.getText();
            int telefono = Integer.parseInt(t_telefono.getText());
            double efectivo = Integer.parseInt(t_efectivo.getText());
            String direccion = ta_direccion.getText();

            DefaultListModel modelo
                    = (DefaultListModel) jl_clientes.getModel();
            modelo.addElement(new Cliente(nombre,
                    telefono,
                    efectivo,
                    direccion
            )
            );
            t_nombre.setText("");
            t_telefono.setText("");
            t_efectivo.setText("");
            ta_direccion.setText("");

            menu_cliente.dispose();
            dispose();
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jl_clientes.getSelectedIndex() >= 0) {
            DefaultListModel modeloLista
                    = (DefaultListModel) jl_clientes.getModel();
            Cliente persona = (Cliente) modeloLista.get(jl_clientes.getSelectedIndex());
            Baleada baleada;
            if (cb_baleada.getSelectedItem().toString().equals("Baleada binarias")) {
                baleada = new Binarias();
            } else if (cb_baleada.getSelectedItem().toString().equals("Baleada especiales")) {
                baleada = new Especiales();
            } else if (cb_baleada.getSelectedItem().toString().equals("Baleada reloaded")) {
                baleada = new Reloaded();
            } else {
                baleada = new OutOfBounds();
            }

            orden += 7;
            
            Orden baleadas = new Orden(persona,
                                    baleada,
                                    orden,
                                    new Date()
                            );
            
            ///Agreggar al jtree
            DefaultTreeModel m = (DefaultTreeModel) jt_empresa.getModel();
            DefaultMutableTreeNode raiz
                    = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_orden
                    = new DefaultMutableTreeNode(
                           baleadas
                    );
            System.out.println("hola");
            DefaultMutableTreeNode nodo_cliente 
                    = new DefaultMutableTreeNode(((Cliente) modeloLista.get(jl_clientes.getSelectedIndex())).getNombre());
            
            DefaultMutableTreeNode dato1 = new DefaultMutableTreeNode("Direccion");
            DefaultMutableTreeNode dato2 = new DefaultMutableTreeNode("Numero de telefono");
            DefaultMutableTreeNode dato3 = new DefaultMutableTreeNode("Efectivo");
            
            DefaultMutableTreeNode telefono = new DefaultMutableTreeNode(((Cliente) modeloLista.get(jl_clientes.getSelectedIndex())).getTelefono());
            DefaultMutableTreeNode direccion = new DefaultMutableTreeNode(((Cliente) modeloLista.get(jl_clientes.getSelectedIndex())).getDireccion());
            DefaultMutableTreeNode efectivo = new DefaultMutableTreeNode(((Cliente) modeloLista.get(jl_clientes.getSelectedIndex())).getEfectivo());
            
            nodo_orden.add(baleada.getIngredientes());
            nodo_cliente.add(nodo_orden);
            dato1.add(direccion);
            dato2.add(telefono);
            dato3.add(efectivo);
            nodo_cliente.add(dato3);
            nodo_cliente.add(dato2);
            nodo_cliente.add(dato1);
            raiz.add(nodo_cliente);
            m.reload();

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTreeModel m
                = (DefaultTreeModel) jt_empresa.getModel();
        Object v1 = jt_empresa.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
        
        m.removeNodeFromParent(
                nodo_seleccionado
        );
        m.reload();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> cb_baleada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jl_clientes;
    private javax.swing.JTree jt_empresa;
    private javax.swing.JDialog menu_cliente;
    private javax.swing.JDialog menu_ordenes;
    private javax.swing.JMenuItem nueva_orden;
    private javax.swing.JMenuItem nuevo_cliente;
    private javax.swing.JTextField num_orden;
    private javax.swing.JTextField t_efectivo;
    private javax.swing.JTextField t_nombre;
    private javax.swing.JTextField t_telefono;
    private javax.swing.JTextArea ta_direccion;
    // End of variables declaration//GEN-END:variables

    int orden = 7;
    DefaultMutableTreeNode nodo_seleccionado;
}
