
package entity;

import static entity.Client.campaigns;
import static entity.StaffMember.staffL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Campaign {
    String title;
    String campaignStartDate;
    String campaignFinishDate;
    String estimatedCost;
     public static List<StaffMember> staffL=new  ArrayList<StaffMember>();

    public Campaign(){}
    public Campaign(String title,String campaignStartDate,String campaignFinishDate,String estimatedCost){
        this.title = title;
        this.campaignStartDate = campaignStartDate;
        this.campaignFinishDate = campaignFinishDate;
        this.estimatedCost = estimatedCost;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCampaignStartDate() {
        return campaignStartDate;
    }
    public void setCampaignStartDate(String campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }
    public String getCampaignFinishDate() {
        return campaignFinishDate;
    }
    public void setCampaignFinishDate(String campaignFinishDate) {
        this.campaignFinishDate = campaignFinishDate;
    }
    public String getEstimatedCost() {
        return estimatedCost;
    }
    public void setEstimatedCost(String estimatedCost) {
        this.estimatedCost = estimatedCost;
    }
   
    public static Campaign createCampaign() {
    
        String title,campaignFinishDate,campaignStartDate,estimatedCost;
        Scanner input =new Scanner(System.in);
        Campaign cmg1=new Campaign();
        System.out.println("title: ");
        title= input.next();
        cmg1.setTitle(title);
        System.out.println("->"+cmg1.getTitle());
        
        System.out.println("campaignFinishDate: ");
        campaignFinishDate= input.next();
        cmg1.setCampaignFinishDate(campaignFinishDate);
        System.out.println("->"+cmg1.getCampaignFinishDate());
        
        System.out.println("campaignStartDate: ");
        campaignStartDate= input.next();
        cmg1.setCampaignStartDate(campaignStartDate);
        System.out.println("->"+cmg1.getCampaignStartDate());
        
        System.out.println("estimatedCost: ");
        estimatedCost= input.next();
        cmg1.setEstimatedCost(estimatedCost);
        System.out.println("->"+cmg1.getEstimatedCost());
        
        
        Campaign campaign = new Campaign(title,campaignFinishDate,campaignStartDate,estimatedCost);
        return campaign;
    }
    
    public static void getCampaign(){
       for(int i=0;i<Client.campaigns.size();i++) { 
			if(i<=Client.campaigns.size()) { 
				System.out.println(Client.campaigns.get(i).getTitle()); 
			}else if(i>Client.campaigns.size()) 
		{ 
				break; 
 			} 
		} 

    }
      public void assignStaff(StaffMember staffMember) 
	{ 
            this.staffL.add(staffMember);
 	} 
 	 
	public List<StaffMember> getStaffDetails() 
	{ 
		return staffL; 
	} 
	 
 	public void setStaff(List<StaffMember> staffMembers) 
 	{ 
		this.staffL=staffMembers; 
 	} 

}
