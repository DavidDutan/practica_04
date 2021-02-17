/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Carrito;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import ec.edu.ups.idao.IdaoCarrito;

/**
 *
 * @author dduta
 */
public class DaoCarrito implements IdaoCarrito{
    
    private Map<Integer, Carrito> carritos;

    public DaoCarrito() {
        this.carritos= new HashMap<Integer,Carrito>();
    }

    @Override
    public void create(Carrito carrito) {
        carritos.put(carrito.getNumeroCarrito(), carrito);
    }

    @Override
    public Carrito read(int codigo) {
        return carritos.get(codigo);
    }

    @Override
    public void update(Carrito carrito) {
        carritos.put(carrito.getNumeroCarrito(), carrito);
    }

    @Override
    public void delete(Carrito carrito) {
        carritos.remove(carrito.getNumeroCarrito());
    }

    @Override
    public Collection<Carrito> findAll() {
        Collection<Carrito> carrito = carritos.values();
        return carrito;
    } 
}
