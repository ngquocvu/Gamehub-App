/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.BUS_SaleReceipt;
import BUS.BUS_Product;
import BUS.BUS_Statistics;
import DTO.DTO_SaleReceipt;
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
public class GUI_Statistics_SaleReceipt extends javax.swing.JFrame {
    private Vector Object;
    private Vector Header;
    private DefaultTableModel  model;
    public GUI_Statistics_SaleReceipt() throws SQLException, ClassNotFoundException {
       Header = new Vector();
       Header.add("ID");
       Header.add("Staff ID");
       Header.add("Create at");
       Header.add("State");
       model = new DefaultTableModel(Header,0);
              initComponents();
       txtProductID.setEditable(false);
       txtUserID.setEditable(false);
       txtStaffID.setEditable(false);
       txtDateFrom.setEditable(false);
       txtDateTo.setEditable(false);
 
        
    }
public void loadReceipt() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("ID");
       Header.add("Staff ID");
       Header.add("Create at");
       Header.add("State");    
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_Statistics statisticBUS = new BUS_Statistics();
       ArrayList<DTO_SaleReceipt> receipts = new ArrayList<DTO_SaleReceipt>();
       receipts = statisticBUS.getSaleReceipts(txtDateFrom.getText());
        for(int i=0;i<receipts.size();i++)
        {
            DTO_SaleReceipt tempReceipt = new DTO_SaleReceipt(); 
            tempReceipt = receipts.get(i);
            Vector Object = new Vector();
            Object.add(tempReceipt.getId());
            Object.add(tempReceipt.getStaffID());
            Object.add(tempReceipt.getCreateDate());
            Object.add(tempReceipt.getState());
            model.addRow(Object);
        }
        this.model = model;
        tblStatistics.setModel(model);
    }
public void setTotalImportingCost() throws SQLException, ClassNotFoundException
{
    BUS_Statistics staBUS = new BUS_Statistics();
    txtCost.setText(String.valueOf(staBUS.getTotalImportingCost(txtDateFrom.getText())));
}
public void setImportItemQuantity() throws SQLException, ClassNotFoundException
{
    BUS_Statistics staBUS = new BUS_Statistics();
    txtTotal.setText(String.valueOf(staBUS.getImportItemQuantity(txtDateFrom.getText())));
}

