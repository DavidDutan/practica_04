/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ventanPrincipal;

import ec.edu.ups.idao.*;
import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.DaoCarrito;
import ec.edu.ups.dao.DaoProducto;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.ventanaUsuario.*;
import ec.edu.ups.ventanaProducto.*;
import ec.edu.ups.ventanaCarrito.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import sun.misc.Resource;

/**
 *
 * @author dduta
 */
public class Principal extends javax.swing.JFrame {

    private EditarUsuario editarU;
    private EliminarUsuario eliminarU;
    private CrearUsuario creaUsuario;
    private IngresarUsuario ingresarU;
    private ListarUsuarios listarU;
    private BuscarUsuario buscarU;

    private BuscarProducto buscarP;
    private CreaProducto crearP;
    private EliminarProducto eliminarP;
    private ListarProductos listarP;
    private ModificarProducto modificarP;

    private CrearCarrito crearC;
    private EliminarCarrito eliminarC;
    private ListarCarrito listarC;
    //idaos
    private IdaoCarrito idaoC;
    private IdaoProducto idaoP;
    private IdaoUsuario idaoU;
    //controladores
    private ControladorCarrito controladorC;
    private ControladorProducto controladorP;
    private ControladorUsuario controladorU;
    //Internacionalizacion
    private Locale localizacion;
    private ResourceBundle mensajes;

    public Principal() {
        initComponents();
        //idao
        idaoC = new DaoCarrito();
        idaoP = new DaoProducto();
        idaoU = new DaoUsuario();
        //contructores
        controladorC = new ControladorCarrito(idaoP, idaoU, idaoC);
        controladorP = new ControladorProducto(idaoP);
        controladorU = new ControladorUsuario(idaoU);
        //Ventanas Usuario
        eliminarU = new EliminarUsuario(controladorU);
        editarU = new EditarUsuario(controladorU);
        creaUsuario = new CrearUsuario(controladorU);
        ingresarU = new IngresarUsuario(controladorU, this);
        listarU = new ListarUsuarios(controladorU);
        buscarU = new BuscarUsuario(controladorU);
        //Ventanas producto
        buscarP = new BuscarProducto(controladorP);
        crearP = new CreaProducto(controladorP);
        eliminarP = new EliminarProducto(controladorP);
        listarP = new ListarProductos(controladorP);
        modificarP = new ModificarProducto(controladorP);
        //ventanas carrito
        crearC = new CrearCarrito(controladorC, controladorP, controladorU);
        eliminarC = new EliminarCarrito(controladorC);
        listarC = new ListarCarrito(controladorC,controladorU,controladorP);
        //ventanas usuarios al panel
        desktopPane.add(ingresarU);
        desktopPane.add(eliminarU);
        desktopPane.add(editarU);
        desktopPane.add(creaUsuario);
        desktopPane.add(buscarU);
        desktopPane.add(listarU);
        //ventanas producto al panel
        desktopPane.add(buscarP);
        desktopPane.add(crearP);
        desktopPane.add(eliminarP);
        desktopPane.add(listarP);
        desktopPane.add(modificarP);
        //ventanas carrito al panel
        desktopPane.add(crearC);
        desktopPane.add(eliminarC);
        desktopPane.add(listarC);

        menuItemEditarU.setVisible(false);
        menuItemEliminarU.setVisible(false);
        menuItemListarU.setVisible(false);
        menuItemBuscarU.setVisible(false);

        menuItemCrearP.setVisible(false);
        menuItemBuscarP.setVisible(false);
        menuItemAcutualizarP.setVisible(false);
        menuItemEliminarP.setVisible(false);

        menuItemEliminarC.setVisible(false);
        menuItemCrearC.setVisible(false);
        menuItemCerrarSesion.setVisible(false);
        //internacionalizacion
        setLocationRelativeTo(null);
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma(mensajes);
    }

