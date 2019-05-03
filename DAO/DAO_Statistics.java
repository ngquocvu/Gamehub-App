/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import DTO.DTO_StatisticReceiptInfo;
import DTO.DTO_Product;
import java.sql.Date;
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
    
    public ArrayList<DTO_Product> getReceiptByProduct() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_Product> receipts = new ArrayList<DTO_Product>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT productID,name,SUM(ordereditems.quantity),price FROM ordereditems INNER JOIN products ON id = productID \n GROUP BY productID";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
            DTO_Product product = new DTO_Product();
           product.setId(result.getString(1));
           product.setName(result.getString(2));
           product.setQuantity(Integer.parseInt(result.getString(3)));
           product.setPrice(Double.parseDouble(result.getString(4)));
        
            
            receipts.add(product);
        }
        conn.close();
        return receipts;
    }
    
      public ArrayList<DTO_Product> getSaleReceiptByProduct() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_Product> receipts = new ArrayList<DTO_Product>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT productID,name,SUM(saleordereditems.quantity),price FROM saleordereditems INNER JOIN products ON id = productID \n GROUP BY productID";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
            DTO_Product product = new DTO_Product();
           product.setId(result.getString(1));
           product.setName(result.getString(2));
           product.setQuantity(Integer.parseInt(result.getString(3)));
           product.setPrice(Double.parseDouble(result.getString(4)));
        
            
            receipts.add(product);
        }
        conn.close();
        return receipts;
    }
    
    public ArrayList<DTO_StatisticReceiptInfo> getReceiptByProductAndStaff() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql =    "SELECT products.name,staffs.firstname,products.price,SUM(ordereditems.quantity) FROM orders\n" +
                        "INNER JOIN ordereditems ON orderID = id\n" +
                        "INNER JOIN products ON products.id = ordereditems.productID \n" +
                        "INNER JOIN staffs ON staffID = staffs.id \n" +
                        "GROUP BY productID,staffID";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
           DTO_StatisticReceiptInfo info = new DTO_StatisticReceiptInfo();
           info.setProductName(result.getString(1));
           info.setStaffName(result.getString(2));
           info.setPrice(Double.parseDouble(result.getString(3)));
           info.setQuantity(Integer.parseInt(result.getString(4)));      
           receipts.add(info);
        }
        conn.close();
        return receipts;
    }
    
    public ArrayList<DTO_StatisticReceiptInfo> getReceiptByProductAndCustomer() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql =    "SELECT products.name,users.firstname,products.price,SUM(saleordereditems.quantity) FROM saleorders\n" +
                        "INNER JOIN saleordereditems ON orderID = id\n" +
                        "INNER JOIN products ON products.id = saleordereditems.productID \n" +
                        "INNER JOIN users ON userID = users.id \n" +
                        "GROUP BY productID,userID";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
           DTO_StatisticReceiptInfo info = new DTO_StatisticReceiptInfo();
           info.setProductName(result.getString(1));
           info.setCustomerName(result.getString(2));
           info.setPrice(Double.parseDouble(result.getString(3)));
           info.setQuantity(Integer.parseInt(result.getString(4)));      
           receipts.add(info);
        }
        conn.close();
        return receipts;
    }
    
    
       public ArrayList<DTO_StatisticReceiptInfo> getReceiptByProductAndStaffAndDate() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql =    "SELECT orders.updatedAt,products.name,staffs.firstname,products.price,SUM(ordereditems.quantity) FROM orders\n" +
                        "INNER JOIN ordereditems ON orderID = id\n" +
                        "INNER JOIN products ON products.id = ordereditems.productID \n" +
                        "INNER JOIN staffs ON staffID = staffs.id \n" +
                        "GROUP BY productID,staffID,orders.updatedAt";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
           DTO_StatisticReceiptInfo info = new DTO_StatisticReceiptInfo();
           Timestamp ts=Timestamp.valueOf(result.getString(1));
           Date date=new Date(ts.getTime());    
           info.setDate(date);
           info.setProductName(result.getString(2));
           info.setCustomerName(result.getString(3));
           info.setPrice(Double.parseDouble(result.getString(4)));
           info.setQuantity(Integer.parseInt(result.getString(5)));      
           receipts.add(info);
        }
        conn.close();
        return receipts;
    }
       
        public ArrayList<DTO_StatisticReceiptInfo> getReceiptByProductAndCustomerAndDate() throws 
            SQLException, ClassNotFoundException {
        ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql =    "SELECT saleorders.updatedAt,products.name,users.firstname,products.price,SUM(ordereditems.quantity) FROM saleorders\n" +
                        "INNER JOIN saleordereditems ON orderID = id\n" +
                        "INNER JOIN products ON products.id = saleordereditems.productID \n" +
                        "INNER JOIN users ON userID = users.id \n" +
                        "GROUP BY productID,userID,orders.updatedAt";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
           DTO_StatisticReceiptInfo info = new DTO_StatisticReceiptInfo();
           Timestamp ts=Timestamp.valueOf(result.getString(1));
           Date date=new Date(ts.getTime());    
           info.setDate(date);
           info.setProductName(result.getString(2));
           info.setCustomerName(result.getString(3));
           info.setPrice(Double.parseDouble(result.getString(4)));
           info.setQuantity(Integer.parseInt(result.getString(5)));      
           receipts.add(info);
        }
        conn.close();
        return receipts;
    }
    
    public int getImportReceiptQuantity(String date /*yyyy-MM-dd*/) throws 
            SQLException, ClassNotFoundException {
        int quantity = 0;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE DATE(createdAt) = " + "'" + date + "'";
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
        String sql = "SELECT SUM(quantity) AS total"
                + " FROM orders INNER JOIN ordereditems ON ordereditems.orderID = orders.id "
                + " WHERE DATE(orders.createdAt) = " + "'" + date + "'";
        
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            quantity = result.getInt(1);
        }
        conn.close();
        
        return quantity;
    }
    
    public double getTotalImportingCost(String date) throws 
            SQLException, ClassNotFoundException {
        double cost = 0;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT ordereditems.quantity AS quantity, products.price AS price "
                + "FROM orders "
                + "INNER JOIN ordereditems ON ordereditems.orderID = orders.id "
                + "INNER JOIN products ON products.id = ordereditems.productID "
                + "WHERE DATE(orders.createdAt) = " + "'" + date + "'";
        
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            int quantity = result.getInt("quantity");
            double price = result.getDouble("price");
            cost += quantity * price;
        }
        conn.close();
        System.out.print(cost);
        return cost;
    }
}
