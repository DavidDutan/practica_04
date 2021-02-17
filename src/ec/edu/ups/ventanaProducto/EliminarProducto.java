/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanaProducto;

import ec.edu.ups.controlador.ControladorProducto;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author dduta
 */
public class EliminarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaEliminar
     */
    public EliminarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorProducto = controladorProducto;
    }

    public void limpiar() {
        txtEliminarP.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        eliminarp.setText(mensajes.getString("eliminarp"));
        ButtonEliminarP.setText(mensajes.getString("ButtonEliminarP"));
        ButtonCancelarEliminarP.setText(mensajes.getString("ButtonCancelarEliminarP"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminarp = new javax.swing.JLabel();
        ButtonEliminarP = new javax.swing.JButton();
        txtEliminarP = new javax.swing.JTextField();
        ButtonCancelarEliminarP = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Eliminar Productos");

        eliminarp.setText("Ingrese el codigo del producto a eliminar: ");

        ButtonEliminarP.setText("Eliminar");
        ButtonEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarPActionPerformed(evt);
            }
        });

        ButtonCancelarEliminarP.setText("Cancelar");
        ButtonCancelarEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarEliminarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eliminarp)
                        .addGap(18, 18, 18)
                        .addComponent(txtEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(ButtonEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ButtonCancelarEliminarP)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarp)
                    .addComponent(txtEliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminarP)
                    .addComponent(ButtonCancelarEliminarP))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarPActionPerformed
        if (!txtEliminarP.getText().isEmpty()) {
            if (controladorProducto.read(Integer.valueOf(txtEliminarP.getText())) != null) {
                controladorProducto.delete(Integer.valueOf(txtEliminarP.getText()));
                JOptionPane.showMessageDialog(null, "Eliminado Correctamente");
                limpiar();
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Porducto no existe");
                limpiar();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonEliminarPActionPerformed

    private void ButtonCancelarEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarEliminarPActionPerformed
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarEliminarPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarEliminarP;
    private javax.swing.JButton ButtonEliminarP;
    private javax.swing.JLabel eliminarp;
    private javax.swing.JTextField txtEliminarP;
    // End of variables declaration//GEN-END:variables
}