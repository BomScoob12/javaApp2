package int101.puzzling;

import java.util.Random;

public class Randor {
    private int low;
    private int high;
    public Randor(int low, int high){
        this.low = low;
        this.high = high;
    }
    public int getValue(){
        Random random = new Random();
        //        output random in range low,high
        return random.nextInt(high-low)+low;
    }
}
