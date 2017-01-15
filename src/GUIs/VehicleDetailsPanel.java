/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.Command;
import commands.CommandTracker;
import commands.interfaces.ICommandBehavior;
import commands.vehicleManagement.AddVehicle;
import commands.vehicleManagement.EditVehicle;
import commands.vehicleManagement.RemoveVehicle;
import data.Datastore;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.Car;
import models.CarParks;
import models.Insurance;

/**
 *
 * @author Admin
 */
public class VehicleDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleDetailsPanel
     */
    
    JList vehicleList;
    Car selectedCar = null;
    CommandTracker cmdTracker = new CommandTracker();
    DocumentListener documentListener;

    public VehicleDetailsPanel() {
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

        txtCarBrand.getDocument().addDocumentListener(documentListener);
        txtCarModel.getDocument().addDocumentListener(documentListener);
        txtCarID.getDocument().addDocumentListener(documentListener);
        txtDescription.getDocument().addDocumentListener(documentListener);
        txtInsuranceCompany.getDocument().addDocumentListener(documentListener);
        txtInsuranceNumber.getDocument().addDocumentListener(documentListener);
        txtNumberSeats.getDocument().addDocumentListener(documentListener);
        for (CarParks loc : CarParks.values()) {
            cbParkLoc.addItem(loc);
        }
        
    }

    public void loadCarInfo(Car selectedVehicle, JList list) {
        vehicleList = list;
        
        txtCarBrand.setText(selectedVehicle.getBrand());
        txtCarModel.setText(selectedVehicle.getModel());
        txtCarID.setText(selectedVehicle.getCARID());
        txtDescription.setText(selectedVehicle.getDescription());
        txtInsuranceCompany.setText(selectedVehicle.getInsurance().getCompany());
        txtInsuranceNumber.setText(selectedVehicle.getInsurance().getInsuranceNumber());
        txtInsuranceStart.setDate(selectedVehicle.getInsurance().getStartDate());
        txtInsuranceEnd.setDate(selectedVehicle.getInsurance().getEndDate());
        txtNumberSeats.setText(String.valueOf(selectedVehicle.getSeats()));
        cbParkLoc.setSelectedItem(selectedVehicle.getLocation());
        ckOutOfService.setSelected(selectedVehicle.isDamaged());
        selectedCar = selectedVehicle;
        updateButtons();
    }

    public void clearCarInfo() {
        txtCarBrand.setText("");
        txtCarModel.setText("");
        txtCarID.setText("");
        txtDescription.setText("");
        txtInsuranceCompany.setText("");
        txtInsuranceNumber.setText("");
        txtNumberSeats.setText("");
        cbParkLoc.setSelectedItem(CarParks.CarPark01);
        ckOutOfService.setSelected(false);
    }
    private void updateButtons()
    {
        if(selectedCar != null)
            enableSaveButton();
        else
            disableSaveButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCarID = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCarBrand = new javax.swing.JTextField();
        txtNumberSeats = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtCarModel = new javax.swing.JTextField();
        txtInsuranceCompany = new javax.swing.JTextField();
        txtInsuranceNumber = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtInsuranceStart = new org.jdesktop.swingx.JXDatePicker();
        txtInsuranceEnd = new org.jdesktop.swingx.JXDatePicker();
        cbParkLoc = new javax.swing.JComboBox<>();
        ckOutOfService = new javax.swing.JCheckBox();

        jLabel18.setText("Description:");

        jLabel14.setText("Car Brand:");

        txtCarID.setEnabled(false);

        jLabel15.setText("Insurance");

        jLabel13.setText("Car ID:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        jLabel19.setText("Car Model:");

        jLabel20.setText("Nr. seats:");

        jLabel21.setText("Location:");

        jLabel22.setText("Company Name:");

        jLabel23.setText("Number:");

        jLabel24.setText("Start Date:");

        jLabel25.setText("End Date:");

        txtInsuranceStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceStartActionPerformed(evt);
            }
        });

        txtInsuranceEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceEndActionPerformed(evt);
            }
        });

        ckOutOfService.setText("Out of service");
        ckOutOfService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckOutOfServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel21)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtInsuranceStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInsuranceNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInsuranceCompany)
                                    .addComponent(txtInsuranceEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtCarID)
                            .addComponent(txtCarBrand)
                            .addComponent(txtCarModel)
                            .addComponent(txtNumberSeats)
                            .addComponent(cbParkLoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ckOutOfService)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtCarModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbParkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtInsuranceCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtInsuranceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtInsuranceStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInsuranceEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckOutOfService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ICommandBehavior cmdBehavior = new AddVehicle(createCarFromTextBoxes());
        Command cmd = new Command(cmdBehavior);

        try {
            cmdTracker.executeCommand(cmd);
            clearCarInfo();
            RefreshCarList();
            infoBox("Car added successfully.", "Operation successful");
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        Car newDetails = createCarFromTextBoxes();
        ICommandBehavior cmdBehavior = new EditVehicle(newDetails.getCARID(), newDetails.getBrand(),
                newDetails.getModel(), newDetails.getSeats(), newDetails.getDescription(),
                newDetails.getLocation(), newDetails.getInsurance(), newDetails.isDamaged());
        Command cmd = new Command(cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
            
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        ICommandBehavior cmdBehavior = new RemoveVehicle(selectedCar);
        Command cmd = new Command(cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
            clearCarInfo();
            selectedCar = null;
            disableDeleteButton();
            disableSaveButton();
            RefreshCarList();
            infoBox("Car deleted from list.", "Operation successful");
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtInsuranceStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceStartActionPerformed
        updateButtons();
    }//GEN-LAST:event_txtInsuranceStartActionPerformed

    private void txtInsuranceEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceEndActionPerformed
        updateButtons();
    }//GEN-LAST:event_txtInsuranceEndActionPerformed

    private void ckOutOfServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckOutOfServiceActionPerformed
        updateButtons();
    }//GEN-LAST:event_ckOutOfServiceActionPerformed

    public void enableSaveButton() {
        btnSave.setEnabled(true);
    }

    public void disableSaveButton() {
        btnSave.setEnabled(false);
    }

    public void enableDeleteButton() {
        btnDelete.setEnabled(true);
    }

    public void disableDeleteButton() {
        btnDelete.setEnabled(false);
    }

    public Car createCarFromTextBoxes() {
        Car tempCar;
        String carBrand = "N/A", carModel = "N/A", carID = "N/A", carDescription = "N/A", carInsuranceCompany = "N/A", carInsuranceNumber = "N/A";
        int carNumberSeats = 0;
        CarParks carLoc = (CarParks) cbParkLoc.getSelectedItem();

        if (!txtCarBrand.getText().isEmpty()) {
            carBrand = txtCarBrand.getText();
        }
        if (!txtCarModel.getText().isEmpty()) {
            carModel = txtCarModel.getText();
        }
        if (!txtCarID.getText().isEmpty()) {
            carID = txtCarID.getText();
        }
        if (!txtNumberSeats.getText().isEmpty()) {
            try {
            carNumberSeats = Integer.parseInt(txtNumberSeats.getText());
            } catch (Exception e) {}
        }
        if (!txtDescription.getText().isEmpty()) {
            carDescription = txtDescription.getText();
        }
        if (!txtInsuranceCompany.getText().isEmpty()) {
            carInsuranceCompany = txtInsuranceCompany.getText();
        }
        if (!txtInsuranceNumber.getText().isEmpty()) {
            carInsuranceNumber = txtInsuranceNumber.getText();
        }

        tempCar = new Car(carID, carBrand, carModel, carNumberSeats, carLoc, carDescription);
        tempCar.setDamaged(ckOutOfService.isSelected());

        Insurance tempInsurance = new Insurance(carInsuranceCompany, carInsuranceNumber, txtInsuranceStart.getDate(), txtInsuranceEnd.getDate());
        tempCar.setInsurance(tempInsurance);
        return tempCar;
    }

    private void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    private void RefreshCarList()
    {
        ArrayList<Car> carList = Datastore.GetCars();
        DefaultListModel<Car> model = new DefaultListModel<>();
        for( Car car : carList)
        {
            model.addElement(car);
        }
        vehicleList.setModel(model);
        updateButtons();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<CarParks> cbParkLoc;
    private javax.swing.JCheckBox ckOutOfService;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JTextField txtCarBrand;
    private javax.swing.JTextField txtCarID;
    private javax.swing.JTextField txtCarModel;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtInsuranceCompany;
    private org.jdesktop.swingx.JXDatePicker txtInsuranceEnd;
    private javax.swing.JTextField txtInsuranceNumber;
    private org.jdesktop.swingx.JXDatePicker txtInsuranceStart;
    private javax.swing.JTextField txtNumberSeats;
    // End of variables declaration//GEN-END:variables
}
