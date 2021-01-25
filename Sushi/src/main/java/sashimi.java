
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class sashimi extends javax.swing.JFrame {

    public sashimi() {
        initComponents();
        llenarTabla();
        String tipoSashimi = (String)cbTipo.getSelectedItem();
        llenarComboBoxSashimi(tipoSashimi);
        
        cbIdSashimi.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSashimi = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbTipos = new javax.swing.JComboBox<>();
        cbSashimi = new javax.swing.JComboBox<>();
        cbIdSashimi = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnAgregarIngredientes = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnActualizar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<= Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tableSashimi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableSashimi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        tableSashimi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSashimiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSashimi);

        txtNombre.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setText("Tipo :");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Nombre :");

        cbTipo.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sashimi", "Tiraritos" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Precio :");

        cbTipos.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sashimi", "Tiraritos" }));
        cbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTiposActionPerformed(evt);
            }
        });

        cbSashimi.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbSashimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSashimiActionPerformed(evt);
            }
        });

        cbIdSashimi.setFont(new java.awt.Font("Harlow Solid Italic", 0, 18)); // NOI18N
        cbIdSashimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdSashimiActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAgregarIngredientes.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregarIngredientes.setText("Agregar");
        btnAgregarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarIngredientesActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(76, 76, 76)
                        .addComponent(cbIdSashimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSashimi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbIdSashimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSashimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarIngredientes)
                    .addComponent(cbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre, tipo, tipoSashimi;
        int precio;

        nombre = txtNombre.getText();
        tipo = (String)cbTipo.getSelectedItem();
        precio = Integer.parseInt(txtPrecio.getText());

        tipoSashimi = (String)cbTipos.getSelectedItem();

        try
        {
            PreparedStatement pst = cn.prepareStatement("UPDATE sashimi SET precio = ?, tipo = ? WHERE nombre = ?");
            pst.setInt(1, precio);
            pst.setString(2, tipo);
            pst.setString(3, nombre);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxSashimi(tipoSashimi);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        inicio_creacion inicio_creacion = new inicio_creacion();
        inicio_creacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void tableSashimiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSashimiMouseClicked
        int  fila = tableSashimi.getSelectedRow();
        txtNombre.setText((String) tableSashimi.getValueAt(fila, 0));
        txtPrecio.setText((String) tableSashimi.getValueAt(fila, 2));
    }//GEN-LAST:event_tableSashimiMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoActionPerformed

    private void cbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTiposActionPerformed
        if(cbTipos.getSelectedIndex() > -1){
            String tipoSashimi = (String)cbTipos.getSelectedItem();
            llenarComboBoxSashimi(tipoSashimi);
        }else{
            cbTipos.removeAll();
        }
    }//GEN-LAST:event_cbTiposActionPerformed

    private void cbSashimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSashimiActionPerformed
        if(cbSashimi.getSelectedIndex() > -1){
            cbIdSashimi.setSelectedIndex(cbSashimi.getSelectedIndex());
            cbSashimi.removeAll();
        }
    }//GEN-LAST:event_cbSashimiActionPerformed

    private void cbIdSashimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdSashimiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIdSashimiActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre, tipo, tipoSashimi;
        int precio;

        nombre = txtNombre.getText();
        tipo = (String)cbTipo.getSelectedItem();
        precio = Integer.parseInt(txtPrecio.getText());

        tipoSashimi = (String)cbTipos.getSelectedItem();

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO sashimi VALUES (?,?,?,?)");
            pst.setString(2, nombre);
            pst.setString(3, tipo);
            pst.setInt(4, precio);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxSashimi(tipoSashimi);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarIngredientesActionPerformed
        String id = (String)cbIdSashimi.getSelectedItem();
        sashimi_ingredientes sashimi_ingredientes = new sashimi_ingredientes(id);
        sashimi_ingredientes.setLocationRelativeTo(null);
        sashimi_ingredientes.setResizable(true);
        sashimi_ingredientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarIngredientesActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre = txtNombre.getText();

        String tipoSashimi = (String)cbTipos.getSelectedItem();

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este " + tipoSashimi + "?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM sashimi WHERE nombre = ?");
                pst.setString(1, nombre);
                pst.executeUpdate();
                limpiar();
                llenarTabla();
                llenarComboBoxSashimi(tipoSashimi);
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    public void limpiar(){
    txtNombre.setText("");
    txtPrecio.setText("");
    txtNombre.requestFocus();
    }
    
    public void llenarTabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo");
        modelo.addColumn("Precio");
        
        String [] fila = new String[4];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet sushi = st.executeQuery("SELECT * FROM sashimi");
                        
            while(sushi.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                fila[0] = sushi.getString(2);
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[1] = sushi.getString(3);
                fila[2] = sushi.getString(4);
                modelo.addRow(fila);
            }
            
            tableSashimi.setModel(modelo);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxSashimi(String tipo){
        
        cbSashimi.removeAllItems();
        cbIdSashimi.removeAllItems();
        DefaultComboBoxModel modeloSashimi = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            System.out.println(tipo);
            Statement st = cn.createStatement();
            ResultSet sushi = st.executeQuery("SELECT * FROM sashimi WHERE tipo = '" + tipo + "'");
            
            while(sushi.next()){
                modeloSashimi.addElement(sushi.getString(2));
                modeloId.addElement(sushi.getString(1));
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbSashimi.setModel(modeloSashimi);
        cbIdSashimi.setModel(modeloId);
}

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sashimi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarIngredientes;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    public static javax.swing.JComboBox<String> cbIdSashimi;
    private javax.swing.JComboBox<String> cbSashimi;
    public static javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbTipos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSashimi;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
