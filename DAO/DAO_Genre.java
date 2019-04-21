/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Genre;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author AnhhTuann
 */
public class DAO_Genre {
    private ArrayList<DTO_Genre> genres;
    
    public DAO_Genre() throws SQLException, ClassNotFoundException {
        genres = new ArrayList<DTO_Genre>();
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM genre";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while (result.next()) {
            String id = result.getString(1);
            String name = result.getString(2);
            DTO_Genre genre = new DTO_Genre(id,name);
            
            genres.add(genre);
        }
        conn.close();
    }
     public ArrayList<DTO_Genre> getAll() {
        return genres;
    }
}
