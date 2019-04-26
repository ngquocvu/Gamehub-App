/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.BUS_Genre;
import BUS.BUS_Customer;
import DTO.DTO_Genre;
import DTO.DTO_Customer;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnhhTuann
 */
public class GUI_CustomerTable extends javax.swing.JFrame {
    private static Object txtProID;
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
private int key;
    public GUI_CustomerTable(int key) throws SQLException, ClassNotFoundException {
        this.key = key;
        loadCustomer();
        initComponents();
       
    }

    public void loadCustomer() throws SQLException, ClassNotFoundException
    {
        Header = new Vector();
        Header.add("ID");
        Header.add("First Name");
        Header.add("Last Name");
        Header.add("Email");
        Header.add("Password");
        Header.add("Phone Number");
        
        DefaultTableModel model = new DefaultTableModel(Header,0);
        BUS_Customer customerbus = new BUS_Customer();
        for(int i=0;i<BUS_Customer.array.size();i++)
        {
            DTO_Customer tempCustomer = new DTO_Customer(); 
            tempCustomer = BUS_Customer.array.get(i);
            Vector Object = new Vector();
            Object.add(tempCustomer.getId());
            Object.add(tempCustomer.getFirstname());
            Object.add(tempCustomer.getLastname());
            Object.add(tempCustomer.getEmail());
            Object.add(tempCustomer.getPassword());
            Object.add(tempCustomer.getPhonenumber());
            model.addRow(Object);
        }
        this.model = model;     
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnsellect = new javax.swing.JButton();

        tblCustomer.setRowHeight(32);
        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblCustomer.setModel(model);
        jScrollPane1.setViewportView(tblCustomer);

        btnsellect.setText("Sellect");
        btnsellect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsellectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(btnsellect, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsellect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsellectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsellectActionPerformed
    setSelectOption();
    
    this.dispose();
    }//GEN-LAST:event_btnsellectActionPerformed
    public void setSelectOption()
    {   
        int i = tblCustomer.getSelectedRow();
        if(key == 2)
        GUI_SaleReceipt.txtUserID.setText(tblCustomer.getModel().getValueAt(i, 0).toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsellect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    // End of variables declaration//GEN-END:variables
}
