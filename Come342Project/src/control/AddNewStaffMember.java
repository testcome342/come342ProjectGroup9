/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.StaffMember;

public class AddNewStaffMember {
    private static AddNewStaffMember object;
    public static AddNewStaffMember getObject() {		 
 		object = new AddNewStaffMember(); 
		return object; 
 	} 

    public AddNewStaffMember(){
    
      
    }
    
     
    
    public int createNewStaff(StaffMember staffmember) { 
 		return StaffMember.createStaff(staffmember); 
 	} 
}
