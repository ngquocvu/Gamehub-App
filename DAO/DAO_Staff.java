/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Staff;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AnhhTuann
 */
public class DAO_Staff  implements DAO_Interface<DTO_Staff>{
    private ArrayList<DTO_Staff> staffs;
    
    public DAO_Staff () throws SQLException, ClassNotFoundException {
        staffs = new ArrayList<DTO_Staff>() ;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM staffs";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while(result.next()){
            String id = result.getString(1);
            String firstname = result.getString(2);
            String lastname = result.getString(3);
            String email = result.getString(4);
            String password = result.getString(5);
            String address = result.getString(6);
            String phonenumber = result.getString(7);
            int role = result.getInt(8);
            int sex = result.getInt(9);
            DTO_Staff staff = new DTO_Staff(id,firstname,lastname,email,password,address,phonenumber,role,sex);
            
            staffs.add(staff);
        }
        conn.close();
    }
    
    
    @Override
    public ArrayList<DTO_Staff> getAll() {
        return staffs;
    }

    @Override
    public DTO_Staff get(String id) {
         for (DTO_Staff staff : staffs) {
            if (staff.getId().equals(id)) {
                return staff;
            }
        }
        return null;
    }

    @Override
    public void update(DTO_Staff object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE staffs SET ";
            sql+= "firstname = " + "'" + object.getFirstname() + "'";
            sql+= "lasttname = " + "'" + object.getLastname() + "'";
            sql+= "," + "email = " + object.getEmail();
            sql+= "," + "password = " + object.getPassword();
            sql+= "," + "address = " + "'" + object.getAddress() + "'";
            sql+= "," + "phonenumber = " + "'" + object.getPhonenumber() + "'";
            sql+= "," + "role = " + "'" + object.getRole() + "'";
            sql+= "," + "sex = " + object.getSex() + "WHERE id= " + "'" + object.getId()+ "'";;
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM staffs WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }

    public void add(DTO_Staff object) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO staffs(id,firstname,lastname,email,password,address,phonenumber,role,sex) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getFirstname() + "'";
               sql+= "," + "'" + object.getLastname() + "'";
               sql+= "," + object.getEmail()+ "'";
               sql+= "," + "'" + object.getPassword() +"'" ;
               sql+= "," + "'" + object.getAddress()+"'" ;
               sql+= "," + "'" + object.getPhonenumber()+"'";
               sql+= "," + object.getRole();
               sql+= "," + object.getSex() + " )";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
   
}
