
package runapplication;
import java.util.*;
/**
 *
 * @author RC_Student_Lab
 */
public class CricketRunsScored extends Cricket {
   Scanner input = new Scanner(System.in); 
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRunsScored) {
        super(batsmanName, stadiumName, totalRunsScored);
    }
    
    @Override
    public void printReport(){
       System.out.println();
       System.out.println("BATSMAN RUNS SCORED REPORT");
       System.out.println("***************************");
       System.out.println("CRICKET PLAYER: " + getBatsman());
       System.out.println("STADIUM: " + getStadium());
       System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
       
    }
}
