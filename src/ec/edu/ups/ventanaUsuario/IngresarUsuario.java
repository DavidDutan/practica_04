/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanaUsuario;

import com.sun.imageio.plugins.jpeg.JPEG;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.ventanPrincipal.Principal;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dduta
 */
public class IngresarUsuario extends javax.swing.JInternalFrame {

    private Principal p;
    private Locale localizacion;
    private ResourceBundle mensajes;

    private ControladorUsuario controladorUsuario;

    public IngresarUsuario(ControladorUsuario controladorUsuario, Principal p) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorUsuario = controladorUsuario;
        this.p = p;
        
    }

    public void limpiar() {
        txtContraseniaU.setText("");
        txtCorreoU.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
      mensajes=ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        lebelCorreoU.setText(mensajes.getString("lebelCorreoU"));
        lebelContraseniaU.setText(mensajes.getString("lebelContraseniaU"));
        ButtonIngresarU.setText(mensajes.getString("ButtonIngresarU"));
        ButtonCancelarU.setText(mensajes.getString("ButtonCancelarU"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        ButtonCancelarU = new javax.swing.JButton();
        lebelCorreoU = new javax.swing.JLabel();
        lebelContraseniaU = new javax.swing.JLabel();
        txtCorreoU = new javax.swing.JTextField();
        txtContraseniaU = new javax.swing.JPasswordField();
        ButtonIngresarU = new javax.swing.JButton();

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Inicia Sesion");

        ButtonCancelarU.setText("Cancelar");
        ButtonCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarUActionPerformed(evt);
            }
        });

        lebelCorreoU.setText("Correo:");

        lebelContraseniaU.setText("Contraseña");

        txtCorreoU.setToolTipText("Ingresa el Usuario o Correo");
        txtCorreoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUActionPerformed(evt);
            }
        });

        txtContraseniaU.setToolTipText("Ingresa la contraseña");
        txtContraseniaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaUActionPerformed(evt);
            }
        });

        ButtonIngresarU.setText("Ingresar");
        ButtonIngresarU.setToolTipText("Dale push para Inicion Sesion");
        ButtonIngresarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lebelCorreoU)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lebelContraseniaU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreoU, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtContraseniaU)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ButtonIngresarU)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCancelarU)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebelCorreoU))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lebelContraseniaU)
                    .addComponent(txtContraseniaU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCancelarU)
                    .addComponent(ButtonIngresarU))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCorreoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtContraseniaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaUActionPerformed

    private void ButtonIngresarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresarUActionPerformed
        if (!txtContraseniaU.getText().isEmpty() && !txtCorreoU.getText().isEmpty()) {
            if (controladorUsuario.validar(String.valueOf(txtContraseniaU.getPassword()), txtCorreoU.getText()) != null) {

                JOptionPane.showMessageDialog(this, "A iniciado sesion correctamente");

                p.getMenuBuscar().setVisible(true);
                p.getMenuBuscarP().setVisible(true);
                p.getMenuCrearC().setVisible(true);
                p.getMenuCrearP().setVisible(true);
                p.getMenuEditarU().setVisible(true);
                p.getMenuEliminarC().setVisible(true);
                p.getMenuListar().setVisible(true);
                p.getMenueliminarU().setVisible(true);
                p.getMenuAcutualizarP().setVisible(true);
                p.getMenuEliminarP().setVisible(true);
                p.getCerrarS().setVisible(true);
                p.getCrearU().setVisible(false);
                p.getMenuIniciar().setVisible(false);
                limpiar();
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña o correo incorrectos");
                limpiar();
                this.setVisible(false);

            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonIngresarUActionPerformed

    private void ButtonCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarUActionPerformed
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarU;
    private javax.swing.JButton ButtonIngresarU;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lebelContraseniaU;
    private javax.swing.JLabel lebelCorreoU;
    private javax.swing.JPasswordField txtContraseniaU;
    private javax.swing.JTextField txtCorreoU;
    // End of variables declaration//GEN-END:variables
}
