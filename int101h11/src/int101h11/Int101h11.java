/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package int101h11;

import method.BollRandor;
import method.Randor;

public class Int101h11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Randor ob1 = new Randor(1,10);
        int result = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        final int index =100_000;
        for (int i = 0; i < index; i++) {
            int x = ob1.getValue();
            result += x;
            if (min > x) min = x;
            if (max < x) max = x;
//             System.out.println("result" + result);
        }
        System.out.println("Result "+result);
        System.out.println(result/index + "is mean");
        System.out.println("Max value "+ max);
        System.out.println("Min value "+ min);
        
        BollRandor r = new BollRandor(0.5);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.getValue());
        }
    }   
    
}
