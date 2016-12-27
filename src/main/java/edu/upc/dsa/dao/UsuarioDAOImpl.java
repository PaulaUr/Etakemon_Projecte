package edu.upc.dsa.dao;

import edu.upc.dsa.entity.Usuario;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.eclipse.persistence.config.TargetDatabase.Database;

/**
 * Created by pauli on 24/12/2016.
 */
public class UsuarioDAOImpl implements UsuarioDAO{

    static final Logger logger = Logger.getLogger(UsuarioDAOImpl.class);

    @Override
    public Usuario createUsuario(String nombre, String nick, String password, String email) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;
        int id = 0;
        try{
            Usuario usuario = getUusarioByNick(nick);
            if(usuario !=null)
                logger.error("Usuario" +getUusarioByNick(nick)+"existe");
            connection = edu.upc.dsa.dao.Database.getConnection();
            stmt = connection.prepareStatement(UsuarioDAOQuery.UUID);
            ResultSet rs = stmt.executeQuery();

            if (rs.next())
                id = rs.getInt(1);
            else
                throw new SQLException();

            connection.setAutoCommit(false);

            stmt.close();
            stmt = connection.prepareStatement(UsuarioDAOQuery.CREATE_USUARIO);
            stmt.setInt(1, id);
            stmt.setString(2, nick);
            stmt.setString(3, password);
            stmt.setString(4, email);
            stmt.setString(5, nombre);
            stmt.executeUpdate();

            stmt.close();
            //  stmt = connection.prepareStatement(UserDAOQuery.ASSIGN_ROLE_REGISTERED);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            logger.error(e);
        }finally {
            if (stmt != null) stmt.close();
            if (connection != null) {
                connection.setAutoCommit(true);
                connection.close();
            }
        }
        return getUsuarioById(id);
    }

    @Override
    public Usuario updateProfile(Integer id, String nombre, String nick, String email) {
        return null;
    }

    @Override
    public Usuario getUsuarioById(Integer id) {
        return null;
    }

    @Override
    public Usuario getUusarioByNick(String nick) {
        return null;
    }

    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }

    @Override
    public boolean checkPassword(Integer id, String password) {
        return false;
    }
}
