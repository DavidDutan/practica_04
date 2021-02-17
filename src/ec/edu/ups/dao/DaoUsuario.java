/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import ec.edu.ups.idao.IdaoUsuario;

/**
 *
 * @author dduta
 */
public class DaoUsuario implements IdaoUsuario{
    
    private Map<String, Usuario> diccionario;
    
    public DaoUsuario() {
        this.diccionario = new HashMap<String,Usuario>();
        
    }
    @Override
    public void create(Usuario usuario) {
        diccionario.put(usuario.getId(), usuario );
    }

    @Override
    public Usuario read(String id) {
      return diccionario.get(id);
    }

    @Override
    public void update(Usuario usuario) {
        diccionario.put(usuario.getId(), usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        diccionario.remove(usuario.getId());
    }
    
    @Override
    public Usuario validar(String correo, String contrasenia) {
        Collection <Usuario> usuarios=diccionario.values();
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasenia().equals(contrasenia)) {
                return usuario;
            }else{
                  System.out.println("Usuario no existente");
                }
        }
        return null;
    }

    @Override
    public Collection<Usuario> findAll() {
        Collection<Usuario> usuarios = diccionario.values();
        return usuarios;
    }  
}
