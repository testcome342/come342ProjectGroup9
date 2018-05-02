
package boundary;
import control.AddNewClient;
import entity.Campaign;
import entity.Client;
import java.util.Scanner;
import java.util.ArrayList;


public class AddNewClientUI {
    private static AddNewClientUI object;
    public static AddNewClientUI getObject() {		 
 		object = new AddNewClientUI(); 
		return object; 
 	} 

    public AddNewClientUI(){
    
        Client.getClients();
       
        startClientInterface();
    
    }
    public void startClientInterface(){
        System.out.println("Start interface..");
        Scanner input =new Scanner(System.in);
        Client c1=new Client();
        System.out.println("ID: ");
        int clientId;
        clientId = input.nextInt();
        c1.setClientID(clientId);
        System.out.println("->"+c1.getClientID());
        
        System.out.println("Maili: ");
        String email;
        email=input.next();
        c1.setEmail(email);
        System.out.println("->"+c1.getEmail());
        
        System.out.println("Company Name: ");
        String companyName;
        companyName=input.next();
        c1.setCompanyName(companyName);
        System.out.println("->"+c1.getCompanyName());
        
        System.out.println("Company Address: ");
        String address;
        address=input.next();
        c1.setCompanyAddress(address);
        System.out.println("->"+c1.getCompanyAddress());
        
        System.out.println("ContactName: ");
        String contactName;
        contactName=input.next();
        c1.setContactName(contactName);
        System.out.println("->"+c1.getContactName());
       
        Client NewClient;
        NewClient = new Client(clientId, email, companyName, address, contactName);
        
        int client_Id = createNewClient(NewClient);
        if(client_Id>0){
        
            System.out.println("Eklendi!!");
            System.out.println("Kampanya ekleyiin!!");   
                    for(int i=0;i<Client.clientL.size();i++){
                    
                        if(client_Id==Client.clientL.get(i).getClientID()){
                            Client.clientL.get(i).addNewCampaign(createNewCampaign());
                            System.out.println("musteri: "+ Client.clientL.get(i).getContactName());
                                    
                        }
                 
                    }
  
        }
    }
	 
    
    public int createNewClient(Client client) {	 
 		AddNewClient a=new AddNewClient();
                int client_Id =a.createNewClient(client);
	 
 		return client_Id; 
	} 

    public Campaign createNewCampaign() {
        return AddNewClient.getObject().createNewCampaign();
   
    }
}
