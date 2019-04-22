/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_OrderItem;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phandungtri
 */
public class DAO_OrderItem implements DAO_Interface<DTO_OrderItem> {
    private ArrayList<DTO_OrderItem> items;
    
    public DAO_OrderItem() throws SQLException, ClassNotFoundException {
        items = new ArrayList<DTO_OrderItem>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT orderID,id,products.name,ordereditems.quantity,price FROM ordereditems \nINNER JOIN products WHERE products.id = ordereditems.productID;";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String orderID = result.getString(1);
            String productID = result.getString(2);
            String productName = result.getString(3);
            int quantity = Integer.parseInt(result.getString(4));
            Double price = Double.parseDouble(result.getString(5));
            DTO_OrderItem item = new DTO_OrderItem(orderID,productID,productName,price,quantity);
            
            items.add(item);
        }
        conn.close();
    }
    
    public ArrayList<DTO_OrderItem> getAll() {
        return items;
    }
    public ArrayList<DTO_OrderItem> getByProductID(String id)
    {
        ArrayList<DTO_OrderItem> array = new  ArrayList<DTO_OrderItem>();
        for(DTO_OrderItem item : items)
        {
            if(item.getOrderID().equals(id))
                array.add(item);
        }
        return array;
    }
  

    @Override
    public void update(DTO_OrderItem object) {
        /*try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE orders SET ";
            sql+= "staffID = " + "'" + object.getStaffID() + "'";
            sql+= "," + "userID = " + "'" + object.getCustomerID() + "'" + " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_OrderItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_OrderItem.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
       /* Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM orders WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();*/
    }
    
    public void add(DTO_OrderItem object) throws SQLException, ClassNotFoundException
    {  /*
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO orders(id,staffID,userID,createdAt,state) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getStaffID() + "'";
               sql+= "," + object.getCustomerID();
               sql+= "," + "'" + object.getCreateDate()+ "'";
               sql+= "," +  "'" + object.getState() + "'" + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();*/
        
    }
      public ArrayList<DTO_OrderItem> search(String content) throws SQLException, ClassNotFoundException {
      /*  Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE id LIKE " + "'" + content + "%'";        
        ArrayList<DTO_OrderItem> receipts = new  ArrayList<DTO_OrderItem>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate =new java.sql.Timestamp(result.getTime(4).getTime());
            String state = result.getString(6);
            DTO_OrderItem receipt = new DTO_OrderItem(id, staffID,userID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    */
      return null;}

    public ArrayList<DTO_OrderItem> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
       /* Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM orders ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM orders ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_OrderItem> receipts = new  ArrayList<DTO_OrderItem>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate =new java.sql.Timestamp(result.getTime(4).getTime());
            String state = result.getString(6);
            DTO_OrderItem receipt = new DTO_OrderItem(id, staffID,userID,createDate,state);           
            receipts.add(receipt);         
        }
        
         conn.close();
         return receipts;
    }

    @Override
    public DTO_OrderItem get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
        return null;
}

    @Override
    public DTO_OrderItem get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
