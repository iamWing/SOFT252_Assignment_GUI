/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.Command;
import commands.CommandTracker;
import commands.interfaces.ICommandBehavior;
import commands.vehicleManagement.AddInsurance;
import commands.vehicleManagement.AddVehicle;
import commands.vehicleManagement.RemoveVehicle;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import models.Car;
import models.CarParks;

/**
 *
 * @author Admin
 */
public class VehicleDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleDetailsPanel
     */
    Car selectedCar = null;
    CommandTracker cmdTracker = new CommandTracker();
    DocumentListener documentListener;

    public VehicleDetailsPanel() {
        initComponents();
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
        
        txtCarBrand.getDocument().addDocumentListener(documentListener);
        txtCarModel.getDocument().addDocumentListener(documentListener);
        txtCarID.getDocument().addDocumentListener(documentListener);
        txtDescription.getDocument().addDocumentListener(documentListener);
        txtInsuranceCompany.getDocument().addDocumentListener(documentListener);
        txtInsuranceNumber.getDocument().addDocumentListener(documentListener);
        txtNumberSeats.getDocument().addDocumentListener(documentListener);
        txtParkLoc.getDocument().addDocumentListener(documentListener);
        
    }

    public void warn()
    {
        if(selectedCar != null)
            enableSaveButton();
    }
    public void loadCarInfo(Car selectedVehicle) {
        txtCarBrand.setText(selectedVehicle.getBrand());
        txtCarModel.setText(selectedVehicle.getModel());
        txtCarID.setText(selectedVehicle.getCARID());
        txtDescription.setText(selectedVehicle.getDescription());
        txtInsuranceCompany.setText(selectedVehicle.getInsurance().getCompany());
        txtInsuranceNumber.setText(selectedVehicle.getInsurance().getInsuranceNumber());
        txtInsuranceStart.setDate(selectedVehicle.getInsurance().getStartDate());
        txtInsuranceEnd.setDate(selectedVehicle.getInsurance().getEndDate());
        txtNumberSeats.setText(String.valueOf(selectedVehicle.getSeats()));
        txtParkLoc.setText(selectedVehicle.getLocation().toString());

        disableSaveButton();
        enableDeleteButton();
        selectedCar = selectedVehicle;
    }

    public void clearCarInfo() {
        txtCarBrand.setText("");
        txtCarModel.setText("");
        txtCarID.setText("");
        txtDescription.setText("");
        txtInsuranceCompany.setText("");
        txtInsuranceNumber.setText("");
        txtNumberSeats.setText("");
        txtParkLoc.setText("");
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
        txtParkLoc = new javax.swing.JTextField();
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

        jLabel18.setText("Description:");

        jLabel14.setText("Car Brand:");

        txtCarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarIDActionPerformed(evt);
            }
        });

        jLabel15.setText("Insurance");

        txtCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarBrandActionPerformed(evt);
            }
        });

        txtNumberSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberSeatsActionPerformed(evt);
            }
        });

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

        jLabel21.setText("Park Loc.:");

        txtCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelActionPerformed(evt);
            }
        });

        jLabel22.setText("Company Name:");

        jLabel23.setText("Number:");

        jLabel24.setText("Start Date:");

        jLabel25.setText("End Date:");

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
                                    .addComponent(txtInsuranceStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtInsuranceNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInsuranceCompany)
                                    .addComponent(txtInsuranceEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtCarID)
                            .addComponent(txtCarBrand)
                            .addComponent(txtCarModel)
                            .addComponent(txtNumberSeats)
                            .addComponent(txtParkLoc, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription)))
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
                    .addComponent(txtParkLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarIDActionPerformed

    private void txtCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarBrandActionPerformed

    private void txtNumberSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberSeatsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ICommandBehavior cmdBehavior = new AddVehicle(createCarFromTextBoxes());
        Command cmd = new Command(cmdBehavior);

        try {
            cmdTracker.executeCommand(cmd);
            clearCarInfo();
            infoBox("Car added successfully.", "Operation successful");
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarModelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        ICommandBehavior cmdBehavior = new RemoveVehicle(selectedCar);
        Command cmd = new Command(cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
            selectedCar = null;
            
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
        cmdBehavior = new AddVehicle(createCarFromTextBoxes());
        cmd = new Command(cmdBehavior);

        try {
            cmdTracker.executeCommand(cmd);
            clearCarInfo();
            selectedCar = null;
            disableSaveButton();
            disableDeleteButton();
            infoBox("Car information updated.", "Operation successful");
        } catch (Exception ex) {
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
            infoBox("Car deleted from list.", "Operation successful");
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

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
        CarParks carLoc = CarParks.CarPark01;

        if (!txtCarBrand.getText().isEmpty()) {
            carBrand = txtCarBrand.getText();
        }
        if (!txtCarModel.getText().isEmpty()) {
            carModel = txtCarModel.getText();
        }
        if (!txtCarID.getText().isEmpty()) {
            carID = txtCarID.getText();
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
        
        ICommandBehavior cmdBehavior = new AddInsurance(tempCar,carInsuranceCompany,carInsuranceNumber,txtInsuranceStart.getDate(),txtInsuranceEnd.getDate());
        Command cmd = new Command(cmdBehavior);
        
        try
        {
            cmdTracker.executeCommand(cmd);
        }catch(Exception ex)
        {
            System.err.print(ex.getMessage());
        }
        
        
 //       Insurance tempInsurance = new Insurance(carInsuranceCompany, carInsuranceNumber, txtInsuranceStart.getDate(), txtInsuranceEnd.getDate(), tempCar);
 //       tempCar.setInsurance(tempInsurance);
        return tempCar;
    }

    private void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
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
    private javax.swing.JTextField txtParkLoc;
    // End of variables declaration//GEN-END:variables
}
