package GUIs;

import data.Datastore;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.Car;
import models.DamageRecord;
import models.Staff;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FairyMental
 */
public class ManageDamageRecordsHistoryPanel extends javax.swing.JPanel {

    
    Car currentCar;
    DocumentListener documentListener;
    ArrayList<String> staffIDs;
    /**
     * Creates new form ManageHistoryPanel
     */
    public ManageDamageRecordsHistoryPanel() {
        initComponents();
        
        staffIDs = new ArrayList<String>();
        for(Staff curStaff : Datastore.GetStaff())
        {
            staffIDs.add(curStaff.getSTAFFID());
        }
        AutoCompleteDecorator.decorate(txtStaffID, staffIDs, true);
        documentListener = new DocumentListener()
        {
            public void changedUpdate (DocumentEvent e)
            {
                warn();
            }
            public void removeUpdate (DocumentEvent e)
            {
                warn();
            }
            public void insertUpdate (DocumentEvent e)
            {
                warn();
            }
        };
        txtStaffID.getDocument().addDocumentListener(documentListener);
    }
    private void warn()
    {
        Staff tempStaff = Datastore.GetStaff(txtStaffID.getText());
        if(tempStaff != null)
        {
            txtStaffName.setText(tempStaff.getForeName() + " - " + tempStaff.getLastName());
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDamageRecords = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAddDamageRecord = new javax.swing.JButton();
        dpDamageDate = new org.jdesktop.swingx.JXDatePicker();
        dpRecordingDate = new org.jdesktop.swingx.JXDatePicker();
        btnSaveDamageRecord = new javax.swing.JButton();
        btnDeleteDamageRecord = new javax.swing.JButton();

        jLabel1.setText("Damage History");

        lstDamageRecords.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDamageRecordsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDamageRecords);

        jLabel2.setText("Description:");

        jLabel3.setText("Staff Name:");

        jLabel4.setText("Staff ID:");

        txtStaffName.setEditable(false);

        jLabel5.setText("Damage Date:");

        jLabel6.setText("Recording Date:");

        btnAddDamageRecord.setText("Add Damage Record");
        btnAddDamageRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDamageRecordActionPerformed(evt);
            }
        });

        btnSaveDamageRecord.setText("Save Damage Record");
        btnSaveDamageRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDamageRecordActionPerformed(evt);
            }
        });

        btnDeleteDamageRecord.setText("Delete Damage Record");
        btnDeleteDamageRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDamageRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dpDamageDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dpRecordingDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAddDamageRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveDamageRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteDamageRecord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dpDamageDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(dpRecordingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDamageRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveDamageRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteDamageRecord))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDamageRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDamageRecordActionPerformed
        createDamageRecordFromBoxes();
        RefreshList(currentCar);
        System.out.println("Added");
    }//GEN-LAST:event_btnAddDamageRecordActionPerformed

    private void lstDamageRecordsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDamageRecordsValueChanged
        if(lstDamageRecords.getSelectedIndex() != -1)
        {
            loadDamageRecordInfo(lstDamageRecords.getSelectedValue());
            btnSaveDamageRecord.setEnabled(true);
            btnDeleteDamageRecord.setEnabled(true);
        }
        else
        {
            btnSaveDamageRecord.setEnabled(false);
            btnDeleteDamageRecord.setEnabled(false);
        }
    }//GEN-LAST:event_lstDamageRecordsValueChanged

    private void btnDeleteDamageRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDamageRecordActionPerformed
        removeDamageRecordFromCar(lstDamageRecords.getSelectedValue());
    }//GEN-LAST:event_btnDeleteDamageRecordActionPerformed

    private void btnSaveDamageRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDamageRecordActionPerformed
        createDamageRecordFromBoxes();
        removeDamageRecordFromCar(lstDamageRecords.getSelectedValue());
        
    }//GEN-LAST:event_btnSaveDamageRecordActionPerformed
    
    private void createDamageRecordFromBoxes()
    {       
        Staff tempStaff = Datastore.GetStaff(txtStaffID.getText());
        if(currentCar != null)
        {
            if(tempStaff != null)
            {
                if(dpDamageDate.getDate() != null)
                {
                    new DamageRecord(currentCar,dpDamageDate.getDate(),tempStaff,txtDescription.getText());
                }
                else
                {
                    infoBox("Please select a date","No Date selected");
                }
            }
            else
            {
                infoBox("Please enter a valid staff ID", "Invalid Staff ID");
            }
        }
        else
        {
            infoBox("Please select a car", "Car not selected");
        }
    }
    
    public void RefreshList(Car car)
    {
        currentCar = car;
        ArrayList<DamageRecord> records = car.getDamageRecords();
        System.out.println(records.size() + " ");
        DefaultListModel<DamageRecord> model = new DefaultListModel<>();
        for(DamageRecord rec : records)
        {
            model.addElement(rec);
        }
        lstDamageRecords.setModel(model);
    }
    
    private void loadDamageRecordInfo(DamageRecord rec)
    {
        txtStaffName.setText(rec.getDamagedBy().getForeName() + "-" + rec.getDamagedBy().getLastName());
        txtStaffID.setText(rec.getDamagedBy().getSTAFFID());
        txtDescription.setText(rec.getDescription());
        dpDamageDate.setDate(rec.getDamageDate());
    }
    public void clearDamageRecordInfo()
    {
        txtStaffName.setText("");
        txtStaffID.setText("");
        txtDescription.setText("");
        dpDamageDate.setDate(new Date());
    }

    public void removeDamageRecordFromCar(DamageRecord rec)
    {
        if(lstDamageRecords.getSelectedIndex() != -1 )
        {
            currentCar.removeDamageRecord(rec);           
        }
    }
    private void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDamageRecord;
    private javax.swing.JButton btnDeleteDamageRecord;
    private javax.swing.JButton btnSaveDamageRecord;
    private org.jdesktop.swingx.JXDatePicker dpDamageDate;
    private org.jdesktop.swingx.JXDatePicker dpRecordingDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<DamageRecord> lstDamageRecords;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtStaffName;
    // End of variables declaration//GEN-END:variables
}
