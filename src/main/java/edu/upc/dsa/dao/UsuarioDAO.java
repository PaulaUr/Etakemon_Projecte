package edu.upc.dsa.dao;

import edu.upc.dsa.entity.Usuario;

import java.sql.SQLException;

/**
 * Created by pauli on 24/12/2016.
 */
public interface UsuarioDAO {

    public Usuario createUsuario (String nombre, String nick, String password,String email) throws SQLException;
    //actualiza el perfil y lo q se puede modificar sera el email
    public Usuario updateProfile (Integer id,String nombre, String nick,String email );
    public Usuario getUsuarioById(Integer id);
    public Usuario getUusarioByNick(String nick);
    public  boolean deleteUser(Integer id);
    public boolean checkPassword(Integer id, String password);

}
