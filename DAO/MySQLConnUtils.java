/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author phandungtri
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        String hostname = "localhost";
        String dbName = "GameHub";
        String username = "root";
        String password = "";
        
        return getMySQLConnection(hostname, dbName, username, password);
    }
    
    public static Connection getMySQLConnection(String hostname, String dbName, 
            String username, String password) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + hostname + ":3306/" + dbName;
        Connection conn = DriverManager.getConnection(connectionURL, username, password);
        return conn;
    }
}
