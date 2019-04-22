/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Genre;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AnhhTuann
 */
public class DAO_Genre {
    private ArrayList<DTO_Genre> genre;
    
    public DAO_Genre() throws SQLException, ClassNotFoundException {
        genre = new ArrayList<DTO_Genre>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM genre";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Genre genre = new DTO_Genre(id,name);
            
            this.genre.add(genre);
        }
        conn.close();
    }
     public ArrayList<DTO_Genre> getAll() {
        return genre;
    }
     public void add(DTO_Genre object) throws SQLException, ClassNotFoundException
    {  
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO genre(genreID,genreName) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getName() + "')";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
        public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM genre WHERE genreID = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
        public void update(DTO_Genre object) throws SQLException, ClassNotFoundException {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE genre SET ";            
           sql+= "GenreName = " + "'" + object.getName() + "'" + " WHERE Genreid= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);  
}
         public ArrayList<DTO_Genre> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM genre WHERE genreName LIKE " + "'" + content + "%'";
        
        ArrayList<DTO_Genre> array = new  ArrayList<DTO_Genre>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Genre genre = new DTO_Genre(id, name);    
            array.add(genre);
            
        }
        
         conn.close();
         return array;
    }

    public ArrayList<DTO_Genre> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM genre ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM genre ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_Genre> array = new  ArrayList<DTO_Genre>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Genre genre = new DTO_Genre(id, name);    
            array.add(genre);
            
        }
        
         conn.close();
         return array;
    }

}
