package edu.upc.dsa.dao;

import java.sql.DriverManager;
import java.util.Properties;

import static edu.upc.dsa.dao.UserAlreadyExistsException.logger;

/**
 * Created by pauli on 27/12/2016.
 */
public class Database {

    public static java.sql.Connection getConnection() {
        java.sql.Connection con = null;
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
            logger.info("Conexion creada \n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
