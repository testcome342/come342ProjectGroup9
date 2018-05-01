
package boundary;

import control.AddNewCampaign;
import control.AddNewClient;
import entity.Campaign;
import entity.Client;
import java.util.Scanner;


public class AddNewCampaignUI {
    public static AddNewCampaignUI object;
    
    public static AddNewCampaignUI getObject() {
        object = new AddNewCampaignUI();
        return object;
        
       
    }
    public AddNewCampaignUI(){
        Client.getClients();
        startCampaignInterface();
    }
    public void startCampaignInterface(){
      
        System.out.println("Lütfen client secin:");
        Scanner input=new Scanner(System.in);
        int client_Id = input.nextInt();
        selectClient(client_Id);
        Campaign campaign=createNewCampaign();
        for(int i=0;i< Client.clientL.size();i++){
            if(client_Id == Client.clientL.get(i).getClientID()){
                Client.clientL.get(i).addNewCampaign(campaign);
                System.out.println("basarılııı");
             
            }
       
          
    }
        
       
    }
    public void selectClient(int client_Id){
        AddNewCampaign.getObject().showClientCampaigns(client_Id);
    
    }
    
    public Campaign createNewCampaign() { 
                
	 return AddNewCampaign.getObject().createNewCampaign();
 		 
 	} 

}
