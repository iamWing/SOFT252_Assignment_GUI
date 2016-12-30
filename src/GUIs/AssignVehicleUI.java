/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import data.Datastore;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.AllocationRecord;
import models.Car;
import models.CarParks;
import models.Staff;

/**
 *
 * @author Admin
 */
public class AssignVehicleUI extends javax.swing.JPanel {

    
    private Car selectedCar;
    private Staff selectedStaff;
    /**
     * Creates new form AssignVehicleUI
     */
    public AssignVehicleUI() {
        initComponents();
        
        // --- init locations --- //
        for (CarParks loc : CarParks.values()) {
            lstLocation.addItem(loc.toString());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstVehicles = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStaffMembers = new javax.swing.JList<>();
        btnAssignVehicle = new javax.swing.JButton();
        lstLocation = new javax.swing.JComboBox<>();
        staffDetailsPanel1 = new GUIs.StaffDetailsPanel();
        vehicleDetailsPanel1 = new GUIs.VehicleDetailsPanel();
        btnForceRefresh = new javax.swing.JButton();
        dpStartDate = new org.jdesktop.swingx.JXDatePicker();
        dpEndDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        lstVehicles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstVehiclesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstVehicles);

        lstStaffMembers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstStaffMembersValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstStaffMembers);

        btnAssignVehicle.setText("Assign Vehicle");
        btnAssignVehicle.setEnabled(false);
        btnAssignVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignVehicleActionPerformed(evt);
            }
        });

        lstLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstLocationActionPerformed(evt);
            }
        });

        btnForceRefresh.setText("Force Refresh Lists");
        btnForceRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Start Date:");

        jLabel2.setText("End Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstLocation, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(btnForceRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(btnAssignVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lstLocation))
                    .addComponent(btnForceRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAssignVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignVehicleActionPerformed
        AllocationRecord tempRec;
        if(dpStartDate.getDate() != null && dpEndDate.getDate() != null)
        {
            tempRec = new AllocationRecord(selectedCar,selectedStaff,dpStartDate.getDate(),dpEndDate.getDate());
        }
        else if(dpStartDate.getDate() == null)
        {
            infoBox("Please assign a start date","Start date exected");
        }
        else
        {
            tempRec = new AllocationRecord(selectedCar,selectedStaff,new Date());
        }
    }//GEN-LAST:event_btnAssignVehicleActionPerformed

    private void lstLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstLocationActionPerformed
        RefreshLists();
    }//GEN-LAST:event_lstLocationActionPerformed

    private void lstVehiclesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstVehiclesValueChanged
        if(lstVehicles.getSelectedIndex() != -1)
        {
            vehicleDetailsPanel1.loadCarInfo(lstVehicles.getSelectedValue());
            selectedCar = lstVehicles.getSelectedValue();
            if(lstStaffMembers.getSelectedIndex() != -1)
            {
                EnableAssignVehicleButton();
            }
        }
        else
        {
            DisableAssignVehicleButton();
        }
    }//GEN-LAST:event_lstVehiclesValueChanged

    private void lstStaffMembersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstStaffMembersValueChanged
        if(lstStaffMembers.getSelectedIndex() != -1)
        {
            staffDetailsPanel1.loadStaffInfo(lstStaffMembers.getSelectedValue());
            selectedStaff = lstStaffMembers.getSelectedValue();
            if(lstVehicles.getSelectedIndex() != -1)
            {
                EnableAssignVehicleButton();
            }
        }
        else
        {
            DisableAssignVehicleButton();
        }
    }//GEN-LAST:event_lstStaffMembersValueChanged

    private void btnForceRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceRefreshActionPerformed
        RefreshLists();
    }//GEN-LAST:event_btnForceRefreshActionPerformed
    private void RefreshLists()
    {
        ArrayList<Car> carList = Datastore.GetCars();
        DefaultListModel<Car> model = new DefaultListModel<>();
        for( Car car : carList)
        {
            model.addElement(car);
        }
        lstVehicles.setModel(model);
        
        ArrayList<Staff> staffList = Datastore.GetStaff();
        DefaultListModel<Staff> modelStaff = new DefaultListModel<>();
        for( Staff staff : staffList)
        {
            modelStaff.addElement(staff);
        }
        lstStaffMembers.setModel(modelStaff);
    }
    private void EnableAssignVehicleButton()
    {
        btnAssignVehicle.setEnabled(true);
    }
    private void DisableAssignVehicleButton()
    {
        btnAssignVehicle.setEnabled(false);
    }
    private void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignVehicle;
    private javax.swing.JButton btnForceRefresh;
    private org.jdesktop.swingx.JXDatePicker dpEndDate;
    private org.jdesktop.swingx.JXDatePicker dpStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> lstLocation;
    private javax.swing.JList<Staff> lstStaffMembers;
    private javax.swing.JList<Car> lstVehicles;
    private GUIs.StaffDetailsPanel staffDetailsPanel1;
    private GUIs.VehicleDetailsPanel vehicleDetailsPanel1;
    // End of variables declaration//GEN-END:variables
}
