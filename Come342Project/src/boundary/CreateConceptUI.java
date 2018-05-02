
package boundary;

import control.CreateConcept;
import entity.ConceptNote;
import static entity.ConceptNote.createConceptNote;
import entity.StaffMember;

import java.util.Scanner;

public class CreateConceptUI {
    private static CreateConceptUI object;
    public static CreateConceptUI getObject() {		 
 		object = new CreateConceptUI(); 
		return object; 
 	} 

    public CreateConceptUI(){
    StaffMember.getStaffMember();
    startConceptInterface();
      
    }
    
    public void  startConceptInterface(){
       System.out.println("Lütfen staff secin:");
        Scanner input=new Scanner(System.in);
        int staff_ıd = input.nextInt();
        selectStaff(staff_ıd);
        ConceptNote note =createConceptNote();
        for(int i=0;i< StaffMember.staffL.size();i++){
            if(staff_ıd == StaffMember.staffL.get(i).getStaffNo()){
                StaffMember.staffL.get(i).addNewConceptNote(note);
                System.out.println("basarılııı");
             
            }
            
  
        }
    }
        public void selectStaff(int staff_ıd){
        CreateConcept.getObject().showstaffnotes(staff_ıd);
    
    }
          public ConceptNote createNewConceptNote() { 
                
	 return CreateConcept.getObject().createNewConceptNote();
 		 
 	} 
    }
