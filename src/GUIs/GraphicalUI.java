/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import commands.CommandTracker;
import commands.interfaces.ICommandTracker;
import commands.vehicleManagement.AddVehicle;
import data.Datastore;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Fairymental
 */
public class GraphicalUI extends javax.swing.JFrame {

    private ICommandTracker UndoHistory;
    /**
     * Creates new form GraphicalUI, Loading the specified database.
     */
    public GraphicalUI(String fileName) {
        Datastore.LoadDatastore(fileName);
        UndoHistory = new CommandTracker();
        initComponents();
    }
    
    /**
     * Creates new form GraphicalUI, Loading the default database.
     */
    public GraphicalUI() {
        this("./default.dat");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        assignVehicleUI2 = new GUIs.AssignVehicleUI();
        manageStaffUI1 = new GUIs.ManageStaffUI();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageVehiclesUI2 = new GUIs.ManageVehiclesUI();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuChangeDatabase = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane2.addTab("Assign Vehicle", assignVehicleUI2);
        jTabbedPane2.addTab("Manage Staff", manageStaffUI1);

        jScrollPane1.setViewportView(manageVehiclesUI2);

        jTabbedPane2.addTab("Manage Vehicles", jScrollPane1);

        jMenu1.setText("File");

        menuChangeDatabase.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuChangeDatabase.setText("Change Database");
        menuChangeDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChangeDatabaseActionPerformed(evt);
            }
        });
        jMenu1.add(menuChangeDatabase);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Datastore.Save();
    }//GEN-LAST:event_formWindowClosing

    private void menuChangeDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChangeDatabaseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Open Database");
        chooser.setCurrentDirectory(new File("."));
        chooser.showOpenDialog(this);
        File newDB = chooser.getSelectedFile();
        if (newDB != null && !newDB.isDirectory())
        {
            Datastore.Save();
            this.dispose();
            GraphicalUI newWindow = new GraphicalUI(newDB.getAbsolutePath());
            newWindow.show();
        }
    }//GEN-LAST:event_menuChangeDatabaseActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        Datastore.Save();
        System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphicalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicalUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicalUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUIs.AssignVehicleUI assignVehicleUI2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private GUIs.ManageStaffUI manageStaffUI1;
    private GUIs.ManageVehiclesUI manageVehiclesUI2;
    private javax.swing.JMenuItem menuChangeDatabase;
    private javax.swing.JMenuItem menuExit;
    // End of variables declaration//GEN-END:variables
}
