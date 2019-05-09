/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AppPackage.AnimationClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AnhhTuann
 */


public class GUI_Animation extends javax.swing.JFrame {

    
   
    public GUI_Animation() {
        initComponents();
        this.setSize(1100, 680);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        AnimationClass anim = new AnimationClass();
        
        anim.jLabelXLeft(purple.getX(), -1000, 2, 1, purple);
        
        anim.jLabelXRight(yellow.getX(), 1000, 3, 1, yellow);
        
        anim.jLabelYDown(red.getY(), 1000, 4, 1, red);
        
        anim.jLabelYDown(blue.getY(), 1000, 2, 1, blue);
        
        anim.jLabelXRight(-500, 10, 2, 1, welcome);
        
        new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                 setVisible(false);
            new GUI_MainJFrame().setVisible(true);
            }
        }, 
        3000
);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        purple = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        purple.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animation/Path 1.png"))); // NOI18N
        jPanel1.add(purple, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 770, 670));

        blue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animation/Path 3.png"))); // NOI18N
        jPanel1.add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 750, 670));

        red.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animation/Path 4.png"))); // NOI18N
        jPanel1.add(red, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 160, 760, 670));

        yellow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animation/Path 2.png"))); // NOI18N
        jPanel1.add(yellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, -10, 760, 670));

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        welcome.setForeground(new java.awt.Color(102, 102, 102));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gamehub.png"))); // NOI18N
        welcome.setToolTipText("");
        welcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welcomeMouseClicked(evt);
            }
        });
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 170, 1090, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void welcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welcomeMouseClicked

    }//GEN-LAST:event_welcomeMouseClicked
    
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
            java.util.logging.Logger.getLogger(GUI_Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Animation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel purple;
    private javax.swing.JLabel red;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables
}
