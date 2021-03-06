/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanaUsuario;

import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dduta
 */
public class BuscarUsuario extends javax.swing.JInternalFrame {

    private ControladorUsuario controladoUsuario;
    private Locale localizacion;
    private ResourceBundle mensajes;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String tipo;

    /**
     * Creates new form BuscarUsuario
     */
    public BuscarUsuario(ControladorUsuario controladoUsuario) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladoUsuario = controladoUsuario;
    }

    public void actalizar(Collection<Usuario> usuarios) {
        DefaultTableModel modelo = (DefaultTableModel) tableBuscarU.getModel();
        modelo.setRowCount(0);
        for (Usuario usuario : usuarios) {
            Object[] fila = new Object[4];
            fila[0] = usuario.getTipo();
            fila[1] = usuario.getNombre();
            fila[2] = usuario.getApellido();
            fila[3] = usuario.getCorreo();
        }
        tableBuscarU.setModel(modelo);
    }

    public void limpiar() {
        txtBuscarU.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        dd.setText(mensajes.getString("dd"));
        ButtonBuscarU.setText(mensajes.getString("ButtonBuscarU"));
        ca.setText(mensajes.getString("ca"));
        
        this.cedula = mensajes.getString("cedula");
        this.nombre = mensajes.getString("nombre");
        this.apellido = mensajes.getString("apellido");
        this.correo = mensajes.getString("correo");
        this.tipo = mensajes.getString("tipo");
        
        DefaultTableModel modelo = (DefaultTableModel) tableBuscarU.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn(cedula);
        modelo.addColumn(tipo);
        modelo.addColumn(nombre);
        modelo.addColumn(apellido);
        modelo.addColumn(correo);
        this.tableBuscarU.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dd = new javax.swing.JLabel();
        txtBuscarU = new javax.swing.JTextField();
        ButtonBuscarU = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuscarU = new javax.swing.JTable();
        ca = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Buscar Usuario");

        dd.setText("Ingrese el Codigo de la persona a Buscar:");

        txtBuscarU.setToolTipText("Inserta el codigo para listar el Usuario");
        txtBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUActionPerformed(evt);
            }
        });

        ButtonBuscarU.setText("Buscar");
        ButtonBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarUActionPerformed(evt);
            }
        });

        tableBuscarU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Tipo", "Nombre", "Apellido", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBuscarU);

        ca.setText("Cancelar");
        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(dd)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(ButtonBuscarU))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(ca)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dd)
                    .addComponent(ButtonBuscarU))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUActionPerformed

    }//GEN-LAST:event_txtBuscarUActionPerformed

    private void ButtonBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarUActionPerformed
        if (!txtBuscarU.getText().isEmpty()) {
            if (controladoUsuario.read(txtBuscarU.getText()) != null) {
                DefaultTableModel modelo = (DefaultTableModel) tableBuscarU.getModel();
                modelo.setRowCount(0);
                Object[] rowData = {controladoUsuario.read(txtBuscarU.getText()).getId(), controladoUsuario.read(txtBuscarU.getText()).getTipo(),
                    controladoUsuario.read(txtBuscarU.getText()).getNombre(), controladoUsuario.read(txtBuscarU.getText()).getApellido(), controladoUsuario.read(txtBuscarU.getText()).getCorreo()};
                modelo.addRow(rowData);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "el Usuario no existe");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonBuscarUActionPerformed

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_caActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarU;
    private javax.swing.JButton ca;
    private javax.swing.JLabel dd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuscarU;
    private javax.swing.JTextField txtBuscarU;
    // End of variables declaration//GEN-END:variables
}
