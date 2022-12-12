package method;

import java.util.Random;

public class Randor {
    private int low;
    private int high;
    
    public Randor(int low, int high){
        this.low = low;
        this.high = high;
    }
    
    public int getValue(){
        Random r = new Random();
        int x = r.nextInt(high-low)+low;
        return x;
    }
    
    
}
