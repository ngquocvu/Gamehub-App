/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.BUS_Publisher;
import DTO.DTO_Publisher;
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
public class GUI_PublisherTable extends javax.swing.JFrame {
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
    public GUI_PublisherTable() throws SQLException, ClassNotFoundException {
        loadPublisher();
        initComponents();
       
    }

    public void loadPublisher() throws SQLException, ClassNotFoundException
    {
       BUS_Publisher publisherBUS = new BUS_Publisher();
       Header = new Vector();
       Header.add("ID");
       Header.add("Name");
       DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<publisherBUS.array.size();i++)
        {
            Object = new Vector();
            DTO_Publisher tempPublisher = new DTO_Publisher(); 
            tempPublisher = BUS_Publisher.array.get(i);  
            Object.add(tempPublisher.getId());
            Object.add(tempPublisher.getName());
            model.addRow(Object);
        }
        this.model = model;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPublisher = new javax.swing.JTable();
        btnsellect = new javax.swing.JButton();

        tblPublisher.setRowHeight(32);
        tblPublisher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblPublisher.setModel(model);
        jScrollPane1.setViewportView(tblPublisher);

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
        int i = tblPublisher.getSelectedRow();
    GUI_Product.txtPublisher.setText(tblPublisher.getModel().getValueAt(i, 0).toString());
    GUI_ImportReceipt.txtPublisherID.setText(tblPublisher.getModel().getValueAt(i, 0).toString());
    this.dispose();
    }//GEN-LAST:event_btnsellectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_PublisherTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PublisherTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PublisherTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PublisherTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_PublisherTable().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_PublisherTable.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI_PublisherTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsellect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPublisher;
    // End of variables declaration//GEN-END:variables
}