    public JMenuItem getMenuIniciar() {
        return menuItemIngresarU;
    }

    public JMenuItem getCrearU() {
        return menuItemCrearUsuario;
    }

    public JMenuItem getMenuEliminarC() {
        return menuItemEliminarC;
    }

    public JMenuItem getMenuCrearC() {
        return menuItemCrearC;
    }

    public JMenuItem getMenuEliminarP() {
        return menuItemEliminarP;
    }

    public JMenuItem getMenuAcutualizarP() {
        return menuItemAcutualizarP;
    }

    public JMenuItem getCerrarS() {
        return menuItemCerrarSesion;
    }

    public JMenuItem getMenuBuscarP() {
        return menuItemBuscarP;
    }

    public JMenuItem getMenuCrearP() {
        return menuItemCrearP;
    }

    public JMenuItem getMenuListar() {
        return menuItemListarU;
    }

    public JMenuItem getMenuBuscar() {
        return menuItemBuscarU;
    }

    public JMenuItem getMenuEditarU() {
        return menuItemEditarU;
    }

    public JMenuItem getMenueliminarU() {
        return menuItemEliminarU;
    }

    public void cambiarIdioma(ResourceBundle mensajes) {
        mensajes = ResourceBundle.getBundle("ec.edu.ups.Idiomas.mensajes", Locale.getDefault());
        menuIdioma.setText(mensajes.getString("menuIdioma"));
        MenuUsuario.setText(mensajes.getString("menuUsuario"));
        MenuCarrito.setText(mensajes.getString("menuCarrito"));
        MenuProducto.setText(mensajes.getString("menuProducto"));
        menuItemIngels.setText(mensajes.getString("menuItemIngels"));
        menuItemEspanol.setText(mensajes.getString("menuItemEspanol"));
        menuItemCrearUsuario.setText(mensajes.getString("menuItemCrearUsuario"));
        menuItemIngresarU.setText(mensajes.getString("menuItemIngresarU"));
        menuItemBuscarU.setText(mensajes.getString("menuItemBuscarU"));
        menuItemEliminarU.setText(mensajes.getString("menuItemEliminarU"));
        menuItemEditarU.setText(mensajes.getString("menuItemEditarU"));
        menuItemListarU.setText(mensajes.getString("menuItemListarU"));
        menuItemCerrarSesion.setText(mensajes.getString("menuItemCerrarSesion"));
        menuItemSalir.setText(mensajes.getString("menuItemSalir"));
        menuItemCrearP.setText(mensajes.getString("menuItemCrearP"));
        menuItemBuscarP.setText(mensajes.getString("menuItemBuscarP"));
        menuItemEliminarP.setText(mensajes.getString("menuItemEliminarP"));
        menuItemListarP.setText(mensajes.getString("menuItemListarP"));
        menuItemAcutualizarP.setText(mensajes.getString("menuItemAcutualizarP"));
        menuItemCrearC.setText(mensajes.getString("menuItemCrearC"));
        menuItemListarC.setText(mensajes.getString("menuItemListarC"));
        menuItemEliminarC.setText(mensajes.getString("menuItemEliminarC"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuIdioma = new javax.swing.JMenu();
        menuItemIngels = new javax.swing.JMenuItem();
        menuItemEspanol = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        menuItemIngresarU = new javax.swing.JMenuItem();
        menuItemCrearUsuario = new javax.swing.JMenuItem();
        menuItemBuscarU = new javax.swing.JMenuItem();
        menuItemEliminarU = new javax.swing.JMenuItem();
        menuItemEditarU = new javax.swing.JMenuItem();
        menuItemListarU = new javax.swing.JMenuItem();
        menuItemCerrarSesion = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        menuItemCrearP = new javax.swing.JMenuItem();
        menuItemAcutualizarP = new javax.swing.JMenuItem();
        menuItemEliminarP = new javax.swing.JMenuItem();
        menuItemBuscarP = new javax.swing.JMenuItem();
        menuItemListarP = new javax.swing.JMenuItem();
        MenuCarrito = new javax.swing.JMenu();
        menuItemCrearC = new javax.swing.JMenuItem();
        menuItemListarC = new javax.swing.JMenuItem();
        menuItemEliminarC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 255));

        menuIdioma.setText("Idiomas");

        menuItemIngels.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemIngels.setText("Ingles");
        menuItemIngels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIngelsActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemIngels);

