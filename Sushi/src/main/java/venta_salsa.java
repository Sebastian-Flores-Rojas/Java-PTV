
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class venta_salsa extends javax.swing.JFrame {

    public venta_salsa(String folio) {
        initComponents();
        txtFolio.setText(folio);
        int salsa = Integer.parseInt(txtFolio.getText());
        llenarTableSalsa(salsa);
        llenarComboBoxSalsa();
        
        txtFolio.setVisible(false);
        cbIdSalsa.setVisible(false);
        cbSalsaPrecio.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        cbSalsa = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtFolio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSalsa = new javax.swing.JTable();
        cbIdSalsa = new javax.swing.JComboBox<>();
        cbSalsaPrecio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<=Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbSalsa.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalsaActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N

        txtFolio.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N

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

        cbIdSalsa.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbIdSalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdSalsaActionPerformed(evt);
            }
        });

        cbSalsaPrecio.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbSalsaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalsaPrecioActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbIdSalsa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(cbSalsaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbIdSalsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbSalsaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        venta venta = new venta();
        venta.setLocationRelativeTo(null);
        venta.setResizable(false);
        venta.setVisible(true);
        dispose();
        /*venta venta = new venta();
        venta.setLocationRelativeTo(null);
        venta.setResizable(false);
        venta.setVisible(false);
        dispose();*/
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalsaActionPerformed
        if(cbSalsa.getSelectedIndex() > -1){
            cbIdSalsa.setSelectedIndex(cbSalsa.getSelectedIndex());
            cbSalsaPrecio.setSelectedIndex(cbSalsa.getSelectedIndex());
        }else{
            cbSalsa.removeAll();
        }
    }//GEN-LAST:event_cbSalsaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre, idsalsa, preciosalsa;
        int id_venta, id_salsa, precio, precio_final;

        nombre = (String)cbSalsa.getSelectedItem();
        id_venta = Integer.parseInt(txtFolio.getText());
        idsalsa = (String)cbIdSalsa.getSelectedItem();
        id_salsa = Integer.parseInt(idsalsa);
        preciosalsa = (String)cbSalsaPrecio.getSelectedItem();
        precio = Integer.parseInt(preciosalsa);

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO venta_salsa VALUES (?,?,?,?,?)");
            pst.setInt(2, id_venta);
            pst.setInt(3, id_salsa);
            pst.setString(4, nombre);
            pst.setInt(5, precio);
            pst.executeUpdate();
            llenarTableSalsa(id_venta);

        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        int id, id_venta;

        id = Integer.parseInt(txtId.getText());
        id_venta = Integer.parseInt(txtFolio.getText());

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este salsa?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM venta_salsa WHERE id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();

                //limpiar();
                llenarTableSalsa(id_venta);
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableSalsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSalsaMouseClicked
        int  fila = tableSalsa.getSelectedRow();
        txtId.setText((String) tableSalsa.getValueAt(fila, 0));
    }//GEN-LAST:event_tableSalsaMouseClicked

    private void cbIdSalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdSalsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdSalsaActionPerformed

    private void cbSalsaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalsaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSalsaPrecioActionPerformed
    
    public void llenarTableSalsa(int folio){
        
        DefaultTableModel stock = new DefaultTableModel();
        
        stock.addColumn("ID");
        stock.addColumn("Nombre");
        stock.addColumn("Precio");
        
        String [] fila = new String[5];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet salsa = st.executeQuery("SELECT * FROM venta_salsa WHERE id_venta =" + folio);
                        
            while(salsa.next()){
                
                System.out.println(salsa.getString(3));
                
                fila[0] = salsa.getString(1);
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[1] = salsa.getString(4);
                fila[2] = salsa.getString(5);

                stock.addRow(fila);
            }
            
            tableSalsa.setModel(stock);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxSalsa(){
        
        cbSalsa.removeAllItems();
        cbIdSalsa.removeAllItems();
        cbSalsaPrecio.removeAllItems();
        DefaultComboBoxModel modeloSalsa = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloPrecio = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet salsa = st.executeQuery("SELECT * FROM salsa");
            
            while(salsa.next()){
                modeloSalsa.addElement(salsa.getString(2));
                modeloId.addElement(salsa.getString(1));
                modeloPrecio.addElement(salsa.getString(3));
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbSalsa.setModel(modeloSalsa);
        cbIdSalsa.setModel(modeloId);
        cbSalsaPrecio.setModel(modeloPrecio);
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
            java.util.logging.Logger.getLogger(venta_salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta_salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta_salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta_salsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cbIdSalsa;
    private javax.swing.JComboBox<String> cbSalsa;
    private javax.swing.JComboBox<String> cbSalsaPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSalsa;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
