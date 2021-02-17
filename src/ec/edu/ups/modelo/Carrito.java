/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dduta
 */
public class Carrito {

    private int numeroCarrito;
    private Usuario usuario;
    private List<Producto> productos;
    private double total;

    public Carrito(int numeroCarrito, double total) {
        this.numeroCarrito = numeroCarrito;
        this.total=total;
        //usuario = new Usuario();
        productos = new ArrayList<>();
    }

    public Carrito() {
        total = 0;
        //usuario = new Usuario();
        productos = new ArrayList<>();
    }

    public int getNumeroCarrito() {
        return numeroCarrito;
    }

    public void setNumeroCarrito(int numeroCarrito) {
        this.numeroCarrito = numeroCarrito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numeroCarrito;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrito other = (Carrito) obj;
        if (this.numeroCarrito != other.numeroCarrito) {
            return false;
        }
        return true;
    }

    //composicion con usuario
    public void agregarUsuarios(Usuario usuario) {
        this.usuario=usuario;
    }

    public Usuario mostrarUsuarios() {
         return usuario;   
    }
    //agregacion producto

    public void agregarProductos(Producto producto) {
        productos.add(producto);

    }

    public List<Producto> imprimirProductos() {
        return productos;
    }

    public void totalCompras(Set<Producto> productos) {
        for (Producto producto : productos) {
            total+=producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Carrito{" + "numeroCarrito=" + numeroCarrito + "\n usuario=" + usuario + "\n productos=" + productos + "\n total=" + total + '}';
    }

}
