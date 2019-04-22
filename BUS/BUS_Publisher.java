/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DAO_Publisher;
import DTO.DTO_Publisher;
import java.sql.SQLException;
import java.util.ArrayList;

public class BUS_Publisher {
   public static ArrayList<DTO_Publisher> array;

    public BUS_Publisher() throws ClassNotFoundException, SQLException {
        DAO_Publisher publisherDAO = new DAO_Publisher();
        array = publisherDAO.getAll();
    }
    public void add(DTO_Publisher publisher) throws SQLException, ClassNotFoundException
     {
             DAO_Publisher publisherDAO = new DAO_Publisher();
             publisherDAO.add(publisher);
     }
        
          public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_Publisher publisher = new DAO_Publisher();
         publisher.delete(id);
    } 
           public void update(DTO_Publisher publisher) throws SQLException, ClassNotFoundException
     {
             DAO_Publisher publisherDAO = new DAO_Publisher();
             publisherDAO.update(publisher);
     }
     
     public ArrayList<DTO_Publisher> search(String content) throws ClassNotFoundException, SQLException
     {
         DAO_Publisher publisherDAO = new DAO_Publisher();
         ArrayList<DTO_Publisher> array = publisherDAO.search(content);
         return array;     
     }
     
     public ArrayList<DTO_Publisher> sortBy(String content,Boolean isSelected) throws ClassNotFoundException, SQLException
     {
         DAO_Publisher publisherDAO = new DAO_Publisher();
         ArrayList<DTO_Publisher> array = publisherDAO.sortBy(content, isSelected);
         return array;     
     }
}
