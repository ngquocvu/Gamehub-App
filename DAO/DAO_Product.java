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
            String publisher = result.getString(5);
            String genre = result.getString(6);
            String platform = result.getString(7);
            String releaseDate = result.getString(8);
            int quantity = result.getInt(9);
            DTO_Product product = new DTO_Product(id, name, description, publisher, 
                    genre, platform, releaseDate, quantity, price);
            
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
            sql+= "," + "publisher = " + "'" + object.getPublisher() + "'";
            sql+= "," + "genre = " + "'" + object.getGenre() + "'";
            sql+= "," + "platform = " + "'" + object.getPlatform() + "'";
            sql+= "," + "quantity = " + object.getQuantity();
            sql+= "," + "releaseDate = " +  "'" + object.getReleaseDate() + "'" + "WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
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
        String sql = "INSERT INTO products(id,name,description,price,publisher,genre,platform,quantity,releaseDate) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getName() + "'";
               sql+= "," + "'none'";
               sql+= "," + object.getPrice();
               sql+= "," + "'" + object.getPublisher() + "'";
               sql+= "," + "'" + object.getGenre() + "'";
               sql+= "," + "'" + object.getPlatform() + "'";
               sql+= "," + object.getQuantity();
               sql+= "," +  "'" + object.getReleaseDate() + "'" + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }

}
