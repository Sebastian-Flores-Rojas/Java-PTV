
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raccoon
 */
public class salsa extends javax.swing.JFrame {

    /**
     * Creates new form salsa
     */
    public salsa() {
        initComponents();
        limpiar();
        llenarTabla();
        llenarComboBoxSalsa();
        
        cbIdSalsa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardarSalsa = new javax.swing.JButton();
        btnAgregarIngredientes = new javax.swing.JButton();
        btnEliminarSalsa = new javax.swing.JButton();
        btnActualizarSalsa = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalsa = new javax.swing.JTable();
        txtNombreSalsa = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSalsa = new javax.swing.JComboBox<>();
        cbIdSalsa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardarSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnGuardarSalsa.setText("Guardar");
        btnGuardarSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSalsaActionPerformed(evt);
            }
        });

        btnAgregarIngredientes.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregarIngredientes.setText("Agregar");
        btnAgregarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngredientesActionPerformed(evt);
            }
        });

        btnEliminarSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminarSalsa.setText("Eliminar");
        btnEliminarSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSalsaActionPerformed(evt);
            }
        });

        btnActualizarSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnActualizarSalsa.setText("Actualizar");
        btnActualizarSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarSalsaActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<= Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tableSalsa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableSalsa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        tableSalsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSalsaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSalsa);

        txtNombreSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtNombreSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSalsaActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Nombre :");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Precio :");

        cbSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalsaActionPerformed(evt);
            }
        });

        cbIdSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbIdSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdSalsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizarSalsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarSalsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarSalsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbIdSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarSalsa)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnEliminarSalsa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizarSalsa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarIngredientes)
                    .addComponent(cbIdSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSalsaActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre;
        int precio;

        nombre = txtNombreSalsa.getText();
        precio = Integer.parseInt(txtPrecio.getText());

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO salsa VALUES (?,?,?)");
            pst.setString(2, nombre);
            pst.setInt(3, precio);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxSalsa();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarSalsaActionPerformed

    private void btnAgregarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngredientesActionPerformed
        String id = (String)cbIdSalsa.getSelectedItem();
        salsa_ingredientes salsa_ingredientes = new salsa_ingredientes(id);
        salsa_ingredientes.setLocationRelativeTo(null);
        salsa_ingredientes.setResizable(true);
        salsa_ingredientes.setVisible(true);
        dispose();

        /*Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre, stock, sushi, numero;
        int id_stock, id_sushi, cantidad;
        nombre = (String)cbStock.getSelectedItem();
        stock = (String)cbIdStock.getSelectedItem();
        id_stock = Integer.parseInt(stock);
        sushi = (String)cbIdSushi.getSelectedItem();
        id_sushi = Integer.parseInt(sushi);
        cantidad = Integer.parseInt(txtCantidad.getText());

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO sushi_ingredientes VALUES (?,?,?,?,?)");
            pst.setInt(2, id_stock);
            pst.setInt(3, id_sushi);
            pst.setString(4, nombre);
            pst.setInt(5, cantidad);
            pst.executeUpdate();
            limpiar();
            llenarTableStock(id_sushi);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }*/
    }//GEN-LAST:event_btnAgregarIngredientesActionPerformed

    private void btnEliminarSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSalsaActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre = txtNombreSalsa.getText();

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR esta salsa?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM salsa WHERE nombre = ?");
                pst.setString(1, nombre);
                pst.executeUpdate();
                limpiar();
                llenarTabla();
                llenarComboBoxSalsa();
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarSalsaActionPerformed

    private void btnActualizarSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarSalsaActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre;
        int precio;

        nombre = txtNombreSalsa.getText();
        precio = Integer.parseInt(txtPrecio.getText());

        try
        {
            PreparedStatement pst = cn.prepareStatement("UPDATE salsa SET precio = ? WHERE nombre = ?");
            pst.setInt(1, precio);
            pst.setString(2, nombre);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxSalsa();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarSalsaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        inicio_creacion inicio_creacion = new inicio_creacion();
        inicio_creacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tableSalsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalsaMouseClicked
        int  fila = tableSalsa.getSelectedRow();
        txtNombreSalsa.setText((String) tableSalsa.getValueAt(fila, 0));
        txtPrecio.setText((String) tableSalsa.getValueAt(fila, 1));
    }//GEN-LAST:event_tableSalsaMouseClicked

    private void txtNombreSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSalsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSalsaActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cbSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalsaActionPerformed
        if(cbSalsa.getSelectedIndex() > -1){
            cbIdSalsa.setSelectedIndex(cbSalsa.getSelectedIndex());
            //tableStock.removeAll();
            //String num = (String)cbIdSushi.getSelectedItem();
            //int id = Integer.parseInt(num);
            //llenarTableStock(id);
        }else{
            cbSalsa.removeAll();
        }
    }//GEN-LAST:event_cbSalsaActionPerformed

    private void cbIdSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdSalsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdSalsaActionPerformed

    public void limpiar(){
    txtNombreSalsa.setText("");
    txtPrecio.setText("");
    txtNombreSalsa.requestFocus();
    }
    
    public void llenarTabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        
        String [] fila = new String[3];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet salsa = st.executeQuery("SELECT * FROM salsa");
                        
            while(salsa.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[0] = salsa.getString(2);
                fila[1] = salsa.getString(3);
                modelo.addRow(fila);
            }
            
            tableSalsa.setModel(modelo);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxSalsa(){
        
        cbSalsa.removeAllItems();
        cbIdSalsa.removeAllItems();
        DefaultComboBoxModel modeloSalsa = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet salsa = st.executeQuery("SELECT * FROM salsa");
            
            while(salsa.next()){
                modeloSalsa.addElement(salsa.getString(2));
                modeloId.addElement(salsa.getString(1));
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbSalsa.setModel(modeloSalsa);
        cbIdSalsa.setModel(modeloId);
}
    
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
            java.util.logging.Logger.getLogger(salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salsa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarSalsa;
    private javax.swing.JButton btnAgregarIngredientes;
    private javax.swing.JButton btnEliminarSalsa;
    private javax.swing.JButton btnGuardarSalsa;
    private javax.swing.JButton btnVolver;
    public static javax.swing.JComboBox<String> cbIdSalsa;
    private javax.swing.JComboBox<String> cbSalsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSalsa;
    private javax.swing.JTextField txtNombreSalsa;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
