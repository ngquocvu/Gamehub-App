/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import BUS.BUS_Staff;
import DTO.DTO_Staff;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AnhhTuann
 */
public class GUI_Staff extends javax.swing.JPanel {
private Vector Object;
private Vector Header;
private DefaultTableModel  model;


    public GUI_Staff() throws SQLException, ClassNotFoundException  {
        model = loadStaff();
        initComponents();  
    }
    
    public DefaultTableModel loadStaff() throws SQLException, ClassNotFoundException  {
        Header = new Vector();
        Header.add("ID");
        Header.add("First Name");
        Header.add("Last Name");
        Header.add("Email");
        Header.add("Password");
        Header.add("Address");
        Header.add("Phone Number");
        Header.add("Role");
        Header.add("Sex");
        
        DefaultTableModel model = new DefaultTableModel(Header,0);
        BUS_Staff staffbus = new BUS_Staff();
        for(int i=0;i<BUS_Staff.array.size();i++)
        {
            DTO_Staff tempStaff = new DTO_Staff(); 
            tempStaff = BUS_Staff.array.get(i);
            Vector Object = new Vector();
            Object.add(tempStaff.getId());
            Object.add(tempStaff.getFirstname());
            Object.add(tempStaff.getLastname());
            Object.add(tempStaff.getEmail());
            Object.add(tempStaff.getPassword());
            Object.add(tempStaff.getAddress());
            Object.add(tempStaff.getPhonenumber());
            Object.add(tempStaff.getRole());
            Object.add(tempStaff.getSex());
            model.addRow(Object);
        }
        return model;     
    }
    

