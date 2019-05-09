/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DAO_Product;
import DAO.DAO_Staff;
import DTO.DTO_Product;
import DTO.DTO_Staff;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author AnhhTuann
 */
public class BUS_Staff {
    public static  ArrayList<DTO.DTO_Staff> array;
    public BUS_Staff() throws SQLException, ClassNotFoundException 
    {
        DAO_Staff staffs = new DAO_Staff();
        array = staffs.getAll(); 
    } 
     public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_Staff staffs = new DAO_Staff();
         staffs.delete(id);
    } 
     public void deleteAll() throws SQLException, ClassNotFoundException { 
         DAO_Staff staffs = new DAO_Staff();
         staffs.deleteAll();
    } 
     
     public DTO_Staff getByEmail(String email) throws SQLException, ClassNotFoundException
     {
         DTO_Staff staff = new DTO_Staff();
         DAO_Staff staffDAO = new DAO_Staff();
         staff = staffDAO.getByEmail(email);
         return staff;
     }
     public DTO_Staff findItem(String id)
     {
         for(DTO_Staff staff : array)
         {
            if(staff.getId().equalsIgnoreCase(id))
                return staff;
         }
         return null;
     }
     
     public void add(DTO_Staff staff) throws SQLException, ClassNotFoundException
     {
             DAO_Staff staffDAO = new DAO_Staff();
             staffDAO.add(staff);
     }
        
     public void update(DTO_Staff staff) throws SQLException, ClassNotFoundException
     {
             DAO_Staff staffDAO = new DAO_Staff();
             staffDAO.update(staff);
     }
     
     public ArrayList<DTO_Staff> search (String content) throws SQLException, ClassNotFoundException {
        DAO_Staff staffDAO = new DAO_Staff();
        ArrayList<DTO_Staff> array = staffDAO.search(content);
        return array;      
     }
     
     public ArrayList<DTO_Staff> sortBy (String content , boolean isSelected) throws SQLException, ClassNotFoundException {
        DAO_Staff staffDAO = new DAO_Staff();
        ArrayList<DTO_Staff> array = staffDAO.sortBy(content,isSelected);
        return array;
         
     }
    
    public ArrayList<DTO_Staff> sexSearch(String content) throws ClassNotFoundException, SQLException
    {
         DAO_Staff staffDAO = new DAO_Staff();
         ArrayList<DTO_Staff> array = staffDAO.sexSearch(content);
         return array;     
    }
    
        public ArrayList<DTO_Staff> roleSearch(String content) throws ClassNotFoundException, SQLException
    {
         DAO_Staff staffDAO = new DAO_Staff();
         ArrayList<DTO_Staff> array = staffDAO.roleSearch(content);
         return array;     
    }
}
