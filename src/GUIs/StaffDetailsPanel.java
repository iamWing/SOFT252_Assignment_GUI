/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.Command;
import commands.CommandTracker;
import commands.interfaces.ICommandBehavior;
import commands.staffMamagement.AddStaff;
import commands.staffMamagement.EditStaff;
import commands.staffMamagement.RemoveStaff;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.Staff;

/**
 *
 * @author Admin
 */
public class StaffDetailsPanel extends javax.swing.JPanel {

    
    Staff selectedStaff;
    CommandTracker cmdTracker = new CommandTracker();
    DocumentListener documentListener;
    
    /**
     * Creates new form StaffDetailsPanel
     */
    public StaffDetailsPanel() {
        initComponents();
        
        documentListener = new DocumentListener()
        {
            public void changedUpdate (DocumentEvent e)
            {
                updateButtons();
            }
            public void removeUpdate (DocumentEvent e)
            {
                updateButtons();
            }
            public void insertUpdate (DocumentEvent e)
            {
                updateButtons();
            }
        };
        txtForename.getDocument().addDocumentListener(documentListener);
        txtLastName.getDocument().addDocumentListener(documentListener);
        txtAdress.getDocument().addDocumentListener(documentListener);
        txtStaffID.getDocument().addDocumentListener(documentListener);
        txtLicenseNumber.getDocument().addDocumentListener(documentListener);
        txtLicenseType.getDocument().addDocumentListener(documentListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtLicenseType = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtForename = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        txtLicenseNumber = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jLabel37.setText("License Nr.");

        jLabel36.setText("License Type:");

        jLabel40.setText("Last Name:");

        jLabel39.setText("Staff ID:");

        jLabel41.setText("Forename:");

        btnNew.setText("Add");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtAdress.setColumns(20);
        txtAdress.setRows(5);
        jScrollPane1.setViewportView(txtAdress);

        jLabel1.setText("Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtForename)
                            .addComponent(txtLastName)
                            .addComponent(txtStaffID)
                            .addComponent(txtLicenseNumber)
                            .addComponent(txtLicenseType)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtForename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicenseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        if (selectedStaff != null)
        {
            clearStaffInfo();
            updateButtons();
        }
        else
        {
            ICommandBehavior cmdBehavior = new AddStaff(createStaffFromTextBoxes());
            Command cmd = new Command (cmdBehavior);

            try
            {
                cmdTracker.executeCommand(cmd);
                clearStaffInfo();
            } catch(Exception ex)
            {
                System.err.print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        Staff newDetails = createStaffFromTextBoxes();
        ICommandBehavior cmdBehavior = new EditStaff(selectedStaff.getSTAFFID(),newDetails.getForeName(),newDetails.getLastName(),newDetails.getAddress(),newDetails.getLicenseNumber(),newDetails.getLicenseType());
        Command cmd = new Command (cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
            selectedStaff = null;
            clearStaffInfo();
            updateButtons();
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        ICommandBehavior cmdBehavior = new RemoveStaff(selectedStaff);
        Command cmd = new Command (cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
            clearStaffInfo();
            updateButtons();
            
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    public void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    } 
    
    public void updateButtons()
    {
        btnSave.setEnabled(selectedStaff != null);
        btnDelete.setEnabled(selectedStaff != null);
        btnNew.setText(selectedStaff != null?"New":"Add");
        txtStaffID.setEnabled(selectedStaff == null);
    }
    public void clearStaffInfo()
    {
        txtForename.setText("");
        txtLastName.setText("");
        txtLicenseNumber.setText("");
        txtLicenseType.setText("");
        txtStaffID.setText("");
        txtAdress.setText("");
        selectedStaff=null;
        updateButtons();
    }
    public void loadStaffInfo(Staff tempStaff)
    {
        txtForename.setText(tempStaff.getForeName());
        txtLastName.setText(tempStaff.getLastName());
        txtLicenseNumber.setText(tempStaff.getLicenseNumber());
        txtLicenseType.setText(tempStaff.getLicenseType());
        txtStaffID.setText(tempStaff.getSTAFFID());
        txtAdress.setText(tempStaff.getAddress());
        selectedStaff =tempStaff;
        updateButtons();
    }
    
    private Staff createStaffFromTextBoxes()
    {
        Staff tempStaff;
        String forename = "N/A", lastName = "N/A", address = "N/A", licenseNumber = "N/A", licenseType = "N/A", staffID = "N/A";
        
        if(!txtForename.getText().isEmpty())
        {
            forename = txtForename.getText();
        }
        if(!txtLastName.getText().isEmpty())
        {
            lastName = txtLastName.getText();
        }
        if(!txtStaffID.getText().isEmpty())
        {
            staffID = txtStaffID.getText();
        }
        if(!txtAdress.getText().isEmpty())
        {
            address = txtAdress.getText();
        }
        if(!txtLicenseNumber.getText().isEmpty())
        {
            licenseNumber = txtLicenseNumber.getText();
        }
        if(!txtLicenseType.getText().isEmpty())
        {
            licenseType = txtLicenseType.getText();
        }
        
        tempStaff = new Staff(staffID, forename, lastName, address,licenseNumber,licenseType);
        
        return tempStaff;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAdress;
    private javax.swing.JTextField txtForename;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLicenseType;
    private javax.swing.JTextField txtStaffID;
    // End of variables declaration//GEN-END:variables
}
