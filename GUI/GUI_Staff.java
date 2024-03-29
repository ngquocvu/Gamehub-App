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
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
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
private String directory = new String("") ;


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
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        txtDir = new javax.swing.JTextField();
        btnExport1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnAdSearch = new javax.swing.JButton();
        txtAdSearch = new javax.swing.JTextField();
        rbID = new javax.swing.JRadioButton();
        rbFirstname = new javax.swing.JRadioButton();
        rbLastname = new javax.swing.JRadioButton();
        rbEmail = new javax.swing.JRadioButton();
        rbPhonenumber = new javax.swing.JRadioButton();
        rbAddress = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

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
                .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(lbFirstname)
                    .addComponent(lbLastname)
                    .addComponent(lbEmail))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPhonenumber)
                            .addComponent(lbAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtPhonenumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPassword)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbRole)
                        .addGap(18, 18, 18)
                        .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(lbSex)
                        .addGap(18, 18, 18)
                        .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbFirstname))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPhonenumber)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lbAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSex)
                            .addComponent(cbSex, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRole))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Advanced Features", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 24))); // NOI18N

        btnSexSearch.setBackground(new java.awt.Color(99, 19, 132));
        btnSexSearch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSexSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSexSearch.setText("Sex Search");
        btnSexSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSexSearchActionPerformed(evt);
            }
        });

        cbMale.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cbMale.setText("Male");
        cbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaleActionPerformed(evt);
            }
        });

        cbFemale.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
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

        cbAdmin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cbAdmin.setText("Admin");
        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        cbStaff.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cbStaff.setText("Staff");

        txtDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("File Directory");

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

        buttonGroup2.add(rbID);
        rbID.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbID.setText("ID");
        rbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIDActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbFirstname);
        rbFirstname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbFirstname.setText("First Name");
        rbFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFirstnameActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbLastname);
        rbLastname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbLastname.setText("Last Name");
        rbLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLastnameActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbEmail);
        rbEmail.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbEmail.setText("Email");
        rbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmailActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbPhonenumber);
        rbPhonenumber.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbPhonenumber.setText("Phone Number");
        rbPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPhonenumberActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbAddress);
        rbAddress.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rbAddress.setText("Address");
        rbAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("IMPORT/EXPORT EXCEL FILE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(514, 514, 514))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnSexSearch)
                        .addGap(18, 18, 18)
                        .addComponent(cbMale)
                        .addGap(13, 13, 13)
                        .addComponent(cbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRoleSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbAdmin)
                        .addGap(8, 8, 8)
                        .addComponent(cbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btnAdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(rbID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbFirstname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbLastname)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbAddress)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbPhonenumber))
                                    .addComponent(txtAdSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(btnExport1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtDir)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSexSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMale)
                        .addComponent(cbFemale)
                        .addComponent(cbStaff)
                        .addComponent(cbAdmin))
                    .addComponent(btnRoleSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbID)
                    .addComponent(rbFirstname)
                    .addComponent(rbLastname)
                    .addComponent(rbEmail)
                    .addComponent(rbAddress)
                    .addComponent(rbPhonenumber))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnRestart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tgSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRestart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tgSort))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(815, 815, 815))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Customer Infomation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 985, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnSexSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSexSearchActionPerformed
       try {
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
            BUS_Staff StaffBus = new BUS_Staff();
            ArrayList<DTO_Staff> array = null;
            if (cbMale.isSelected() && !cbFemale.isSelected()) 
            array = StaffBus.sexSearch(cbMale.getText());
            else if(cbFemale.isSelected() && !cbMale.isSelected())
            array = StaffBus.sexSearch(cbFemale.getText());  
            else if(cbFemale.isSelected() && cbMale.isSelected())
            array = BUS_Staff.array;
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
        if (findItem(txtID.getText())!=null)
        {
            JOptionPane.showMessageDialog(null,"This ID is already used !");
        }
         else if (!txtID.getText().matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null,"ID must contain digit numbers from 0 to 9 !");
        }
        else if (txtFirstname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input first name ! ");
        }
          else if (txtLastname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input last name ! ");
        }
         else if (txtEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input email ! ");
        }
         else if (txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input password ! ");
        }
        else if (txtAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input address ! ");
        } 
          else if (txtPhonenumber.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please input phone ! ");
        }
        else{
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
    }
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

    private void cbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMaleActionPerformed

    private void btnRoleSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoleSearchActionPerformed
    try {
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
            BUS_Staff StaffBus = new BUS_Staff();
            ArrayList<DTO_Staff> array = null;
            if (cbAdmin.isSelected() && !cbStaff.isSelected()) 
            array = StaffBus.roleSearch(cbAdmin.getText());
            else if(cbStaff.isSelected() && !cbAdmin.isSelected())
            array = StaffBus.roleSearch(cbStaff.getText());  
            else if(cbStaff.isSelected() && cbAdmin.isSelected())
            array = BUS_Staff.array;
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
    }//GEN-LAST:event_btnRoleSearchActionPerformed

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminActionPerformed

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

    private void tgSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgSortActionPerformed
        cbSortActionPerformed(evt);
    }//GEN-LAST:event_tgSortActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        try {
            model = loadStaff();
            tblStaff.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRestartActionPerformed

    private void txtDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirActionPerformed

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

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed

            if(directory.equals(""))
            JOptionPane.showMessageDialog(null, "Please choose xls file to import");
            else
            {
                try {
                    Object[] options = {"Add new","Update"};
                    int choice = JOptionPane.showOptionDialog(null, //Component parentComponent
                            "Add new or Update?", //Object message,
                            "Choose an option", //String title
                            JOptionPane.YES_NO_OPTION, //int optionType
                            JOptionPane.INFORMATION_MESSAGE, //int messageType
                            null, //Icon icon,
                            options, "Import");
                    ExcelReader exreader = new ExcelReader();
                    BUS_Staff staffBUS = new BUS_Staff();
                    ArrayList<DTO_Staff> array = exreader.readExcelForStaff(directory);
                    if(choice==0)
                    {  for(int i=0;i<array.size();i++)
                    {
                        staffBUS.add(array.get(i));
                    }
                    btnRestartActionPerformed(evt);
                    }
                    else
                    {
                        staffBUS.deleteAll();
                        {  for(int i=0;i<array.size();i++)
                        {
                            staffBUS.add(array.get(i));
                        }
                        btnRestartActionPerformed(evt);
                        }
                        btnRestartActionPerformed(evt);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        try {
            BUS_Staff staffBUS = new BUS_Staff();
            ExcelWriter excel = new ExcelWriter();
            if(directory.equals(""))
            JOptionPane.showMessageDialog(null," Choose a file directory");
            else
            excel.writeExcelForStaff(BUS_Staff.array,directory);
        } catch (SQLException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUI_Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnAdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdSearchActionPerformed
        try {
            DefaultTableModel model = new DefaultTableModel(Header,0);
            BUS_Staff StaffBus = new BUS_Staff();
            ArrayList<DTO_Staff> array = StaffBus.adSearch(txtAdSearch.getText());
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
            
            if (rbID.isSelected())
            array = StaffBus.idSearch(txtAdSearch.getText());
            else if(rbFirstname.isSelected())
            array = StaffBus.firstnameSearch(txtAdSearch.getText());
            else if(rbLastname.isSelected())
            array = StaffBus.lastnameSearch(txtAdSearch.getText());
            else if(rbEmail.isSelected())
            array = StaffBus.emailSearch(txtAdSearch.getText());
            else if(rbAddress.isSelected())
            array = StaffBus.addressSearch(txtAdSearch.getText());
            else if(rbPhonenumber.isSelected())
            array = StaffBus.phonenumberSearch(txtAdSearch.getText());

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
    }//GEN-LAST:event_btnAdSearchActionPerformed

    private void txtAdSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdSearchActionPerformed

    private void rbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIDActionPerformed

    private void rbFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFirstnameActionPerformed

    private void rbLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLastnameActionPerformed

    private void rbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEmailActionPerformed

    private void rbPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPhonenumberActionPerformed

    private void rbAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdSearch;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnExport1;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnRoleSearch;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSexSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbAdmin;
    private javax.swing.JCheckBox cbFemale;
    private javax.swing.JCheckBox cbMale;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JComboBox cbSex;
    private javax.swing.JComboBox cbSort;
    private javax.swing.JCheckBox cbStaff;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JRadioButton rbAddress;
    private javax.swing.JRadioButton rbEmail;
    private javax.swing.JRadioButton rbFirstname;
    private javax.swing.JRadioButton rbID;
    private javax.swing.JRadioButton rbLastname;
    private javax.swing.JRadioButton rbPhonenumber;
    private javax.swing.JTable tblStaff;
    private javax.swing.JToggleButton tgSort;
    private javax.swing.JTextField txtAdSearch;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
