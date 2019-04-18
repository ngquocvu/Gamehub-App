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

    public void update(DTO_Customer user) throws SQLException, ClassNotFoundException {
        DAO_Customer customerDAO = new DAO_Customer();
        customerDAO.update(user);
    }
}
