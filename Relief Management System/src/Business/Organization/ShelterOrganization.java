/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.FoodAdminRole;
import Business.Role.Role;
import Business.Role.ShelterAdminRole;
import java.util.HashSet;

/**
 *
 * @author rk
 */
public class ShelterOrganization extends Organization {

    public ShelterOrganization(String name) {
        super(name);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        
    roles.add(new ShelterAdminRole());
        return roles;
    }
    
      @Override
     public Type getType() {
        return Organization.Type.ShelterOrganization;
    } 
    
}
