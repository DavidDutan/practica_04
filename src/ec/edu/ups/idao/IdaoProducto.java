/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.idao;

import ec.edu.ups.modelo.Producto;
import java.util.Collection;

/**
 *
 * @author dduta
 */
public interface IdaoProducto {
    public void create(Producto producto);
    public Producto read(int codigo);
    public void update (Producto producto);
    public void delete (Producto producto);
    public Collection<Producto> findAll();
}
