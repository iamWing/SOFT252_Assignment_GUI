/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.CommandTracker;
import commands.interfaces.ICommandWatcher;
import data.Datastore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import models.Car;

/**
 *
 * @author Admin
 */
public class ManageVehiclesUI extends javax.swing.JPanel implements ICommandWatcher {

    /**
     * Creates new form ManageVehiclesUI
     */
    public ManageVehiclesUI() {
        initComponents();
        
        dpCurrentDate.setDate(new Date());
        RefreshList();
        CommandTracker.addCommandWatcher(this);
    }

    /**
     * ICommandWatcher Callback.
     */
    @Override
    public void notifyCommandWatcher()
    {
        int pos = listManageVehicles.getSelectedIndex();
        RefreshList();
        listManageVehicles.setSelectedIndex(pos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        listManageVehicles = new javax.swing.JList<>();
        vehicleDetailsPanel1 = new GUIs.VehicleDetailsPanel();
        jLabel4 = new javax.swing.JLabel();
        dpCurrentDate = new org.jdesktop.swingx.JXDatePicker();
        tabs = new javax.swing.JTabbedPane();
        manageAllocationHistoryPanel = new GUIs.ManageAllocationHistoryPanel();
        manageServiceHistoryPanel = new GUIs.ManageServiceHistoryPanel();
        manageDamageHistoryPanel = new GUIs.ManageDamageRecordsHistoryPanel();

        setFocusTraversalPolicyProvider(true);

        listManageVehicles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listManageVehiclesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listManageVehicles);

        jLabel4.setText("For Date:");

        dpCurrentDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpCurrentDateActionPerformed(evt);
            }
        });

        tabs.addTab("Allocation History", manageAllocationHistoryPanel);
        tabs.addTab("Service History", manageServiceHistoryPanel);
        tabs.addTab("Damage History", manageDamageHistoryPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dpCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpCurrentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listManageVehiclesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listManageVehiclesValueChanged
        if(listManageVehicles.getSelectedIndex() != -1)
        {
            vehicleDetailsPanel1.loadCarInfo(listManageVehicles.getSelectedValue(),listManageVehicles);
            manageAllocationHistoryPanel.RefreshAllocationRecordList(listManageVehicles.getSelectedValue());
            manageServiceHistoryPanel.RefreshServiceListModel(listManageVehicles.getSelectedValue());
            manageDamageHistoryPanel.RefreshList(listManageVehicles.getSelectedValue());
        }
    }//GEN-LAST:event_listManageVehiclesValueChanged

    
    
    private void dpCurrentDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpCurrentDateActionPerformed
        RefreshList();
    }//GEN-LAST:event_dpCurrentDateActionPerformed
    private void RefreshList()
    {
        ArrayList<Car> carList = Datastore.GetCars();
        Collections.sort(carList, new CustomComparator());
        DefaultListModel<Car> model = new DefaultListModel<>();
        for( Car car : carList)
        {
            model.addElement(car);
        }
        if(dpCurrentDate.getDate() == null)
            dpCurrentDate.setDate(new Date());
        listManageVehicles.setCellRenderer( new CustomCellRenderer(dpCurrentDate.getDate()));
        listManageVehicles.setModel(model);
    }
    
    
   private void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker dpCurrentDate;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<Car> listManageVehicles;
    private GUIs.ManageAllocationHistoryPanel manageAllocationHistoryPanel;
    private GUIs.ManageDamageRecordsHistoryPanel manageDamageHistoryPanel;
    private GUIs.ManageServiceHistoryPanel manageServiceHistoryPanel;
    private javax.swing.JTabbedPane tabs;
    private GUIs.VehicleDetailsPanel vehicleDetailsPanel1;
    // End of variables declaration//GEN-END:variables
}
