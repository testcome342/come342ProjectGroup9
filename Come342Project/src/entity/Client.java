
package entity;

import entity.Campaign;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

   
        private int clientID;
        private String Email;
	private String CompanyName;
	private String CompanyAddress;
	private String ContactName;
        public static List<Campaign> campaigns=new  ArrayList<Campaign>();
        public static List <Client>clientL=new ArrayList<Client>();
        /*public static void dondur(){
            Client c1=new Client(1,"afra@gmail","argela","istanbul","afrakose");
            Campaign cmg=new Campaign("argela_indirim","23.04.2018","2.05.2018","1000");
            c1.addNewCampaign(cmg);
            clientL.add(c1);
        }*/
        public Client(){
        
        }
	public Client(int clientID,String Email, String companyName, String companyAddress, String contactName){
            this.clientID=clientID;
            this.Email = Email;
	    this.CompanyName = companyName;     
	    this.CompanyAddress = companyAddress;
	    this.ContactName = contactName;
            //this.campaigns = new ArrayList<Campaign>();
	     
	}
        public void setClientID(int clientID) {
            this.clientID = clientID;
	}
        public void setEmail(String Email) {
            this.Email = Email;
	}
	public void setCompanyName(String CompanyName) {
            this.CompanyName = CompanyName;
	}
	public void setCompanyAddress(String CompanyAddress) {
            this.CompanyAddress = CompanyAddress;
	}
	public void setContactName(String ContactName) {
            this.ContactName = ContactName;
	}
        public int getClientID() {
            return clientID;
	}
        public String getEmail() {
            return Email;
	}
	public String getCompanyName() {
            return CompanyName;
	}
	public String getCompanyAddress() {
            return CompanyAddress;
	}
	public String getContactName() {
            return ContactName;
	}
       /*public void CreateNewClient() {
	 
        Scanner input =new Scanner(System.in);
        Client c1=new Client(); 
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
       
        
    }*/
        public static List<Client> getClients() 
 	{ 
            Client c1=new Client(1,"afra@gmail","argela","istanbul","afrakose");
            Campaign cmg=new Campaign("argela_indirim","23.04.2018","2.05.2018","1000");            
            c1.addNewCampaign(cmg);
            clientL.add(c1);
            campaigns.add(cmg);
            Client c2=new Client(2,"basak@gmail","argela2","istanbul","basakturan");
            Campaign cmg1=new Campaign("argela_indirim2","23.04.2018","2.05.2018","1000");
            c2.addNewCampaign(cmg1);
            clientL.add(c2);
            campaigns.add(cmg1);
              List<Client> clientL = Client.clientL; 
		if(Client.clientL.size() != 0) { 
 			for(int i=0; i< clientL.size(); i++) { 
 				System.out.println((clientL.get(i).getClientID()) +")"+ clientL.get(i).getContactName() ); 
			} 
 		} 
                else { 
 			System.out.println("Not Found!"); 
 		} 
 		 
                return clientL;
	}        

       public static int createClient(Client client) {
       
           Client.clientL.add(client);
           return client.getClientID();
       
       }
       
       public void addNewCampaign(Campaign campaign) 
	{ 
		this.campaigns.add(campaign); 
 	} 
 	 
	public List<Campaign> getCampaigns() 
	{ 
		return campaigns; 
	} 
	 
 	public void setCampaigns(List<Campaign> campaigns) 
 	{ 
		this.campaigns=campaigns; 
 	} 

    
     
    
	
}
