/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DTO.DTO_Product;
import BUS.BUS_Product;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vu Nguyen
 */
public class GUI_Product extends javax.swing.JPanel {
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
private String directory = "";
    public GUI_Product() throws SQLException, ClassNotFoundException {
       loadProduct();
       initComponents();
       txtGenre.setEditable(false);
       txtPublisher.setEditable(false);
       
        
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
  
    public DTO_Product findItem(String id)
    {
        for(DTO_Product product : BUS_Product.array)
         {
            if(product.getId().equalsIgnoreCase(id))
                return product;
         }
         return null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbPrice = new javax.swing.JLabel();
        lbPublisher = new javax.swing.JLabel();
        lbPlatform = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lbGenre = new javax.swing.JLabel();
        cbPlatform = new javax.swing.JComboBox();
        txtReDate = new javax.swing.JTextField();
        lbReDate = new javax.swing.JLabel();
        txtGenre = new javax.swing.JTextField();
        btnGenre = new javax.swing.JButton();
        btnPublisher = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnYearSearch = new javax.swing.JButton();
        txtPriceSearch1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPriceSearch2 = new javax.swing.JTextField();
        btnPriceSearch = new javax.swing.JButton();
        txtDateSearch1 = new javax.swing.JTextField();
        txtDateSearch2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnQuantitySearch = new javax.swing.JButton();
        txtQuantitySearch2 = new javax.swing.JTextField();
        txtQuantitySearch1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport1 = new javax.swing.JButton();
        txtDir = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        cbsort = new javax.swing.JComboBox();
        tgSort = new javax.swing.JToggleButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setForeground(java.awt.Color.white);
        setToolTipText("");
        setInheritsPopupMenu(true);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1494, 1092));

