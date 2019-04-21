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
   
}
