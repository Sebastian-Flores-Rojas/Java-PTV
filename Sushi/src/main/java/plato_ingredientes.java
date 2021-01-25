
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
public class plato_ingredientes extends javax.swing.JFrame {

    /**
     * Creates new form plato_ingredientes
     */
    public plato_ingredientes(String id) {
        initComponents();
        txtId.setText(id);
        llenarTableStock(Integer.parseInt(txtId.getText()));
        llenarComboBoxStock((String)cbStockFiltro.getSelectedItem());
        
        cbIdStock.setVisible(false);
        txtId.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbStock = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        cbIdStock = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        cbStockFiltro = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnSalsa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad :");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Ingrediente :");

        cbStock.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStockActionPerformed(evt);
            }
        });

        txtCantidad.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        tableStock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStockMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableStock);

        btnAgregar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbIdStock.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbIdStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdStockActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Lucida Bright", 0, 10)); // NOI18N

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<=Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbStockFiltro.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbStockFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "und.", "gr.", "cc." }));
        cbStockFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStockFiltroActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnSalsa.setText("Agregar Salsa");
        btnSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalsaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbIdStock, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad)
                            .addComponent(cbStock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStockFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnSalsa, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(cbStockFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalsa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStockActionPerformed
        if(cbStock.getSelectedIndex() > -1){
            cbIdStock.setSelectedIndex(cbStock.getSelectedIndex());
            String num = (String)cbIdStock.getSelectedItem();
            int id = Integer.parseInt(num);
        }else{
            cbStock.removeAll();
        }
    }//GEN-LAST:event_cbStockActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void tableStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockMouseClicked
        int  fila = tableStock.getSelectedRow();
        txtNombre.setText((String) tableStock.getValueAt(fila, 0));
    }//GEN-LAST:event_tableStockMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String stock = (String)cbIdStock.getSelectedItem();

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO plato_ingredientes VALUES (?,?,?,?,?)");
            pst.setInt(2, Integer.parseInt(stock));
            pst.setInt(3, Integer.parseInt(txtId.getText()));
            pst.setString(4, (String)cbStock.getSelectedItem());
            pst.setDouble(5, Double.parseDouble(txtCantidad.getText()));
            pst.executeUpdate();

            llenarTableStock(Integer.parseInt(txtId.getText()));
            limpiar();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbIdStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdStockActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        plato plato = new plato();
        plato.setLocationRelativeTo(null);
        plato.setResizable(false);
        plato.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbStockFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStockFiltroActionPerformed
        if(cbStockFiltro.getSelectedIndex() > -1){
            llenarComboBoxStock((String)cbStockFiltro.getSelectedItem());
        }else{
            cbStockFiltro.removeAll();
        }
    }//GEN-LAST:event_cbStockFiltroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este ingrediente?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM plato_ingredientes WHERE ( nombre = ? AND id_plato = ? )");
                pst.setString(1, txtNombre.getText());
                pst.setInt(2, Integer.parseInt(txtId.getText()));
                pst.executeUpdate();
                llenarTableStock(Integer.parseInt(txtId.getText()));
                limpiar();
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalsaActionPerformed
        plato_salsas plato_salsas = new plato_salsas(txtId.getText());
        plato_salsas.setLocationRelativeTo(null);
        plato_salsas.setResizable(true);
        plato_salsas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalsaActionPerformed

    public void llenarTableStock(int id){
        
        DefaultTableModel stock = new DefaultTableModel();
        
        stock.addColumn("Nombre");
        stock.addColumn("Cantidad");
        
        String [] fila = new String[5];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet plato = st.executeQuery("SELECT * FROM plato_ingredientes WHERE id_plato =" + id);
                        
            while(plato.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                fila[0] = plato.getString(4);
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[1] = plato.getString(5);

                stock.addRow(fila);
            }
            
            tableStock.setModel(stock);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxStock(String filtro){
        
        cbStock.removeAllItems();
        cbIdStock.removeAllItems();
        DefaultComboBoxModel modeloIngredientes = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet stock = st.executeQuery("SELECT * FROM stock WHERE medida = '"+filtro+"'");
            
            while(stock.next()){
                modeloIngredientes.addElement(stock.getString(2));
                modeloId.addElement(stock.getString(1)); 
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbStock.setModel(modeloIngredientes);
        cbIdStock.setModel(modeloId);
    }
    
    public void limpiar(){
    txtCantidad.setText("");
    txtNombre.setText("");
    txtCantidad.requestFocus();
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
            java.util.logging.Logger.getLogger(plato_ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(plato_ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(plato_ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(plato_ingredientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalsa;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbIdStock;
    private javax.swing.JComboBox<String> cbStock;
    private javax.swing.JComboBox<String> cbStockFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
