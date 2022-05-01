/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.ServiceProvider.Food;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FoodOrganization;
import Business.Organization.Organization;
import Business.RoundedBorder;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rk
 */
public class FoodAdminWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodAdminWAJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    FoodOrganization foodOrganization;
    Enterprise enterprise;
    EcoSystem ecoSystem;
    public FoodAdminWAJPanel(JPanel userProcessContainer,
    UserAccount userAccount,
    FoodOrganization foodOrganization,
    Enterprise enterprise,
    EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.foodOrganization = foodOrganization;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        
        jMngInvBtn.setBorder(new RoundedBorder(20));
        jFoodReqBtn.setBorder(new RoundedBorder(20));
        //jShelterReqBtn.setBorder(new RoundedBorder(20));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMngInvBtn = new javax.swing.JButton();
        jFoodReqBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jMngInvBtn.setBackground(new java.awt.Color(255, 146, 146));
        jMngInvBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jMngInvBtn.setForeground(new java.awt.Color(255, 255, 255));
        jMngInvBtn.setText("Manage Inventory");
        jMngInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMngInvBtnActionPerformed(evt);
            }
        });

        jFoodReqBtn.setBackground(new java.awt.Color(255, 146, 146));
        jFoodReqBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jFoodReqBtn.setForeground(new java.awt.Color(255, 255, 255));
        jFoodReqBtn.setText("Community Food Requests");
        jFoodReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFoodReqBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setText("FOOD ORGANIZATION");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fs1.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFoodReqBtn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jMngInvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel4)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jMngInvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFoodReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFoodReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFoodReqBtnActionPerformed
        // TODO add your handling code here:
        ManageCommunityFoodRequestJPanel communityFoodRequestJPanel = new ManageCommunityFoodRequestJPanel(userProcessContainer,enterprise.getOrganizationDirectory(), enterprise, ecoSystem,userAccount);
        userProcessContainer.add("communityFoodRequestJPanel", communityFoodRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jFoodReqBtnActionPerformed

    private void jMngInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMngInvBtnActionPerformed
        // TODO add your handling code here:
        try{
            if(!ecoSystem.getFoodDirectory().getFoodList().isEmpty()){
         ManageFoodInventory manageFoodInventory = new ManageFoodInventory(userProcessContainer, enterprise, ecoSystem, userAccount,enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageFoodInventory", manageFoodInventory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
            else{
               JOptionPane.showMessageDialog(null, "No Food Packet!! Please login with FS Distributor and create food!!", "Warning", JOptionPane.WARNING_MESSAGE);
 
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Some Error Occurred!!", "Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jMngInvBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jFoodReqBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jMngInvBtn;
    // End of variables declaration//GEN-END:variables
}
