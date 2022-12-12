package method;

public class BollRandor {
    private double d;
    
    public BollRandor(double d){
        this.d = d;
    }
    public boolean getValue(){
        double r = Math.random();
        return r <= d;
    }
}
