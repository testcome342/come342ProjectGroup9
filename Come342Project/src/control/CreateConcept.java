
package control;

import entity.ConceptNote;
import entity.StaffMember;

public class CreateConcept {
    private static CreateConcept object;
    public static CreateConcept getObject() {		 
 		object = new CreateConcept(); 
		return object; 
 	} 

    public CreateConcept(){
    
      
    }
    public ConceptNote createNewConceptNote() { 
 		return ConceptNote.createConceptNote(); 
 	} 
     public void showstaffnotes(int staff_ıd){
        StaffMember staff;
        for(int i=0; i<StaffMember.staffL.size(); i++){
        if(staff_ıd==StaffMember.staffL.get(i).getStaffNo()){
        
            staff = StaffMember.staffL.get(i);
            if((staff.getConceptNote().size()) == 0){
            System.out.println("no note");
            }
            else{
            for(int j=staff_ıd-1; j < staff_ıd; j++){
              
                System.out.println(String.valueOf(j)+" "+staff.getConceptNote().get(j).getconceptTitle());
                
            }
            }
        }
        
        }
     }
}
    
         
