
package runapplication;

import java.util.Scanner;

/**
 * Student name: Oregolele Mangwegape
 * Student number: st10471814
 * Prog6112 test: Question 2
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //constructor
        String batsmanName;
        String stadiumName;
        int totalRunsScored;
        
        //get batsman name
        System.out.print("The cricketer name: " );
        while(true){
             batsmanName = input.nextLine().trim();
            if(batsmanName != null){
                break;
            }
            else{
             System.out.println("Enter a valid name");
            }
        }
        //get stadium name
        System.out.print("Enter the stadium name: ");
        while(true){
            stadiumName = input.nextLine().trim();
            if(stadiumName != null){
                break;
            }
            else{
                System.out.println("Enter a valid stadium name");
            }
        }
        //get runs scored
        System.out.print("Enter the total runs scored by " + batsmanName + " at " + stadiumName + ": ");
        while(true){
            if(input.hasNextInt()){
                totalRunsScored = input.nextInt();
                if(totalRunsScored > 0){
                    break;
                }
                else{
                    System.out.println("Number must be greater than zero.");
                }            
            }
            else{
               System.out.println("Please enter a valid number.");
               input.next(); 
            }
        }
        CricketRunsScored runs = new CricketRunsScored(batsmanName, stadiumName, totalRunsScored);
        //print the report
        runs.printReport();
        
        input.close();
    }
    
}