        public DTO_Staff findItem(String id) {
            for(DTO_Staff staff : BUS_Staff.array){
                if(staff.getId().equalsIgnoreCase(id))
                    return staff;
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
        cbSort = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        tgSort = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        lbRole = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhonenumber = new javax.swing.JTextField();
        lbSex = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lbPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cbRole = new javax.swing.JComboBox();
        cbSex = new javax.swing.JComboBox();
        lbLastname = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        lbPhonenumber = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbFirstname = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnSexSearch = new javax.swing.JButton();
        cbMale = new javax.swing.JCheckBox();
        cbFemale = new javax.swing.JCheckBox();
        btnRoleSearch = new javax.swing.JButton();
        cbAdmin = new javax.swing.JCheckBox();
        cbStaff = new javax.swing.JCheckBox();

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

        jPanel2.setBackground(new java.awt.Color(126, 64, 139));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_assignment_ind_white_24dp.png"))); // NOI18N
        jLabel2.setText("Staff");
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

        cbSort.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by", "ID", "First Name", "Last Name", "Email", "Password", "Address", "Phone Number", "Role", "Sex" }));
        cbSort.setMaximumSize(null);
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

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
        btnRestart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_refresh_white_18dp.png"))); // NOI18N
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        tgSort.setBackground(new java.awt.Color(99, 19, 132));
        tgSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tgSort.setForeground(new java.awt.Color(255, 255, 255));
        tgSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_generic_sorting_32px_1.png"))); // NOI18N
        tgSort.setText("Desc");
        tgSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgSortActionPerformed(evt);
            }
        });

        tblStaff.setModel(model);
        tblStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblStaff.setInheritsPopupMenu(true);
        tblStaff.setFont(new java.awt.Font("Tahoma", 1, 14));
        tblStaff.setRowHeight(32);
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblStaff);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Staff Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbID.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbRole.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbRole.setText("Role");
        lbRole.setFocusTraversalPolicyProvider(true);

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lbSex.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbSex.setText("Sex");

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        lbPassword.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPassword.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Staff" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });

        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        lbLastname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbLastname.setText("Last Name");

        lbAddress.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbAddress.setText("Address");

        lbPhonenumber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbPhonenumber.setText("Phone Number");

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbEmail.setText("Email");

        lbFirstname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        lbFirstname.setText("First Name");

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
                .addGap(21, 21, 21)
                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(lbLastname)
                            .addComponent(lbEmail))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtFirstname)
                            .addComponent(txtID)))
                    .addComponent(lbFirstname))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAddress)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbRole)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbPhonenumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbSex)
                                        .addGap(26, 26, 26)
                                        .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                        .addComponent(txtAddress)
                                        .addComponent(txtPhonenumber))))
                            .addComponent(lbPassword))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbID))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPassword)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPhonenumber)
                        .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbFirstname))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(lbRole)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSex)
                    .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advanced Searching", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N

        btnSexSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnSexSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSexSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSexSearch.setText("Sex Search");
        btnSexSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSexSearchActionPerformed(evt);
            }
        });

        cbMale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbMale.setText("Male");
        cbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaleActionPerformed(evt);
            }
        });

        cbFemale.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbFemale.setText("Female");

        btnRoleSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnRoleSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRoleSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnRoleSearch.setText("Role Search");
        btnRoleSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoleSearchActionPerformed(evt);
            }
        });

        cbAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbAdmin.setText("Admin");
        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        cbStaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbStaff.setText("Staff");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSexSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMale))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnRoleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAdmin)))
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSexSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbMale)
                    .addComponent(cbFemale))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoleSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAdmin)
                    .addComponent(cbStaff))
                .addGap(172, 172, 172))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRestart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tgSort)
                        .addGap(55, 55, 55)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tgSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Customer Infomation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tgSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgSortActionPerformed
        cbSortActionPerformed(evt);
    }//GEN-LAST:event_tgSortActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        try {
            loadStaff();
            tblStaff.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            BUS_Staff StaffBus = new BUS_Staff();
            ArrayList<DTO_Staff> array = StaffBus.search(txtSearch.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSexSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSexSearchActionPerformed
       try {
            BUS_Staff StaffBus = new BUS_Staff();
            if (cbMale.isSelected()) {
            ArrayList<DTO_Staff> array = StaffBus.sexSearch(cbMale.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
            }
            else if(cbFemale.isSelected()) {
            ArrayList<DTO_Staff> array = StaffBus.sexSearch(cbFemale.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSexSearchActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int  i = tblStaff.getSelectedRow();
        String id = txtID.getText();
        if (i>=0)
        {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(dialogResult == JOptionPane.YES_OPTION){
                try {
                    BUS_Staff StaffBus = new BUS_Staff();
                    StaffBus.delete(id);
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
                }
                model.removeRow(i);
                tblStaff.setModel(model);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row to delete !");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText("");
        txtFirstname.setText("");
        txtLastname.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtAddress.setText("");
        txtPhonenumber.setText("");
        cbRole.setSelectedIndex(1);
        cbSex.setSelectedIndex(1);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        int  i=tblStaff.getSelectedRow();
        if (i>=0)
        {
            try {
                model.setValueAt(txtFirstname.getText(), i, 1);
                model.setValueAt(txtLastname.getText(), i, 2);
                model.setValueAt(txtEmail.getText(), i, 3);
                model.setValueAt(txtPassword.getText(), i, 4);
                model.setValueAt(txtAddress.getText(), i, 5);
                model.setValueAt(txtPhonenumber.getText(), i, 6);
                model.setValueAt(cbRole.getSelectedItem(), i, 7);
                model.setValueAt(cbSex.getSelectedItem(), i, 8);
                tblStaff.setModel(model);
                DTO_Staff staff= new DTO_Staff();
                BUS_Staff staffBUS = new BUS_Staff();
                staff.setId(txtID.getText());
                staff.setFirstname(txtFirstname.getText());
                staff.setLastname(txtLastname.getText());
                staff.setEmail(txtEmail.getText());
                staff.setPassword(txtPassword.getText());
                staff.setAddress(txtAddress.getText());
                staff.setPhonenumber(txtPhonenumber.getText());
                staff.setRole((String) cbRole.getSelectedItem());
                staff.setSex((String) cbSex.getSelectedItem());
                staffBUS.update(staff);
            } catch (SQLException ex) {
                Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            DTO_Staff staff = new DTO_Staff();
            BUS_Staff staffBUS = new BUS_Staff();
            staff.setId(txtID.getText());
            staff.setFirstname(txtFirstname.getText());
            staff.setLastname(txtLastname.getText());
            staff.setEmail(txtEmail.getText());
            staff.setPassword(txtPassword.getText());
            staff.setAddress(txtAddress.getText());
            staff.setPhonenumber(txtPhonenumber.getText());
            staff.setRole((String) cbRole.getSelectedItem());
            staff.setSex((String) cbSex.getSelectedItem());

            Vector header = new Vector();
            Vector row=new Vector();
            if(findItem(staff.getId())==null)
            {
                row.add(staff.getId());
                row.add(staff.getFirstname());
                row.add(staff.getLastname());
                row.add(staff.getEmail());
                row.add(staff.getPassword());
                row.add(staff.getAddress());
                row.add(staff.getPhonenumber());
                row.add(String.valueOf(staff.getRole()));
                row.add(String.valueOf(staff.getSex()));
                model.addRow(row);
                tblStaff.setModel(model);
                staffBUS.add(staff);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"This ID is already used !");
            }
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoleActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        int i = tblStaff.getSelectedRow();
        txtID.setText(tblStaff.getModel().getValueAt(i, 0).toString());
        txtFirstname.setText(tblStaff.getModel().getValueAt(i, 1).toString());
        txtLastname.setText(tblStaff.getModel().getValueAt(i, 2).toString());
        txtEmail.setText(tblStaff.getModel().getValueAt(i, 3).toString());
        txtPassword.setText(tblStaff.getModel().getValueAt(i, 4).toString());
        txtAddress.setText(tblStaff.getModel().getValueAt(i, 5).toString());
        txtPhonenumber.setText(tblStaff.getModel().getValueAt(i, 6).toString());
        cbRole.setSelectedItem(tblStaff.getModel().getValueAt(i, 7).toString());
        cbSex.setSelectedItem(tblStaff.getModel().getValueAt(i, 8).toString());

    }//GEN-LAST:event_tblStaffMouseClicked

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        try {
            BUS_Staff staffBUS = new BUS_Staff();
            String content = "";
            if(cbSort.getSelectedIndex()==0)
            return;
            switch(cbSort.getSelectedIndex())
            {
                case 1: content = "id +0";  break;
                case 2: content = "firstname"; break;
                case 3: content = "lastname"; break;
                case 4: content = "email"; break;
                case 5: content = "password"; break;
                case 6: content = "address"; break;
                case 7: content = "phonenumber"; break;
                case 8: content = "role"; break;
                case 9: content = "sex"; break;
            }
            ArrayList<DTO_Staff> array = staffBUS.sortBy(content,tgSort.isSelected());

            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
        }
        catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbSortActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaleActionPerformed

    private void btnRoleSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleSearchActionPerformed
    try {
        BUS_Staff StaffBus = new BUS_Staff();
        if (cbAdmin.isSelected()) {
            ArrayList<DTO_Staff> array = StaffBus.roleSearch(cbAdmin.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
        }
        else if(cbStaff.isSelected()) {
            ArrayList<DTO_Staff> array = StaffBus.roleSearch(cbStaff.getText());
            Header = new Vector();
            Header.add("ID");
            Header.add("First Name");
            Header.add("Last Name");
            Header.add("Email");
            Header.add("Password");
            Header.add("Address");
            Header.add("Phone Number");
            Header.add("Role");
            Header.add("Sex");
            DefaultTableModel model = new DefaultTableModel(Header,0);
            for(int i=0;i<array.size();i++)
            {
                DTO_Staff tempStaff = new DTO_Staff();
                tempStaff = array.get(i);
                Vector Object = new Vector();
                Object.add(tempStaff.getId());
                Object.add(tempStaff.getFirstname());
                Object.add(tempStaff.getLastname());
                Object.add(tempStaff.getEmail());
                Object.add(tempStaff.getPassword());
                Object.add(tempStaff.getAddress());
                Object.add(tempStaff.getPhonenumber());
                Object.add(tempStaff.getRole());
                Object.add(tempStaff.getSex());
                model.addRow(Object);
            }
            this.model = model;
            tblStaff.setModel(model);
        }
            
           } catch (SQLException ex) {
        Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
    } 

    }//GEN-LAST:event_btnRoleSearchActionPerformed

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnRoleSearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSexSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbAdmin;
    private javax.swing.JCheckBox cbFemale;
    private javax.swing.JCheckBox cbMale;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JComboBox cbSort;
    private javax.swing.JCheckBox cbStaff;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFirstname;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLastname;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbPhonenumber;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbSex;
    private javax.swing.JTable tblStaff;
    private javax.swing.JToggleButton tgSort;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
