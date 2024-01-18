/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package addressBookPackage;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public List<AddressBook> addressBookList = new ArrayList<AddressBook>();
    public int index = -1;

    public MainGUI() {
        initComponents();
        this.initValue();
    }

    private void initValue() {
        this.addressBookList.add(new AddressBook("Savan", "Kim", 98875445, "Surat", 98768943, "FX1", 34568645, "PG1"));
        this.addressBookList.add(new AddressBook("dev", "Mandvi", 87567865, "Morbi", 32546798, "FX2", 9887698, "PG2"));
        DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
        for (int i = 0; i < this.addressBookList.size(); i++) {
            model.addRow(new Object[]{this.addressBookList.get(i).Name, this.addressBookList.get(i).Address, this.addressBookList.get(i).PhoneNo, this.addressBookList.get(i).BussinessAddress, this.addressBookList.get(i).BussinessPhoneNo, this.addressBookList.get(i).FaxMachineNo, this.addressBookList.get(i).CellularPhoneNo, this.addressBookList.get(i).PagerNo});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        MainPanel = new javax.swing.JPanel();
        javax.swing.JPanel FormPanel = new javax.swing.JPanel();
        javax.swing.JLabel lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        javax.swing.JLabel lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        javax.swing.JLabel lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel lblBussAddress = new javax.swing.JLabel();
        txtBussAddress = new javax.swing.JTextField();
        txtBussPhoneNo = new javax.swing.JTextField();
        javax.swing.JLabel lblBussPhoneNo = new javax.swing.JLabel();
        javax.swing.JLabel lblFaxMachineNo = new javax.swing.JLabel();
        txtFaxMachineNo = new javax.swing.JTextField();
        javax.swing.JLabel lblCellularPhoneNo = new javax.swing.JLabel();
        txtCellularPhoneNo = new javax.swing.JTextField();
        txtPagerNo = new javax.swing.JTextField();
        javax.swing.JLabel lblPagerNo = new javax.swing.JLabel();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddressBookList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddressBook");
        setMinimumSize(new java.awt.Dimension(960, 520));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(960, 520));

        MainPanel.setBackground(new java.awt.Color(153, 153, 255));
        MainPanel.setMinimumSize(new java.awt.Dimension(960, 520));
        MainPanel.setPreferredSize(new java.awt.Dimension(960, 520));

        FormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Address Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        FormPanel.setOpaque(false);
        FormPanel.setPreferredSize(new java.awt.Dimension(300, 480));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        txtName.setPreferredSize(new java.awt.Dimension(64, 23));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address");

        txtAddress.setPreferredSize(new java.awt.Dimension(64, 23));

        lblPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNo.setText("Phone No");

        txtPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblBussAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBussAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblBussAddress.setText("Bussiness Address");

        txtBussAddress.setPreferredSize(new java.awt.Dimension(64, 23));

        txtBussPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblBussPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBussPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblBussPhoneNo.setText("Bussiness Phone No");

        lblFaxMachineNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFaxMachineNo.setForeground(new java.awt.Color(255, 255, 255));
        lblFaxMachineNo.setText("Fax Machine No");

        txtFaxMachineNo.setPreferredSize(new java.awt.Dimension(64, 23));

        lblCellularPhoneNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCellularPhoneNo.setForeground(new java.awt.Color(255, 255, 255));
        lblCellularPhoneNo.setText("Cellular Phone No");

        txtCellularPhoneNo.setPreferredSize(new java.awt.Dimension(64, 23));

        txtPagerNo.setPreferredSize(new java.awt.Dimension(64, 23));
        txtPagerNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagerNoActionPerformed(evt);
            }
        });

        lblPagerNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPagerNo.setForeground(new java.awt.Color(255, 255, 255));
        lblPagerNo.setText("Pager No");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setText("Submit");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(80, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(80, 30));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormPanelLayout = new javax.swing.GroupLayout(FormPanel);
        FormPanel.setLayout(FormPanelLayout);
        FormPanelLayout.setHorizontalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBussPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtBussPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(txtFaxMachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCellularPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(lblFaxMachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCellularPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBussAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormPanelLayout.createSequentialGroup()
                                .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lblBussAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPagerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPagerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormPanelLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        FormPanelLayout.setVerticalGroup(
            FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormPanelLayout.createSequentialGroup()
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblAddress)
                    .addComponent(lblBussAddress)
                    .addComponent(lblPhoneNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBussAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBussPhoneNo)
                    .addComponent(lblFaxMachineNo)
                    .addComponent(lblCellularPhoneNo)
                    .addComponent(lblPagerNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBussPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFaxMachineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCellularPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPagerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(FormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        FormPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnClear});

        tblAddressBookList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblAddressBookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Adress", "PhoneNo", "BussinessAddress", "BusinessPhoneNo", "FaxMachineNo", "CellularPhoneNo", "PagerNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblAddressBookList.setFocusable(false);
        tblAddressBookList.setMinimumSize(new java.awt.Dimension(800, 480));
        tblAddressBookList.setPreferredSize(new java.awt.Dimension(800, 480));
        tblAddressBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAddressBookListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAddressBookList);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtBussAddress.getText().isEmpty() || txtBussPhoneNo.getText().isEmpty() || txtFaxMachineNo.getText().isEmpty() || txtCellularPhoneNo.getText().isEmpty() || txtPagerNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all fields properly", "Try again", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
            if (this.index >= 0) {
                AddressBook ab = this.addressBookList.get(index);
                ab.Name = txtName.getText();
                ab.Address = txtAddress.getText();
                ab.PhoneNo = Integer.parseInt(txtPhoneNo.getText());
                ab.BussinessAddress = txtBussAddress.getText();
                ab.BussinessPhoneNo = Integer.parseInt(txtBussPhoneNo.getText());
                ab.FaxMachineNo = txtFaxMachineNo.getText();
                ab.CellularPhoneNo = Integer.parseInt(txtCellularPhoneNo.getText());
                ab.PagerNo = txtPagerNo.getText();
                model.setValueAt(ab.Name, index, 0);
                model.setValueAt(ab.Address, index, 1);
                model.setValueAt(ab.PhoneNo, index, 2);
                model.setValueAt(ab.BussinessAddress, index, 3);
                model.setValueAt(ab.BussinessPhoneNo, index, 4);
                model.setValueAt(ab.FaxMachineNo, index, 5);
                model.setValueAt(ab.CellularPhoneNo, index, 6);
                model.setValueAt(ab.PagerNo, index, 7);
                System.out.print("Row Updated ==> " + ab);
            } else {
                AddressBook ab = new AddressBook(txtName.getText(), txtAddress.getText(), Long.parseLong(txtPhoneNo.getText()), txtBussAddress.getText(), Long.parseLong(txtBussPhoneNo.getText()), txtFaxMachineNo.getText(), Long.parseLong(txtCellularPhoneNo.getText()), txtPagerNo.getText());
                model.addRow(new Object[]{ab.Name, ab.Address, ab.PhoneNo, ab.BussinessAddress, ab.BussinessPhoneNo, ab.FaxMachineNo, ab.CellularPhoneNo, ab.PagerNo});
                this.addressBookList.add(ab);
                System.out.print("Row Added ==> " + ab);
            }
            this.clearFields();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tblAddressBookList.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this, "No row is selected! Please select any row", "Select Row", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblAddressBookList.getModel();
            System.out.print("Deleted row ==> " + this.addressBookList.get(row));
            this.addressBookList.remove(row);
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblAddressBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAddressBookListMouseClicked

        int row = tblAddressBookList.getSelectedRow();
        System.out.print(this.addressBookList.get(row));
        txtName.setText(this.addressBookList.get(row).Name);
        txtAddress.setText(this.addressBookList.get(row).Address);
        txtPhoneNo.setText(String.valueOf(this.addressBookList.get(row).PhoneNo));
        txtBussAddress.setText(this.addressBookList.get(row).BussinessAddress);
        txtBussPhoneNo.setText(String.valueOf(this.addressBookList.get(row).BussinessPhoneNo));
        txtFaxMachineNo.setText(this.addressBookList.get(row).FaxMachineNo);
        txtCellularPhoneNo.setText(String.valueOf(this.addressBookList.get(row).CellularPhoneNo));
        txtPagerNo.setText(this.addressBookList.get(row).PagerNo);
        this.index = row;
    }//GEN-LAST:event_tblAddressBookListMouseClicked

    private void txtPagerNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagerNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagerNoActionPerformed

    private void clearFields() {
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNo.setText("");
        txtBussAddress.setText("");
        txtBussPhoneNo.setText("");
        txtFaxMachineNo.setText("");
        txtCellularPhoneNo.setText("");
        txtPagerNo.setText("");
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblAddressBookList;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBussAddress;
    private javax.swing.JTextField txtBussPhoneNo;
    private javax.swing.JTextField txtCellularPhoneNo;
    private javax.swing.JTextField txtFaxMachineNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPagerNo;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables
}
