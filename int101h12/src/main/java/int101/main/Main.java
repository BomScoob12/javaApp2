package int101.main;
import int101.dummy.Dummy;

import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
//        testRandom1();
        testArray();
    }
    private static void testRandom1(){
        int i = 0;
        while (i <= 200){
            System.out.println(Dummy.rand1());
            i++;
        }
    }

    private static void testArray(){
//        int count[], k ; it means count[] and int k
//        int [] count, k; it means count[] and k[]
        final int LOOP = 1_000;
        final int index = 10;
        int [] count = new int[10];
        for (int i = 0 ; i < LOOP; i++){
            int nub = Dummy.rand1();
            count[nub]++; //it means count[index = nub] let's + 1 and keep value in array;
        }
        for (int i = 0; i< index ; i++) {
            System.out.printf("%d : %d %n", i, count[i]);
        }
    }
}

