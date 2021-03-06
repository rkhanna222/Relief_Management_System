/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Emergency.FireDepartment;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FireDepartment.FireDepartment;
import Business.Organization.OrganizationDirectory;
import Business.PoliceStation.PoliceStation;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.CommunityFireRequest;
import Business.WorkQueue.CommunityPoliceRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arjun
 */
public class ManageCommunityRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCommunityRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    public ManageCommunityRequestJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,Enterprise enterprise,UserAccount userAccount,EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        populateAvailableFireTbl();
        populateRequestTable();
         tblRequest.getTableHeader().setDefaultRenderer(new HeaderColors());
         tblAvailableFire.getTableHeader().setDefaultRenderer(new HeaderColors());
         //finally done
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnApproveReqPolice = new javax.swing.JButton();
        txtCount = new javax.swing.JTextField();
        btnRejectReqPolice = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvailableFire = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAssignToMe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        btnDeleteReqPolice = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnApproveReqPolice.setBackground(new java.awt.Color(102, 217, 255));
        btnApproveReqPolice.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApproveReqPolice.setText("Approve Request");
        btnApproveReqPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveReqPoliceActionPerformed(evt);
            }
        });

        txtCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountActionPerformed(evt);
            }
        });

        btnRejectReqPolice.setBackground(new java.awt.Color(255, 153, 153));
        btnRejectReqPolice.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRejectReqPolice.setText("Reject Request");
        btnRejectReqPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectReqPoliceActionPerformed(evt);
            }
        });

        tblAvailableFire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fire Department Unit", "Unit Strength"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAvailableFire);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Fire Department Request From Community");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Fire Department Data");

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 217, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Request for Assistance");

        btnAssignToMe.setBackground(new java.awt.Color(102, 217, 255));
        btnAssignToMe.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAssignToMe.setText("Assign to me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Units Dispatched", "People Affected", "Request Date", "Resolution Date", "Venue", "Unit Type", "Severity", "Status", "Sender", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(tblRequest);

        btnDeleteReqPolice.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteReqPolice.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteReqPolice.setText("Delete Request");
        btnDeleteReqPolice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReqPoliceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Fire Man to be allocated");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(155, 155, 155)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnAssignToMe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApproveReqPolice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRejectReqPolice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteReqPolice)))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe)
                    .addComponent(btnApproveReqPolice)
                    .addComponent(btnRejectReqPolice)
                    .addComponent(btnDeleteReqPolice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveReqPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveReqPoliceActionPerformed
        // TODO add your handling code here:

        try{
            if(Integer.parseInt(txtCount.getText()) <= 0 ){
        JOptionPane.showMessageDialog(null, "Enter Proper value", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
            
        } catch( NumberFormatException n){
        JOptionPane.showMessageDialog(null, "Enter Proper numeric value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        
        int selectedRow= tblRequest.getSelectedRow();

        if(txtCount.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please provide the task force count", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            CommunityFireRequest p=(CommunityFireRequest) tblRequest.getValueAt(selectedRow, 7);

            int temp=0;
            if(p.getReceiver()!= null){
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    UserAccount a =p.getSender();
                    if(ecoSystem.getFireDepartmentDirectory().getFireDepartmentList().size()< 0){
                        System.out.print("inside the size being 0");
                        JOptionPane.showMessageDialog(null, "No Doctors available.");
                        return;
                    }
                    //                    for (Doctor v : ecoSystem.getDoctorList().getDoctorList()) {
                        //                        if (v.getDocName() == p.getDoctorType()){
                            //                            //if(p.getDocName().equals(v.getDocName())){
                                //                                if(v.getQuantity()- p.getNoDoctorRequired()<0){
                                    //                                    JOptionPane.showMessageDialog(null, "Not enough Doctors available. Wait for sometime");
                                    //                                    return;
                                    //                                }
                                //                                temp=1;
                                //                                v.setQuantity(v.getQuantity()- p.getNoDoctorRequired());
                                //                                break;
                                //                                //}
                            //                        }
                        //
                        //                    }

                    for(FireDepartment v : ecoSystem.getFireDepartmentDirectory().getFireDepartmentList()) {
                        if(v.getFireDepartmentType().equals(p.getFireDepartmentType())){
                            System.out.print("ok the type is same");
                            if(v.getUnitCount() - Integer.parseInt(txtCount.getText()) < 0) {
                                JOptionPane.showMessageDialog(null, "Not enough Police force available. Wait for sometime");
                                return;
                            }
                            temp = 1;
                            v.setUnitCount(v.getUnitCount() - Integer.parseInt(txtCount.getText()));

                        }
                    }
                    if(temp==0){
                        JOptionPane.showMessageDialog(null, "No Doctors available");
                        return;
                    }

                    p.setStatus("Approved");
                    p.setFireDepartmentCount(Integer.parseInt(txtCount.getText()));
                    Date resolveDate = new Date();
                    p.setResolveDate(resolveDate);
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                    //  populateAvailableDoctorTbl();
                    //  populateRequestTable();
                    populateAvailableFireTbl();
                    populateRequestTable();
                } else if(p.getStatus().equalsIgnoreCase("Rejected")){
                    JOptionPane.showMessageDialog(null, "You cannot approve the rejected request.");

                }else {
                    JOptionPane.showMessageDialog(null, "Cannot Approve the request 2 times.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnApproveReqPoliceActionPerformed

    private void txtCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountActionPerformed

    private void btnRejectReqPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectReqPoliceActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to reject the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            CommunityFireRequest p=(CommunityFireRequest) tblRequest.getValueAt(selectedRow, 7);
            if(p.getStatus().equalsIgnoreCase("Approved")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the Approved request", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if(p.getStatus().equalsIgnoreCase("Rejected")){
                JOptionPane.showMessageDialog(null, "Cannot Reject the request 2 times", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                if (p.getStatus().equalsIgnoreCase("Pending")) {
                    p.setStatus("Rejected");
                    p.setReceiver(userAccount);
                    Date resolveDate = new Date();
                    p.setResolveDate(resolveDate);
                }else{
                    JOptionPane.showMessageDialog(null, "Please assign first");
                }
            }
            populateRequestTable();

        }
    }//GEN-LAST:event_btnRejectReqPoliceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to assign the Request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            CommunityFireRequest c =  (CommunityFireRequest)tblRequest.getValueAt(selectedRow, 7);
            //NGOWorkRequest p=(NGOWorkRequest) tblRequestTableCommunity.getValueAt(selectedRow, 4);

            c.setStatus("Pending");
            c.setReceiver(userAccount);

            populateRequestTable();

        }
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnDeleteReqPoliceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReqPoliceActionPerformed
        // TODO add your handling code here:
        int selectedRow= tblRequest.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the request", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest p=(WorkRequest) tblRequest.getValueAt(selectedRow, 7);

            userAccount.getWorkQueue().getWorkRequestList().remove(p);
            ecoSystem.getWorkQueue().getWorkRequestList().remove(p);
            enterprise.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the request");
            populateRequestTable();
        }
    }//GEN-LAST:event_btnDeleteReqPoliceActionPerformed


    private void populateAvailableFireTbl() {
        System.out.print("check 0 !!!");
       DefaultTableModel model = (DefaultTableModel) tblAvailableFire.getModel();

       System.out.print("check 1 !!!");
        model.setRowCount(0);

        System.out.print("check 2 !!!");
        for (FireDepartment fire : ecoSystem.getFireDepartmentDirectory().getFireDepartmentList() ) {
            System.out.print("check 3 !!!");
            Object[] row = new Object[2];
            row[0] = fire;
            row[1] = fire.getUnitCount() ;
            model.addRow(row);

        }
    }
    
    
    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(work instanceof CommunityFireRequest){
                if(((CommunityFireRequest) work).getReceiver() == null || ((CommunityFireRequest) work).getReceiver() == userAccount ){
                    
                    Object[] row = new Object[10];
                row[0] = ((CommunityFireRequest) work).getFireDepartmentCount() ;
                row[1] = ((CommunityFireRequest) work).getNoPeopleAffected() ;
                row[2] = ((CommunityFireRequest) work).getRequestDate() ;
                row[3] = ((CommunityFireRequest) work).getResolveDate() ;
                row[7] = work;
                row[4] = ((CommunityFireRequest) work).getLocation() ;
                row[5] = ((CommunityFireRequest) work).getFireDepartmentType() ;
                row[6] = ((CommunityFireRequest) work).getPurpose() ;
                row[8] = ((CommunityFireRequest) work).getSender() ;
                
                if(((CommunityFireRequest) work).getReceiver() != null){
                    row[9] = ((CommunityFireRequest) work).getReceiver();
                }

                model.addRow(row);
                    
                
                }
                
            
            }
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveReqPolice;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteReqPolice;
    private javax.swing.JButton btnRejectReqPolice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAvailableFire;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtCount;
    // End of variables declaration//GEN-END:variables
}
