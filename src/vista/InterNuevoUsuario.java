/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Ctrl_Usuario;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Admin
 */
public class InterNuevoUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterNuevoUsuario
     */
    public InterNuevoUsuario() {
        initComponents();
        setSize(new Dimension(400, 300));
        setTitle("Nuevo Usuario");
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        setLocation(x, y);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txt_contraseña = new javax.swing.JTextField();
        Txt_nombre = new javax.swing.JTextField();
        Txt_apellido = new javax.swing.JTextField();
        Txt_cc = new javax.swing.JTextField();
        Txt_email = new javax.swing.JTextField();
        Txt_usuario = new javax.swing.JTextField();
        jButton_Guardar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CC");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        Txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        Txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        Txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        Txt_cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ccActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, -1));

        Txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        Txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(Txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, -1));

        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_contraseñaActionPerformed

    private void Txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_nombreActionPerformed

    private void Txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_apellidoActionPerformed

    private void Txt_ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ccActionPerformed

    private void Txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_emailActionPerformed

    private void Txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_usuarioActionPerformed

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        if (Txt_nombre.getText().isEmpty() || Txt_apellido.getText().isEmpty() || Txt_cc.getText().isEmpty() || Txt_usuario.getText().isEmpty() || Txt_contraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            Usuario usuario = new Usuario();
            Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
            if (!controlUsuario.existeUsuario(Txt_usuario.getText().trim())) {
                usuario.setNombre (Txt_nombre.getText().trim());
                usuario.setApellido (Txt_nombre.getText().trim());
                usuario.setCc(Integer.parseInt(Txt_cc.getText().trim()));
                usuario.setEmail (Txt_email.getText().trim());
                usuario.setUsuario (Txt_usuario.getText().trim());
                usuario.setContraseña (Txt_contraseña.getText().trim());
                if(controlUsuario.guardar(usuario)){
                     JOptionPane.showMessageDialog(null, "Usuario Registrado");

                }else{
                    JOptionPane.showMessageDialog(null, "Error al registrar usuario");

                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya esta registrado");

            }

        }
        Limpiar();
    }//GEN-LAST:event_jButton_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_apellido;
    private javax.swing.JTextField Txt_cc;
    private javax.swing.JTextField Txt_contraseña;
    private javax.swing.JTextField Txt_email;
    private javax.swing.JTextField Txt_nombre;
    private javax.swing.JTextField Txt_usuario;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

//metodo limpiar
    private void Limpiar(){
    Txt_nombre.setText("");
    Txt_apellido.setText("");
    Txt_cc.setText("");
    Txt_email.setText("");
    Txt_usuario.setText("");
    Txt_contraseña.setText("");
}
}