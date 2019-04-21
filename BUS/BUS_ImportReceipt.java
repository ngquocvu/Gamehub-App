    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;
import DAO.DAO_ImportReceipt;
import DTO.DTO_ImportReceipt; 
import java.sql.SQLException;
import java.util.ArrayList; 
public class BUS_ImportReceipt {

    public static ArrayList<DTO.DTO_ImportReceipt> array;
    public BUS_ImportReceipt() throws SQLException, ClassNotFoundException 
    {
        DAO_ImportReceipt receipts = new DAO_ImportReceipt();
        array = receipts.getAll();
    } 
     public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_ImportReceipt receipts = new DAO_ImportReceipt();
         receipts.delete(id);
    } 
     
     public DTO_ImportReceipt findItem(String id)
     {
         for(DTO_ImportReceipt receipt : array)
         {
            if(receipt.getId().equalsIgnoreCase(id))
                return receipt;
         }
         return null;
     }
     
     public void add(DTO_ImportReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_ImportReceipt receiptDAO = new DAO_ImportReceipt();
             receiptDAO.add(receipt);
     }
        
     public void update(DTO_ImportReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_ImportReceipt receiptDAO = new DAO_ImportReceipt();
             receiptDAO.update(receipt);
     }
     
     public void updateState(DTO_ImportReceipt receipt) throws SQLException, ClassNotFoundException
     {
             DAO_ImportReceipt receiptDAO = new DAO_ImportReceipt();
             receiptDAO.updateState(receipt);
     }
     
     public ArrayList<DTO_ImportReceipt> search(String content) throws ClassNotFoundException, SQLException
     {
         DAO_ImportReceipt receiptDAO = new DAO_ImportReceipt();
         ArrayList<DTO_ImportReceipt> array = receiptDAO.search(content);
         return array;     
     }
     
     public ArrayList<DTO_ImportReceipt> sortBy(String content,Boolean isSelected) throws ClassNotFoundException, SQLException
     {
         DAO_ImportReceipt receiptDAO = new DAO_ImportReceipt();
         ArrayList<DTO_ImportReceipt> array = receiptDAO.sortBy(content, isSelected);
         return array;     
     }
}

