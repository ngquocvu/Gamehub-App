/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_SaleReceipt;
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
public class DAO_SaleReceipt implements DAO_Interface<DTO_SaleReceipt> {
    private ArrayList<DTO_SaleReceipt> receipts;
    
    public DAO_SaleReceipt() throws SQLException, ClassNotFoundException {
        receipts = new ArrayList<DTO_SaleReceipt>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate =result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);
            
            receipts.add(receipt);
        }
        conn.close();
    }
    
    public ArrayList<DTO_SaleReceipt> getAll() {
        return receipts;
    }
    
    public DTO_SaleReceipt get(String id) {
        for (DTO_SaleReceipt receipt : receipts) {
            if (receipt.getId().equals(id)) {
                return receipt;
            }
        }
        return null;
    }

    @Override
    public void update(DTO_SaleReceipt object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE saleorders SET ";
            sql+= "staffID = " + "'" + object.getStaffID() + "' ";
            sql+= ",userID = " + "'" + object.getUserID() + "' ";
            sql+= "WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void updateState(DTO_SaleReceipt object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE saleorders SET ";
            sql+="state = " + "'" + object.getState() + "'" + " WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        DAO_SaleItem saleItemDAO = new DAO_SaleItem();
        ArrayList<String> list = saleItemDAO.getItemsID(id);
        for(String productID: list)
        {
            
            saleItemDAO.delete(productID, id);
        }
        Connection conn = MySQLConnUtils.getMySQLConnection();
        
        String sql = "DELETE FROM saleorders WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
        
    }
    
    public void add(DTO_SaleReceipt object) throws SQLException, ClassNotFoundException
    {  
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO saleorders(id,staffID,userID,createAt,state) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getStaffID() + "'";
               sql+= "," + "'" + object.getUserID() + "'";
               sql+= "," + "'" + object.getCreateDate()+ "'";
               sql+= "," +  "'" + object.getState() + "'" + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
      public ArrayList<DTO_SaleReceipt> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE id LIKE " + "'%" + content + "%'"
                    +" OR staffID LIKE" + "'" + content + "%'" 
                    +" OR userID LIKE " + "'" + content + "%'" 
                    +" OR state LIKE " + "'" + content + "%'" ;
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_SaleReceipt> sortBy(String content,Boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM saleorders ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM saleorders ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);           
            receipts.add(receipt);         
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_SaleReceipt> userIdSearch(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE userID = ' "+content+" '";
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
             String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);  
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_SaleReceipt> adSearch(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE id LIKE " + "'" + content + "%'"
                    +" OR staffID LIKE" + "'" + content + "%'" 
                    +" OR userID LIKE " + "'" + content + "%'" 
                    +" OR state LIKE " + "'" + content + "%'" ;
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
             String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);     
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_SaleReceipt> stateSearch(String content) throws SQLException, ClassNotFoundException {
                Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE state = ' "+content+" '";
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
             String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);    
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }


    public ArrayList<DTO_SaleReceipt> idSearch(String content) throws SQLException, ClassNotFoundException {
                Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE id = ' "+content+" '";
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
             String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);    
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }

    public ArrayList<DTO_SaleReceipt> staffIdSearch(String content) throws SQLException, ClassNotFoundException {
                Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM saleorders WHERE staffID = ' "+content+" '";
        ArrayList<DTO_SaleReceipt> receipts = new  ArrayList<DTO_SaleReceipt>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
       while (result.next()) {
             String id = result.getString(1);
            String staffID = result.getString(2);
            String userID = result.getString(3);
            Timestamp createDate = result.getTimestamp(4);
            String state = result.getString(6);
            DTO_SaleReceipt receipt = new DTO_SaleReceipt(id, staffID,userID,createDate,state);        
            receipts.add(receipt);
        }
        
         conn.close();
         return receipts;
    }
}
