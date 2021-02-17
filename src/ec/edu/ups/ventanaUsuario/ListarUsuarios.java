/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanaUsuario;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dduta
 */
public class ListarUsuarios extends javax.swing.JInternalFrame {

    private ControladorUsuario controladorUsuario;
    private Locale localizacion;
    private ResourceBundle mensajes;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String tipo;

    /**
     * Creates new form ListarUsuarios
     */
    public ListarUsuarios(ControladorUsuario controladorUsuario) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorUsuario = controladorUsuario;
    }

    public void actalizar(Collection<Usuario> usuarios) {
        DefaultTableModel modelo = (DefaultTableModel) TablaListarU.getModel();
        modelo.setRowCount(0);
        for (Usuario usuario : usuarios) {
            Object[] fila = new Object[4];
            fila[0] = usuario.getId();
            fila[1] = usuario.getNombre();
            fila[2] = usuario.getApellido();
            fila[3] = usuario.getTipo();
        }
        TablaListarU.setModel(modelo);
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        ButtonListarU.setText(mensajes.getString("ButtonListarU"));
        ButtonCancelarU.setText(mensajes.getString("ButtonCancelarU"));
        
        this.cedula = mensajes.getString("cedula");
        this.nombre = mensajes.getString("nombre");
        this.apellido = mensajes.getString("apellido");
        this.correo = mensajes.getString("correo");
        this.tipo = mensajes.getString("tipo");
        
        DefaultTableModel modelo = (DefaultTableModel) TablaListarU.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn(cedula);
        modelo.addColumn(nombre);
        modelo.addColumn(apellido);
        modelo.addColumn(correo);
        modelo.addColumn(tipo);
        this.TablaListarU.setModel(modelo);
    }
     public void limpiarTblLista() {
       TablaListarU.removeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListarU = new javax.swing.JTable();
        ButtonListarU = new javax.swing.JButton();
        ButtonCancelarU = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Ventana Listar Usuario");

        TablaListarU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaListarU);

        ButtonListarU.setText("Listar");
        ButtonListarU.setToolTipText("Dale push para lista los USUARIOSr");
        ButtonListarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListarUActionPerformed(evt);
            }
        });

        ButtonCancelarU.setText("Cancelar");
        ButtonCancelarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(ButtonListarU, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(ButtonCancelarU, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonListarU)
                    .addComponent(ButtonCancelarU))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonListarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListarUActionPerformed
        Collection<Usuario> listaUsuarios = controladorUsuario.findAll();
        DefaultTableModel modelo = (DefaultTableModel) TablaListarU.getModel();
        modelo.setRowCount(0);
        for (Usuario usuario : listaUsuarios) {
            Object[] rowData = {usuario.getId(), usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getTipo()};
            modelo.addRow(rowData);
        }
    }//GEN-LAST:event_ButtonListarUActionPerformed

    private void ButtonCancelarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarUActionPerformed
        limpiarTblLista();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarUActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelarU;
    private javax.swing.JButton ButtonListarU;
    private javax.swing.JTable TablaListarU;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
