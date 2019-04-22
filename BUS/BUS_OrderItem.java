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
    public ArrayList<DTO_OrderItem> getByProductID (String id) throws SQLException, ClassNotFoundException
    {
        ArrayList<DTO_OrderItem> items = new ArrayList<DTO_OrderItem>();
        DAO_OrderItem oderItemDAO = new DAO_OrderItem();
        items = oderItemDAO.getByProductID(id);   
        return items;
    }
     public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_OrderItem items = new DAO_OrderItem();
         items.delete(id);
    }      
     
     public void add(DTO_OrderItem receipt) throws SQLException, ClassNotFoundException
     {
             DAO_OrderItem receiptDAO = new DAO_OrderItem();
             receiptDAO.add(receipt);
     }
        
     public void update(DTO_OrderItem receipt) throws SQLException, ClassNotFoundException
     {
             DAO_OrderItem receiptDAO = new DAO_OrderItem();
             receiptDAO.update(receipt);
     }
     
     public void updateState(DTO_OrderItem receipt) throws SQLException, ClassNotFoundException
     {
             DAO_OrderItem receiptDAO = new DAO_OrderItem();
             receiptDAO.updateState(receipt);
     }
     
     public ArrayList<DTO_OrderItem> search(String content) throws ClassNotFoundException, SQLException
     {
         DAO_OrderItem receiptDAO = new DAO_OrderItem();
         ArrayList<DTO_OrderItem> array = receiptDAO.search(content);
         return array;     
     }
     
     public ArrayList<DTO_OrderItem> sortBy(String content,Boolean isSelected) throws ClassNotFoundException, SQLException
     {
         DAO_OrderItem receiptDAO = new DAO_OrderItem();
         ArrayList<DTO_OrderItem> array = receiptDAO.sortBy(content, isSelected);
         return array;     
     }
}

