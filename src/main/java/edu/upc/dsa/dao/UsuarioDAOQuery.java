package edu.upc.dsa.dao;

/**
 * Created by pauli on 27/12/2016.
 */
public interface UsuarioDAOQuery {

//consulta UUID genera el identificador de usuario,es una funcion de MYSQL q retorna un Identificador Universal Unico
    public final static String UUID = "select REPLACE(UUID(),'-','')";

    //Inserta un nuevo usuario en la BD.La funcion UNHEX() convierte una cadena q representa un numero en hexadecimal a datos binarios
    public final static String CREATE_USUARIO = "insert into users (id, nick, password, nombre, email) values (?, ?, ?, ?, ?);";
  //  public final static String UPDATE_USER = "update users set email=?, nombre=? where id=?";
 //   public final static String GET_USER_BY_ID = "select u.id as id, u.nick, u.email, u.nombre from usuario u where id=?";




}
