/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.Command;
import commands.CommandTracker;
import commands.interfaces.ICommandBehavior;
import commands.interfaces.ICommandWatcher;
import commands.vehicleManagement.AddAllocationRecord;
import data.Datastore;
import java.util.ArrayList;
import java.util.Collections;
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
public class AssignVehicleUI extends javax.swing.JPanel implements ICommandWatcher {

    CommandTracker cmdTracker = new CommandTracker();
    private Car selectedCar;
    private Staff selectedStaff;
    /**
     * Creates new form AssignVehicleUI
     */
    public AssignVehicleUI() {
        initComponents();
        dpStartDate.setDate(new Date());
        
        // --- init locations --- //
        for (CarParks loc : CarParks.values()) {
            lstLocation.addItem(loc);
        }
        CommandTracker.addCommandWatcher(this);
    }
    /**
     * ICommandWatcher Callback.
     */
    @Override
    public void notifyCommandWatcher()
    {
        RefreshLists();
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

        dpStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpStartDateActionPerformed(evt);
            }
        });

        jLabel1.setText("Start Date:");

        jLabel2.setText("End Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssignVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lstLocation, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lstLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dpStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAssignVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignVehicleActionPerformed
        AllocationRecord tempRec;
        if(dpStartDate.getDate() != null && dpEndDate.getDate() != null)
        {
            ICommandBehavior cmdBehavior = new AddAllocationRecord(selectedCar, selectedStaff, dpStartDate.getDate(),dpEndDate.getDate());
            Command cmd = new Command(cmdBehavior);
            try
            {
                cmdTracker.executeCommand(cmd);
            }catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }           
        }
        else if(dpStartDate.getDate() == null)
        {
            infoBox("Please assign a start date","Start date exected");
        }
        else
        {
            ICommandBehavior cmdBehavior = new AddAllocationRecord(selectedCar, selectedStaff, dpStartDate.getDate());
            Command cmd = new Command(cmdBehavior);
            try
            {
                cmdTracker.executeCommand(cmd);
            }catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAssignVehicleActionPerformed

    private void lstLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstLocationActionPerformed
        RefreshLists();
    }//GEN-LAST:event_lstLocationActionPerformed

    private void lstVehiclesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstVehiclesValueChanged
        if(lstVehicles.getSelectedIndex() != -1)
        {
            vehicleDetailsPanel1.loadCarInfo(lstVehicles.getSelectedValue(),lstVehicles);
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

    private void dpStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpStartDateActionPerformed
        RefreshLists();
    }//GEN-LAST:event_dpStartDateActionPerformed
    private void RefreshLists()
    {
        ArrayList<Car> carList = Datastore.GetCars();
        Collections.sort(carList, new CustomComparator());
        DefaultListModel<Car> model = new DefaultListModel<>();
        for( Car car : carList)
        {
            if(dpStartDate.getDate() == null)
                dpStartDate.setDate(new Date());
            if(car.isAvailable(dpStartDate.getDate()) && car.getLocation() == lstLocation.getSelectedItem())
                model.addElement(car);
        }
        lstVehicles.setCellRenderer( new CustomCellRenderer(dpStartDate.getDate()));
        lstVehicles.setModel(model);
        
        ArrayList<Staff> staffList = Datastore.GetStaff();
        Collections.sort(staffList, new CustomComparator());
        DefaultListModel<Staff> modelStaff = new DefaultListModel<>();
        for( Staff staff : staffList)
        {
            modelStaff.addElement(staff);
        }
        lstStaffMembers.setCellRenderer( new CustomCellRenderer(dpStartDate.getDate()));
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
    private org.jdesktop.swingx.JXDatePicker dpEndDate;
    private org.jdesktop.swingx.JXDatePicker dpStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<CarParks> lstLocation;
    private javax.swing.JList<Staff> lstStaffMembers;
    private javax.swing.JList<Car> lstVehicles;
    private GUIs.StaffDetailsPanel staffDetailsPanel1;
    private GUIs.VehicleDetailsPanel vehicleDetailsPanel1;
    // End of variables declaration//GEN-END:variables
}
