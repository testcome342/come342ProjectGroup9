
import boundary.AddNewClientUI;
import boundary.AddNewCampaignUI;
import boundary.AddNewStaffMemberUI;
import boundary.CreateConceptUI;
import entity.Client;
import entity.Campaign;
import java.util.*;

public class Come342Project {


    public static void main(String[] args) {
        
        do{
        System.out.println("1) Add a new client");
        System.out.println("2) Add a new campaign");
        System.out.println("5) Assign staff to work on a campaign");
        System.out.println("8) Create concept note");
        System.out.println("12) Add a new member of staff");
        System.out.print("Enter your choice :");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                AddNewClientUI.getObject();
                
            break;
            case 2:
                AddNewCampaignUI.getObject();
                
            break; 
            case 8:
                CreateConceptUI.getObject();
                
            break;
           case 12:
                AddNewStaffMemberUI.getObject();
                
            break;
        
            default:
                System.out.println("wrong choise !");
            break;
        }
        
    }  while(true); 

        }  
       
}
    

