/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author meghanshubhatt
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.NGOOrganization.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.DonationOrganization.getValue())){
            organization = new DonationOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ClinicOrganization.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }

        
        return organization;
    }
}