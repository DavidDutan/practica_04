/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Carrito;
import java.util.Collection;

/**
 *
 * @author dduta
 */
public interface IdaoCarrito {
    public void create(Carrito carrito);
    public Carrito read(int codigo);
    public void update(Carrito carrito);
    public void delete(Carrito carrito);
    public Collection<Carrito> findAll();
}

