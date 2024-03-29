/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_ImportReceipt;
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
public class DAO_ImportReceipt implements DAO_Interface<DTO_ImportReceipt> {
    private ArrayList<DTO_ImportReceipt> receipts;
    
    public DAO_ImportReceipt() throws SQLException, ClassNotFoundException {
        receipts = new ArrayList<DTO_ImportReceipt>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate =result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);
            
            receipts.add(receipt);
        }
        conn.close();
    }
    
    public ArrayList<DTO_ImportReceipt> getAll() {
        return receipts;
    }
    
    public DTO_ImportReceipt get(String id) {
        for (DTO_ImportReceipt receipt : receipts) {
            if (receipt.getId().equals(id)) {
                return receipt;
            }
        }
        return null;
    }

    @Override
    public void update(DTO_ImportReceipt object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE orders SET ";
            sql+= "staffID = " + "'" + object.getStaffID() + "'";
            sql+= " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void updateState(DTO_ImportReceipt object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE orders SET ";
            sql+="state = " + "'" + object.getState() + "'" + " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        DAO_OrderItem orderItemDAO = new DAO_OrderItem();
        ArrayList<String> list = orderItemDAO.getItemsID(id);
        for(String productID: list)
        {
            
            orderItemDAO.delete(productID, id);
        }
        Connection conn = MySQLConnUtils.getMySQLConnection();
        
        String sql = "DELETE FROM orders WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
        
    }
    
    public void add(DTO_ImportReceipt object) throws SQLException, ClassNotFoundException
    {  
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO orders(id,staffID,createdAt,state) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getStaffID() + "'";
               sql+= "," + "'" + object.getCreateDate()+ "'";
               sql+= "," +  "'" + object.getState() + "'" + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
      public ArrayList<DTO_ImportReceipt> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE id LIKE " + "'" + content + "%'"
                    +" OR staffID LIKE" + "'" + content + "%'" 
                    +" OR state LIKE " + "'" + content + "%'" ;
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_ImportReceipt> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM orders ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM orders ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);           
            receipts.add(receipt);         
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_ImportReceipt> adSearch(String content) throws SQLException, ClassNotFoundException {
               Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE id LIKE " + "'" + content + "%'"
                    +" OR staffID LIKE" + "'" + content + "%'" 
                    +" OR state LIKE " + "'" + content + "%'" ;
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_ImportReceipt> idSearch(String content) throws SQLException, ClassNotFoundException {
               Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE id = '"+content+"'";
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    }


    public ArrayList<DTO_ImportReceipt> stateSearch(String content) throws SQLException, ClassNotFoundException {
                Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE state = '"+content+"'";
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_ImportReceipt> StaffIdSearch(String content) throws SQLException, ClassNotFoundException {
                Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM orders WHERE staffID = '"+content+"'";
        ArrayList<DTO_ImportReceipt> receipts = new  ArrayList<DTO_ImportReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            Timestamp createDate = result.getTimestamp(3);
            String state = result.getString(5);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt(id, staffID,createDate,state);            
            receipts.add(receipt);             
        }
        
         conn.close();
         return receipts;
    }
}
