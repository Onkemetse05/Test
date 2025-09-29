
package runsscored;
import java.util.Scanner;
/**
 *Student name: Oregolele Mangwegape
 *Student number: st10471814
 * Prog6112 test: Question 1
 */
public class RunsScored {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stadium = {"Kingsmead", "St Georges", "Wanderers"};
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB De Villers"};
        int[][] totalRuns = new int[3][3];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("SA CRICKET APPLICATION");
        System.out.println("-------------------------------------------------------------------------");
        for(int i = 0; i < stadium.length; i++){
            for(int j = 0; j < batsmen.length; j++){
                int count;
                
                System.out.print("Enter the number of runs scored by " + batsmen[j] + " at " + stadium[i].toUpperCase() + ": ");
                while(true){
                    if(input.hasNextInt()){
                        count = input.nextInt();
                        if(count > 0){
                            break;
                        }
                        else{
                            System.out.println("number must be greater than zero");
                        }
                    }
                    else{
                        System.out.println("Number must be numeric");
                   }
                }
            totalRuns[i][j] = count;
            }   
        }//Scored report
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("RUNS SCORED REPORT");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        for(int i = 0; i < batsmen.length; i++){
            for(int j = 0; j < stadium.length; j++){
                System.out.println(batsmen[0] + " runs scored at " + stadium[j].toUpperCase());
                System.out.println();
                System.out.println(batsmen[1] + " runs scored at " + stadium[j].toUpperCase());
                System.out.println();
                System.out.println(batsmen[2] + " runs scored at " + stadium[j].toUpperCase());
                System.out.println();
            }
            
        }
        System.out.println("-------------------------------------------------------------------------");
        //total runs report
        System.out.println("TOTAL RUNS AT STADIUM");
        System.out.println("-------------------------------------------------------------------------");
        
        int[] totals = new int[3];
        int max = 0;
        for(int i = 0; i < stadium.length; i++){
            totals[i] = totalRuns[i][0] + totalRuns[i][1] + totalRuns[i][2];
            System.out.printf("%-20s %-15d\n", stadium[i].toUpperCase(), totals[i]);
            if(totals[i] > totals[max]){
                max = i;
            }
        }
        System.out.println("Stadium with the miost runs: " + stadium[max]);
        input.close();
    }
}
    

