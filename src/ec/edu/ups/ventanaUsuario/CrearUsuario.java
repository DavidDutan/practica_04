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
public class CrearUsuario extends javax.swing.JInternalFrame {

    private ControladorUsuario controladorUsuario;
    private Locale localizacion;
    private ResourceBundle mensajes;

    public CrearUsuario(ControladorUsuario controladorUsuario) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorUsuario = controladorUsuario;
    }

    public void limpiar() {
        txtApellidoU.setText("");
        txtContraseniaU.setText("");
        txtCorreoU.setText("");
        txtIdU.setText("");
        txtTipoU.setText("");
        txtNombreU.setText("");

    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        tipo.setText(mensajes.getString("tipo"));
        nombre.setText(mensajes.getString("nombre"));
        apellido.setText(mensajes.getString("apellido"));
        correo.setText(mensajes.getString("correo"));
        contrasenia.setText(mensajes.getString("contrasenia"));
        tiulo1.setText(mensajes.getString("tiulo1"));
        ButtonCrearU.setText(mensajes.getString("ButtonCrearU"));
        cedula.setText(mensajes.getString("cedula"));
        jButtonCancelarU.setText(mensajes.getString("jButtonCancelarU"));
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        ButtonCrearU = new javax.swing.JButton();
        tiulo1 = new javax.swing.JLabel();
        jButtonCancelarU = new javax.swing.JButton();
        cedula = new javax.swing.JLabel();
        txtIdU = new javax.swing.JTextField();
        tipo = new javax.swing.JLabel();
        txtTipoU = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtNombreU = new javax.swing.JTextField();
        apellido = new javax.swing.JLabel();
        txtApellidoU = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        txtCorreoU = new javax.swing.JTextField();
        contrasenia = new javax.swing.JLabel();
        txtContraseniaU = new javax.swing.JPasswordField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Crea un Usuario");
        setToolTipText("");

        ButtonCrearU.setText("Crear");
        ButtonCrearU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCrearUActionPerformed(evt);
            }
        });

        tiulo1.setText("Ingrese los Datos del Usuario a Crear");

        jButtonCancelarU.setText("Cancelar");
        jButtonCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarUActionPerformed(evt);
            }
        });

        cedula.setText("Cedula:");

        txtIdU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUActionPerformed(evt);
            }
        });

        tipo.setText("Tipo:");

        nombre.setText("Nombre:");

        apellido.setText("Apellido:");

        correo.setText("Correo:");

        contrasenia.setText("Contraseña:");

        txtContraseniaU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiulo1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTipoU, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cedula)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtIdU, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(apellido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtApellidoU, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ButtonCrearU)
                            .addGap(27, 27, 27)
                            .addComponent(jButtonCancelarU)
                            .addGap(8, 8, 8))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(correo, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(contrasenia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorreoU, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                .addComponent(txtContraseniaU)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tiulo1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula)
                    .addComponent(txtIdU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipo)
                    .addComponent(txtTipoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido)
                    .addComponent(txtApellidoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo)
                    .addComponent(txtCorreoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenia)
                    .addComponent(txtContraseniaU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCrearU)
                    .addComponent(jButtonCancelarU))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaUActionPerformed

    private void ButtonCrearUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCrearUActionPerformed
        if (!txtTipoU.getText().isEmpty() && !txtNombreU.getText().isEmpty() && !txtCorreoU.getText().isEmpty() && !txtContraseniaU.getText().isEmpty() && !txtIdU.getText().isEmpty() && !txtApellidoU.getText().isEmpty()) {

            controladorUsuario.create(txtTipoU.getText(), txtIdU.getText(), txtNombreU.getText(), txtApellidoU.getText(), txtCorreoU.getText(), String.valueOf(txtContraseniaU.getPassword()));
            JOptionPane.showMessageDialog(null, "Usuario Creado");
            limpiar();
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }

    }//GEN-LAST:event_ButtonCrearUActionPerformed

    private void txtIdUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUActionPerformed

    private void jButtonCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarUActionPerformed
        limpiar();
        this.setVisible(false);

    }//GEN-LAST:event_jButtonCancelarUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCrearU;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel contrasenia;
    private javax.swing.JLabel correo;
    private javax.swing.JButton jButtonCancelarU;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel tiulo1;
    private javax.swing.JTextField txtApellidoU;
    private javax.swing.JPasswordField txtContraseniaU;
    private javax.swing.JTextField txtCorreoU;
    private javax.swing.JTextField txtIdU;
    private javax.swing.JTextField txtNombreU;
    private javax.swing.JTextField txtTipoU;
    // End of variables declaration//GEN-END:variables
}
