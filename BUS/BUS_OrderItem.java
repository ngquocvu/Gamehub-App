    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;
import DAO.DAO_OrderItem;
import DTO.DTO_OrderItem; 
import java.sql.SQLException;
import java.util.ArrayList; 
public class BUS_OrderItem {

    public static ArrayList<DTO.DTO_OrderItem> array;
    public BUS_OrderItem() throws SQLException, ClassNotFoundException 
    {
        DAO_OrderItem items = new DAO_OrderItem();
        array = items.getAll();
    } 
    public ArrayList<DTO_OrderItem> getByOrderID (String id) throws SQLException, ClassNotFoundException
    {
        ArrayList<DTO_OrderItem> items = new ArrayList<DTO_OrderItem>();
        DAO_OrderItem oderItemDAO = new DAO_OrderItem();
        items = oderItemDAO.getByOrderID(id);   
        return items;
    }
     public void delete(String productID, String orderID) throws SQLException, ClassNotFoundException { 
         DAO_OrderItem items = new DAO_OrderItem();
         items.delete(productID,orderID);
    }      
     
     public void add(DTO_OrderItem orderItem) throws SQLException, ClassNotFoundException
     {
             DAO_OrderItem orderItemDAO = new DAO_OrderItem();
             orderItemDAO.add(orderItem);
     }
        
     public void update(DTO_OrderItem orderItem) throws SQLException, ClassNotFoundException
     {
             DAO_OrderItem orderItemDAO = new DAO_OrderItem();
             orderItemDAO.update(orderItem);
     }

     
     public ArrayList<DTO_OrderItem> search(String content,String orderID) throws ClassNotFoundException, SQLException
     {
         DAO_OrderItem orderItemDAO = new DAO_OrderItem();
         ArrayList<DTO_OrderItem> array = orderItemDAO.search(content,orderID);
         return array;     
     }
     
     public ArrayList<DTO_OrderItem> sortBy(String content,Boolean isSelected, String orderID) throws ClassNotFoundException, SQLException
     {
         DAO_OrderItem orderItemDAO = new DAO_OrderItem();
         ArrayList<DTO_OrderItem> array = orderItemDAO.sortBy(content, isSelected,orderID);
         return array;     
     }
}

