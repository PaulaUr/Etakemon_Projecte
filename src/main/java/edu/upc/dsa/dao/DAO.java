package edu.upc.dsa.dao;

import edu.upc.dsa.Usuario;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Properties;

/**
 * Created by pauli on 12/12/2016.
 */

public abstract class DAO {
    private Statement statement= null;
    private PreparedStatement prepStatement= null;

    public Connection getConnection(){

        Connection con = null;
        try {
            String host = "localhost";
            int port = 3306;
            String database = "juego2";
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://" + host + ":" + port + "/" + database;
            Properties info = new Properties();
            info.setProperty("user", "root");
            info.setProperty("password", "mysql");
            info.setProperty("useSSL", "false");
            info.setProperty("serverTimezone", "UTC");
            con = DriverManager.getConnection(url, info);
            System.out.println("Conexion creada \n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    //función que coge los valores de las variables
    private String getValors(Field f) {
        String res = null;
        try {
            Method m = this.getClass().getMethod(getUpper(f.getName()), null);
            res = m.invoke(this, null).toString();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return res;
    }

    private String getUpper(String m) {
        String result = Character.toUpperCase(m.charAt(0)) + m.substring(1);
        return "get".concat(result);
    }

    private void insertarElementos(PreparedStatement preparedStatement) throws NoSuchMethodException, SQLException, InvocationTargetException, IllegalAccessException {
        int i = 1;
        Field[] fields = this.getClass().getFields();

        for (Field f : fields) {
            String res = getValors(f); //obtienes el valor de esa posición
            preparedStatement.setObject(i, res); //asigna valor al interrrogante de esa posicion
            i++;
        }
    }

    public void insert() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO ").append(this.getClass().getSimpleName());

        Field[] fields = this.getClass().getFields();
        sb.append(" (");
        int i = 0;
        for (Field f : fields) {
            sb.append(f.getName());
            i++;
            if (i != fields.length)
                sb.append(", ");
        }

        sb.append(") VALUES (");
        i = 0;
        for (Field f : fields) {
            i++;
            sb.append("?");
            if (i != fields.length)
                sb.append(",");
        }

        sb.append(");");

        System.out.println("QUERY: " + sb.toString() + "\n");

        Connection con = getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sb.toString());
            insertarElementos(preparedStatement);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


  /*  public  void  select(int idusuario){}
    public  void delete(){}
    public void update(){} */

}
