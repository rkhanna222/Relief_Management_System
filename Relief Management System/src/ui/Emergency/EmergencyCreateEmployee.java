/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Emergency;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arjun
 */
public class EmergencyCreateEmployee extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyCreateEmployee
     */
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    public EmergencyCreateEmployee(JPanel userProcessContainer, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.organizationDirectory = organizationDirectory;
        this.userProcessContainer = userProcessContainer;
        populateOrgComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboBoxOrganiztionFilter = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteEmployee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxOrganiztionEmployee = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        btnCreateEmployee = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        comboBoxOrganiztionFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrganiztionFilterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 1, 18)); // NOI18N
        jLabel4.setText("Emergency Create Employee Panel");

        btnDeleteEmployee.setBackground(new java.awt.Color(255, 153, 153));
        btnDeleteEmployee.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDeleteEmployee.setText("Delete Employee");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Organiztion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/department128x.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(102, 217, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Organization");

        comboBoxOrganiztionEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxOrganiztionEmployeeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 217, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Name");

        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });
        txtEmployeeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmployeeNameKeyPressed(evt);
            }
        });

        btnCreateEmployee.setBackground(new java.awt.Color(102, 217, 255));
        btnCreateEmployee.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCreateEmployee.setText("Create Employee");
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(102, 217, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Organiztion Filter :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxOrganiztionEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCreateEmployee))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleteEmployee))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backJButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxOrganiztionFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxOrganiztionFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxOrganiztionEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnDeleteEmployee))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateEmployee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxOrganiztionFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrganiztionFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxOrganiztionFilterActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();

        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            String organizationName = (String) organizationJTable.getValueAt(selectedRow, 2);
            String EmployeeName = (String) organizationJTable.getValueAt(selectedRow, 1);

            for (Organization organization: organizationDirectory.getOrganizationList()){
                if (organization.getName() == organizationName)
                {
                    Organization organizationSelected = organization;
                    //System.err.println(""+organizationSelected);
                    for (Employee e: organizationSelected.getEmployeeDirectory().getEmployeeList())
                    {
                        if (e.getName() == EmployeeName)
                        {
                            organizationSelected.getEmployeeDirectory().getEmployeeList().remove(e);
                            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
                            fillTheTable(organizationSelected);
                            break;
                        }
                    }

                }

            }

        }
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void comboBoxOrganiztionEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxOrganiztionEmployeeActionPerformed
        // TODO add your handling code here
        populateOrganizationFilterComboBox();
        Organization organization = (Organization) comboBoxOrganiztionEmployee.getSelectedItem();
        fillTheTable(organization);

    }//GEN-LAST:event_comboBoxOrganiztionEmployeeActionPerformed

    
     private void populateOrgComboBox() {
       comboBoxOrganiztionEmployee.removeAllItems();
       
       for (Organization organization: organizationDirectory.getOrganizationList()){
           comboBoxOrganiztionEmployee.addItem(organization);
       }
       populateOrganizationFilterComboBox();
      
    }
    
     
      private void populateOrganizationFilterComboBox() {
        comboBoxOrganiztionFilter.removeAllItems();
        
        Organization organization = (Organization) comboBoxOrganiztionEmployee.getSelectedItem();
        comboBoxOrganiztionFilter.addItem(organization.getType());
//        for (Organization organization : organizationDirectory.getOrganizationList()){
//            //System.out.println("ui.Hospital.HospitalCreateEmployee.populateOrganizationFilterComboBox()"+organization.getName());
//            //System.out.println("ui.Hospital.HospitalCreateEmployee.populateOrganizationFilterComboBox()"+organization.getType());
//            comboBoxOrganiztionFilter.addItem(organization.getType());
//        }
        
        
        
    
        
        
        
        
    }
     
     
     private void fillTheTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee.getName();
            //System.out.println("ORGS "+organization.getName());
            row[2] = organization.getName();
            model.addRow(row);
        }
    }
    
    
    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtEmployeeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeNameKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEmployeeNameKeyPressed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed

        Organization organization = (Organization) comboBoxOrganiztionEmployee.getSelectedItem();
        String name = txtEmployeeName.getText();

        organization.getEmployeeDirectory().createEmployee(name);
        fillTheTable(organization);
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JComboBox comboBoxOrganiztionEmployee;
    private javax.swing.JComboBox comboBoxOrganiztionFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
