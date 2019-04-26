    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;
import DAO.DAO_SaleReceipt;
import DTO.DTO_SaleReceipt; 
import java.sql.SQLException;
import java.util.ArrayList; 
public class BUS_SaleReceipt {

    public static ArrayList<DTO.DTO_SaleReceipt> array;
    public BUS_SaleReceipt() throws SQLException, ClassNotFoundException 
    {
        DAO_SaleReceipt receipts = new DAO_SaleReceipt();
        array = receipts.getAll();
    } 
     public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_SaleReceipt receipts = new DAO_SaleReceipt();
         receipts.delete(id);
    } 
     
     public DTO_SaleReceipt findItem(String id)
     {
         for(DTO_SaleReceipt receipt : array)
         {
            if(receipt.getId().equalsIgnoreCase(id))
                return receipt;
         }
         return null;
     }
     
     public void add(DTO_SaleReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_SaleReceipt receiptDAO = new DAO_SaleReceipt();
             receiptDAO.add(receipt);
     }
        
     public void update(DTO_SaleReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_SaleReceipt receiptDAO = new DAO_SaleReceipt();
             receiptDAO.update(receipt);
     }
     
     public void updateState(DTO_SaleReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_SaleReceipt receiptDAO = new DAO_SaleReceipt();
             receiptDAO.updateState(receipt);
     }
     
     public ArrayList<DTO_SaleReceipt> search(String content) throws ClassNotFoundException, SQLException
     {
         DAO_SaleReceipt receiptDAO = new DAO_SaleReceipt();
         ArrayList<DTO_SaleReceipt> array = receiptDAO.search(content);
         return array;     
     }
     
     public ArrayList<DTO_SaleReceipt> sortBy(String content,Boolean isSelected) throws ClassNotFoundException, SQLException
     {
         DAO_SaleReceipt receiptDAO = new DAO_SaleReceipt();
         ArrayList<DTO_SaleReceipt> array = receiptDAO.sortBy(content, isSelected);
         return array;     
     }
}

