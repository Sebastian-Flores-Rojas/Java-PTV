
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class acompañamiento extends javax.swing.JFrame {

    public acompañamiento() {
        initComponents();
        limpiar();
        llenarTabla();
        llenarComboBoxAcompañamiento();
        
        cbIdAcompañamiento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        cbIdAcompañamiento = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAcompañamiento = new javax.swing.JTable();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        cbAcompañamiento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        cbIdAcompañamiento.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbIdAcompañamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIdAcompañamientoActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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

        tableAcompañamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableAcompañamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        tableAcompañamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAcompañamientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAcompañamiento);

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

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Nombre :");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Precio :");

        btnGuardar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cbAcompañamiento.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbAcompañamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAcompañamientoActionPerformed(evt);
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
                        .addComponent(cbIdAcompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbAcompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAcompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(cbIdAcompañamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String id = (String)cbIdAcompañamiento.getSelectedItem();
        acompañamiento_ingredientes acompañamiento_ingredientes = new acompañamiento_ingredientes(id);
        acompañamiento_ingredientes.setLocationRelativeTo(null);
        acompañamiento_ingredientes.setResizable(true);
        acompañamiento_ingredientes.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbIdAcompañamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIdAcompañamientoActionPerformed

    }//GEN-LAST:event_cbIdAcompañamientoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre = txtNombre.getText();

        try
        {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea ELIMINAR este acompañamiento?");

            if (confirmacion == 0){

                PreparedStatement pst = cn.prepareStatement("DELETE FROM acompañamiento WHERE nombre = ?");
                pst.setString(1, nombre);
                pst.executeUpdate();
                limpiar();
                llenarTabla();
                llenarComboBoxAcompañamiento();
                
                pst.close();
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre;
        int precio;

        nombre = txtNombre.getText();
        precio = Integer.parseInt(txtPrecio.getText());

        try
        {
            PreparedStatement pst = cn.prepareStatement("UPDATE acompañamiento SET precio = ? WHERE nombre = ?");
            pst.setInt(1, precio);
            pst.setString(2, nombre);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxAcompañamiento();
            
            pst.close();
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

    private void tableAcompañamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAcompañamientoMouseClicked
        int  fila = tableAcompañamiento.getSelectedRow();
        txtNombre.setText((String) tableAcompañamiento.getValueAt(fila, 0));
        txtPrecio.setText((String) tableAcompañamiento.getValueAt(fila, 1));
    }//GEN-LAST:event_tableAcompañamientoMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed

    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        String nombre;
        int precio;

        nombre = txtNombre.getText();
        precio = Integer.parseInt(txtPrecio.getText());

        try
        {
            PreparedStatement pst = cn.prepareStatement("INSERT INTO acompañamiento VALUES (?,?,?)");
            pst.setString(2, nombre);
            pst.setInt(3, precio);
            pst.executeUpdate();
            limpiar();
            llenarTabla();
            llenarComboBoxAcompañamiento();
            
            pst.close();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbAcompañamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAcompañamientoActionPerformed
        if(cbAcompañamiento.getSelectedIndex() > -1){
            cbIdAcompañamiento.setSelectedIndex(cbAcompañamiento.getSelectedIndex());
        }else{
            cbAcompañamiento.removeAll();
        }
    }//GEN-LAST:event_cbAcompañamientoActionPerformed

    public void limpiar(){
    txtNombre.setText("");
    txtPrecio.setText("");
    txtNombre.requestFocus();
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
            ResultSet salsa = st.executeQuery("SELECT * FROM acompañamiento");
                        
            while(salsa.next()){
                fila[0] = salsa.getString(2);
                fila[1] = salsa.getString(3);
                modelo.addRow(fila);
            }
            
            tableAcompañamiento.setModel(modelo);
            st.close();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void llenarComboBoxAcompañamiento(){
        
        cbAcompañamiento.removeAllItems();
        cbIdAcompañamiento.removeAllItems();
        DefaultComboBoxModel modeloAcompañamiento = new DefaultComboBoxModel();
        DefaultComboBoxModel modeloId = new DefaultComboBoxModel();
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet acompañamiento = st.executeQuery("SELECT * FROM acompañamiento");
            
            while(acompañamiento.next()){
                modeloAcompañamiento.addElement(acompañamiento.getString(2));
                modeloId.addElement(acompañamiento.getString(1));
            }
            st.close();
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        cbAcompañamiento.setModel(modeloAcompañamiento);
        cbIdAcompañamiento.setModel(modeloId);
}

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acompañamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbAcompañamiento;
    public static javax.swing.JComboBox<String> cbIdAcompañamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAcompañamiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
