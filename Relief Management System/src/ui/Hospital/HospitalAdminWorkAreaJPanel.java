/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Hospital;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import ui.AdminPanels.*;
import Business.Enterprise.Enterprise;
import Business.RoundedBorder;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.Hospital.Clinic.ClinicManageDoctorsJPanel;
/**
 *
 * @author meghanshubhatt
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    UserAccount userAccount;
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
                
        btnCreateManageOrganization.setBorder(new RoundedBorder(20));
        btnEmployeeCreation.setBorder(new RoundedBorder(20));
        btnUserAccountsManage.setBorder(new RoundedBorder(20));
        
        //enterpriseNameLabel.setText(enterprise.getName());
        //System.out.println("ui.Hospital.HospitalAdminWorkAreaJPanel.<init>() "+ecoSystem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateManageOrganization = new javax.swing.JButton();
        btnEmployeeCreation = new javax.swing.JButton();
        btnUserAccountsManage = new javax.swing.JButton();
        SPTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        btnCreateManageOrganization.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateManageOrganization.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnCreateManageOrganization.setText("Organization");
        btnCreateManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateManageOrganizationActionPerformed(evt);
            }
        });

        btnEmployeeCreation.setBackground(new java.awt.Color(255, 255, 255));
        btnEmployeeCreation.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnEmployeeCreation.setText("Create Employee");
        btnEmployeeCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeCreationActionPerformed(evt);
            }
        });

        btnUserAccountsManage.setBackground(new java.awt.Color(255, 255, 255));
        btnUserAccountsManage.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnUserAccountsManage.setText("Manage User Accounts");
        btnUserAccountsManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccountsManageActionPerformed(evt);
            }
        });

        SPTitle.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        SPTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SPTitle.setText("HOSPITAL ADMIN");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreateManageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmployeeCreation, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(btnUserAccountsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(SPTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnCreateManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(btnEmployeeCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnUserAccountsManage, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateManageOrganizationActionPerformed
        // TODO add your handling code here:
        HospitalManageOrganization hospitalManageOrganization = new HospitalManageOrganization(enterprise, enterprise.getOrganizationDirectory(),userProcessContainer,ecoSystem);
        userProcessContainer.add("hospitalManageOrganization", hospitalManageOrganization);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateManageOrganizationActionPerformed

    private void btnEmployeeCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeCreationActionPerformed
        // TODO add your handling code here:
        
        try {
        
        HospitalCreateEmployee hospitalCreateEmployee = new HospitalCreateEmployee(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("hospitalCreateEmployee", hospitalCreateEmployee);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please create the organiztion", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnEmployeeCreationActionPerformed

    private void btnUserAccountsManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccountsManageActionPerformed
        // TODO add your handling code here:
        HospitalManageUserAccounts hospitalManageUserAccounts = new HospitalManageUserAccounts(userProcessContainer, enterprise);
        userProcessContainer.add("HospitalManageUserAccounts", hospitalManageUserAccounts);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserAccountsManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SPTitle;
    private javax.swing.JButton btnCreateManageOrganization;
    private javax.swing.JButton btnEmployeeCreation;
    private javax.swing.JButton btnUserAccountsManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
