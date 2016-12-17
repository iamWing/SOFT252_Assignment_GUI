/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.CommandTracker;
import commands.interfaces.ICommandTracker;
import data.Datastore;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import models.Staff;

/**
 *
 * @author Admin
 */
public class ManageStaffUI extends javax.swing.JPanel {
    private ICommandTracker UndoHistory;

    /**
     * Creates new form ManageStaffUI
     */
    public ManageStaffUI() {
        UndoHistory = new CommandTracker();
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

        jScrollPane7 = new javax.swing.JScrollPane();
        listHistoryStaffMembers = new javax.swing.JList<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listManageStaffMembers = new javax.swing.JList<>();
        staffDetailsPanel1 = new GUIs.StaffDetailsPanel();

        jScrollPane7.setViewportView(listHistoryStaffMembers);

        jLabel42.setText("H i s t o r y:");

        listManageStaffMembers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listManageStaffMembersValueChanged(evt);
            }
        });
        jScrollPane6.setViewportView(listManageStaffMembers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffDetailsPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listManageStaffMembersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listManageStaffMembersValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listManageStaffMembersValueChanged
    private void RefreshList()
    {
        ArrayList<Staff> staffList = Datastore.GetStaff();
        DefaultListModel<Staff> model = new DefaultListModel<>();
        for( Staff staff : staffList)
        {
            model.addElement(staff);
        }
        listManageStaffMembers.setModel(model);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel42;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList<String> listHistoryStaffMembers;
    private javax.swing.JList<Staff> listManageStaffMembers;
    private GUIs.StaffDetailsPanel staffDetailsPanel1;
    // End of variables declaration//GEN-END:variables
}