        menuItemEspanol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        menuItemEspanol.setText("Español");
        menuItemEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspanolActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemEspanol);

        menuBar.add(menuIdioma);

        MenuUsuario.setMnemonic('f');
        MenuUsuario.setText("Usuario");

        menuItemIngresarU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuItemIngresarU.setMnemonic('o');
        menuItemIngresarU.setText("Ingresar");
        menuItemIngresarU.setToolTipText("Ingresa si ya tienes una cuenta");
        menuItemIngresarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIngresarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemIngresarU);

        menuItemCrearUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCrearUsuario.setMnemonic('s');
        menuItemCrearUsuario.setText("Crear");
        menuItemCrearUsuario.setToolTipText("Dale click para crear una cuenta");
        menuItemCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemCrearUsuario);

        menuItemBuscarU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemBuscarU.setMnemonic('a');
        menuItemBuscarU.setText("Buscar");
        menuItemBuscarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemBuscarU);

        menuItemEliminarU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEliminarU.setMnemonic('x');
        menuItemEliminarU.setText("Eliminar");
        menuItemEliminarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemEliminarU);

        menuItemEditarU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEditarU.setText("Editar");
        menuItemEditarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemEditarU);

        menuItemListarU.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemListarU.setText("Listar Usuarios");
        menuItemListarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarUActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemListarU);

        menuItemCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCerrarSesion.setText("Cerrar Session");
        menuItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCerrarSesionActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemCerrarSesion);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        MenuUsuario.add(menuItemSalir);

        menuBar.add(MenuUsuario);

        MenuProducto.setMnemonic('e');
        MenuProducto.setText("Producto");

        menuItemCrearP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCrearP.setMnemonic('t');
        menuItemCrearP.setText("Crear");
        menuItemCrearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearPActionPerformed(evt);
            }
        });
        MenuProducto.add(menuItemCrearP);

        menuItemAcutualizarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemAcutualizarP.setMnemonic('y');
        menuItemAcutualizarP.setText("Actualizar");
        menuItemAcutualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcutualizarPActionPerformed(evt);
            }
        });
        MenuProducto.add(menuItemAcutualizarP);

        menuItemEliminarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEliminarP.setMnemonic('p');
        menuItemEliminarP.setText("Eliminar");
        menuItemEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarPActionPerformed(evt);
            }
        });
        MenuProducto.add(menuItemEliminarP);

        menuItemBuscarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        menuItemBuscarP.setMnemonic('d');
        menuItemBuscarP.setText("Buscar");
        menuItemBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarPActionPerformed(evt);
            }
        });
        MenuProducto.add(menuItemBuscarP);

        menuItemListarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuItemListarP.setText("Listar Productos");
        menuItemListarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarPActionPerformed(evt);
            }
        });
        MenuProducto.add(menuItemListarP);

        menuBar.add(MenuProducto);

        MenuCarrito.setMnemonic('h');
        MenuCarrito.setText("Carrito Compras");

        menuItemCrearC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCrearC.setMnemonic('c');
        menuItemCrearC.setText("Crear un Carrito de Compras");
        menuItemCrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearCActionPerformed(evt);
            }
        });
        MenuCarrito.add(menuItemCrearC);

        menuItemListarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemListarC.setMnemonic('a');
        menuItemListarC.setText("Ver Carrito de Compras");
        menuItemListarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCActionPerformed(evt);
            }
        });
        MenuCarrito.add(menuItemListarC);

        menuItemEliminarC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEliminarC.setText("Eliminar un Carrito de Compras");
        menuItemEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCActionPerformed(evt);
            }
        });
        MenuCarrito.add(menuItemEliminarC);

        menuBar.add(MenuCarrito);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemEliminarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarUActionPerformed
        eliminarU.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarUActionPerformed

    private void menuItemAcutualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcutualizarPActionPerformed
        modificarP.setVisible(true);
    }//GEN-LAST:event_menuItemAcutualizarPActionPerformed

    private void menuItemBuscarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarUActionPerformed
        buscarU.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarUActionPerformed

    private void menuItemEditarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarUActionPerformed
        editarU.setVisible(true);
    }//GEN-LAST:event_menuItemEditarUActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearUsuarioActionPerformed

        creaUsuario.setVisible(true);
    }//GEN-LAST:event_menuItemCrearUsuarioActionPerformed

    private void menuItemIngresarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIngresarUActionPerformed
        ingresarU.setVisible(true);

    }//GEN-LAST:event_menuItemIngresarUActionPerformed

    private void menuItemListarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarUActionPerformed
        listarU.setVisible(true);
    }//GEN-LAST:event_menuItemListarUActionPerformed

    private void menuItemCrearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearPActionPerformed
        crearP.setVisible(true);
    }//GEN-LAST:event_menuItemCrearPActionPerformed

    private void menuItemEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarPActionPerformed
        eliminarP.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarPActionPerformed

    private void menuItemBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarPActionPerformed
        buscarP.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarPActionPerformed

    private void menuItemListarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarPActionPerformed
        listarP.setVisible(true);
    }//GEN-LAST:event_menuItemListarPActionPerformed

    private void menuItemEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCActionPerformed
        eliminarC.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCActionPerformed

    private void menuItemCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearCActionPerformed
        crearC.setVisible(true);
    }//GEN-LAST:event_menuItemCrearCActionPerformed

    private void menuItemListarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCActionPerformed
        listarC.setVisible(true);
    }//GEN-LAST:event_menuItemListarCActionPerformed

    private void menuItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCerrarSesionActionPerformed
        getMenuBuscar().setVisible(false);
        getMenuBuscarP().setVisible(false);
        getMenuCrearC().setVisible(false);
        getMenuCrearP().setVisible(false);
        getMenuEditarU().setVisible(false);
        getMenuEliminarC().setVisible(false);
        getMenuListar().setVisible(false);
        getMenueliminarU().setVisible(false);
        getMenuAcutualizarP().setVisible(false);
        getMenuEliminarP().setVisible(false);
        getCerrarS().setVisible(false);
        getCrearU().setVisible(true);
        getMenuIniciar().setVisible(true);
    }//GEN-LAST:event_menuItemCerrarSesionActionPerformed

    private void menuItemEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspanolActionPerformed
        localizacion = new Locale("es", "EC");
        Locale.setDefault(localizacion);
        cambiarIdioma(mensajes);
        if (listarU != null || listarU.isVisible()) {
            listarU.cambiarIdioma(mensajes);
        }
        if (ingresarU != null || ingresarU.isVisible()) {
            ingresarU.cambiarIdioma(mensajes);
        }
        if (eliminarU != null || eliminarU.isVisible()) {
            eliminarU.cambiarIdioma(mensajes);
        }
        if (editarU != null || editarU.isVisible()) {
            editarU.cambiarIdioma(mensajes);
        }
        if (creaUsuario != null || creaUsuario.isVisible()) {
            creaUsuario.cambiarIdioma(mensajes);
        }
        if (buscarU != null || buscarU.isVisible()) {
            buscarU.cambiarIdioma(mensajes);
        }
        if (modificarP != null || modificarP.isVisible()) {
            modificarP.cambiarIdioma(mensajes);
        }
        if (listarP != null || listarP.isVisible()) {
            listarP.cambiarIdioma(mensajes);
        }
        if (eliminarP != null || eliminarP.isVisible()) {
            eliminarP.cambiarIdioma(mensajes);
        }
        if (crearP != null || crearP.isVisible()) {
            crearP.cambiarIdioma(mensajes);
        }
        if (buscarP != null || buscarP.isVisible()) {
            buscarP.cambiarIdioma(mensajes);
        }
        if (listarC != null || listarC.isVisible()) {
            listarC.cambiarIdioma(mensajes);
        }
        if (eliminarC != null || eliminarC.isVisible()) {
            eliminarC.cambiarIdioma(mensajes);
        }
        if (crearC != null ||crearC.isVisible()) {
            crearC.cambiarIdioma(mensajes);
        }


    }//GEN-LAST:event_menuItemEspanolActionPerformed

    private void menuItemIngelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIngelsActionPerformed
        localizacion = new Locale("en", "UK");
        Locale.setDefault(localizacion);
        cambiarIdioma(mensajes);
        if (listarU != null || listarU.isVisible()) {
            listarU.cambiarIdioma(mensajes);
        }
        if (ingresarU != null || ingresarU.isVisible()) {
            ingresarU.cambiarIdioma(mensajes);
        }
        if (eliminarU != null || eliminarU.isVisible()) {
            eliminarU.cambiarIdioma(mensajes);
        }

        if (editarU != null || editarU.isVisible()) {
            editarU.cambiarIdioma(mensajes);
        }
        if (creaUsuario != null || creaUsuario.isVisible()) {
            creaUsuario.cambiarIdioma(mensajes);
        }
        if (buscarU != null || buscarU.isVisible()) {
            buscarU.cambiarIdioma(mensajes);
        }
        if (modificarP != null || modificarP.isVisible()) {
            modificarP.cambiarIdioma(mensajes);
        }
        if (listarP != null || listarP.isVisible()) {
            listarP.cambiarIdioma(mensajes);
        }
        if (eliminarP != null || eliminarP.isVisible()) {
            eliminarP.cambiarIdioma(mensajes);
        }
        if (crearP != null || crearP.isVisible()) {
            crearP.cambiarIdioma(mensajes);
        }
        if (buscarP != null || buscarP.isVisible()) {
            buscarP.cambiarIdioma(mensajes);
        }
        if (listarC != null || listarC.isVisible()) {
            listarC.cambiarIdioma(mensajes);
        }
        if (eliminarC != null || eliminarC.isVisible()) {
            eliminarC.cambiarIdioma(mensajes);
        }
        if (crearC != null || crearC.isVisible()) {
            crearC.cambiarIdioma(mensajes);
        }


    }//GEN-LAST:event_menuItemIngelsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCarrito;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenuItem menuItemAcutualizarP;
    private javax.swing.JMenuItem menuItemBuscarP;
    private javax.swing.JMenuItem menuItemBuscarU;
    private javax.swing.JMenuItem menuItemCerrarSesion;
    private javax.swing.JMenuItem menuItemCrearC;
    private javax.swing.JMenuItem menuItemCrearP;
    private javax.swing.JMenuItem menuItemCrearUsuario;
    private javax.swing.JMenuItem menuItemEditarU;
    private javax.swing.JMenuItem menuItemEliminarC;
    private javax.swing.JMenuItem menuItemEliminarP;
    private javax.swing.JMenuItem menuItemEliminarU;
    private javax.swing.JMenuItem menuItemEspanol;
    private javax.swing.JMenuItem menuItemIngels;
    private javax.swing.JMenuItem menuItemIngresarU;
    private javax.swing.JMenuItem menuItemListarC;
    private javax.swing.JMenuItem menuItemListarP;
    private javax.swing.JMenuItem menuItemListarU;
    private javax.swing.JMenuItem menuItemSalir;
    // End of variables declaration//GEN-END:variables

}
