package int101.main;

import com.sun.jdi.IntegerValue;
import int101.puzzling.Puzzle;
import int101.puzzling.Randor;

public class Int101h11 {
    public static void main(String[] args) {
//        testPuzzle();
//        testAverage(5);
        testRandor();
    }
    private static void testPuzzle(){
        Puzzle p = new Puzzle();
        Puzzle q = new Puzzle();
        System.out.println("Random p =" + p.getValue());
        System.out.println("Random q =" + q.getValue());
        System.out.println("Random p =" + p.getValue());
    }
    private static void testAverage(int count){
        Puzzle r = new Puzzle();
        int i = 0;
        double avg = 0;

        while (i < count){
            avg += r.getValue();
            i++;
            System.out.println("avg round"+i+" is "+avg);
        }
        System.out.println(avg/count);
    }

    private static void testRandor(){
        int i;
        final int ROUND = 10;
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        int avg=0;
        Randor ob1 = new Randor(10,20);
        for ( i=0 ; i<ROUND ; i++ ){
//            System.out.println(ob1.getValue());
            int r = ob1.getValue();
            avg += r;
            System.out.println(r);
            if (r < MIN){//r less than Max it means r is the new Min
                MIN = r;
            }else if(r > MAX){ //r greater than Max it means r is the new Max
                MAX = r;
            }
        }
        System.out.println(MAX+ " Is max value");
        System.out.println(MIN+ " Is min value");
        System.out.println(avg/ROUND + " average");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");
    }
}
