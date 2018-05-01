package control;
import entity.Campaign;
import entity.Client;



public class AddNewClient {
    public static AddNewClient object=new AddNewClient();
    
    public static AddNewClient getObject() {
        return object;
       
    }
      
    public AddNewClient(){
   
    
    }
    public Campaign createNewCampaign() { 
		 
		return Campaign.createCampaign(); 	
    } 
    
    public int createNewClient(Client client) { 
 		return Client.createClient(client); 
 	} 

   

}
  

