/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DTO.DTO_ImportReceipt;
import BUS.BUS_ImportReceipt;
import BUS.BUS_OrderItem;
import BUS.BUS_Product;
import BUS.BUS_Publisher;
import BUS.BUS_Staff;
import DTO.DTO_OrderItem;
import DTO.DTO_Staff;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.Color;
import java.io.FileOutputStream;

/**
 *
 * @author Vu Nguyen
 */
public class GUI_ImportReceipt extends javax.swing.JPanel {
private Vector Object;
private Vector Header;
private DefaultTableModel  model;
private DefaultTableModel  orderModel;
    private Object rbEmail;
    private Object rbGerne;
    public GUI_ImportReceipt() throws SQLException, ClassNotFoundException {
       
       loadReceipt();
       defaultDetailModel();
       initComponents();
       
      
    }
    public void defaultDetailModel()
    {
       Header = new Vector();
       Header.add("Product ID");
       Header.add("Product Name");
       Header.add("Price");
       Header.add("Quantity");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       this.orderModel = model;
    }
    public void loadReceipt() throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("ID");
       Header.add("Staff ID");
       Header.add("Create at");
       Header.add("State");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_ImportReceipt ReceiptBus = new BUS_ImportReceipt();
        for(int i=0;i<BUS_ImportReceipt.array.size();i++)
        {
            DTO_ImportReceipt tempReceipt = new DTO_ImportReceipt(); 
            BUS_Product productBUS = new BUS_Product();
            tempReceipt = BUS_ImportReceipt.array.get(i);
            Vector Object = new Vector();
            Object.add(tempReceipt.getId());
            Object.add(tempReceipt.getStaffID());
            Object.add(tempReceipt.getCreateDate());
            Object.add(tempReceipt.getState());
            model.addRow(Object);
        }
        this.model = model;
    }
    public void loadOrderItem(String id) throws SQLException, ClassNotFoundException
    {
       Header = new Vector();
       Header.add("Product ID");
       Header.add("Product Name");
       Header.add("Price");
       Header.add("Quantity");
       Header.add("Sub Total");
       DefaultTableModel model = new DefaultTableModel(Header,0);
       BUS_OrderItem OrderItemBus = new BUS_OrderItem();
       double total = 0;
        ArrayList<DTO_OrderItem> items = new ArrayList<DTO_OrderItem>();
        items=OrderItemBus.getByOrderID(id);
        for(int i=0;i<items.size();i++)
        {
            DTO_OrderItem tempOrderItem = new DTO_OrderItem(); 
            tempOrderItem = items.get(i);
            Vector Object = new Vector();
            Object.add(tempOrderItem.getProductID());
            Object.add(tempOrderItem.getProductName());
            Object.add(tempOrderItem.getPrice());
            Object.add(tempOrderItem.getQuantity());
            double subTotal=(double)(tempOrderItem.getPrice() * tempOrderItem.getQuantity());
            Object.add("$"+subTotal);
            model.addRow(Object);
            total += subTotal;
        }
        this.orderModel = model;
        tblImportDetail.setModel(model);
        txtTotal.setText("Total: $" + total);
    }
    
  
    public DTO_ImportReceipt findItem(String id)
    {
        for(DTO_ImportReceipt receipt : BUS_ImportReceipt.array)
         {
            if(receipt.getId().equalsIgnoreCase(id))
                return receipt;
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
        lbStaffID = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        tgProcess = new javax.swing.JToggleButton();
        btnPrint = new javax.swing.JButton();
        btnAddPro = new javax.swing.JButton();
        btnGenre = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnAdSearch = new javax.swing.JButton();
        txtAdSearch = new javax.swing.JTextField();
        rbID = new javax.swing.JRadioButton();
        rbStaffID = new javax.swing.JRadioButton();
        rbState = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReceipt = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblImportDetail = new javax.swing.JTable();
        txtTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        cbsort = new javax.swing.JComboBox();
        tgSort = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_receipt_white_24dp.png"))); // NOI18N
        jLabel2.setText("Import Receipt");
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

        jPanel5.setPreferredSize(new java.awt.Dimension(1427, 1034));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Receipt Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbID.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lbStaffID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbStaffID.setText("Staff ID");

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

        tgProcess.setBackground(new java.awt.Color(99, 19, 132));
        tgProcess.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        tgProcess.setForeground(new java.awt.Color(255, 255, 255));
        tgProcess.setText("Processed");
        tgProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgProcessActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(99, 19, 132));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.setFocusTraversalPolicyProvider(true);
        btnPrint.setMaximumSize(new java.awt.Dimension(79, 25));
        btnPrint.setMinimumSize(new java.awt.Dimension(79, 25));
        btnPrint.setPreferredSize(new java.awt.Dimension(79, 25));
        btnPrint.setVerifyInputWhenFocusTarget(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tgProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(tgProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAddPro.setBackground(new java.awt.Color(99, 19, 132));
        btnAddPro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddPro.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPro.setText("Add Product");
        btnAddPro.setFocusTraversalPolicyProvider(true);
        btnAddPro.setMaximumSize(new java.awt.Dimension(79, 25));
        btnAddPro.setMinimumSize(new java.awt.Dimension(79, 25));
        btnAddPro.setPreferredSize(new java.awt.Dimension(79, 25));
        btnAddPro.setVerifyInputWhenFocusTarget(false);
        btnAddPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProActionPerformed(evt);
            }
        });

        btnGenre.setText("...");
        btnGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenreActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(99, 19, 132));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Receipt");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbID))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddPro, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStaffID)
                    .addComponent(btnGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddPro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advanced Searching", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N

        btnAdSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnAdSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAdSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnAdSearch.setText("Search");
        btnAdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdSearchActionPerformed(evt);
            }
        });

        txtAdSearch.setMaximumSize(null);
        txtAdSearch.setMinimumSize(null);
        txtAdSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdSearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbID);
        rbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbID.setText("ID");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbStaffID);
        rbStaffID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbStaffID.setText("StaffID");
        rbStaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStaffIDActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbState);
        rbState.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbState.setText("State");
        rbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnAdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(rbID)
                        .addGap(18, 18, 18)
                        .addComponent(rbStaffID)
                        .addGap(18, 18, 18)
                        .addComponent(rbState)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbID)
                    .addComponent(rbStaffID)
                    .addComponent(rbState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblReceipt.setRowHeight(32);
        tblReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblReceipt.setModel(model);
        tblReceipt.setRowHeight(32);
        tblReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReceiptMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReceipt);

        tblReceipt.setRowHeight(32);
        tblImportDetail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblImportDetail.setModel(orderModel);
        tblImportDetail.setRowHeight(32);
        tblImportDetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblImportDetailMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblImportDetail);

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("Total: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(526, 526, 526)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
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

        cbsort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbsort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by", "ID", "StaffID", "Time", "State" }));
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

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receipt Detail");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(tgSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbsort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1460, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbsort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    try {
        BUS_ImportReceipt ReceiptBus = new BUS_ImportReceipt();
        ArrayList<DTO_ImportReceipt> array = ReceiptBus.search(txtSearch.getText());
        Header = new Vector();
       Header.add("ID");
       Header.add("Staff ID");
       Header.add("Create at");
       Header.add("State");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        BUS_Product productBUS = new BUS_Product();
        for(int i=0;i<array.size();i++)
        {
            DTO_ImportReceipt tempReceipt = new DTO_ImportReceipt(); 
            tempReceipt = array.get(i);
            Vector Object = new Vector();
            Object.add(tempReceipt.getId());
            Object.add(tempReceipt.getStaffID());
            Object.add(tempReceipt.getCreateDate());
            Object.add(tempReceipt.getState());
            model.addRow(Object);
        }
        this.model = model;
        tblReceipt.setModel(model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        try {
            loadReceipt();
            defaultDetailModel();
            tblImportDetail.setModel(orderModel);
            tblReceipt.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void cbsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsortActionPerformed
      try { 
        BUS_ImportReceipt receiptBUS = new BUS_ImportReceipt();
        String content = "";
        if(cbsort.getSelectedIndex()==0)
        return;
        switch(cbsort.getSelectedIndex())
       {
           case 1: content = "id +0";  break;
           case 2: content = "staffID"; break; 
           case 3: content = "createdAt"; break;  
           case 4: content = "state"; break;   
       }
       ArrayList<DTO_ImportReceipt> array = receiptBUS.sortBy(content,tgSort.isSelected());
       
        Header = new Vector();
        Header.add("ID");
        Header.add("Staff ID");
        Header.add("Create at");
        Header.add("State");
        DefaultTableModel model = new DefaultTableModel(Header,0);
        for(int i=0;i<array.size();i++)
        {
            DTO_ImportReceipt tempReceipt = new DTO_ImportReceipt(); 
            tempReceipt = array.get(i);
            Vector Object = new Vector();
            Object.add(tempReceipt.getId());
            Object.add(tempReceipt.getStaffID());
            Object.add(tempReceipt.getCreateDate());
            Object.add(tempReceipt.getState());
            model.addRow(Object);
        }
        this.model = model;
        tblReceipt.setModel(model);
      }
      catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbsortActionPerformed

    private void tgSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgSortActionPerformed
        cbsortActionPerformed(evt);
    }//GEN-LAST:event_tgSortActionPerformed

    private void tblReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReceiptMouseClicked
        try {
            int i = tblReceipt.getSelectedRow();
            BUS_ImportReceipt receiptBUS = new BUS_ImportReceipt();
            BUS_Product productBUS = new BUS_Product();
            txtID.setText(tblReceipt.getModel().getValueAt(i, 0).toString());
            txtStaffID.setText(tblReceipt.getModel().getValueAt(i, 1).toString());
            loadOrderItem(tblReceipt.getModel().getValueAt(i, 0).toString());
            if(tblReceipt.getModel().getValueAt(i, 3).toString().equals("Processing"))
            tgProcess.setSelected(false);
            else
             tgProcess.setSelected(true);    
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblReceiptMouseClicked

    private void rbStaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStaffIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbStaffIDActionPerformed

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIDActionPerformed

    private void txtAdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdSearchActionPerformed

    private void btnAdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdSearchActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel(Header,0);
            BUS_ImportReceipt ImportReceiptBus = new BUS_ImportReceipt();
            ArrayList<DTO_ImportReceipt> array = ImportReceiptBus.adSearch(txtAdSearch.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("Staff ID");
            Header.add("Create at");
            Header.add("State");
            

            if (rbID.isSelected()) 
                array = ImportReceiptBus.idSearch(txtAdSearch.getText());
            else if(rbStaffID.isSelected())
                array = ImportReceiptBus.staffIdSearch(txtAdSearch.getText());  
            else if(rbState.isSelected())
                array = ImportReceiptBus.stateSearch(txtAdSearch.getText()); 
            for(int i=0;i<array.size();i++)
            {
                DTO_ImportReceipt tempReceipt = new DTO_ImportReceipt(); 
                tempReceipt = array.get(i);
                Vector Object = new Vector();
                Object.add(tempReceipt.getId());
                Object.add(tempReceipt.getStaffID());
                Object.add(tempReceipt.getCreateDate());
                Object.add(tempReceipt.getState());
                model.addRow(Object);
            }
            this.model = model;
            tblReceipt.setModel(model);
                  
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdSearchActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            DTO_ImportReceipt receipt = new DTO_ImportReceipt();
            BUS_ImportReceipt receiptBUS = new BUS_ImportReceipt();
            receipt.setId(txtID.getText());
            receipt.setStaffID(txtStaffID.getText());
            receiptBUS.update(receipt);
            loadReceipt();
            tblReceipt.setModel(this.model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        String id = txtID.getText();
        if(findItem(id)== null)
        {
            JOptionPane.showMessageDialog(null,"Can not delete ! Receipt's ID not found !");
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(dialogResult == JOptionPane.YES_OPTION)
        {
            try {
                BUS_ImportReceipt ReceiptBus = new BUS_ImportReceipt();
                ReceiptBus.delete(id);
                loadReceipt();
                tblReceipt.setModel(this.model);
            } catch (SQLException ex) {
                Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row to delete !");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText("");
        txtStaffID.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Date date= new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);
            DTO_ImportReceipt receipt = new DTO_ImportReceipt();
            BUS_ImportReceipt receiptBUS = new BUS_ImportReceipt();
            receipt.setId(txtID.getText());
            receipt.setStaffID(txtStaffID.getText());
            receipt.setState("Processing");
            receipt.setCreateDate(ts);
            Vector header = new Vector();
            Vector row=new Vector();
            if(findItem(receipt.getId())==null && receipt.getId().matches("[0-9]+") && receipt.getId().length() >= 1)
            {
                model.addRow(row);
                tblReceipt.setModel(model);
                receiptBUS.add(receipt);
            }
            else if (findItem(receipt.getId())!=null)
            {
                JOptionPane.showMessageDialog(null,"This ID is already used !");
            }
            else if (!receipt.getId().matches("[0-9]+"))
            {
                JOptionPane.showMessageDialog(null,"ID must contain digit numbers from 0 to 9 !");
            }

            loadReceipt();
            tblReceipt.setModel(this.model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblImportDetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblImportDetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblImportDetailMouseClicked

    private void btnAddProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProActionPerformed
    try {
        GUI_OrderItem orderItemGUI = new GUI_OrderItem(txtID.getText());
        orderItemGUI.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAddProActionPerformed

    private void tgProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgProcessActionPerformed
    try {
        DTO_ImportReceipt receipt = new DTO_ImportReceipt();
        BUS_ImportReceipt receiptBUS = new BUS_ImportReceipt();
        receipt.setId(txtID.getText());
        if(tgProcess.isSelected())
        {
            
            receipt.setState("Processed");
        }
        else
        {
            receipt.setState("Processing");
        }
        receiptBUS.updateState(receipt);
        loadReceipt();
        tblReceipt.setModel(this.model);
    } catch (SQLException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_ImportReceipt.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_tgProcessActionPerformed

    private void btnGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenreActionPerformed
        try {
            GUI_StaffTable staffGUI = new GUI_StaffTable(1);
            staffGUI.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Product.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenreActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            int receiptRow = tblReceipt.getSelectedRow();
            if(receiptRow<0)
            {
                JOptionPane.showMessageDialog(null,"Please choose a receipt to print !");
            }
            else
            {
                Font regular = new Font(FontFamily.HELVETICA, 12);
                Font bold = new Font(FontFamily.HELVETICA, 12, Font.BOLD);

                String dir = "D:\\import_receipt" + tblReceipt.getValueAt(receiptRow, 0) + ".pdf";
                PdfWriter.getInstance(document, new FileOutputStream(dir));
                document.open();
                Paragraph paragraph = new Paragraph("Import Receipt",new Font(FontFamily.HELVETICA, 24, Font.BOLD));
                paragraph.setAlignment(Element.ALIGN_CENTER);
                document.add(paragraph);

                Paragraph paragraph2 = new Paragraph("NO: " + tblReceipt.getValueAt(receiptRow, 0),new Font(FontFamily.HELVETICA, 16, Font.BOLD));
                paragraph2.setAlignment(Element.ALIGN_CENTER);
                document.add(paragraph2);

                Paragraph paragraph3 = new Paragraph("Date: " + tblReceipt.getValueAt(receiptRow, 3),bold);
                document.add(paragraph3);
                BUS_Staff staffBUS = new BUS_Staff();
                DTO_Staff staff = staffBUS.findItem(tblReceipt.getValueAt(receiptRow, 1).toString());
                Paragraph paragraph4 = new Paragraph("Staff: " +staff.getFirstname() ,bold);
                document.add(paragraph4);
                int row = tblImportDetail.getModel().getRowCount();
                PdfPTable t = new PdfPTable(4);
                t.setSpacingBefore(25);
                t.setSpacingAfter(25);
                PdfPCell productName = new PdfPCell(new Phrase("Item Name",bold));
                t.addCell(productName);
                PdfPCell price = new PdfPCell(new Phrase("Price",bold));
                t.addCell(price);
                PdfPCell quantity = new PdfPCell(new Phrase("Quantity",bold));
                t.addCell(quantity);
                PdfPCell subtotal = new PdfPCell(new Phrase("Subtotal",bold));
                t.addCell(subtotal);
                double retotal=0;
                for(int i=0;i<row;i++)
                {
                    t.addCell(tblImportDetail.getValueAt(i, 1).toString());
                    t.addCell(tblImportDetail.getValueAt(i, 2).toString());
                    t.addCell(tblImportDetail.getValueAt(i, 3).toString());
                    double resubtotal = Double.parseDouble(tblImportDetail.getValueAt(i, 2).toString())  * Double.parseDouble(tblImportDetail.getValueAt(i, 3).toString());
                    t.addCell("$" + resubtotal);
                    retotal+=resubtotal;

                }
                document.add(t);
                Paragraph paragraph5 = new Paragraph("TOTAL: $" + retotal,bold);
                paragraph5.setAlignment(Element.ALIGN_RIGHT);
                document.add(paragraph5);
                JOptionPane.showMessageDialog(null,"Receipt has been printed as \n  " +dir);
                document.close();
            }

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(GUI_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_SaleReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void rbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbStateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdSearch;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddPro;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnGenre;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbsort;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbStaffID;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbStaffID;
    private javax.swing.JRadioButton rbState;
    private javax.swing.JTable tblImportDetail;
    private javax.swing.JTable tblReceipt;
    private javax.swing.JToggleButton tgProcess;
    private javax.swing.JToggleButton tgSort;
    private javax.swing.JTextField txtAdSearch;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    public static javax.swing.JTextField txtStaffID;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
