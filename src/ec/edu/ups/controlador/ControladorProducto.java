/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.Collection;
import ec.edu.ups.idao.IdaoProducto;

/**
 *
 * @author dduta
 */
public class ControladorProducto {
    private IdaoProducto idaoP;
    private Producto producto;

    public ControladorProducto(IdaoProducto IDAOProducto) {
        idaoP=IDAOProducto;
    }
    
    public void create(int codigo,String descripcion,double precio){
        producto= new Producto(codigo, descripcion, precio);
        idaoP.create(producto);
    }
    
    public Producto read(int codigo){
         producto=idaoP.read(codigo);
        if(producto!=null){
            return producto;
        }else{
            System.out.println("El producto no existente");
        }
        return null;
    } 
    
    public void update(int codigo,String descripcion,double precio){
        producto= new Producto(codigo, descripcion, precio);
        idaoP.update(producto);
    }
    
    public void delete(int codigo){
      producto=new Producto(codigo, null, 0);
      idaoP.delete(producto);
    }
    
     public Collection<Producto> findAll() {
        return idaoP.findAll();
    }
}
