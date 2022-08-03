package assistedproject2;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchEmail
{
public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("sarthakagarwal@gmail.com");
        emailID.add("sarthakagarwal1@gmail.com");
        emailID.add("sarthakagarwal2@gmail.com");
        emailID.add("sarthakagarwal3@gmail.com");
        emailID.add("sarthakagarwal4@gmail.com");
        emailID.add("sarthakagarwal5@gmail.com");
        emailID.add("sarthakagarwal6@gmail.com");
        emailID.add("sarthakagarwal7@gmail.com");
        emailID.add("sarthakagarwal8@gmail.com");
        emailID.add("sarthakagarwal9@gmail.com");
        
        String searcElement = "sarthakagarwal8@gmail.com";
        
        for(int i=0; i<emailID.size(); i++) {
            
            System.out.println(emailID.get(i));
            
            if(searcElement==emailID.get(i)) {
                
                System.out.println("\n");
                
                System.out.println("email ID" + searcElement + "found");
                
                break;
                
            }
        }
}       
}