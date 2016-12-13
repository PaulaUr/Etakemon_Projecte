package edu.upc.dsa.dao;

import edu.upc.dsa.User;

import javax.activation.DataSource;
import java.sql.*;

/**
 * Created by pauli on 12/12/2016.
 */

public abstract class DAO {
    private Statement statement= null;
    private PreparedStatement prepStatement= null;

    public Connection getConnection(){

        Connection conn= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","25098866");
            System.out.println("Conexión exitoso");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }

    //insertar nuevo usuario
    public  void insert(User user, Connection conn){

        String query = "INSERT INTO Users ("
                + " null,"
                + " name,"
                + " nick,"
                + " password,"
                + " email,) VALUES ("
                + "null, ?, ?, ?, ?)";
        try{
            //set all the preparedstatement parameters
            PreparedStatement st= conn.prepareStatement(query);
            st.setString(1,user.getName());
            st.setString(2,user.getNick());
            st.setString(3,user.getPassword());
            st.setString(4,user.getEmail());

            st.executeUpdate();
            st.close();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public  void  select(int idusuario){


    }
    public  void delete(){}
    public void update(){}

}
