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
public class EditarUsuario extends javax.swing.JInternalFrame {

    private ControladorUsuario controladoUsuario;
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form EditarUsuario
     */
    public EditarUsuario(ControladorUsuario controladoUsuario) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladoUsuario = controladoUsuario;
    }

    public void limpiar() {
        contrasenia.setText("");
        txtApellidoActualizarU.setText("");
        txtCedulaU.setText("");
        txtCorreoActualizarU.setText("");
        txtNombreActualizarU.setText("");
        txtTipoActualizarU.setText("");
        txtcu.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        lebelUsuarioEditar.setText(mensajes.getString("lebelUsuarioEditar"));
        ButtonBuscarU.setText(mensajes.getString("ButtonBuscarU"));
        Labesuariol.setText(mensajes.getString("Labesuariol"));
        tipo.setText(mensajes.getString("tipo"));
        nombre.setText(mensajes.getString("nombre"));
        apellido.setText(mensajes.getString("apellido"));
        correo.setText(mensajes.getString("correo"));
        contrasenia.setText(mensajes.getString("contrasenia"));
        ButtonActualizarU.setText(mensajes.getString("ButtonActualizarU"));
        jButton1.setText(mensajes.getString("jButton1"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lebelUsuarioEditar = new javax.swing.JLabel();
        Labesuariol = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        ButtonBuscarU = new javax.swing.JButton();
        ButtonActualizarU = new javax.swing.JButton();
        txtCedulaU = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        txtTipoActualizarU = new javax.swing.JTextField();
        txtApellidoActualizarU = new javax.swing.JTextField();
        txtNombreActualizarU = new javax.swing.JTextField();
        txtCorreoActualizarU = new javax.swing.JTextField();
        contrasenia = new javax.swing.JLabel();
        txtcu = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Editar Usuarios");

        lebelUsuarioEditar.setText("Ingrese la Cedula del Usuario a Editar:");

        Labesuariol.setText("Ingrese los nuevos Datos");

        tipo.setText("Tipo:");

        nombre.setText("Nombre:");

        apellido.setText("Apellido:");

        ButtonBuscarU.setText("Buscar");
        ButtonBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarUActionPerformed(evt);
            }
        });

        ButtonActualizarU.setText("Actualizar");
        ButtonActualizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarUActionPerformed(evt);
            }
        });

        correo.setText("Correo:");

        txtTipoActualizarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActualizarUActionPerformed(evt);
            }
        });

        contrasenia.setText("contraseña");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lebelUsuarioEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Labesuariol)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(ButtonBuscarU))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre)
                                    .addComponent(tipo)
                                    .addComponent(apellido)
                                    .addComponent(correo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(contrasenia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcu))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonActualizarU)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(78, 78, 78)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lebelUsuarioEditar)
                    .addComponent(txtCedulaU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonBuscarU)
                .addGap(14, 14, 14)
                .addComponent(Labesuariol)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo)
                    .addComponent(txtTipoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(txtNombreActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido)
                    .addComponent(txtApellidoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correo)
                    .addComponent(txtCorreoActualizarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenia)
                    .addComponent(txtcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonActualizarU)
                    .addComponent(jButton1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActualizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActualizarUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActualizarUActionPerformed

    private void ButtonActualizarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarUActionPerformed
        if (!txtApellidoActualizarU.getText().isEmpty() && !txtTipoActualizarU.getText().isEmpty() && !txtCorreoActualizarU.getText().isEmpty() && !txtNombreActualizarU.getText().isEmpty() && !txtcu.getText().isEmpty()) {
            controladoUsuario.update(txtTipoActualizarU.getText(), txtCedulaU.getText(), txtNombreActualizarU.getText(), txtApellidoActualizarU.getText(), txtCorreoActualizarU.getText(), txtcu.getText());
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonActualizarUActionPerformed

    private void ButtonBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarUActionPerformed
        if (!txtCedulaU.getText().isEmpty()) {
            if (controladoUsuario.read(txtCedulaU.getText()) != null) {
                txtTipoActualizarU.setText(controladoUsuario.read(txtCedulaU.getText()).getTipo());
                txtNombreActualizarU.setText(controladoUsuario.read(txtCedulaU.getText()).getNombre());
                txtApellidoActualizarU.setText(controladoUsuario.read(txtCedulaU.getText()).getApellido());
                txtCorreoActualizarU.setText(controladoUsuario.read(txtCedulaU.getText()).getCorreo());
                txtcu.setText(controladoUsuario.read(txtCedulaU.getText()).getContrasenia());

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Usuario");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Campo buscar Uusuario vacio");
        }
    }//GEN-LAST:event_ButtonBuscarUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarU;
    private javax.swing.JButton ButtonBuscarU;
    private javax.swing.JLabel Labesuariol;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel contrasenia;
    private javax.swing.JLabel correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lebelUsuarioEditar;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextField txtApellidoActualizarU;
    private javax.swing.JTextField txtCedulaU;
    private javax.swing.JTextField txtCorreoActualizarU;
    private javax.swing.JTextField txtNombreActualizarU;
    private javax.swing.JTextField txtTipoActualizarU;
    private javax.swing.JPasswordField txtcu;
    // End of variables declaration//GEN-END:variables
}