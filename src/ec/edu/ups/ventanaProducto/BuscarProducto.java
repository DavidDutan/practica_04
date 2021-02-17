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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dduta
 */
public class BuscarProducto extends javax.swing.JInternalFrame {

    private ControladorProducto controladorProducto;
    private Locale localizacion;
    private ResourceBundle mensajes;
    private String codigo;
    private String descripcion;
    private String precio;

    /**
     * Creates new form BuscarProducto
     */
    public BuscarProducto(ControladorProducto controladorProducto) {
        initComponents();
        this.mensajes = mensajes;
        cambiarIdioma(mensajes);
        this.controladorProducto = controladorProducto;
    }

    public void limpiar() {
        txtBuscarP.setText("");
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        productoabuscar.setText(mensajes.getString("productoabuscar"));
        ButtonBuscarP.setText(mensajes.getString("ButtonBuscarP"));
        CancelarBP.setText(mensajes.getString("CancelarBP"));
        
         this.codigo=mensajes.getString("codigop");
        this.descripcion=mensajes.getString("descripcionp");
        this.precio=mensajes.getString("preciop");
        
        DefaultTableModel modelo = (DefaultTableModel) tablaBuscarP.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn(codigo);
        modelo.addColumn(descripcion);
        modelo.addColumn(precio);
        this.tablaBuscarP.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productoabuscar = new javax.swing.JLabel();
        ButtonBuscarP = new javax.swing.JButton();
        txtBuscarP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscarP = new javax.swing.JTable();
        CancelarBP = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Buscar Productos");

        productoabuscar.setText("Ingrese el codigo del producto a Buscar:");

        ButtonBuscarP.setText("Buscar");
        ButtonBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarPActionPerformed(evt);
            }
        });

        txtBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPActionPerformed(evt);
            }
        });

        tablaBuscarP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrpcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaBuscarP);

        CancelarBP.setText("Cancelar");
        CancelarBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(productoabuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ButtonBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(CancelarBP)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoabuscar)
                    .addComponent(txtBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelarBP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPActionPerformed

    private void ButtonBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarPActionPerformed
        if (!txtBuscarP.getText().isEmpty()) {
            if (controladorProducto.read(Integer.parseUnsignedInt(txtBuscarP.getText())) != null) {
               
                DefaultTableModel modelo = (DefaultTableModel) tablaBuscarP.getModel();
                modelo.setRowCount(0);
                Object[] rowData = {controladorProducto.read(Integer.valueOf(txtBuscarP.getText())).getCodigo(), controladorProducto.read(Integer.valueOf(txtBuscarP.getText())).getDescripcion(), controladorProducto.read(Integer.valueOf(txtBuscarP.getText())).getPrecio()};
                modelo.addRow(rowData);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no Existe");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los Campos");
        }
    }//GEN-LAST:event_ButtonBuscarPActionPerformed

    private void CancelarBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarBPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscarP;
    private javax.swing.JButton CancelarBP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productoabuscar;
    private javax.swing.JTable tablaBuscarP;
    private javax.swing.JTextField txtBuscarP;
    // End of variables declaration//GEN-END:variables
}