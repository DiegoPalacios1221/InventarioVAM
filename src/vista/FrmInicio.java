/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static vista.FrmMenu.fm;

/**
 *
 * @author Admin
 */
public class FrmInicio extends javax.swing.JFrame {
    
   Conexion con = new Conexion();
   Connection cn = con.conectar();
    
    public static FrmRegistro fr;
    public FrmInicio () {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

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
        button_SalirPrograma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsurio = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        button_Registrarse = new javax.swing.JButton();
        button_IniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a Vanity and Magic");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        button_SalirPrograma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_SalirPrograma.setText("Salir del programa");
        button_SalirPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_SalirProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(button_SalirPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 420, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        txtUsurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsurioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, -1));

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        button_Registrarse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_Registrarse.setText("Registrarse");
        button_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(button_Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 30));

        button_IniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button_IniciarSesion.setText("Iniciar Sesion");
        button_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_IniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(button_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_registrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_registrarseActionPerformed

    private void jButton2_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_iniciarSesionActionPerformed
 
    }//GEN-LAST:event_jButton2_iniciarSesionActionPerformed

    private void jButton3_salirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_salirProgramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3_salirProgramaActionPerformed

    private void txtUsurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsurioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void button_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarseActionPerformed
                                                          
    // Utilizar el constructor por defecto de FrmRegistro
    fr = new FrmRegistro(); // Crear una nueva instancia sin parámetros
    fr.setVisible(true);
    this.dispose(); // Cerrar la ventana de inicio actual (opcional)

    }//GEN-LAST:event_button_RegistrarseActionPerformed

    private void button_SalirProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_SalirProgramaActionPerformed
          System.exit(0);

    }//GEN-LAST:event_button_SalirProgramaActionPerformed

    private void button_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_IniciarSesionActionPerformed
        String usuario = txtUsurio.getText();    
        String contraseña = txtContraseña.getText();  
        if (!usuario.equals("")||!contraseña.equals("")){
            try{
                PreparedStatement ps = cn.prepareStatement("SELECT tu.descripcion FROM usuario u JOIN tipo_usuario tu ON u.tipo_usuario_id_tipo_usuario = tu.id_tipo_usuario "
                        + "WHERE u.usuario = '"+usuario+"' AND u.contraseña = '"+contraseña+"';");
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    String tipousuario = rs.getString("Descripcion");
                    if(tipousuario.equalsIgnoreCase("Administrador")){
                        dispose();
                        JOptionPane.showMessageDialog(null, "Se ha iniciado sesion correctamente");
                        fm = new FrmMenu(); // Crear una nueva instancia sin parámetros
                        fm.setVisible(true);
                        dispose(); 
                        
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");

                }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion" + e);    
                }
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor llene los campos");
        }
    }//GEN-LAST:event_button_IniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            FrmInicio frmInicio = new FrmInicio();
            frmInicio.setLocationRelativeTo(null); // Centrar la ventana
            frmInicio.setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_IniciarSesion;
    private javax.swing.JButton button_Registrarse;
    private javax.swing.JButton button_SalirPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsurio;
    // End of variables declaration//GEN-END:variables

   
}


    
