/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueo;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriana Abad
 */
public class Registro extends javax.swing.JFrame {
    union u = new union();
File archivo;
Conexion conectar;
String fechaHora ="";
   
    public Registro() {
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

        BotonGuardar = new javax.swing.JButton();
        jRcamioneta = new javax.swing.JRadioButton();
        jRmotor = new javax.swing.JRadioButton();
        jRcarro = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jpropietario2 = new javax.swing.JTextField();
        jplaca1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 140, -1));

        jRcamioneta.setForeground(new java.awt.Color(255, 255, 255));
        jRcamioneta.setText("Camioneta");
        getContentPane().add(jRcamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jRmotor.setForeground(new java.awt.Color(255, 255, 255));
        jRmotor.setText("Motocicleta");
        getContentPane().add(jRmotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jRcarro.setForeground(new java.awt.Color(255, 255, 255));
        jRcarro.setText("Carro");
        getContentPane().add(jRcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de vehiculo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, -1));

        jpropietario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpropietario2ActionPerformed(evt);
            }
        });
        getContentPane().add(jpropietario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, -1));

        jplaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jplaca1ActionPerformed(evt);
            }
        });
        getContentPane().add(jplaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 180, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Propietario ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Placa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 70, 20));

        jTitulo.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jTitulo.setText("Registro Parking");
        getContentPane().add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Parqueo/screen-0.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static final String DEST = "Registroparking/welcome_world-pdf";
    private void jplaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jplaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jplaca1ActionPerformed

    private void jpropietario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpropietario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpropietario2ActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
   
     Conexion conectar = new Conexion();
    String TipoVehículo = "";
    if (jRcarro.isSelected()) {
        TipoVehículo = "Carro";
    }
    if (jRmotor.isSelected()) {
        TipoVehículo = "Motocicleta";      
    }
    if (jRcamioneta.isSelected()){
        TipoVehículo = "Camioneta";
    }
    
    
    try {
        
        Connection conex = new Connection();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:num:ss");
        Calendar cal = Calendar.getInstance();
        fechaHora = dateFormat.format(date);
        System.out.print(dateFormat.format(date));
        String sql = "INSERT INTO parking (Placa , Propietario ,Tipo Vehículo , Hora de entrada, Estado) VALUES (?,?,?,?,?)";
        PreparedStatement Ps = conex.prepareStatement(sql);
        Ps.setString(1, jRcarro.getText());
        Ps.setString(2, jRmotor.getText());
        Ps.setString(3, TipoVehículo);
        Ps.setString(4, fechaHora);
        Ps.setString(5, "Disponible");
        Ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Perfecto! se han ingresado exitosamente los datos del vehiculo");
        //aqui almaceno los datos se guardan en la base de datos y al final los muestra
    } catch (SQLException ex) {
        Logger.getLogger(Registro.class.getName()).log(Level.SEVERE,null,ex);
    }
    
    String dest ="c:\\Registros\\sample.pdf";
    p.CrearPdf(dest,jplaca1 ,jpropietario2 , fechaHora);
    JOptionPane.showMessageDialog(null,"Factura pr");
    

    }//GEN-LAST:event_BotonGuardarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRcamioneta;
    private javax.swing.JRadioButton jRcarro;
    private javax.swing.JRadioButton jRmotor;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JTextField jplaca1;
    private javax.swing.JTextField jpropietario2;
    // End of variables declaration//GEN-END:variables
}
