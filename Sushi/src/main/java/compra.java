
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
public class compra extends javax.swing.JFrame {

    /**
     * Creates new form compra
     */
    public compra() {
        initComponents();
        llenarTabla();
        limpiar();
        
        txtTotal.setEditable(false);
        txtTotal.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dcDesde = new com.toedter.calendar.JDateChooser();
        dcHasta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompra = new javax.swing.JTable();
        btnCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbTienda = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dcDesde.setDateFormatString("dd-MM-yyyy");

        dcHasta.setDateFormatString("dd-MM-yyyy");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setText("Precio Total : ($)");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel2.setText("Fecha Hasta :");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setText("Fecha Desde :");

        btnVolver.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnVolver.setText("<= Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tableCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Pagado", "Cliente", "Fecha", "Precio"
            }
        ));
        tableCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCompraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCompra);

        btnCompra.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        btnCompra.setText("Agregar Compra");
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel4.setText("Tienda :");

        cbTienda.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        cbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Boba", "Deandespac", "Surfish", "Vega" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnCompra))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        inicio inicio = new inicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String fechaDesde = date.format(dcDesde.getDate());
        String fechaHasta = date.format(dcHasta.getDate());
        String tienda = (String)cbTienda.getSelectedItem();

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Folio");
        modelo.addColumn("Tienda");
        modelo.addColumn("Fecha");
        modelo.addColumn("Precio");

        String [] fila = new String[4];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();

        if("Todas".equals(tienda)){
        try
        {
            Statement st = cn.createStatement();
            ResultSet compra = st.executeQuery("SELECT * FROM compra WHERE date(fecha)>= '" + fechaDesde + "' and date(fecha)<= '" + fechaHasta + "'");

            while(compra.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[0] = compra.getString(1);
                fila[1] = compra.getString(2);
                fila[2] = compra.getString(3);
                fila[3] = compra.getString(4);
                modelo.addRow(fila);

                totalCostoFecha(fechaDesde, fechaHasta);
            }

            tableCompra.setModel(modelo);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        } else {
        
            try
        {
            Statement st = cn.createStatement();
            ResultSet compra = st.executeQuery("SELECT * FROM compra WHERE date(fecha)>= '" + fechaDesde + "' and date(fecha)<= '" + fechaHasta + "' and tienda = '" + tienda + "'");

            while(compra.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                //fila[1] = stock.getString(3) + " " + stock.getString(4);
                fila[0] = compra.getString(1);
                fila[1] = compra.getString(2);
                fila[2] = compra.getString(3);
                fila[3] = compra.getString(4);
                modelo.addRow(fila);

                totalCostoFecha(fechaDesde, fechaHasta);
            }

            tableCompra.setModel(modelo);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tableCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCompraMouseClicked

    }//GEN-LAST:event_tableCompraMouseClicked

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        compra_nueva compra_nueva = new compra_nueva();
        compra_nueva.setLocationRelativeTo(null);
        compra_nueva.setResizable(false);
        compra_nueva.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCompraActionPerformed

    public void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Folio");
        modelo.addColumn("Tienda");
        modelo.addColumn("Fecha");
        modelo.addColumn("Precio");
        
        String [] fila = new String[4];

        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet compra = st.executeQuery("SELECT * FROM compra");
                        
            while(compra.next()){
                //System.out.println(stock.getString(2) + " " + stock.getString(3) + " " + stock.getString(4));
                fila[0] = compra.getString(1);
                fila[1] = compra.getString(2);
                fila[2] = compra.getString(3);
                fila[3] = compra.getString(4);
                modelo.addRow(fila);
                
                totalCosto();
            }
            
            tableCompra.setModel(modelo);
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void totalCostoFecha(String desde, String hasta){
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet venta = st.executeQuery("SELECT SUM(precio_final) FROM compra WHERE date(fecha)>= '" + desde + "' and date(fecha)<= '" + hasta + "'");
            
            while(venta.next()){
                int num = venta.getInt(1);
                String precio = Integer.toString(num);
                txtTotal.setText(precio);
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void totalCosto(){
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet venta = st.executeQuery("SELECT SUM(precio_final) FROM compra");
            
            while(venta.next()){
                int num = venta.getInt(1);
                String precio = Integer.toString(num);
                txtTotal.setText(precio);
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void limpiar(){
        //txtId.setText("");
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
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbTienda;
    private com.toedter.calendar.JDateChooser dcDesde;
    private com.toedter.calendar.JDateChooser dcHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCompra;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
