/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Product;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phandungtri
 */
public class DAO_Product implements DAO_Interface<DTO_Product> {
    private ArrayList<DTO_Product> products;
    
    public DAO_Product() throws SQLException, ClassNotFoundException {
        products = new ArrayList<DTO_Product>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
                    genreID, platform, releaseDate, quantity, price);
            
            products.add(product);
        }
        conn.close();
    }
    
    public ArrayList<DTO_Product> getAll() {
        return products;
    }
    
    public DTO_Product get(String id) {
        for (DTO_Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(DTO_Product object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE products SET ";
            sql+= "name = " + "'" + object.getName() + "'";
            sql+= "," + "description = " + "'none'";
            sql+= "," + "price = " + object.getPrice();
            sql+= "," + "publisherID = " + "'" + object.getPublisherID() + "'";
            sql+= "," + "genreID = " + "'" + object.getGenreID() + "'";
            sql+= "," + "platform = " + "'" + object.getPlatform() + "'";
            sql+= "," + "releaseDate = " +  "'" + object.getReleaseDate() + "'" + " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM products WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
    
    public void add(DTO_Product object) throws SQLException, ClassNotFoundException
    {  
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO products(id,name,description,price,publisherID,genreID,platform,quantity,releaseDate) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getName() + "'";
               sql+= "," + "'none'";
               sql+= "," + object.getPrice();
               sql+= "," + "'" + object.getPublisherID() + "'";
               sql+= "," + "'" + object.getGenreID() + "'";
               sql+= "," + "'" + object.getPlatform() + "'";
               sql+= "," + object.getQuantity();
               sql+= "," +  "'" + object.getReleaseDate() + "'" + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
      public ArrayList<DTO_Product> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products WHERE name LIKE " + "'" + content + "%'"
                    +" OR price LIKE " + "'" + content + "%'" 
                    +" OR publisherID LIKE " + "'" + content + "%'" 
                    +" OR genreID LIKE " + "'" + content + "%'" 
                    +" OR platform LIKE " + "'" + content + "%'" 
                    +" OR releaseDate LIKE " + "'" + content + "%'" ;
        
        ArrayList<DTO_Product> array = new  ArrayList<DTO_Product>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
            genreID, platform, releaseDate, quantity, price);    
            array.add(product);
            
        }
        
         conn.close();
         return array;
    }

    public ArrayList<DTO_Product> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM products ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM products ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_Product> array = new  ArrayList<DTO_Product>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
            genreID, platform, releaseDate, quantity, price);    
            array.add(product);
            
        }
        
         conn.close();
         return array;
    }
    
    public String getGenreName(String id) throws SQLException, ClassNotFoundException
    {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT genreName FROM genre WHERE genreID = " + id;
        Statement stmt = conn.createStatement();
        String str = "";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next())
            str = result.getString(1);
        conn.close();
        return str;
    }
    public String getGenreID(String name) throws ClassNotFoundException, SQLException
    {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT genreID FROM genre WHERE genreName = '" + name +"'";
        Statement stmt = conn.createStatement();
        String str = "";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next())
            str = result.getString(1);
        conn.close();
        return str;
    }

    public String getPublisherName(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT name FROM publisher WHERE id = " + id;
        Statement stmt = conn.createStatement();
        String str = "";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next())
            str = result.getString(1);
        conn.close();
        return str;
    }

    public String getPublisherID(String name) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT id FROM publisher WHERE name = '" + name +"'";
        Statement stmt = conn.createStatement();
        String str = "";
        ResultSet result = stmt.executeQuery(sql);
        while (result.next())
            str = result.getString(1);
        conn.close();
        return str;
    }
    
    public ArrayList<DTO_Product> dateSearch(String content1 , String content2) throws ClassNotFoundException, SQLException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products WHERE releaseDate BETWEEN '" + content1 +"' AND '"+ content2+"'";
        ArrayList<DTO_Product> array = new  ArrayList<DTO_Product>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
            genreID, platform, releaseDate, quantity, price);    
            array.add(product);
        }
        
         conn.close();
         return array;
    }
    
        public ArrayList<DTO_Product> priceSearch(String content1 , String content2) throws ClassNotFoundException, SQLException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products WHERE price BETWEEN '" + content1 +"' AND '"+ content2+"'";
        ArrayList<DTO_Product> array = new  ArrayList<DTO_Product>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
            genreID, platform, releaseDate, quantity, price);    
            array.add(product);
        }
        
         conn.close();
         return array;
    }

    public ArrayList<DTO_Product> quantitySearch(String content1, String content2) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products WHERE quantity BETWEEN '" + content1 +"' AND '"+ content2+"'";
        ArrayList<DTO_Product> array = new  ArrayList<DTO_Product>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            String description = result.getString(3);
            double price = result.getDouble(4);
            String publisherID = result.getString(5);
            String genreID = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisherID, 
            genreID, platform, releaseDate, quantity, price);    
            array.add(product);
        }
        
         conn.close();
         return array;
    }
}
