
package runapplication;


public abstract class Cricket implements ICricket {
    String batsmanName;
    String stadiumName;
    int totalRunsScored;
    
    Cricket(String batsmanName, String stadiumName, int totalRunsScored){
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRunsScored = totalRunsScored;
    }
    
    @Override
    public String getBatsman(){
        return batsmanName;
    }
    
    @Override
    public String getStadium(){
        return stadiumName;
    }
    
    @Override
    public int getRunsScored(){
        return totalRunsScored;
    }
    
    public void printReport(){
        
    }
    
    
  
}
