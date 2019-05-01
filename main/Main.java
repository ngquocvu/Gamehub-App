package main;

import GUI.GUI_Login;
import GUI.GUI_MainJFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        
         new GUI_MainJFrame().setVisible(true);
        /*GUI_Login login = new GUI_Login();
        Toolkit toolkit = login.getToolkit();
        Dimension size = toolkit.getScreenSize();
        login.setLocation(size.width/2 - login.getHeight()/2, size.height/2 - login.getHeight()/2);
        login.setVisible(true);
                */
    }
    
}
