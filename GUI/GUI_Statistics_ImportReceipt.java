/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.BUS_ImportReceipt;
import BUS.BUS_Product;
import BUS.BUS_Statistics;
import DTO.DTO_StatisticReceiptInfo;
import DTO.DTO_Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vu Nguyen
 */
public class GUI_Statistics_ImportReceipt extends javax.swing.JFrame {
    private Vector Object;
    private Vector Header;
    private DefaultTableModel  model;
    public GUI_Statistics_ImportReceipt() throws SQLException, ClassNotFoundException {
       Header = new Vector();
       Header.add("#");
       Header.add("Product ID");
       Header.add("Product Name");
       Header.add("Quantity");
       Header.add("Total Price");
       model = new DefaultTableModel(Header,0);
        initComponents();
        
    }
public void loadReceiptByProduct() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("#");
       Header.add("Product ID");
       Header.add("Product Name");
       Header.add("Quantity");
       Header.add("Total Price");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_Statistics statisticBUS = new BUS_Statistics();
       ArrayList<DTO_Product> receipts = new ArrayList<DTO_Product>();
       receipts = statisticBUS.getReceiptByProduct();
       double TotalCost =0;
       int    TotalQuantity=0;
        for(int i=0;i<receipts.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = receipts.get(i);
            Vector Object = new Vector();
            Object.add(i+1);
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getQuantity());
            double price = (double)tempProduct.getQuantity() * tempProduct.getPrice();
            Object.add(price);
            model.addRow(Object);
            txtQuantity.setText(String.valueOf(i+1));
            TotalCost += price;
            TotalQuantity +=tempProduct.getQuantity();
        }
        
        txtCost.setText("$" + String.valueOf(TotalCost));
        txtItem.setText(String.valueOf(TotalQuantity));
        this.model = model;
        tblStatistics.setModel(model);
    }

    public void loadReceiptByProductAndStaff() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("#");
       Header.add("Product Name");
       Header.add("Staff Name");
       Header.add("Quantity");
       Header.add("Total Price");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_Statistics statisticBUS = new BUS_Statistics();
       ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
       receipts = statisticBUS.getReceiptByProductAndStaff();
       double TotalCost =0;
       int    TotalQuantity=0;
        for(int i=0;i<receipts.size();i++)
        {
            DTO_StatisticReceiptInfo tempProduct = new DTO_StatisticReceiptInfo(); 
            tempProduct = receipts.get(i);
            Vector Object = new Vector();
            Object.add(i+1);
            Object.add(tempProduct.getProductName());
            Object.add(tempProduct.getStaffName());
            Object.add(tempProduct.getQuantity());
            double price = (double)tempProduct.getQuantity() * tempProduct.getPrice();
            Object.add(price);
            model.addRow(Object);
            txtQuantity.setText(String.valueOf(i+1));
            TotalCost += price;
            TotalQuantity +=tempProduct.getQuantity();
        }
        
        txtCost.setText("$" + String.valueOf(TotalCost));
        txtItem.setText(String.valueOf(TotalQuantity));
        this.model = model;
        tblStatistics.setModel(model);
    }

    public void loadReceiptByProductAndStaffAndDate() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("#");
       Header.add("Date");
       Header.add("Product Name");
       Header.add("Staff Name");
       Header.add("Quantity");
       Header.add("Total Price");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_Statistics statisticBUS = new BUS_Statistics();
       ArrayList<DTO_StatisticReceiptInfo> receipts = new ArrayList<DTO_StatisticReceiptInfo>();
       receipts = statisticBUS.getReceiptByProductAndStaffAndDate();
       double TotalCost =0;
       int    TotalQuantity=0;
        for(int i=0;i<receipts.size();i++)
        {
            DTO_StatisticReceiptInfo tempProduct = new DTO_StatisticReceiptInfo(); 
            tempProduct = receipts.get(i);
            Vector Object = new Vector();
            Object.add(i+1);
            Object.add(tempProduct.getDate());
            Object.add(tempProduct.getProductName());
            Object.add(tempProduct.getStaffName());
            Object.add(tempProduct.getQuantity());
            double price = (double)tempProduct.getQuantity() * tempProduct.getPrice();
            Object.add(price);
            model.addRow(Object);
            txtQuantity.setText(String.valueOf(i+1));
            TotalCost += price;
            TotalQuantity +=tempProduct.getQuantity();
        }
        
        txtCost.setText("$" + String.valueOf(TotalCost));
        txtItem.setText(String.valueOf(TotalQuantity));
        this.model = model;
        tblStatistics.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbOrderID = new javax.swing.JPanel();
        cbChoose = new javax.swing.JComboBox();
        lbQuantity = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbCost = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JLabel();
        txtCost = new javax.swing.JLabel();
        txtItem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatistics = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(126, 64, 139)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 901));

        lbOrderID.setToolTipText("");
        lbOrderID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cbChoose.setBackground(new java.awt.Color(204, 204, 204));
        cbChoose.setEditable(true);
        cbChoose.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        cbChoose.setForeground(new java.awt.Color(255, 255, 255));
        cbChoose.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "STATISTICS CHOOSE", "GET RECEIPT BY PRODUCT", "GET RECEIPT BY PRODUCT AND STAFF", "GET RECEIPT BY PRODUCT AND STAFF AND DATE" }));
        cbChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lbOrderIDLayout = new javax.swing.GroupLayout(lbOrderID);
        lbOrderID.setLayout(lbOrderIDLayout);
        lbOrderIDLayout.setHorizontalGroup(
            lbOrderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbOrderIDLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(cbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        lbOrderIDLayout.setVerticalGroup(
            lbOrderIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbOrderIDLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        lbQuantity.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbQuantity.setText("Total Receipt");

        lbTotal.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setText("Total Import Item");

        lbCost.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCost.setText("Total Cost");

        jPanel1.setBackground(new java.awt.Color(126, 64, 139));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Import Receipt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtQuantity.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        txtQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtQuantity.setToolTipText("");

        txtCost.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtItem.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        txtItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tblStatistics.setRowHeight(32);
        tblStatistics.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        tblStatistics.setModel(model);
        jScrollPane1.setViewportView(tblStatistics);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lbCost, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lbOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantity)
                    .addComponent(lbTotal)
                    .addComponent(lbCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCost)
                        .addComponent(txtItem))
                    .addComponent(txtQuantity))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );

        lbOrderID.getAccessibleContext().setAccessibleName("Order's Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(748, 748, 748)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseActionPerformed
       try {
        switch(cbChoose.getSelectedIndex())
        {
            case 1 : loadReceiptByProduct(); break;
            case 2 : loadReceiptByProductAndStaff(); break;
            case 3 : loadReceiptByProductAndStaffAndDate(); break;    
        }
       }
        catch (SQLException ex) {
            Logger.getLogger(GUI_Statistics_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Statistics_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbChooseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbChoose;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCost;
    private javax.swing.JPanel lbOrderID;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblStatistics;
    private javax.swing.JLabel txtCost;
    private javax.swing.JLabel txtItem;
    private javax.swing.JLabel txtQuantity;
    // End of variables declaration//GEN-END:variables
}

