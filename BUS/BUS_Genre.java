/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DAO_Genre;
import DTO.DTO_Genre;
import java.sql.SQLException;
import java.util.ArrayList;

public class BUS_Genre {
   public static ArrayList<DTO_Genre> array;

    public BUS_Genre() throws ClassNotFoundException, SQLException {
        DAO_Genre genreDAO = new DAO_Genre();
        array = genreDAO.getAll();
    }
    public void add(DTO_Genre genre) throws SQLException, ClassNotFoundException
     {
             DAO_Genre genreDAO = new DAO_Genre();
             genreDAO.add(genre);
     }
        
          public void delete(String id) throws SQLException, ClassNotFoundException { 
         DAO_Genre genre = new DAO_Genre();
         genre.delete(id);
    } 
           public void update(DTO_Genre genre) throws SQLException, ClassNotFoundException
     {
             DAO_Genre genreDAO = new DAO_Genre();
             genreDAO.update(genre);
     }
     
     public ArrayList<DTO_Genre> search(String content) throws ClassNotFoundException, SQLException
     {
         DAO_Genre genreDAO = new DAO_Genre();
         ArrayList<DTO_Genre> array = genreDAO.search(content);
         return array;     
     }
     
     public ArrayList<DTO_Genre> sortBy(String content,Boolean isSelected) throws ClassNotFoundException, SQLException
     {
         DAO_Genre genreDAO = new DAO_Genre();
         ArrayList<DTO_Genre> array = genreDAO.sortBy(content, isSelected);
         return array;     
     }
}
