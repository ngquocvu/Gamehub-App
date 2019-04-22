/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.DTO_ImportReceipt;
import DTO.DTO_Product;
import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author phandungtri
 */
public class DAO_Statistics {
    public ArrayList<DTO_Product> getNewestProducts() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_Product> products = new ArrayList<DTO_Product>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM products ORDER BY createdAt LIMIT 10";
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
        
        return products;
    }
    
    public ArrayList<DTO_ImportReceipt> getImportReceipts(String date /*yyyy-MM-dd*/) throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_ImportReceipt> receipts = new ArrayList<DTO_ImportReceipt>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE DATE(createdAt) = " + date;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate =result.getTimestamp(4);
            String state = result.getString(6);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,userID,createDate,state);
            
            receipts.add(receipt);
        }
        conn.close();
        
        return receipts;
    }
    
    public int getImportReceiptQuantity(String date /*yyyy-MM-dd*/) throws 
            SQLException, ClassNotFoundException {
        int quantity = 0;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE DATE(createdAt) = " + date;
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            quantity = result.getInt(1);
        }
        conn.close();
        
        return quantity;
    }
    
    public int getImportItemQuantity(String date) throws 
            SQLException, ClassNotFoundException {
        int quantity = 0;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT SUM(o.quantity) AS total "
                + "FROM orders AS o JOIN ordereditems AS oi ON oi.orderID = o.id "
                + "WHERE DATE(createdAt) = " + date;
        
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            quantity = result.getInt("total");
        }
        conn.close();
        
        return quantity;
    }
}
