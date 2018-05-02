package entity;

import entity.Campaign;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffMember {
    private int staffNo;
    private String staffName;
    private String staffStartDate;
    private String staffeMail;
    public static List <StaffMember>staffL=new ArrayList<StaffMember>();
    public static List <ConceptNote> conceptL=new ArrayList<ConceptNote>();
    public StaffMember(){
        
    }
    
    public StaffMember(int staffNo,String staffName,String staffStartDate,String staffeMail){
        this.staffNo=staffNo;
        this.staffName=staffName;
        this.staffStartDate=staffStartDate;
        this.staffeMail=staffeMail;
    
    }
        public void setStaffNo(int staffNo) {
            this.staffNo = staffNo;
	}
        public int getStaffNo() {
            return staffNo;
	}
        public void setStaffName(String staffName) {
            this.staffName = staffName;
	}
        public String getStaffName() {
            return staffName;
	}

        public void setStaffStartDate(String staffStartDate) {
            this.staffStartDate = staffStartDate;
	}
        public String getStaffStartDate() {
            return staffStartDate;
	}

        public void setStaffeMail(String staffeMail) {
            this.staffeMail = staffeMail;
	}
        public String getStaffeMail() {
            return staffeMail;
	}
        public static List<StaffMember> getStaffMember() 
 	{ 
            StaffMember s1=new StaffMember(1,"afra","23.04.2018","afrakose@gmail");
           ConceptNote n1 =new ConceptNote(1,"yapıacagım isler","dosyaları düzenle");
            conceptL.add(n1);
            staffL.add(s1);
            
            StaffMember s2=new StaffMember(2,"gulsen","24.04.2018","gulsencakıcı@gmail");
              ConceptNote n2=new ConceptNote(2,"toplantı notları","......");
            conceptL.add(n2);
            staffL.add(s2);
            List<StaffMember> staffL = StaffMember.staffL; 
		if(staffL.size() != 0) { 
 			for(int i=0; i< staffL.size(); i++) { 
 				System.out.println(String.valueOf(staffL.get(i).getStaffNo()) +" - "+ staffL.get(i).getStaffName() ); 
			} 
 		} 
                else { 
 			System.out.println("Not Found!"); 
 		} 
                return staffL;
        }
        /*public static StaffMember assignStaff() {
    
        
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
        
        StaffMember staff = new StaffMember(staff_no,staffName, staffStartDate, staffeMail);
        return staff;
    }*/
           public static int createStaff(StaffMember staffmember) {
       
           StaffMember.staffL.add(staffmember);
           return staffmember.getStaffNo();
       
       }
           public void addNewConceptNote(ConceptNote conceptnote) 
	{ 
		this.conceptL.add(conceptnote); 
 	} 
 	 
	public List<ConceptNote> getConceptNote() 
	{ 
		return conceptL; 
	} 
	 
 	public void setConceptNotes(List<ConceptNote> conceptL) 
 	{ 
		this.conceptL=conceptL; 
 	} 
        
      
      
}   
