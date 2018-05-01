
package boundary;

import control.AddNewCampaign;
import control.AddStaff;
import entity.Campaign;
import entity.Client;
import static entity.Client.clientL;
import java.util.List;
import java.util.Scanner;


public class AddStaffUI {
    public static AddStaffUI object;
    
    public static AddStaffUI getObject() {
        object = new AddStaffUI();
        return object; 
    }
   
    public AddStaffUI(){     
        
     List<Client> clientL = Client.getClients(); 
      if(clientL.size() != 0) { 
	for(int i=0; i< clientL.size(); i++) { 
			System.out.println(String.valueOf(clientL.get(i).getClientID()) +" - "+ clientL.get(i).getCompanyName() +  
					" (Campaigns: " + clientL.get(i).getCampaigns().size() + ")"); 
			} 
			 
		} else { 
 			System.out.println("Not Found Any Company at List..!"); 
		} 
		startStaffInterface(); 
	} 
    public void startStaffInterface(){
      
       /* System.out.println("Lütfen staff secin:");
        Scanner input=new Scanner(System.in);
        int staff_no = input.nextInt();
        selectStaff(staff_no);
        Campaign campaign=createNewCampaign();
        for(int i=0;i< Client.clientL.size();i++){
            if(staff_no == Client.clientL.get(i).getClientID()){
                Client.clientL.get(i).addNewCampaign(campaign);
                System.out.println("basarılııı");
             
            }
       
            public void selectStaff(int staff_no){
           AddStaff.getObject().assignStaff(staff_no);
    
    }*/
    }
        
    
    }
    

