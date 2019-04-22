/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Publisher;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AnhhTuann
 */
public class DAO_Publisher {
    private ArrayList<DTO_Publisher> publisher;
    
    public DAO_Publisher() throws SQLException, ClassNotFoundException {
        publisher = new ArrayList<DTO_Publisher>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM publisher";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Publisher publisher = new DTO_Publisher(id,name);
            
            this.publisher.add(publisher);
        }
        conn.close();
    }
     public ArrayList<DTO_Publisher> getAll() {
        return publisher;
    }
     public void add(DTO_Publisher object) throws SQLException, ClassNotFoundException
    {  
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO publisher(id,name) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getName() + "')";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
        public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM publisher WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
        public void update(DTO_Publisher object) throws SQLException, ClassNotFoundException {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE publisher SET ";            
           sql+= "name = " + "'" + object.getName() + "'" + " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);  
}
         public ArrayList<DTO_Publisher> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM publisher WHERE name LIKE " + "'" + content + "%'";
        
        ArrayList<DTO_Publisher> array = new  ArrayList<DTO_Publisher>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Publisher publisher = new DTO_Publisher(id, name);    
            array.add(publisher);
            
        }
        
         conn.close();
         return array;
    }

    public ArrayList<DTO_Publisher> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM publisher ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM publisher ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_Publisher> array = new  ArrayList<DTO_Publisher>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Publisher publisher = new DTO_Publisher(id, name);    
            array.add(publisher);
            
        }
        
         conn.close();
         return array;
    }

}
