/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import Business.DB4O.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author rk
 */

public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
     private EcoSystem ecoSystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
     UserAccount userAccount;
     Enterprise inEnterprise;
    Organization inOrganization;
    Network networkEmergency;
    public MainJFrame() {
        initComponents();
         ecoSystem = dB4OUtil.retrieveSystem();
        
        EcoSystem.setInstance(ecoSystem);
        loginJPanel.setVisible(true);
        UserContainer.setVisible(false);
        leftPanel.setVisible(false);
        //getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.YELLOW));
        System.out.println("ui.AdminMainJFrame.<init>()" + ecoSystem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jLogoutLabel = new javax.swing.JLabel();
        btnBackLabel = new javax.swing.JLabel();
        jUserLabel = new javax.swing.JLabel();
        UserContainer = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtUsername = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelUser = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1338, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));

        jLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-shutdown-30.png"))); // NOI18N
        jLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLogoutLabelMousePressed(evt);
            }
        });

        btnBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackLabelMousePressed(evt);
            }
        });

        jUserLabel.setBackground(new java.awt.Color(255, 255, 255));
        jUserLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLogoutLabel)
                .addGap(28, 28, 28)
                .addComponent(btnBackLabel)
                .addGap(30, 30, 30)
                .addComponent(jUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(964, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLogoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 50));

        UserContainer.setBackground(new java.awt.Color(255, 255, 255));
        UserContainer.setForeground(new java.awt.Color(31, 50, 97));
        UserContainer.setPreferredSize(new java.awt.Dimension(1338, 840));
        UserContainer.setLayout(new java.awt.CardLayout());
        getContentPane().add(UserContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 49, 1440, 1060));

        loginJPanel.setBackground(new java.awt.Color(198, 210, 198));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 900));

        jPanel1.setBackground(new java.awt.Color(198, 210, 198));

        jLabel1.setBackground(new java.awt.Color(44, 32, 61));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RMS.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(198, 210, 198));

        jLabel3.setBackground(new java.awt.Color(194, 192, 212));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (3).png"))); // NOI18N

        jTxtUsername.setBackground(new java.awt.Color(198, 210, 198));
        jTxtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTxtUsername)
        );

        jPanel3.setBackground(new java.awt.Color(198, 210, 198));

        jLabel4.setBackground(new java.awt.Color(176, 216, 195));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house-key.png"))); // NOI18N

        jPasswordField1.setBackground(new java.awt.Color(198, 210, 198));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
            .addComponent(jPasswordField1)
        );

        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/avatar.png"))); // NOI18N

        jLabelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-icon.png"))); // NOI18N
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabelLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogin)
                .addContainerGap(277, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(loginJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = jTxtUsername.getText();
        // Get Password
        char[] passwordCharArray = jPasswordField1.getPassword();
        String password = String.valueOf(passwordCharArray);
        
         //Step1: Check in the system user account directory if you have the user
         
        userAccount = ecoSystem.getUserAccountDirectory().authenticateUser(userName, password);
         inEnterprise = null;
         inOrganization = null;
        
        if (userAccount == null) {
            //Step2: Go inside each network to check each enterprise
            for (Network network : ecoSystem.getNetworkList()) {
                //Step 2-a: Check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step3: Check against each organization inside that enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            
                            if (userAccount != null) {
                            //    System.out.println("organi"+ organization.getName());
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }
       
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentails!");
            return;
        } else {
           
            jUserLabel.setText("Welcome " + userAccount.getEmployee().getName() + "!!");
            loginJPanel.setVisible(false);
            UserContainer.setVisible(true);
            leftPanel.setVisible(true);
            jLogoutLabel.setVisible(true);
            btnBackLabel.setVisible(false);
            jTxtUsername.setText("");
            jPasswordField1.setText("");
            changePanel1();
        }
//        loginBtn.setEnabled(false);
//        logoutJButton.setEnabled(true);
//        usernameTxt.setEnabled(false);
//        passwordTxt.setEnabled(false);
        
    }//GEN-LAST:event_loginButtonMousePressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogoutLabelMousePressed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_jLogoutLabelMousePressed

    private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLabelMousePressed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_btnBackLabelMousePressed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserContainer;
    private javax.swing.JLabel btnBackLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLogoutLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTxtUsername;
    private javax.swing.JLabel jUserLabel;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel loginJPanel;
    // End of variables declaration//GEN-END:variables

    private void changePanel1() {
        CardLayout layout = (CardLayout) UserContainer.getLayout();
        userAccount.getRole();
        UserContainer.add("workArea", userAccount.getRole().createWorkArea(UserContainer, userAccount, inOrganization, inEnterprise, ecoSystem));
        //System.out.println("ui.AdminMainJFrame.loginBtnActionPerformed() "+ecoSystem);
        layout.next(UserContainer);
    }
    
     private void logout() {
        UserContainer.removeAll();
        dB4OUtil.storeSystem(ecoSystem);
        loginJPanel.setVisible(true);
        UserContainer.setVisible(false);
        leftPanel.setVisible(false);
    }
}
