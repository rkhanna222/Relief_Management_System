/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Donation;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author meghanshubhatt
 */
public class DonationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    
    public DonationWorkAreaJPanel(JPanel UserContainer, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = UserContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        tblSponsorManageRequestNgo.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateRequestTable();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSponsorManageRequestNgo = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnDeleteRequest = new javax.swing.JButton();
        btnApproveReqSponsor = new javax.swing.JButton();
        btnRejectReqSponsor = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Manage Request From NGO");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Blood Donation Camp");

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Purpose :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Request for Sponsorship");

        tblSponsorManageRequestNgo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblSponsorManageRequestNgo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Requested Amount", "Date of requirement", "Time of requirement", "Venue", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSponsorManageRequestNgo.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblSponsorManageRequestNgo);

        btnAssignToMe.setBackground(new java.awt.Color(102, 217, 255));
        btnAssignToMe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnDeleteRequest.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteRequest.setText("Delete Request");
        btnDeleteRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRequestActionPerformed(evt);
            }
        });

        btnApproveReqSponsor.setBackground(new java.awt.Color(102, 217, 255));
        btnApproveReqSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApproveReqSponsor.setText("Approve Request");
        btnApproveReqSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveReqSponsorActionPerformed(evt);
            }
        });

        btnRejectReqSponsor.setBackground(new java.awt.Color(255, 153, 153));
        btnRejectReqSponsor.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRejectReqSponsor.setText("Reject Request");
        btnRejectReqSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectReqSponsorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAssignToMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApproveReqSponsor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRejectReqSponsor)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRejectReqSponsor)
                    .addComponent(btnApproveReqSponsor)
                    .addComponent(btnDeleteRequest)
                    .addComponent(btnAssignToMe))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);

            p.setStatus("Pending");
            p.setReceiver(userAccount);

            populateRequestTable();

        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnDeleteRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
            userAccount.getWorkQueue().getWorkRequestList().remove(p);
            ecoSystem.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnDeleteRequestActionPerformed

    private void btnApproveReqSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveReqSponsorActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to approve the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
                if(p.getStatus().equalsIgnoreCase("Rejected")){
                    JOptionPane.showMessageDialog(null, "Cannot Approve the Rejected request", "Warning", JOptionPane.WARNING_MESSAGE);
                }else if(p.getStatus().equalsIgnoreCase("Approved")){
                    JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
                }else {
                    if (p.getStatus().equalsIgnoreCase("Pending")) {
                        p.setStatus("Approved");
                        p.setReceiver(userAccount);
                    }else{
                        JOptionPane.showMessageDialog(null, "Please assign first");
                    }

                }
                populateRequestTable();
            }
    }//GEN-LAST:event_btnApproveReqSponsorActionPerformed

    private void btnRejectReqSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectReqSponsorActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblSponsorManageRequestNgo.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            DonationWorkRequest p=(DonationWorkRequest) tblSponsorManageRequestNgo.getValueAt(selectedRow, 4);
            if(p.getStatus().equalsIgnoreCase("Approved")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the Approved request", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if(p.getStatus().equalsIgnoreCase("Rejected")){

                JOptionPane.showMessageDialog(null, "Cannot Reject the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    p.setStatus("Rejected");
                    p.setReceiver(userAccount);
                }else{
                    JOptionPane.showMessageDialog(null, "Please assign first");
                }
            }
            populateRequestTable();
        }
    }//GEN-LAST:event_btnRejectReqSponsorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveReqSponsor;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnDeleteRequest;
    private javax.swing.JButton btnRejectReqSponsor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSponsorManageRequestNgo;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblSponsorManageRequestNgo.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
           if(work instanceof DonationWorkRequest){ 
            Object[] row = new Object[5];
            row[0] = ((DonationWorkRequest) work).getRequestedAmount();
            row[1] = ((DonationWorkRequest) work).getRequestedDate();
            row[2] = ((DonationWorkRequest) work).getRequestedTime();
            row[3] = ((DonationWorkRequest) work).getLocation();
            row[4] = work;
            model.addRow(row);
           }
        }
        
        
    }
}
