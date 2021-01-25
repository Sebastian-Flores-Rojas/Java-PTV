
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
 * @author Mapache
 */
public class venta_rolls3 extends javax.swing.JFrame {

    /**
     * Creates new form venta_rolls3
     */
    public venta_rolls3(String folio) {
        initComponents();
        txtFolio.setText(folio);
        llenarTableStock(Integer.parseInt(txtFolio.getText()));
        llenarComboBoxStock((String)cbStockFiltro.getSelectedItem());
        
        cbIdStock.setVisible(false);
        txtFolio.setVisible(false);
        txtNombre.setEditable(false);
        txtNombre.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbIdStock = new javax.swing.JComboBox<>();
        txtFolio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cbStockFiltro = new javax.swing.JComboBox<>();
        cbStock = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbIdStock.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbIdStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdStockActionPerformed(evt);
            }
        });

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad :");

        txtCantidad.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Ingrediente :");

        btnAgregar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbStockFiltro.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbStockFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "und.", "gr.", "cc." }));
        cbStockFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStockFiltroActionPerformed(evt);
            }
        });

        cbStock.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStockActionPerformed(evt);
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
                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbIdStock, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad)
                                    .addComponent(cbStock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbStockFiltro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbIdStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbIdStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdStockActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        venta_especial venta_especial = new venta_especial();
        venta_especial.setLocationRelativeTo(null);
        venta_especial.setResizable(false);
        venta_especial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed

    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este ingrediente?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM venta_especial WHERE id = ?");
                pst.setInt(1, Integer.parseInt(txtNombre.getText()));
                pst.executeUpdate();
                llenarTableStock(Integer.parseInt(txtFolio.getText()));
                limpiar();
                //costo();
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String stock = (String)cbIdStock.getSelectedItem();

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO venta_especial VALUES (?,?,?,?,?)");
            pst.setInt(2, Integer.parseInt(stock));
            pst.setInt(3, Integer.parseInt(txtFolio.getText()));
            pst.setString(4, (String)cbStock.getSelectedItem());
            pst.setDouble(5, Double.parseDouble(txtCantidad.getText()));
            pst.executeUpdate();

            llenarTableStock(Integer.parseInt(txtFolio.getText()));
            limpiar();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbStockFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStockFiltroActionPerformed
        if(cbStockFiltro.getSelectedIndex() > -1){
            llenarComboBoxStock((String)cbStockFiltro.getSelectedItem());
        }else{
            cbStockFiltro.removeAll();
        }
    }//GEN-LAST:event_cbStockFiltroActionPerformed

    private void cbStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStockActionPerformed
        if(cbStock.getSelectedIndex() > -1){
            cbIdStock.setSelectedIndex(cbStock.getSelectedIndex());
            String num = (String)cbIdStock.getSelectedItem();
            int id = Integer.parseInt(num);
        }else{
            cbStock.removeAll();
        }
    }//GEN-LAST:event_cbStockActionPerformed

    private void tableStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStockMouseClicked
        int  fila = tableStock.getSelectedRow();
        txtNombre.setText((String) tableStock.getValueAt(fila, 0));
    }//GEN-LAST:event_tableStockMouseClicked

    public void llenarTableStock(int id){
        
        DefaultTableModel stock = new DefaultTableModel();
        
        stock.addColumn("ID");
        stock.addColumn("Nombre");
        stock.addColumn("Cantidad");
        
        String [] fila = new String[5];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet sushi = st.executeQuery("SELECT * FROM venta_especial WHERE id_especial =" + id);
                        
            while(sushi.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                fila[0] = sushi.getString(1);
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[1] = sushi.getString(4);
                fila[2] = sushi.getString(5);

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
                //String nombreSushi = (String)cbSushi.getSelectedItem();
                //System.out.println(nombreSushi);
                
                /*ResultSet sushi2 = st.executeQuery("SELECT * FROM sushi WHERE nombre = ?");
                System.out.println("aqui aqui aqui");
                System.out.println(nombreSushi);
                sushi2.setString(1, nombreSushi);
                
                while(sushi.next()){
                   String pst = sushi2.getString("id");
                   jTextField1.setText(pst);
            }*/   
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
            java.util.logging.Logger.getLogger(venta_rolls3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta_rolls3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta_rolls3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta_rolls3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbIdStock;
    private javax.swing.JComboBox<String> cbStock;
    private javax.swing.JComboBox<String> cbStockFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableStock;
    private javax.swing.JTextField txtCantidad;
    public static javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
