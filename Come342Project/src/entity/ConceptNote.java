/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConceptNote {
    private int conceptID;
    private String conceptTitle;
    private String comments;
     
    public ConceptNote(){
    }
      public ConceptNote(int conceptID,String conceptTitle,String comments){
          this.conceptID = conceptID;
          this.conceptTitle = conceptTitle;
           this.comments = comments;
    }
    
    public void setconceptID(int conceptID) {
            this.conceptID = conceptID;
	}
        public int getconceptID() {
            return conceptID;
    }
        public String getconceptTitle() {
        return conceptTitle;
    }
    public void setconceptTitle(String conceptTitle) {
        this.conceptTitle = conceptTitle;
    }
    
       public String getcomments() {
       return comments;
    }
    public void setcomments(String comments) {
        this.comments = comments;
    }
    
    public static void getConceptNote() 
 	{ 
         for(int i=0;i<StaffMember.conceptL.size();i++) { 
			if(i<=StaffMember.conceptL.size()) { 
				System.out.println(StaffMember.conceptL.get(i).getconceptTitle()); 
			}else if(i>StaffMember.conceptL.size()) 
		{ 
				break; 
 			} 
		} 
        }
     public static ConceptNote createConceptNote() {
        String conceptTitle , comments ;
        Scanner input =new Scanner(System.in);
        ConceptNote c1=new ConceptNote();
        System.out.println("conceptno: ");
         int conceptID;
        conceptID = input.nextInt();
        c1.setconceptID(conceptID);
        System.out.println("->"+c1.getconceptID());
        
        System.out.println("concept title : ");
        conceptTitle= input.next();
        c1.setconceptTitle(conceptTitle);
        System.out.println("->"+c1.getconceptTitle());
        
       System.out.println("concept comments : ");
        comments= input.next();
        c1.setcomments(comments);
        System.out.println("->"+c1.getcomments());
          ConceptNote conceptnote;
         conceptnote = new ConceptNote(conceptID,conceptTitle,comments);
         return conceptnote;
       }
}
