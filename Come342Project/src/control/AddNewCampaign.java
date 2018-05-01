
package control;

import entity.Campaign;
import entity.Client;

public class AddNewCampaign {
    public static AddNewCampaign object=new AddNewCampaign();
    
    public static AddNewCampaign getObject() {
        return object;
        
       
    }
    
    public AddNewCampaign(){
    
    }
    
    public Campaign createNewCampaign(){
        return Campaign.createCampaign();
    
    }
    public void showClientCampaigns(int client_Id){
        Client client;
        for(int i=0; i<Client.clientL.size(); i++){
        if(client_Id==Client.clientL.get(i).getClientID()){
        
            client = Client.clientL.get(i);
            if((client.getCampaigns().size()) == 0){
            System.out.println("no campaign");
            }
            else{
            for(int j=client_Id-1; j < client_Id; j++){
              
                System.out.println(String.valueOf(j)+" "+client.getCampaigns().get(j).getTitle());
                
            }
            }
        }
        
        }
        
    }
}
