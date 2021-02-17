/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanaUsuario;

import ec.edu.ups.controlador.ControladorUsuario;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dduta
 */
public class EliminarUsuario extends javax.swing.JInternalFrame {

    private ControladorUsuario controladoUsuario;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form EliminarUsuario
     */
    public EliminarUsuario(ControladorUsuario controladoUsuario) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladoUsuario = controladoUsuario;
    }

    public void limpiar() {
        txtEliminarU.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        lebelEliminarU.setText(mensajes.getString("lebelEliminarU"));
        ButtonEliminarU.setText(mensajes.getString("ButtonEliminarU"));
        labelCancelarU.setText(mensajes.getString("labelCancelarU"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lebelEliminarU = new javax.swing.JLabel();
        txtEliminarU = new javax.swing.JTextField();
        ButtonEliminarU = new javax.swing.JButton();
        labelCancelarU = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Eliminar un Usuario");

        lebelEliminarU.setText("Ingrese la Cedula del Usuario a Eliminar:");

        txtEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarUActionPerformed(evt);
            }
        });

        ButtonEliminarU.setText("Eliminar");
        ButtonEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarUActionPerformed(evt);
            }
        });

        labelCancelarU.setText("Cancelar");
        labelCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelCancelarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lebelEliminarU)
                .addGap(26, 26, 26)
                .addComponent(txtEliminarU, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(ButtonEliminarU)
                .addGap(18, 18, 18)
                .addComponent(labelCancelarU)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEliminarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebelEliminarU))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminarU)
                    .addComponent(labelCancelarU))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarUActionPerformed

    private void ButtonEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarUActionPerformed
        if (!txtEliminarU.getText().isEmpty()) {
            if (controladoUsuario.read(txtEliminarU.getText()) != null) {
                controladoUsuario.delete(txtEliminarU.getText());
                JOptionPane.showMessageDialog(null, "Eliminado Con Exito");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "usuario no existe");
                limpiar();
                this.setVisible(false);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }


    }//GEN-LAST:event_ButtonEliminarUActionPerformed

    private void labelCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelCancelarUActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_labelCancelarUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminarU;
    private javax.swing.JButton labelCancelarU;
    private javax.swing.JLabel lebelEliminarU;
    private javax.swing.JTextField txtEliminarU;
    // End of variables declaration//GEN-END:variables
}
