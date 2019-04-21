/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.BUS_ChangeCategory;
import DTO.DTO_Category;
import java.util.ArrayList;

/**
 *
 * @author Vu Nguyen
 */
public class GUI_MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public GUI_MainJFrame() {
        initComponents();
        
        setTitle("Game Selling Manager");
        
        BUS_ChangeCategory controller = new BUS_ChangeCategory(jpnView);
        controller.setView(jpnHome, jlbHome);
        
        ArrayList<DTO_Category> listItem = new ArrayList<>();
        listItem.add(new DTO_Category("Home",jpnHome,jlbHome));
        listItem.add(new DTO_Category("Product",jpnProduct,jlbProduct));
        listItem.add(new DTO_Category("Staff",jpnStaff,jlbStaff));
        listItem.add(new DTO_Category("Customer",jpnCustomer,jlbCustomer));
        listItem.add(new DTO_Category("Receipt",jpnReceipt,jlbReceipt));
        listItem.add(new DTO_Category("Statistics",jpnStatistics,jlbStatistics));
        listItem.add(new DTO_Category("Genre",jpnGenre,jlbGenre));
         
        controller.setEvent(listItem);
         
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jpnTitle = new javax.swing.JPanel();
        jlbTitle = new javax.swing.JLabel();
        jpnHome = new javax.swing.JPanel();
        jlbHome = new javax.swing.JLabel();
        jpnProduct = new javax.swing.JPanel();
        jlbProduct = new javax.swing.JLabel();
        jpnStaff = new javax.swing.JPanel();
        jlbStaff = new javax.swing.JLabel();
        jpnCustomer = new javax.swing.JPanel();
        jlbCustomer = new javax.swing.JLabel();
        jpnReceipt = new javax.swing.JPanel();
        jlbReceipt = new javax.swing.JLabel();
        jpnStatistics = new javax.swing.JPanel();
        jlbStatistics = new javax.swing.JLabel();
        jpnGenre = new javax.swing.JPanel();
        jlbGenre = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jpnView1 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jpnMenu.setBackground(new java.awt.Color(1, 2, 59));
        jpnMenu.setPreferredSize(new java.awt.Dimension(380, 1080));

        jpnTitle.setBackground(new java.awt.Color(126, 64, 139));

        jlbTitle.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbTitle.setForeground(new java.awt.Color(240, 240, 240));
        jlbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_airplay_white_24dp.png"))); // NOI18N
        jlbTitle.setLabelFor(this);
        jlbTitle.setText(" GAME SELLING MANAGER");
        jlbTitle.setToolTipText("");

