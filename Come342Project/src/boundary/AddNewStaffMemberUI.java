/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import entity.StaffMember;
import static entity.StaffMember.createStaff;
import java.util.Scanner;


public class AddNewStaffMemberUI {
    private static AddNewStaffMemberUI object;
    public static AddNewStaffMemberUI getObject() {		 
 		object = new AddNewStaffMemberUI(); 
		return object; 
 	} 

    public AddNewStaffMemberUI(){
    
        StaffMember.getStaffMember();
        startStaffInterface();
    
    }
    public void  startStaffInterface(){
        String staffName, staffStartDate, staffeMail;
        Scanner input =new Scanner(System.in);
        StaffMember s1=new StaffMember();
        System.out.println("staffno: ");
         int staff_no;
        staff_no = input.nextInt();
        s1.setStaffNo(staff_no);
        System.out.println("->"+s1.getStaffNo());
        
        System.out.println("Staffname: ");
        staffName= input.next();
        s1.setStaffName(staffName);
        System.out.println("->"+s1.getStaffName());
        
        System.out.println("staffStartDate: ");
        staffStartDate= input.next();
        s1.setStaffStartDate(staffStartDate);
        System.out.println("->"+s1.getStaffStartDate());
        
              
        System.out.println("staffeMail: ");
        staffeMail= input.next();
        s1.setStaffeMail(staffeMail);
        System.out.println("->"+s1.getStaffeMail());
        StaffMember staff;
         staff = new StaffMember(staff_no,staffName, staffStartDate, staffeMail);
        int staffnumber= createStaff(staff);
        if(staffnumber>0){
        
            System.out.println("Eklendi!!"); 
                    for(int i=0;i<StaffMember.staffL.size();i++){
                    
                        if(staffnumber==StaffMember.staffL.get(i).getStaffNo()){               
                            System.out.println("staff: "+ StaffMember.staffL.get(i).getStaffName());
                                    
                        }
                 
                    }
  
        }
        
        


}

}