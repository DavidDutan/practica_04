/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.*;
import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author dduta
 */
public class ControladorCarrito {
    //modelos
    private Carrito carrito;
    private Usuario usuario;
    private Producto producto;
    //idao
    private IdaoCarrito IDAOCarrito;
    private IdaoProducto IDAOProducto;
    private IdaoUsuario IDAOUsuario;

    public ControladorCarrito(IdaoProducto IdaoP, IdaoUsuario IdaoU, IdaoCarrito idaoCarrito) {
        IDAOCarrito=idaoCarrito;
        IDAOProducto = IdaoP;
        IDAOUsuario = IdaoU;
    }

    public void create(int numero, Usuario usuario, Set<Integer> productos) {
        carrito = new Carrito(numero, 0);
        Set<Producto> productos1 = new HashSet<>();
        for (int producto1 : productos) {
            producto = IDAOProducto.read(producto1);
            carrito.agregarProductos(producto);
            productos1.add(producto);
        }
        this.usuario=usuario;
        carrito.totalCompras(productos1);
        carrito.agregarUsuarios(this.usuario);
        IDAOCarrito.create(carrito);
    }

    public Carrito read(int numeroCarrito) {
        carrito = IDAOCarrito.read(numeroCarrito);
        if (carrito != null) {
            return carrito;
        }
        return null;
    }

    public void update(int numeroCarrito, Set<Integer> productos) {
        carrito = new Carrito(numeroCarrito, 0);
        Set<Producto> productos1 = new HashSet<>();
        for (int producto1 : productos) {
            producto = IDAOProducto.read(producto1);
            carrito.agregarProductos(producto);
            productos1.add(producto);
        }
        carrito.totalCompras(productos1);
        IDAOCarrito.update(carrito);
    }

    public void delete(int numeroCarrito) {
        carrito = new Carrito(numeroCarrito, numeroCarrito);
        IDAOCarrito.delete(carrito);
    }

    public Collection<Carrito> findAll() {
        return IDAOCarrito.findAll();
    }

    public Set<Carrito> ListarCarritoPorCdedulaOCorreo(String tipo, String contenido) {
        Set <Carrito> carritos=new HashSet<>();
        if (tipo.equals("cedula")) {
            for (Carrito carrito : IDAOCarrito.findAll()) {
                if (carrito.mostrarUsuarios().getId().equals(contenido)) {
                    carritos.add(carrito);
                }
            }
        } else {
            for (Carrito carrito : IDAOCarrito.findAll()) {
                if (carrito.mostrarUsuarios().getCorreo().equals(contenido)) {
                    carritos.add(carrito);
                }
            }
        }
        return carritos;
    }
}