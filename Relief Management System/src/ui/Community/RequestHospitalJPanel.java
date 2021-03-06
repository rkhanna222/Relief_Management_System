/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Community;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.CommunityDoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.xml.validation.Validator;

/**
 *
 * @author arjun
 */
public class RequestHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestHospitalJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem ecoSystem;
    public RequestHospitalJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecoSystem = ecoSystem;
        tblRequest.getTableHeader().setDefaultRenderer(new HeaderColors());
        populateRequestTable();
        populateDoctorTypeComboBox();
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
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRequestType = new javax.swing.JTextField();
        txtVenue = new javax.swing.JTextField();
        txtDoctorCount = new javax.swing.JTextField();
        txtPeopleCount = new javax.swing.JTextField();
        btnSendRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        doctorTypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Community Hospital Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 384, -1));

        btnBack.setBackground(new java.awt.Color(102, 217, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 7, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Request Type :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Location :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Number of Doctors : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Number of People Affected :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));
        add(txtRequestType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 118, -1));
        add(txtVenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 118, -1));
        add(txtDoctorCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 118, -1));
        add(txtPeopleCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 119, -1));

        btnSendRequest.setBackground(new java.awt.Color(102, 217, 255));
        btnSendRequest.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSendRequest.setText("Send Request");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });
        add(btnSendRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        tblRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblRequest.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No of Doctors", "Date of Request", "Date of Resolution", "Location", "People Affected", "Doctor Type", "Status", "Sender", "Receiver"
            }
        ));
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tblRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 910, 277));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Doctor Type:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        doctorTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(doctorTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 119, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IncidentOPAQUESCENE.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1200, 510));
    }// </editor-fold>//GEN-END:initComponents

     public static boolean isDateValid(String date){
         SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
         dateFormat.setLenient(false);
        try{
            Date dateJAVA = dateFormat.parse(date);
            return true;
        } catch (ParseException ex) {
            return false;
        }
        
         
     }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        model.setRowCount(0);
        for(WorkRequest work : ecoSystem.getWorkQueue().getWorkRequestList()){
            if(work instanceof CommunityDoctorRequest && work.getSender() == account){
                Object[] row = new Object[9];
                row[0] = ((CommunityDoctorRequest) work).getNoDoctorRequired();
                row[1] = ((CommunityDoctorRequest) work).getRequestDate() ;
                row[2] = ((CommunityDoctorRequest) work).getResolveDate() ;
                row[3] = ((CommunityDoctorRequest) work).getLocation();
                row[6] = work;
                row[4] = ((CommunityDoctorRequest) work).getNoPeopleAffected() ;
                row[5] = ((CommunityDoctorRequest) work).getDoctorType();
                row[7] = ((CommunityDoctorRequest) work).getSender().getUsername();
                
                if(((CommunityDoctorRequest) work).getReceiver() != null){
                row[8] = ((CommunityDoctorRequest) work).getReceiver().getUsername();
                }
                
                model.addRow(row);
            
            }
        }
        
    }
    
    private void populateDoctorTypeComboBox(){
        DefaultComboBoxModel modelDoctorType = new DefaultComboBoxModel();
        for (Doctor doctor : ecoSystem.getDoctorList().getDoctorList()) {
            modelDoctorType.addElement(doctor.getDocName());
        }
        
        doctorTypeComboBox.setModel(modelDoctorType);
    }
    
    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        // TODO add your handling code here:
     
        if(txtDoctorCount.getText().isEmpty() || txtPeopleCount.getText().isEmpty() || txtRequestType.getText().isEmpty() || txtVenue.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "Please add all the fields");
        return;
        }

            CommunityDoctorRequest request = new CommunityDoctorRequest();

            try{
                    request.setNoDoctorRequired(Integer.parseInt(txtDoctorCount.getText()));
                    request.setNoPeopleAffected(Integer.parseInt(txtPeopleCount.getText()));

                
            } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter numeric value");
        return;
            }
            
            try{
                    request.setDoctorType(doctorTypeComboBox.getSelectedItem().toString());

            }catch(NullPointerException n){
             JOptionPane.showMessageDialog(this, "Please wait for clinic to update data");
        return;
            }
            
            
                
                request.setLocation(txtVenue.getText());
                Date requestDate = new Date();
                request.setRequestDate(requestDate); 
//                request.setRequestedTime(txtTime.getText());
                request.setPurpose(txtRequestType.getText());
                request.setStatus("Requested");
                request.setSender(account);
                account.getWorkQueue().getWorkRequestList().add(request);
                enterprise.getWorkQueue().getWorkRequestList().add(request);
                ecoSystem.getWorkQueue().getWorkRequestList().add(request);
                resetFields();
            populateRequestTable();
        
//            JOptionPane.showMessageDialog(null,"Enter date in specified format", "Warning", JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnSendRequestActionPerformed
   public void resetFields() {
        txtDoctorCount.setText("");
        txtPeopleCount.setText("");
        txtRequestType.setText("");
        txtVenue.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JComboBox<String> doctorTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtDoctorCount;
    private javax.swing.JTextField txtPeopleCount;
    private javax.swing.JTextField txtRequestType;
    private javax.swing.JTextField txtVenue;
    // End of variables declaration//GEN-END:variables
}
