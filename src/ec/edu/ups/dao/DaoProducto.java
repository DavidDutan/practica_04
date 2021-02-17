/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Producto;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ec.edu.ups.idao.IdaoProducto;

/**
 *
 * @author dduta
 */
public class DaoProducto implements IdaoProducto {
    
     private Map<Integer, Producto> diccionario;

    public DaoProducto() {
        this.diccionario = new HashMap<Integer,Producto>();
        
    }

    @Override
    public void create(Producto producto) {
         diccionario.put(producto.getCodigo(), producto );
    }

    @Override
    public Producto read(int codigo) {
         return diccionario.get(codigo);
    }

    @Override
    public void update(Producto producto) {
         diccionario.put(producto.getCodigo(), producto);
    }

    @Override
    public void delete(Producto producto) {
          diccionario.remove(producto);
    }

    @Override
    public Collection<Producto> findAll() {
            Collection<Producto> productos = diccionario.values();
        return productos;
    }
    
}

