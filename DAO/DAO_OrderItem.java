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
    public ArrayList<DTO_OrderItem> getByOrderID(String id)
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
        try {
            int previousQuantity = getQuantity(object);
            System.out.print(previousQuantity);
            System.out.print(object.getQuantity());
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE orderedItems SET ";
            sql+= "ProductID = " + "'" + object.getProductID()+ "'";
            sql+= "," + "quantity = " + "'" + object.getQuantity()+ "'" + " WHERE productID= " + "'" + object.getProductID()+ "'" + "AND orderID = " + "'" + object.getOrderID() + "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
            sql = "UPDATE products SET ";
            sql+= "quantity =  quantity - " + previousQuantity + " + " + object.getQuantity() + " WHERE id = " + object.getProductID();
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_OrderItem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_OrderItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void delete(String productID, String orderID) throws SQLException, ClassNotFoundException {
        DTO_OrderItem object = new DTO_OrderItem();
        object.setOrderID(orderID);
        object.setProductID(productID);
        int quantity = getQuantity(object);
        Connection conn = MySQLConnUtils.getMySQLConnection();    
        String sql = "DELETE FROM ordereditems WHERE productID = " +"'" + productID + "'" + "AND orderID = " + "'" + orderID + "'";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        
        sql = "UPDATE products SET ";
        sql+= "quantity =  quantity - " + quantity + " WHERE id = " + object.getProductID();
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
    
    public void add(DTO_OrderItem object) throws SQLException, ClassNotFoundException
    { 
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO ordereditems(orderID,productID,quantity) VALUES";
               sql+= "(" + "'" + object.getOrderID() + "'";
               sql+= "," + "'" + object.getProductID() + "'";
               sql+= "," + object.getQuantity() + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        
        sql = "UPDATE products SET ";
        sql+= "quantity =  quantity + '" + object.getQuantity() + "' " + "WHERE id = " + object.getProductID();
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
        
    }
      public ArrayList<DTO_OrderItem> search(String content, String orderID) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT orderid,id,products.name,ordereditems.quantity,price FROM ordereditems\n INNER JOIN products"
                    +" WHERE products.id = ordereditems.productID AND orderID = "+ "'" + orderID + "'" + " AND (name LIKE " + "'" + content + "%'"
                    +" OR price LIKE " + "'" + content + "%'" 
                    +" OR id LIKE " + "'" + content + "%')";
            ArrayList<DTO_OrderItem> items = new  ArrayList<DTO_OrderItem>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String ordrID = result.getString(1);
            String productID = result.getString(2);
            String productName = result.getString(3);
            int quantity = Integer.parseInt(result.getString(4));
            Double price = Double.parseDouble(result.getString(5));
            DTO_OrderItem item = new DTO_OrderItem(ordrID,productID,productName,price,quantity);
            items.add(item);
            System.out.print(item.getProductID() + " ");
        }       
         conn.close();
         return items;
      }

    public ArrayList<DTO_OrderItem> sortBy(String content,Boolean isSelected,String orderID) throws SQLException, ClassNotFoundException {
       Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT orderID,id,products.name,ordereditems.quantity,price FROM ordereditems\n INNER JOIN products WHERE orderID =" +orderID +" AND products.id = ordereditems.productID\n ORDER BY " + content + " DESC";
        else
        sql = "SELECT orderID,id,products.name,ordereditems.quantity,price FROM ordereditems\n INNER JOIN products WHERE orderID =" +orderID +" AND products.id = ordereditems.productID\n ORDER BY " + content + " ASC";
        
        ArrayList<DTO_OrderItem> items = new  ArrayList<DTO_OrderItem>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String ordrID = result.getString(1);
            String productID = result.getString(2);
            String productName = result.getString(3);
            int quantity = Integer.parseInt(result.getString(4));
            Double price = Double.parseDouble(result.getString(5));
            DTO_OrderItem item = new DTO_OrderItem(ordrID,productID,productName,price,quantity);
            items.add(item);
            System.out.print(item.getProductID() + " ");
        }
        
         conn.close();
         return items;
    }

    @Override
    public DTO_OrderItem get(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
}

    public int getQuantity(DTO_OrderItem object) throws ClassNotFoundException, SQLException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT quantity FROM ordereditems WHERE productID = " + object.getProductID();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);   
        int quantity = 0;
        while (result.next()) {
            quantity = Integer.parseInt(result.getString(1));
        }
        conn.close() ;
        return quantity;
    }  
}
