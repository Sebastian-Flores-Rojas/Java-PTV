
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class venta_menu extends javax.swing.JFrame {

    /**
     * Creates new form venta_menu
     */
    public venta_menu(String folio) {
        initComponents();
        txtFolio.setText(folio);
        int menu = Integer.parseInt(txtFolio.getText());
        llenarTableMenu(menu);
        llenarComboBoxMenu();
        
        txtFolio.setVisible(false);
        cbIdMenu.setVisible(false);
        cbMenuPrecio.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        cbMenu = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtFolio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        cbIdMenu = new javax.swing.JComboBox<>();
        cbMenuPrecio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<=Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cbMenu.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenuActionPerformed(evt);
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

        tableMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        tableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMenu);

        cbIdMenu.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbIdMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdMenuActionPerformed(evt);
            }
        });

        cbMenuPrecio.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbMenuPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMenuPrecioActionPerformed(evt);
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
                                .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAgregar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbIdMenu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(cbMenuPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnVolver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(cbIdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMenuPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void cbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenuActionPerformed
        if(cbMenu.getSelectedIndex() > -1){
            cbIdMenu.setSelectedIndex(cbMenu.getSelectedIndex());
            cbMenuPrecio.setSelectedIndex(cbMenu.getSelectedIndex());
        }else{
            cbMenu.removeAll();
        }
    }//GEN-LAST:event_cbMenuActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre, idmenu, preciosushi;
        int id_venta, id_menu, precio, precio_final;

        nombre = (String)cbMenu.getSelectedItem();
        id_venta = Integer.parseInt(txtFolio.getText());
        idmenu = (String)cbIdMenu.getSelectedItem();
        id_menu = Integer.parseInt(idmenu);
        preciosushi = (String)cbMenuPrecio.getSelectedItem();
        precio = Integer.parseInt(preciosushi);

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO venta_menu VALUES (?,?,?,?,?)");
            pst.setInt(2, id_venta);
            pst.setInt(3, id_menu);
            pst.setString(4, nombre);
            pst.setInt(5, precio);
            pst.executeUpdate();

            llenarTableMenu(id_venta);
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
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este menu?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM venta_menu WHERE id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();

                //limpiar();
                llenarTableMenu(id_venta);
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMenuMouseClicked
        int  fila = tableMenu.getSelectedRow();
        txtId.setText((String) tableMenu.getValueAt(fila, 0));
    }//GEN-LAST:event_tableMenuMouseClicked

    private void cbIdMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdMenuActionPerformed

    private void cbMenuPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMenuPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMenuPrecioActionPerformed

    public void llenarTableMenu(int folio){
        
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
            ResultSet menu = st.executeQuery("SELECT * FROM venta_menu WHERE id_venta =" + folio);
                        
            while(menu.next()){
                
                System.out.println(menu.getString(3));
                
                fila[0] = menu.getString(1);
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[1] = menu.getString(4);
                fila[2] = menu.getString(5);

                stock.addRow(fila);
            }
            
            tableMenu.setModel(stock);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxMenu(){
        
        cbMenu.removeAllItems();
        cbIdMenu.removeAllItems();
        cbMenuPrecio.removeAllItems();
        DefaultComboBoxModel modeloMenu = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloPrecio = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet menu = st.executeQuery("SELECT * FROM menu");
            
            while(menu.next()){
                modeloMenu.addElement(menu.getString(2));
                modeloId.addElement(menu.getString(1));
                modeloPrecio.addElement(menu.getString(4));
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbMenu.setModel(modeloMenu);
        cbIdMenu.setModel(modeloId);
        cbMenuPrecio.setModel(modeloPrecio);
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
            java.util.logging.Logger.getLogger(venta_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(venta_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(venta_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(venta_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JComboBox<String> cbIdMenu;
    private javax.swing.JComboBox<String> cbMenu;
    private javax.swing.JComboBox<String> cbMenuPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
