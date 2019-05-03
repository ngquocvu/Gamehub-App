/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.BUS_Genre;
import DTO.DTO_Genre;
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
public class GUI_GenreTable extends javax.swing.JFrame {
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
    public GUI_GenreTable() throws SQLException, ClassNotFoundException {
        loadGenre();
        initComponents();
       
    }

    public void loadGenre() throws SQLException, ClassNotFoundException
    {
       BUS_Genre genreBUS = new BUS_Genre();
       Header = new Vector();
       Header.add("ID");
       Header.add("Name");
       DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<genreBUS.array.size();i++)
        {
            Object = new Vector();
            DTO_Genre tempGenre = new DTO_Genre(); 
            tempGenre = BUS_Genre.array.get(i);  
            Object.add(tempGenre.getId());
            Object.add(tempGenre.getName());
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
        int i = tblGenre.getSelectedRow();
    GUI_Product.txtGenre.setText(tblGenre.getModel().getValueAt(i, 0).toString());
    this.dispose();
    }//GEN-LAST:event_btnsellectActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsellect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGenre;
    // End of variables declaration//GEN-END:variables
}
