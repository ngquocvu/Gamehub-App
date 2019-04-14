package main;

import GUI.GUI_MainJFrame;
import DAO.DAO_Product;
import DTO.DTO_Product;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        new GUI_MainJFrame().setVisible(true);
        
       
    }
    
}