public void setSaleReceiptQuantity() throws SQLException, ClassNotFoundException
{
    BUS_Statistics staBUS = new BUS_Statistics();
    txtQuantity.setText(String.valueOf(staBUS.getSaleReceiptQuantity(txtDateFrom.getText())));
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Wrapper = new javax.swing.JPanel();
        txtDateFrom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDateTo = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        checkProductID = new javax.swing.JCheckBox();
        checkDate = new javax.swing.JCheckBox();
        checkStaffID = new javax.swing.JCheckBox();
        checkUserID = new javax.swing.JCheckBox();
        lbQuantity = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        lbCost = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatistics = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(126, 64, 139)));
        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 901));

        Wrapper.setToolTipText("");
        Wrapper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtDateFrom.setMaximumSize(null);
        txtDateFrom.setMinimumSize(null);
        txtDateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateFromActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(YYYY-MM-DD)");

        txtDateTo.setMaximumSize(null);
        txtDateTo.setMinimumSize(null);
        txtDateTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateToActionPerformed(evt);
            }
        });

        txtStaffID.setMaximumSize(null);
        txtStaffID.setMinimumSize(null);
        txtStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffIDActionPerformed(evt);
            }
        });

        txtProductID.setMaximumSize(null);
        txtProductID.setMinimumSize(null);
        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PRODUCT ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("USER ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("STAFF ID");

        txtUserID.setMaximumSize(null);
        txtUserID.setMinimumSize(null);
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("FROM");

        btnAdd.setBackground(new java.awt.Color(99, 19, 132));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("GET");
        btnAdd.setFocusTraversalPolicyProvider(true);
        btnAdd.setMaximumSize(new java.awt.Dimension(79, 25));
        btnAdd.setMinimumSize(new java.awt.Dimension(79, 25));
        btnAdd.setPreferredSize(new java.awt.Dimension(79, 25));
        btnAdd.setVerifyInputWhenFocusTarget(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        checkProductID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkProductIDMouseClicked(evt);
            }
        });
        checkProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkProductIDActionPerformed(evt);
            }
        });

        checkDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDateActionPerformed(evt);
            }
        });

        checkStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkStaffIDActionPerformed(evt);
            }
        });

        checkUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkUserIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WrapperLayout = new javax.swing.GroupLayout(Wrapper);
        Wrapper.setLayout(WrapperLayout);
        WrapperLayout.setHorizontalGroup(
            WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrapperLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WrapperLayout.createSequentialGroup()
                        .addComponent(txtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrapperLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(checkDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WrapperLayout.createSequentialGroup()
                        .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkProductID)
                            .addComponent(checkStaffID)
                            .addComponent(checkUserID))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(WrapperLayout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WrapperLayout.setVerticalGroup(
            WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrapperLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkProductID))
                .addGap(18, 18, 18)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkStaffID))
                .addGap(18, 18, 18)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkUserID))
                .addGap(19, 19, 19)
                .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lbQuantity.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbQuantity.setText("Import Receipt Quantity");

        lbTotal.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setText("Total Import Item");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtCost.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbCost.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCost.setText("Total Cost");

        txtQuantity.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel1.setBackground(new java.awt.Color(126, 64, 139));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sale Receipt");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(txtTotal))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCost, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txtCost))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Wrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Wrapper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQuantity, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCost)
                        .addComponent(lbTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Wrapper.getAccessibleContext().setAccessibleName("Order's Information");

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

        tblStatistics.setRowHeight(32);
        tblStatistics.setFont(new java.awt.Font("Roboto", 1, 15)); // NOI18N
        tblStatistics.setModel(model);
        jScrollPane1.setViewportView(tblStatistics);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(308, 308, 308))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 933, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateFromActionPerformed

    private void txtDateToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateToActionPerformed

    private void txtStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffIDActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            loadReceipt();
            setTotalImportingCost();
            setImportReceiptQuantity();
            setImportItemQuantity();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Statistics_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Statistics_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void checkProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkProductIDActionPerformed
       if(!checkProductID.isSelected())
           txtProductID.setEditable(false);
       else
           txtProductID.setEditable(true);
    }//GEN-LAST:event_checkProductIDActionPerformed

    private void checkDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDateActionPerformed
        if(!checkDate.isSelected())
        {
            txtDateTo.setEditable(false);
            txtDateFrom.setEditable(false);
        }
       else
            txtDateTo.setEditable(true);
            txtDateFrom.setEditable(true);
    }//GEN-LAST:event_checkDateActionPerformed

    private void checkStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkStaffIDActionPerformed
        if(!checkStaffID.isSelected())
           txtStaffID.setEditable(false);
       else
           txtStaffID.setEditable(true);
    }//GEN-LAST:event_checkStaffIDActionPerformed

    private void checkUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkUserIDActionPerformed
       if(!checkUserID.isSelected())
           txtUserID.setEditable(false);
       else
           txtUserID.setEditable(true);
    }//GEN-LAST:event_checkUserIDActionPerformed

    private void checkProductIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkProductIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_checkProductIDMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Wrapper;
    private javax.swing.JButton btnAdd;
    private javax.swing.JCheckBox checkDate;
    private javax.swing.JCheckBox checkProductID;
    private javax.swing.JCheckBox checkStaffID;
    private javax.swing.JCheckBox checkUserID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCost;
    private javax.swing.JLabel lbQuantity;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblStatistics;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDateFrom;
    private javax.swing.JTextField txtDateTo;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}

