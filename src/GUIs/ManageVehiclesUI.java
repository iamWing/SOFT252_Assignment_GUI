/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import data.Datastore;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import models.AllocationRecord;
import models.Car;

/**
 *
 * @author Admin
 */
public class ManageVehiclesUI extends javax.swing.JPanel {

    /**
     * Creates new form ManageVehiclesUI
     */
    public ManageVehiclesUI() {
        initComponents();
        RefreshList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listHistoryForCar = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listManageVehicles = new javax.swing.JList<>();
        vehicleDetailsPanel1 = new GUIs.VehicleDetailsPanel();
        btnForceRefresh = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listServiceForCar = new javax.swing.JList<>();
        btnAddService = new javax.swing.JButton();
        btnRemoveService = new javax.swing.JButton();
        dpInDate = new org.jdesktop.swingx.JXDatePicker();
        dpOutDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel26.setText("H i s t o r y");

        jScrollPane5.setViewportView(listHistoryForCar);

        listManageVehicles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listManageVehiclesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(listManageVehicles);

        btnForceRefresh.setText("Force Refresh");
        btnForceRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForceRefreshActionPerformed(evt);
            }
        });

        jLabel27.setText("S e r v i c e    H i s t o r y");

        jScrollPane6.setViewportView(listServiceForCar);

        btnAddService.setText("Add Service");

        btnRemoveService.setText("Remove Service");

        jLabel1.setText("In Date:");

        jLabel2.setText("Out Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(btnForceRefresh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dpInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dpOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveService, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vehicleDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnForceRefresh)
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel26))
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddService)
                            .addComponent(dpInDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dpOutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveService)))
                    .addComponent(jScrollPane5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listManageVehiclesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listManageVehiclesValueChanged
        if(listManageVehicles.getSelectedIndex() != -1)
        {
            System.out.println(" " + listManageVehicles.getSelectedIndex());
            vehicleDetailsPanel1.loadCarInfo(listManageVehicles.getSelectedValue());
            try
            {
                ArrayList<AllocationRecord> allocationHistory = listManageVehicles.getSelectedValue().getAllocationRecords();
                DefaultListModel<String> model = new DefaultListModel<>();
                for( AllocationRecord rec : allocationHistory)
                {
                    model.addElement(rec.getStaff().getSTAFFID() + "-" + rec.getStaff().getForeName() + " " +rec.getStaff().getLastName() + " - " + rec.getStarDate().toString());
                }
                listHistoryForCar.setModel(model);
            }catch(Exception ex)
            {
                System.err.print(ex.getMessage());
            }
        }
    }//GEN-LAST:event_listManageVehiclesValueChanged

    private void btnForceRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForceRefreshActionPerformed
        RefreshList();
        
    }//GEN-LAST:event_btnForceRefreshActionPerformed
    private void RefreshList()
    {
        ArrayList<Car> carList = Datastore.GetCars();
        DefaultListModel<Car> model = new DefaultListModel<>();
        for( Car car : carList)
        {
            model.addElement(car);
        }
        listManageVehicles.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnForceRefresh;
    private javax.swing.JButton btnRemoveService;
    private org.jdesktop.swingx.JXDatePicker dpInDate;
    private org.jdesktop.swingx.JXDatePicker dpOutDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> listHistoryForCar;
    private javax.swing.JList<Car> listManageVehicles;
    private javax.swing.JList<String> listServiceForCar;
    private GUIs.VehicleDetailsPanel vehicleDetailsPanel1;
    // End of variables declaration//GEN-END:variables
}
