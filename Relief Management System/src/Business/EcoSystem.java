/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.BloodBank.BloodBankDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Community.CommunityDirectory;
import java.util.ArrayList;
import java.util.HashSet;
import Business.Doctor.DoctorDirectory;
import Business.Doctor.Doctor;
import Business.FireDepartment.FireDepartmentDirectory;
import Business.FoodAndShelterDistributor.FoodDirectory;
import Business.PoliceStation.PoliceStationDirectory;
import Business.Location.LocationPoint;
import Business.Role.BloodBankAdminRole;
import Business.Role.ClinicAdminRole;
import Business.Role.DonationAdminRole;
import Business.Role.FireDepartmentAdmin;
import Business.Role.HospitalAdminRole;
import Business.Role.PoliceAdminRole;
import Business.ServiceProvider.Food.FoodInventory;
import Business.ServiceProvider.Shelter.ShelterDirectory;

/**
 *
 * @author meghanshubhatt
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;
    private FoodDirectory foodDirectory;
    private FoodInventory foodInventory;
     private ShelterDirectory shelterDirectory;

    private PoliceStationDirectory policeStationList;
    private FireDepartmentDirectory fireDepartmentDirectory;

      private LocationPoint locationPoint;

    public LocationPoint getLocationPoint() {
        return locationPoint;
    }

    public void setLocationPoint(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
    }
      
      

    public ShelterDirectory getShelterDirectory() {
        return shelterDirectory;
    }

    public void setShelterDirectory(ShelterDirectory shelterDirectory) {
        this.shelterDirectory = shelterDirectory;
    }
     
     

    public FoodInventory getFoodInventory() {
        return foodInventory;
    }

    public void setFoodInventory(FoodInventory foodInventory) {
        this.foodInventory = foodInventory;
    }
    

    public FoodDirectory getFoodDirectory() {
        return foodDirectory;
    }

    public void setFoodDirectory(FoodDirectory foodDirectory) {
        this.foodDirectory = foodDirectory;
    }
    
    private CommunityDirectory communityList;


    private DoctorDirectory doctorDirectoryList;
    private BloodBankDirectory bloodDirectory;

    public BloodBankDirectory getBloodDirectory() {
        return bloodDirectory;
    }

    public PoliceStationDirectory getPoliceStationList() {
        return policeStationList;
    }

    public void setPoliceStationList(PoliceStationDirectory policeStationList) {
        this.policeStationList = policeStationList;
    }

    public void setBloodDirectory(BloodBankDirectory bloodDirectory) {
        this.bloodDirectory = bloodDirectory;
    }
    
    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        this.doctorDirectoryList = new DoctorDirectory();
        this.communityList = new CommunityDirectory();
        this.bloodDirectory = new BloodBankDirectory();
        this.foodDirectory = new FoodDirectory();
        this.foodInventory = new FoodInventory();
        this.shelterDirectory = new ShelterDirectory();
        this.policeStationList = new PoliceStationDirectory();
        this.fireDepartmentDirectory = new FireDepartmentDirectory();
    }

    public FireDepartmentDirectory getFireDepartmentDirectory() {
        return fireDepartmentDirectory;
    }

    public void setFireDepartmentDirectory(FireDepartmentDirectory fireDepartmentDirectory) {
        this.fireDepartmentDirectory = fireDepartmentDirectory;
    }

      public CommunityDirectory getCommunityList() {
        return communityList;
    }

    public void setCommunityList(CommunityDirectory communityList) {
        this.communityList = communityList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorDirectoryList;
    }

    public void setDoctorList(DoctorDirectory doctorDirectoryList) {
        this.doctorDirectoryList = doctorDirectoryList;
    }

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(EcoSystem system) {
        ecosystem = system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SystemAdminRole());
        roles.add(new HospitalAdminRole());
        roles.add(new ClinicAdminRole());
        roles.add(new BloodBankAdminRole());
        roles.add(new DonationAdminRole());
        roles.add(new PoliceAdminRole());
        roles.add(new FireDepartmentAdmin());
        return roles;
    }

    public static boolean checkIfUsernameIsUnique(String username) {

        //  if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        for (Network network : ecosystem.getNetworkList()) {

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        //  }
        return true;
    }

}
