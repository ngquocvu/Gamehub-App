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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM products WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        conn.close();
    }
    

}
