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
public class ModificarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaModificar
     */
    public ModificarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorProducto = controladorProducto;
    }

    public void limpiar() {
        txtCodigoP.setText("");
        txtDescrpcionActualizarP.setText("");
        txtPrecioActualizarP.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        ingreseproducto.setText(mensajes.getString("ingreseproducto"));
        ButtonBuscarP.setText(mensajes.getString("ButtonBuscarP"));
        ingreselosdatos.setText(mensajes.getString("ingreselosdatos"));
        jj.setText(mensajes.getString("jj"));
        PrecioP.setText(mensajes.getString("PrecioP"));
        ButtonActualizarP.setText(mensajes.getString("ButtonActualizarP"));
        ButtonCancelarA.setText(mensajes.getString("ButtonCancelarA"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingreseproducto = new javax.swing.JLabel();
        ButtonBuscarP = new javax.swing.JButton();
        txtCodigoP = new javax.swing.JTextField();
        ingreselosdatos = new javax.swing.JLabel();
        ButtonActualizarP = new javax.swing.JButton();
        jj = new javax.swing.JLabel();
        txtDescrpcionActualizarP = new javax.swing.JTextField();
        PrecioP = new javax.swing.JLabel();
        txtPrecioActualizarP = new javax.swing.JTextField();
        ButtonCancelarA = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Modificar Producto");

        ingreseproducto.setText("Ingrese el codigo del producto a Modificar:");

        ButtonBuscarP.setText("Buscar");
        ButtonBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarPActionPerformed(evt);
            }
        });

        ingreselosdatos.setText("Ingrese los nuevos datos del Producto");

        ButtonActualizarP.setText("Actualizar");
        ButtonActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarPActionPerformed(evt);
            }
        });

        jj.setText("Descripcion:");

        txtDescrpcionActualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescrpcionActualizarPActionPerformed(evt);
            }
        });

        PrecioP.setText("Precio:");

        ButtonCancelarA.setText("Cancelar");
        ButtonCancelarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarAActionPerformed(evt);
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
                                .addGap(97, 97, 97)
                                .addComponent(jj))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PrecioP)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDescrpcionActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtPrecioActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ingreselosdatos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ingreseproducto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(ButtonActualizarP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonCancelarA)))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBuscarP)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBuscarP)
                    .addComponent(ingreseproducto)
                    .addComponent(txtCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingreselosdatos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jj)
                    .addComponent(txtDescrpcionActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioP)
                    .addComponent(txtPrecioActualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonActualizarP)
                    .addComponent(ButtonCancelarA))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescrpcionActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescrpcionActualizarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescrpcionActualizarPActionPerformed

    private void ButtonBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarPActionPerformed
        if (!txtCodigoP.getText().isEmpty()) {
            if (controladorProducto.read(Integer.valueOf(txtCodigoP.getText())) != null) {
                txtDescrpcionActualizarP.setText(controladorProducto.read(Integer.valueOf(txtCodigoP.getText())).getDescripcion());
                double total = controladorProducto.read(Integer.parseInt(txtCodigoP.getText())).getPrecio();
                txtPrecioActualizarP.setText(String.valueOf(total));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Usuario");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonBuscarPActionPerformed

    private void ButtonActualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarPActionPerformed
        if (!txtDescrpcionActualizarP.getText().isEmpty() && !txtPrecioActualizarP.getText().isEmpty()) {
            controladorProducto.update(Integer.parseInt(txtCodigoP.getText()), txtDescrpcionActualizarP.getText(), Double.valueOf(txtPrecioActualizarP.getText()));
            JOptionPane.showMessageDialog(null, "Producto Actualizado");
            limpiar();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonActualizarPActionPerformed

    private void ButtonCancelarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarAActionPerformed
        limpiar();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarP;
    private javax.swing.JButton ButtonBuscarP;
    private javax.swing.JButton ButtonCancelarA;
    private javax.swing.JLabel PrecioP;
    private javax.swing.JLabel ingreselosdatos;
    private javax.swing.JLabel ingreseproducto;
    private javax.swing.JLabel jj;
    private javax.swing.JTextField txtCodigoP;
    private javax.swing.JTextField txtDescrpcionActualizarP;
    private javax.swing.JTextField txtPrecioActualizarP;
    // End of variables declaration//GEN-END:variables
}
