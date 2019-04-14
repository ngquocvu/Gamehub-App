/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;
import DAO.DAO_Product;
import DTO.DTO_Product; 
import java.sql.SQLException;
import java.util.ArrayList; 
public class BUS_Product {


    public static ArrayList<DTO_Product> AllProduct() throws SQLException, ClassNotFoundException{ 
        DAO_Product products = new DAO_Product();
        return products.getAll(); 
    } 

}