        javax.swing.GroupLayout jpnTitleLayout = new javax.swing.GroupLayout(jpnTitle);
        jpnTitle.setLayout(jpnTitleLayout);
        jpnTitleLayout.setHorizontalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnTitleLayout.setVerticalGroup(
            jpnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpnHome.setBackground(new java.awt.Color(105, 87, 142));

        jlbHome.setBackground(new java.awt.Color(1, 2, 59));
        jlbHome.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbHome.setForeground(new java.awt.Color(255, 255, 255));
        jlbHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_home_white_24dp.png"))); // NOI18N
        jlbHome.setText("HOME");

        javax.swing.GroupLayout jpnHomeLayout = new javax.swing.GroupLayout(jpnHome);
        jpnHome.setLayout(jpnHomeLayout);
        jpnHomeLayout.setHorizontalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHomeLayout.setVerticalGroup(
            jpnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnProduct.setBackground(new java.awt.Color(105, 87, 142));

        jlbProduct.setBackground(new java.awt.Color(192, 193, 223));
        jlbProduct.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbProduct.setForeground(new java.awt.Color(255, 255, 255));
        jlbProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_games_white_24dp_1.png"))); // NOI18N
        jlbProduct.setText("PRODUCT");

        javax.swing.GroupLayout jpnProductLayout = new javax.swing.GroupLayout(jpnProduct);
        jpnProduct.setLayout(jpnProductLayout);
        jpnProductLayout.setHorizontalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnProductLayout.setVerticalGroup(
            jpnProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnStaff.setBackground(new java.awt.Color(105, 87, 142));

        jlbStaff.setBackground(new java.awt.Color(192, 193, 223));
        jlbStaff.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbStaff.setForeground(new java.awt.Color(255, 255, 255));
        jlbStaff.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_assignment_ind_white_24dp.png"))); // NOI18N
        jlbStaff.setText("STAFF");

        javax.swing.GroupLayout jpnStaffLayout = new javax.swing.GroupLayout(jpnStaff);
        jpnStaff.setLayout(jpnStaffLayout);
        jpnStaffLayout.setHorizontalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStaffLayout.setVerticalGroup(
            jpnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStaff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnCustomer.setBackground(new java.awt.Color(105, 87, 142));

        jlbCustomer.setBackground(new java.awt.Color(192, 193, 223));
        jlbCustomer.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jlbCustomer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_supervisor_account_white_24dp.png"))); // NOI18N
        jlbCustomer.setText("CUSTOMER");

        javax.swing.GroupLayout jpnCustomerLayout = new javax.swing.GroupLayout(jpnCustomer);
        jpnCustomer.setLayout(jpnCustomerLayout);
        jpnCustomerLayout.setHorizontalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnCustomerLayout.setVerticalGroup(
            jpnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnReceipt.setBackground(new java.awt.Color(105, 87, 142));

        jlbReceipt.setBackground(new java.awt.Color(192, 193, 223));
        jlbReceipt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbReceipt.setForeground(new java.awt.Color(255, 255, 255));
        jlbReceipt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbReceipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_receipt_white_24dp.png"))); // NOI18N
        jlbReceipt.setText("RECEIPT");

        javax.swing.GroupLayout jpnReceiptLayout = new javax.swing.GroupLayout(jpnReceipt);
        jpnReceipt.setLayout(jpnReceiptLayout);
        jpnReceiptLayout.setHorizontalGroup(
            jpnReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnReceiptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnReceiptLayout.setVerticalGroup(
            jpnReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReceiptLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbReceipt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnStatistics.setBackground(new java.awt.Color(105, 87, 142));

        jlbStatistics.setBackground(new java.awt.Color(192, 193, 223));
        jlbStatistics.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbStatistics.setForeground(new java.awt.Color(255, 255, 255));
        jlbStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round_assessment_white_24dp.png"))); // NOI18N
        jlbStatistics.setText("STATISTICS");

        javax.swing.GroupLayout jpnStatisticsLayout = new javax.swing.GroupLayout(jpnStatistics);
        jpnStatistics.setLayout(jpnStatisticsLayout);
        jpnStatisticsLayout.setHorizontalGroup(
            jpnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStatisticsLayout.setVerticalGroup(
            jpnStatisticsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStatisticsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnGenre.setBackground(new java.awt.Color(105, 87, 142));

        jlbGenre.setBackground(new java.awt.Color(192, 193, 223));
        jlbGenre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbGenre.setForeground(new java.awt.Color(255, 255, 255));
        jlbGenre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbGenre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_playlist_add_check_white_24dp.png"))); // NOI18N
        jlbGenre.setText("GENRE");

        javax.swing.GroupLayout jpnGenreLayout = new javax.swing.GroupLayout(jpnGenre);
        jpnGenre.setLayout(jpnGenreLayout);
        jpnGenreLayout.setHorizontalGroup(
            jpnGenreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGenreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnGenreLayout.setVerticalGroup(
            jpnGenreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnGenreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jpnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jpnGenre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jpnTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpnView.setPreferredSize(new java.awt.Dimension(1000, 900));

        jpnView1.setPreferredSize(new java.awt.Dimension(1000, 900));

        javax.swing.GroupLayout jpnView1Layout = new javax.swing.GroupLayout(jpnView1);
        jpnView1.setLayout(jpnView1Layout);
        jpnView1Layout.setHorizontalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1509, Short.MAX_VALUE)
        );
        jpnView1Layout.setVerticalGroup(
            jpnView1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1509, Short.MAX_VALUE)
            .addGroup(jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnViewLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpnView1, javax.swing.GroupLayout.PREFERRED_SIZE, 1509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1093, Short.MAX_VALUE)
            .addGroup(jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnViewLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpnView1, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, 1509, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, 1093, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbCustomer;
    private javax.swing.JLabel jlbGenre;
    private javax.swing.JLabel jlbHome;
    private javax.swing.JLabel jlbProduct;
    private javax.swing.JLabel jlbReceipt;
    private javax.swing.JLabel jlbStaff;
    private javax.swing.JLabel jlbStatistics;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JPanel jpnCustomer;
    private javax.swing.JPanel jpnGenre;
    private javax.swing.JPanel jpnHome;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnProduct;
    private javax.swing.JPanel jpnReceipt;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnStaff;
    private javax.swing.JPanel jpnStatistics;
    private javax.swing.JPanel jpnTitle;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnView1;
    // End of variables declaration//GEN-END:variables
}
