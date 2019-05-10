/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DAO_Customer;
import DTO.DTO_Customer;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author AnhhTuann
 */
public class BUS_Customer {
    public static  ArrayList<DTO.DTO_Customer> array;
    public BUS_Customer() throws SQLException, ClassNotFoundException 
    {
        DAO_Customer users = new DAO_Customer();
        array = users.getAll(); 
    } 

    public void add(DTO_Customer user) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        customerDAO.add(user);
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        DAO_Customer users = new DAO_Customer();
        users.delete(id);
    }
    
         public void deleteAll() throws SQLException, ClassNotFoundException { 
         DAO_Customer customers = new DAO_Customer();
         customers.deleteAll();
    } 
    
    public void update(DTO_Customer user) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        customerDAO.update(user);
    }
    
    public ArrayList<DTO_Customer> search (String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.search(content);
        return array;      
     }
     
     public ArrayList<DTO_Customer> sortBy (String content , boolean isSelected) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.sortBy(content,isSelected);
        return array;
         
     }
     
    public DTO_Customer findItem(String id){
         for(DTO_Customer customer : array)
         {
            if(customer.getId().equalsIgnoreCase(id))
                return customer;
         }
         return null;
     }

    public ArrayList<DTO_Customer> adSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.adSearch(content);
        return array; 
    }

    public ArrayList<DTO_Customer> firstnameSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.firstnameSearch(content);
        return array; 
    }

    public ArrayList<DTO_Customer> lastnameSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.lastnameSearch(content);
        return array; 
    }

    public ArrayList<DTO_Customer> emailSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.emailSearch(content);
        return array; 
    }

    public ArrayList<DTO_Customer> phonenumberSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.phonenumberSearch(content);
        return array; 
    }

    public ArrayList<DTO_Customer> idSearch(String content) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        ArrayList<DTO_Customer> array = customerDAO.idSearch(content);
        return array; 
    }
}
