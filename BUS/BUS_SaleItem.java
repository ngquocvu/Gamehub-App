    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;
import DAO.DAO_SaleItem;
import DTO.DTO_OrderItem; 
import java.sql.SQLException;
import java.util.ArrayList; 
public class BUS_SaleItem {

    public static ArrayList<DTO.DTO_OrderItem> array;
    public BUS_SaleItem() throws SQLException, ClassNotFoundException 
    {
        DAO_SaleItem items = new DAO_SaleItem();
        array = items.getAll();
    } 
    public ArrayList<DTO_OrderItem> getByOrderID (String id) throws SQLException, ClassNotFoundException
    {
        ArrayList<DTO_OrderItem> items = new ArrayList<DTO_OrderItem>();
        DAO_SaleItem oderItemDAO = new DAO_SaleItem();
        items = oderItemDAO.getByOrderID(id);   
        return items;
    }
     public void delete(String productID, String orderID) throws SQLException, ClassNotFoundException { 
         DAO_SaleItem items = new DAO_SaleItem();
         items.delete(productID,orderID);
    }      
     
     public void add(DTO_OrderItem saleItem) throws SQLException, ClassNotFoundException
     {
             DAO_SaleItem saleItemDAO = new DAO_SaleItem();
             saleItemDAO.add(saleItem);
     }
        
     public void update(DTO_OrderItem saleItem) throws SQLException, ClassNotFoundException
     {
             DAO_SaleItem saleItemDAO = new DAO_SaleItem();
             saleItemDAO.update(saleItem);
     }

     
     public ArrayList<DTO_OrderItem> search(String content,String orderID) throws ClassNotFoundException, SQLException
     {
         DAO_SaleItem saleItemDAO = new DAO_SaleItem();
         ArrayList<DTO_OrderItem> array = saleItemDAO.search(content,orderID);
         return array;     
     }
     
     public ArrayList<DTO_OrderItem> sortBy(String content,Boolean isSelected, String orderID) throws ClassNotFoundException, SQLException
     {
         DAO_SaleItem saleItemDAO = new DAO_SaleItem();
         ArrayList<DTO_OrderItem> array = saleItemDAO.sortBy(content, isSelected,orderID);
         return array;     
     }
}

