/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DAO_Statistics;
import DTO.DTO_ImportReceipt;
import java.sql.SQLException;
import java.util.ArrayList;

public class BUS_Statistics {
    public BUS_Statistics(){}
        DAO_Statistics statisticsDAO = new DAO_Statistics();
         public ArrayList<DTO_ImportReceipt> getImportReceipts(String date) throws SQLException, ClassNotFoundException
         {
              ArrayList<DTO_ImportReceipt> receipts = new ArrayList<DTO_ImportReceipt>();
              DAO_Statistics staDAO = new DAO_Statistics();
              receipts = staDAO.getImportReceipts(date);
              return receipts;
         }
         
          public int getImportReceiptQuantity(String date) throws SQLException, ClassNotFoundException
         {
              int quantity=0;
              DAO_Statistics staDAO = new DAO_Statistics();
              quantity = staDAO.getImportReceiptQuantity(date);
              return quantity;
         }  
          public int getImportItemQuantity(String date) throws SQLException, ClassNotFoundException
         {
              int quantity=0;
              DAO_Statistics staDAO = new DAO_Statistics();
              quantity = staDAO.getImportItemQuantity(date);
              return quantity;
         } 
          
           public double getTotalImportingCost(String date) throws SQLException, ClassNotFoundException
         {
               double cost=0;
              DAO_Statistics staDAO = new DAO_Statistics();
              cost = staDAO.getTotalImportingCost(date);
              return cost;
         }  
    }

    
         

