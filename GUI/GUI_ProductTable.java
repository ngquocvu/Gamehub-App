/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.BUS_Genre;
import BUS.BUS_Product;
import DTO.DTO_Genre;
import DTO.DTO_Product;
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
public class GUI_ProductTable extends javax.swing.JFrame {
    private static Object txtProID;
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
private int key;
    public GUI_ProductTable(int key) throws SQLException, ClassNotFoundException {
        this.key = key;
        loadProduct();
        initComponents();
       
    }

    public void loadProduct() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("ID");
       Header.add("Name");
       Header.add("Price");
       Header.add("Quantity");
       Header.add("Publisher");
       Header.add("Platform");
       Header.add("Genre");
       Header.add("Release Year");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_Product ProductBus = new BUS_Product();
        for(int i=0;i<BUS_Product.array.size();i++)
        {
            
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = BUS_Product.array.get(i);
            String genreName = ProductBus.getGenreName(tempProduct.getGenreID());
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            String name = ProductBus.getPublisherName(tempProduct.getPublisherID());
            Object.add(name);
            Object.add(tempProduct.getPlatform());
            Object.add(genreName);
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenre = new javax.swing.JTable();
        btnsellect = new javax.swing.JButton();

        tblGenre.setRowHeight(32);
        tblGenre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblGenre.setModel(model);
        jScrollPane1.setViewportView(tblGenre);

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
        int i = tblGenre.getSelectedRow();
        if(key == 1)
        GUI_OrderItem.txtProID.setText(tblGenre.getModel().getValueAt(i, 0).toString());
        else if(key == 2)
        GUI_SaleItem.txtProID.setText(tblGenre.getModel().getValueAt(i, 0).toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsellect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGenre;
    // End of variables declaration//GEN-END:variables
}
