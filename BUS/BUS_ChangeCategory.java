/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BUS;

import DTO.DTO_Category;
import GUI.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Vu Nguyen
 */
public class BUS_ChangeCategory {
    private JPanel root;
    private String kindSelected = "";
    
    private ArrayList<DTO_Category> listItem = null;

    public BUS_ChangeCategory(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "Home";
        jpnItem.setBackground(new Color(91,100,191));
        jlbItem.setBackground(new Color(91,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new GUI_Home());
        root.validate();
        root.repaint();
        
    }
    
    public void setEvent(ArrayList<DTO_Category> listItem)
    {
        this.listItem= listItem;
         for(DTO_Category item: listItem)
         {
             item.getJlabel().addMouseListener(new LabelEvent(item.getKind(),item.getJpanel(),item.getJlabel()));
         }
    }

    class LabelEvent implements MouseListener 
    {
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }



        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind)
            {
                case "Home":
                    node = new GUI_Home();
                    break;
                case "Product":
                try {
                    node = new GUI_Product();
                } catch (SQLException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                }
                    break;
                case "Staff":
                try {        
                    node = new GUI_Staff();
                } catch (SQLException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                }      
                    break;
                case "Customer":
                try {    
                    node = new GUI_Customer();
                } catch (SQLException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(BUS_ChangeCategory.class.getName()).log(Level.SEVERE, null, ex);
                }        
                    break;
                case "Receipt":
                    node = new GUI_Receipt();
                    break;  
                case "Statistics":
                    node = new GUI_Statistics();
                    break;  
                default:    
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected=kind;
            jlbItem.setBackground(new Color(105,87,142));
            jpnItem.setBackground(new Color(105,87,142));
        }
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jlbItem.setBackground(new Color(105,87,142));
            jpnItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
             if(!kindSelected.equalsIgnoreCase(kind))
             {
                 jpnItem.setBackground(new Color(105,87,142));
                 jlbItem.setBackground(new Color(105,87,142));
             }
        }
        }
        private void setChangeBackground(String kind)
        {
            for(DTO_Category item : listItem)
                if(item.getKind().equalsIgnoreCase(kind))
                {
                    item.getJpanel().setBackground(new Color(96,100,191));
                    item.getJlabel().setBackground(new Color(96,100,191));
                }
                 else
                {
                    item.getJpanel().setBackground(new Color(105,87,142));
                    item.getJlabel().setBackground(new Color(105,87,142));
                }
        }
}