/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import ec.edu.ups.modelo.Usuario;
import java.util.Collection;
import ec.edu.ups.idao.IdaoUsuario;

/**
 *
 * @author dduta
 */
public class ControladorUsuario {

    private IdaoUsuario idaoU;
    private Usuario usuario;

    public ControladorUsuario(IdaoUsuario IDAOUsuario) {
        idaoU=IDAOUsuario;
    }

    public void create(String tipo,String id,String nombre,String apellido, String correo, String contrasenia){
        usuario=new Usuario(tipo, id, nombre, apellido, correo, contrasenia);
        idaoU.create(usuario);
    }
    
    public Usuario read(String id){
        usuario=idaoU.read(id);
        if(usuario!=null){
            return usuario;
        }else{
            System.out.println("Usuario no existente");
        }
        return null;
    }
    
    public void update(String tipo,String id,String nombre,String apellido, String correo, String contrasenia){
        usuario =new Usuario(tipo, id, nombre, apellido, correo, contrasenia);
        idaoU.update(usuario);
        
    }
    
    public void delete(String id){
       usuario=new Usuario(null, id, null, null, null, null);
       idaoU.delete(usuario);
    }
    
    public Usuario validar(String contrasenia, String correo){
        usuario= idaoU.validar(correo, contrasenia);
        return usuario;
    }
    
    public Collection<Usuario> findAll() {
        return idaoU.findAll();
    }
    
    public Usuario verUsuario(){
        return usuario;
    }
}