        jPanel2.setBackground(new java.awt.Color(126, 64, 139));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_games_white_24dp_1.png"))); // NOI18N
        jLabel2.setText("Product");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(1130, 901));

        txtSearch.setMaximumSize(null);
        txtSearch.setMinimumSize(null);
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbID.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lbName.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbName.setText("Name");

        lbPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPrice.setText("Price");

        lbPublisher.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPublisher.setText("Publisher");

        lbPlatform.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPlatform.setText("Platform");
        lbPlatform.setFocusTraversalPolicyProvider(true);

        txtPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublisherActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(99, 19, 132));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
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

        btnEdit.setBackground(new java.awt.Color(99, 19, 132));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setMaximumSize(new java.awt.Dimension(79, 25));
        btnEdit.setMinimumSize(new java.awt.Dimension(79, 25));
        btnEdit.setPreferredSize(new java.awt.Dimension(79, 25));
        btnEdit.setVerifyInputWhenFocusTarget(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(99, 19, 132));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setMaximumSize(new java.awt.Dimension(79, 25));
        btnReset.setMinimumSize(new java.awt.Dimension(79, 25));
        btnReset.setPreferredSize(new java.awt.Dimension(79, 25));
        btnReset.setVerifyInputWhenFocusTarget(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(99, 19, 132));
        btnRemove.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.setVerifyInputWhenFocusTarget(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );

        lbGenre.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbGenre.setText("Genre");
        lbGenre.setFocusTraversalPolicyProvider(true);

        cbPlatform.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Steam", "PC", "Wii", "Xbox", "Playstation" }));

        txtReDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReDateActionPerformed(evt);
            }
        });

        lbReDate.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbReDate.setText("Release Year");

        txtGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenreActionPerformed(evt);
            }
        });

        btnGenre.setText("...");
        btnGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenreActionPerformed(evt);
            }
        });

        btnPublisher.setText("...");
        btnPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublisherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID)
                    .addComponent(lbPlatform))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(cbPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGenre)
                    .addComponent(lbReDate)
                    .addComponent(lbPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtReDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtGenre)
                                .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbName)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbReDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbID))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlatform, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbGenre)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPublisher))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advanced Features", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N

        btnYearSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnYearSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnYearSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnYearSearch.setText("Release Year Search");
        btnYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearSearchActionPerformed(evt);
            }
        });

        txtPriceSearch1.setMaximumSize(null);
        txtPriceSearch1.setMinimumSize(null);
        txtPriceSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceSearch1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("TO");

        txtPriceSearch2.setMaximumSize(null);
        txtPriceSearch2.setMinimumSize(null);
        txtPriceSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceSearch2ActionPerformed(evt);
            }
        });

        btnPriceSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnPriceSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPriceSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnPriceSearch.setText("Price Search");
        btnPriceSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPriceSearchActionPerformed(evt);
            }
        });

        txtDateSearch1.setMaximumSize(null);
        txtDateSearch1.setMinimumSize(null);
        txtDateSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateSearch1ActionPerformed(evt);
            }
        });

        txtDateSearch2.setMaximumSize(null);
        txtDateSearch2.setMinimumSize(null);
        txtDateSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateSearch2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("TO");

        btnQuantitySearch.setBackground(new java.awt.Color(99, 19, 132));
        btnQuantitySearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnQuantitySearch.setForeground(new java.awt.Color(255, 255, 255));
        btnQuantitySearch.setText("Quantity Search ");
        btnQuantitySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuantitySearchActionPerformed(evt);
            }
        });

        txtQuantitySearch2.setMaximumSize(null);
        txtQuantitySearch2.setMinimumSize(null);
        txtQuantitySearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantitySearch2ActionPerformed(evt);
            }
        });

        txtQuantitySearch1.setMaximumSize(null);
        txtQuantitySearch1.setMinimumSize(null);
        txtQuantitySearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantitySearch1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("TO");

        btnExport.setBackground(new java.awt.Color(99, 19, 132));
        btnExport.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("EXPORT");
        btnExport.setFocusTraversalPolicyProvider(true);
        btnExport.setMaximumSize(new java.awt.Dimension(79, 25));
        btnExport.setMinimumSize(new java.awt.Dimension(79, 25));
        btnExport.setPreferredSize(new java.awt.Dimension(79, 25));
        btnExport.setVerifyInputWhenFocusTarget(false);
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(99, 19, 132));
        btnImport.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setText("IMPORT");
        btnImport.setFocusTraversalPolicyProvider(true);
        btnImport.setMaximumSize(new java.awt.Dimension(79, 25));
        btnImport.setMinimumSize(new java.awt.Dimension(79, 25));
        btnImport.setPreferredSize(new java.awt.Dimension(79, 25));
        btnImport.setVerifyInputWhenFocusTarget(false);
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnExport1.setBackground(new java.awt.Color(99, 19, 132));
        btnExport1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnExport1.setForeground(new java.awt.Color(255, 255, 255));
        btnExport1.setText("Browser");
        btnExport1.setFocusTraversalPolicyProvider(true);
        btnExport1.setMaximumSize(new java.awt.Dimension(79, 25));
        btnExport1.setMinimumSize(new java.awt.Dimension(79, 25));
        btnExport1.setPreferredSize(new java.awt.Dimension(79, 25));
        btnExport1.setVerifyInputWhenFocusTarget(false);
        btnExport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExport1ActionPerformed(evt);
            }
        });

        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("File Directory");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnQuantitySearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYearSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPriceSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPriceSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtQuantitySearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(txtDateSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDateSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPriceSearch2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuantitySearch2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(368, Short.MAX_VALUE)
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExport1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDir)))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPriceSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPriceSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnQuantitySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantitySearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantitySearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tblProduct.setRowHeight(32);
        tblProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblProduct.setModel(model);
        tblProduct.setRowHeight(32);
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Customer Infomation");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        btnSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(99, 19, 132));
        btnRestart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 255, 255));
        btnRestart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_refresh_white_18dp.png"))); // NOI18N
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        cbsort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbsort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by", "ID", "Name", "Price", "Quantity", "Publisher", "Platform", "Genre", "Release Year" }));
        cbsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsortActionPerformed(evt);
            }
        });

        tgSort.setBackground(new java.awt.Color(99, 19, 132));
        tgSort.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tgSort.setForeground(new java.awt.Color(255, 255, 255));
        tgSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_generic_sorting_32px_1.png"))); // NOI18N
        tgSort.setText("Desc");
        tgSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tgSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbsort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbsort, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tgSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

            String id = txtID.getText();
            if(findItem(id)== null)
            {
                JOptionPane.showMessageDialog(null,"Can not delete ! Product's ID not found !");
                return;
            }
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(dialogResult == JOptionPane.YES_OPTION)
                    {
                        try {
                            BUS_Product ProductBus = new BUS_Product();
                            ProductBus.delete(id);
                            loadProduct();
                            tblProduct.setModel(this.model);
                        } catch (SQLException ex) {
                            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
                        }  
                      }   
                  else 
                  {
                      JOptionPane.showMessageDialog(null,"Please select a row to delete !");
                  }
           
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    try {
        BUS_Product ProductBus = new BUS_Product();
        ArrayList<DTO_Product> array = ProductBus.search(txtSearch.getText());
        Header = new Vector();
        Header.add("ID");
        Header.add("Name");
        Header.add("Price");
        Header.add("Quantity");
        Header.add("Publisher");
        Header.add("Platform");
        Header.add("Genre");
        Header.add("Release Date");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = array.get(i);
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            Object.add(tempProduct.getPublisherID());
            Object.add(tempProduct.getPlatform());
            Object.add(tempProduct.getGenreID());
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
        tblProduct.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearSearchActionPerformed

    try {
        BUS_Product ProductBus = new BUS_Product();
        ArrayList<DTO_Product> array = ProductBus.dateSearch(txtDateSearch1.getText(),txtDateSearch2.getText());
        Header = new Vector();
        Header.add("ID");
        Header.add("Name");
        Header.add("Price");
        Header.add("Quantity");
        Header.add("Publisher");
        Header.add("Platform");
        Header.add("Genre");
        Header.add("Release Date");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = array.get(i);
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            Object.add(tempProduct.getPublisherID());
            Object.add(tempProduct.getPlatform());
            Object.add(tempProduct.getGenreID());
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
        tblProduct.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnYearSearchActionPerformed

    private void txtPriceSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceSearch1ActionPerformed

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
    try {
        int i = tblProduct.getSelectedRow();
        BUS_Product productBUS = new BUS_Product();
        String genreID = productBUS.getGenreID(tblProduct.getModel().getValueAt(i, 6).toString());
        txtID.setText(tblProduct.getModel().getValueAt(i, 0).toString());
        txtName.setText(tblProduct.getModel().getValueAt(i, 1).toString());
        txtPrice.setText(tblProduct.getModel().getValueAt(i, 2).toString());
        String id = productBUS.getPublisherID(tblProduct.getModel().getValueAt(i, 4).toString());
        txtPublisher.setText(id);
        cbPlatform.setSelectedItem(tblProduct.getModel().getValueAt(i, 5).toString());
        txtGenre.setText(genreID);
        txtReDate.setText(tblProduct.getModel().getValueAt(i, 7).toString());
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
            
    }//GEN-LAST:event_tblProductMouseClicked

    private void txtReDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReDateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    try {
        
        if (findItem(txtID.getText())!=null)
        {
            JOptionPane.showMessageDialog(null,"This ID is already used !");
        }
         else if (!txtID.getText().matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"ID must contain digit numbers from 0 to 9 !");
        }
        else if (txtName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input name ! ");
        }
         else if (txtPublisher.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Publisher ! ");
        }
         else if (txtGenre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Genre ! ");
        }
         else if (txtPrice.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Price ! ");
        }
          else if (txtReDate.getText().equals("") || (Integer.parseInt(txtReDate.getText())>Calendar.getInstance().get(Calendar.YEAR)) || (Integer.parseInt(txtReDate.getText()))<1970)
        {
            JOptionPane.showMessageDialog(null,"Please input Year from 1970 - present ! ");
        }
        else
          {
           DTO_Product product = new DTO_Product();
            BUS_Product productBUS = new BUS_Product();
            product.setId(txtID.getText());
            product.setName(txtName.getText());
            product.setPrice(Double.parseDouble(txtPrice.getText()));
            product.setQuantity(0);
            product.setPublisherID(txtPublisher.getText());
            product.setPlatform(String.valueOf(cbPlatform.getSelectedItem()));
            product.setGenreID(String.valueOf(txtGenre.getText()));
            product.setReleaseDate(txtReDate.getText());      
            Vector header = new Vector();
            Vector row=new Vector();     
            model.addRow(row);
            tblProduct.setModel(model);
            productBUS.add(product);
        }
        
            loadProduct();
            tblProduct.setModel(this.model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText("");
            txtName.setText("");
            txtPrice.setText("");
            txtPublisher.setText("");
            cbPlatform.setSelectedIndex(1);
            txtGenre.setText("");
            txtReDate.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
             try {
        

        if (txtName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input name ! ");
        }
         else if (txtPublisher.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Publisher ! ");
        }
         else if (txtGenre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Genre ! ");
        }
         else if (txtPrice.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input Price ! ");
        }
          else if (txtReDate.getText().equals("") || (Integer.parseInt(txtReDate.getText())>Calendar.getInstance().get(Calendar.YEAR)) || (Integer.parseInt(txtReDate.getText()))<1970)
        {
            JOptionPane.showMessageDialog(null,"Please input Year from 1970 - present ! ");
        }
        else
          {
           DTO_Product product = new DTO_Product();
            BUS_Product productBUS = new BUS_Product();
            product.setId(txtID.getText());
            product.setName(txtName.getText());
            product.setPrice(Double.parseDouble(txtPrice.getText()));
            product.setQuantity(0);
            product.setPublisherID(txtPublisher.getText());
            product.setPlatform(String.valueOf(cbPlatform.getSelectedItem()));
            product.setGenreID(String.valueOf(txtGenre.getText()));
            product.setReleaseDate(txtReDate.getText());      
            Vector header = new Vector();
            Vector row=new Vector();     
            model.addRow(row);
            productBUS.update(product);
        }
        
            loadProduct();
            tblProduct.setModel(this.model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        try {
            loadProduct();
            tblProduct.setModel(this.model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void cbsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsortActionPerformed
      try { 
        BUS_Product productBUS = new BUS_Product();
        String content = "";
        if(cbsort.getSelectedIndex()==0)
        return;
        switch(cbsort.getSelectedIndex())
       {
           case 1: content = "id +0";  break;
           case 2: content = "name"; break;
           case 3: content = "price"; break;
           case 4: content = "quantity"; break;
           case 5: content = "publisherID"; break; 
           case 6: content = "platform"; break;
           case 7: content = "genreID"; break;
           case 8: content = "releaseDate"; break;    
       }
       ArrayList<DTO_Product> array = productBUS.sortBy(content,tgSort.isSelected());
       
        Header = new Vector();
        Header.add("ID");
        Header.add("Name");
        Header.add("Price");
        Header.add("Quantity");
        Header.add("Publisher");
        Header.add("Platform");
        Header.add("Genre");
        Header.add("Release Date");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = array.get(i);
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            Object.add(tempProduct.getPublisherID());
            Object.add(tempProduct.getPlatform());
            Object.add(productBUS.getGenreName(tempProduct.getGenreID()));
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
        tblProduct.setModel(model);
      }
      catch (SQLException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbsortActionPerformed

    private void tgSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgSortActionPerformed
        cbsortActionPerformed(evt);
    }//GEN-LAST:event_tgSortActionPerformed

    private void txtGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenreActionPerformed

    private void btnGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenreActionPerformed
    try {
        GUI_GenreTable genreGUI = new GUI_GenreTable();
        genreGUI.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnGenreActionPerformed

    private void txtPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublisherActionPerformed

    private void btnPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublisherActionPerformed
    try {
        GUI_PublisherTable publisherGUI = new GUI_PublisherTable();
        publisherGUI.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnPublisherActionPerformed

    private void txtPriceSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceSearch2ActionPerformed

    private void btnPriceSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPriceSearchActionPerformed
       try {
        BUS_Product ProductBus = new BUS_Product();
        ArrayList<DTO_Product> array = ProductBus.priceSearch(txtPriceSearch1.getText(),txtPriceSearch2.getText());
        Header = new Vector();
        Header.add("ID");
        Header.add("Name");
        Header.add("Price");
        Header.add("Quantity");
        Header.add("Publisher");
        Header.add("Platform");
        Header.add("Genre");
        Header.add("Release Date");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = array.get(i);
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            Object.add(tempProduct.getPublisherID());
            Object.add(tempProduct.getPlatform());
            Object.add(tempProduct.getGenreID());
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
        tblProduct.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnPriceSearchActionPerformed

    private void txtDateSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateSearch1ActionPerformed

    private void txtDateSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateSearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateSearch2ActionPerformed

    private void btnQuantitySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuantitySearchActionPerformed
       try {
        BUS_Product ProductBus = new BUS_Product();
        ArrayList<DTO_Product> array = ProductBus.quantitySearch(txtQuantitySearch1.getText(),txtQuantitySearch2.getText());
        Header = new Vector();
        Header.add("ID");
        Header.add("Name");
        Header.add("Price");
        Header.add("Quantity");
        Header.add("Publisher");
        Header.add("Platform");
        Header.add("Genre");
        Header.add("Release Date");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_Product tempProduct = new DTO_Product(); 
            tempProduct = array.get(i);
            Vector Object = new Vector();
            Object.add(tempProduct.getId());
            Object.add(tempProduct.getName());
            Object.add(tempProduct.getPrice());
            Object.add(tempProduct.getQuantity());
            Object.add(tempProduct.getPublisherID());
            Object.add(tempProduct.getPlatform());
            Object.add(tempProduct.getGenreID());
            Object.add(tempProduct.getReleaseDate());
            model.addRow(Object);
        }
        this.model = model;
        tblProduct.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnQuantitySearchActionPerformed

    private void txtQuantitySearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantitySearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantitySearch2ActionPerformed

    private void txtQuantitySearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantitySearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantitySearch1ActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
    try {
        if(directory.equals(""))
            JOptionPane.showMessageDialog(null, "Please choose xls file to import");
        else
        {
        Object[] options = {"Add new","Update"};
        int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                               "Add new or Update?", //Object message,
                               "Choose an option", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.INFORMATION_MESSAGE, //int messageType
                               null, //Icon icon,
                               options, "Import");
        ExcelReader exreader = new ExcelReader();
        BUS_Product productBUS = new BUS_Product();
            ArrayList<DTO_Product> array = exreader.readExcelForProduct(directory);
            if(choice==0)     
                {  for(int i=0;i<array.size();i++)
                        {
                            productBUS.add(array.get(i));
                        }
                    btnRestartActionPerformed(evt);   
                }
            else 
            {
                productBUS.deleteAll();
                {  for(int i=0;i<array.size();i++)
                        {
                            productBUS.add(array.get(i));
                        }
                    btnRestartActionPerformed(evt);   
                }
                 btnRestartActionPerformed(evt); 
            }
        }
        
       
        
    } catch (IOException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
    try {   
        BUS_Product productBUS = new BUS_Product();
        ExcelWriter excel = new ExcelWriter();
        if(directory.equals(""))
        JOptionPane.showMessageDialog(null," Choose a file directory");
        else
        excel.writeExcelForProduct(BUS_Product.array,directory);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnExport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExport1ActionPerformed
             JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("."));
            chooser.setDialogTitle("Browse the folder to process");
            chooser.setAcceptAllFileFilterUsed(false);
             if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                directory = chooser.getSelectedFile().toString();
                txtDir.setText(directory);
            } else {
                txtDir.setText("");
            }
    }//GEN-LAST:event_btnExport1ActionPerformed

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnExport1;
    private javax.swing.JButton btnGenre;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnPriceSearch;
    private javax.swing.JButton btnPublisher;
    private javax.swing.JButton btnQuantitySearch;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnYearSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbPlatform;
    private javax.swing.JComboBox cbsort;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbGenre;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPlatform;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbPublisher;
    private javax.swing.JLabel lbReDate;
    private javax.swing.JTable tblProduct;
    private javax.swing.JToggleButton tgSort;
    private javax.swing.JTextField txtDateSearch1;
    private javax.swing.JTextField txtDateSearch2;
    private javax.swing.JTextField txtDir;
    public static javax.swing.JTextField txtGenre;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceSearch1;
    private javax.swing.JTextField txtPriceSearch2;
    public static javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtQuantitySearch1;
    private javax.swing.JTextField txtQuantitySearch2;
    private javax.swing.JTextField txtReDate;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
