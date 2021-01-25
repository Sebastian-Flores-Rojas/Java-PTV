import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class inicio extends javax.swing.JFrame {
    
    
    public inicio(){
        initComponents();
        CentrarJFrame();
    }


    public void CentrarJFrame(){
    setLocationRelativeTo(null);
    setResizable(false);
  }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStock = new javax.swing.JButton();
        btnContabilidadVenta = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnContabilidadCompra = new javax.swing.JButton();
        btnContabilidadVenta1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStock.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnStock.setText("Ver Stock");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnContabilidadVenta.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnContabilidadVenta.setText("Crear Contenido");
        btnContabilidadVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadVentaActionPerformed(evt);
            }
        });

        btnVenta.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnVenta.setText("Hacer Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnContabilidadCompra.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnContabilidadCompra.setText("Ver Contabilidad Compras");
        btnContabilidadCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadCompraActionPerformed(evt);
            }
        });

        btnContabilidadVenta1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        btnContabilidadVenta1.setText("Ver Contabilidad Ventas");
        btnContabilidadVenta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContabilidadVenta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContabilidadCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContabilidadVenta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnContabilidadVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnContabilidadVenta)
                .addGap(18, 18, 18)
                .addComponent(btnContabilidadVenta1)
                .addGap(18, 18, 18)
                .addComponent(btnContabilidadCompra)
                .addGap(18, 18, 18)
                .addComponent(btnStock)
                .addGap(18, 18, 18)
                .addComponent(btnVenta)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContabilidadVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadVentaActionPerformed
        inicio_creacion inicio_creacion = new inicio_creacion();
        inicio_creacion.setLocationRelativeTo(null);
        inicio_creacion.setResizable(false);
        inicio_creacion.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContabilidadVentaActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        venta venta = new venta();
        venta.setLocationRelativeTo(null);
        venta.setResizable(false);
        venta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        stock stock = new stock();
        stock.setLocationRelativeTo(null);
        stock.setResizable(false);
        stock.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnContabilidadCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadCompraActionPerformed
        compra compra = new compra();
        compra.setLocationRelativeTo(null);
        compra.setResizable(false);
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContabilidadCompraActionPerformed

    private void btnContabilidadVenta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContabilidadVenta1ActionPerformed
        contabilidad contabilidad = new contabilidad();
        contabilidad.setLocationRelativeTo(null);
        contabilidad.setResizable(false);
        contabilidad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContabilidadVenta1ActionPerformed

    public void stockGr(){
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet stock = st.executeQuery("SELECT nombre FROM stock WHERE ( cantidad <= 10000 AND medida = 'gr.' )");
            
            while(stock.next()){
                for ( int i = 0; i < 1; i++ ) {
                JOptionPane.showMessageDialog(null, "AVISO DE POCO STOCK DE: " + stock.getString(1));
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void stockUnd(){
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet stock = st.executeQuery("SELECT nombre FROM stock WHERE ( cantidad <= 100 AND medida = 'und.' )");
            
            while(stock.next()){
                for ( int i = 0; i < 1; i++ ) {
                JOptionPane.showMessageDialog(null, "AVISO DE POCO STOCK DE: " + stock.getString(1));
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public void stockCc(){
        Conexion cc = new Conexion();
        Connection cn = cc.conectar();
        
        try
        {
            Statement st = cn.createStatement();
            ResultSet stock = st.executeQuery("SELECT nombre FROM stock WHERE ( cantidad <= 1000 AND medida = 'cc.' )");
            
            while(stock.next()){
                for ( int i = 0; i < 1; i++ ) {
                JOptionPane.showMessageDialog(null, "AVISO DE POCO STOCK DE: " + stock.getString(1));
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    
    public static void main(String args[]) {
        
        ImageIcon wallpaper = new ImageIcon("fondo.png");
        JButton btn = new JButton("wallpaper", wallpaper);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContabilidadCompra;
    private javax.swing.JButton btnContabilidadVenta;
    private javax.swing.JButton btnContabilidadVenta1;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnVenta;
    // End of variables declaration//GEN-END:variables
    }
