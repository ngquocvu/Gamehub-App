/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTO_Customer;
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
public class DAO_Customer implements DAO_Interface<DTO.DTO_Customer>{
    private ArrayList<DTO_Customer> users;
    
    public DAO_Customer () throws SQLException, ClassNotFoundException {
        users = new ArrayList<DTO_Customer>() ;
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM users";
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        
        while(result.next()){
            String id = result.getString(1);
            String firstname = result.getString(2);
            String lastname = result.getString(3);
            String email = result.getString(4);
            String password = result.getString(5);
            String phonenumber = result.getString(6);
            DTO_Customer user = new DTO_Customer(id,firstname,lastname,email,password,phonenumber);
            
            users.add(user);
        }
        conn.close();
    }
    
    
    @Override
    public ArrayList<DTO_Customer> getAll() {
        return users;
    }

    @Override
    public DTO_Customer get(String id) {
        for (DTO_Customer user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void update(DTO_Customer object) {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String sql = "UPDATE users SET ";
            sql+= "firstname = " + "'" + object.getFirstname() + "'";
            sql+= "," + "lastname = " + "'" + object.getLastname() + "'";
            sql+= "," + "password = " + "'" + object.getPassword() + "'";
            sql+= "," + "email = " + "'" +object.getEmail()+ "'";
            sql+= "," + "phonenumber = " + "'" + object.getPhonenumber() + "'"+ "WHERE id= " + "'" + object.getId()+ "'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO_Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String id) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "DELETE FROM users WHERE id = " + id ;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }
    
    public void add(DTO_Customer object) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "INSERT INTO users(id,firstname,lastname,email,password,phonenumber) VALUES";
               sql+= "(" + "'" + object.getId() + "'";
               sql+= "," + "'" + object.getFirstname() + "'";
               sql+= "," + "'" + object.getLastname() + "'";    
               sql+= "," + "'" + object.getEmail() + "'";
               sql+= "," + "'" + object.getPassword() + "'";
               sql+= "," + "'" + object.getPhonenumber()+"'" + " )";;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();
    }

    public ArrayList<DTO_Customer> search(String content) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = "SELECT * FROM users WHERE firstname LIKE " + "'" + content + "%'" 
                    +" OR lastname LIKE " + "'" + content + "%'" 
                    +" OR email LIKE " + "'" + content + "%'" 
                    +" OR phonenumber LIKE " + "'" + content + "%'" 
                    ;      
        ArrayList<DTO_Customer> array = new  ArrayList<DTO_Customer>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String firstname = result.getString(2);
            String lastname = result.getString(3);
            String email = result.getString(4);
            String password = result.getString(5);
            String phonenumber = result.getString(6);
            DTO_Customer user = new DTO_Customer(id, firstname, lastname, email, 
            password, phonenumber);    
            array.add(user);
        }
        
         conn.close();
         return array;
    }

    public ArrayList<DTO_Customer> sortBy(String content, boolean isSelected) throws SQLException, ClassNotFoundException {
        Connection conn = MySQLConnUtils.getMySQLConnection();
        String sql = new String();
        if (isSelected)
        sql = "SELECT * FROM users ORDER BY " + content + " DESC";
        else
        sql = "SELECT * FROM users ORDER BY " + content + " ASC";  
        
        ArrayList<DTO_Customer> array = new  ArrayList<DTO_Customer>();
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        while (result.next()) {
            String id = result.getString(1);
            String firstname = result.getString(2);
            String lastname = result.getString(3);
            String email = result.getString(4);
            String password = result.getString(5);
            String phonenumber = result.getString(6);
            DTO_Customer user = new DTO_Customer(id, firstname, lastname, email, 
            password, phonenumber);   
            array.add(user);
            
        }
        
         conn.close();
         return array;
    }
    
}
