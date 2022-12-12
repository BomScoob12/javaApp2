package method;

import java.util.Arrays;

public class FruitCollection {
    private Fruit[] fruits;
    private int count;

    public FruitCollection(int size){
        if (size < 1) size = 1;
        Fruit[] f= new Fruit[size];
        fruits = f;
    }

    public int getCount() {
        return count;
    }

    public boolean checkPriceQuality(double price, int quality){
        return price < 0 || quality < 1 || quality > 10;
    }

    public boolean addFruit(String name, double price, int quality) {
        if (fruits.length <= count || checkPriceQuality(price,quality) ) return false;
        if (fruits.length > count) {
//            array index in range 2 is [0,1] and count = count+1
//            when count is "2" means out of range
            fruits[count++] = new Fruit(name, price, quality);
            return true;
        }
        return false;
    }
    public boolean isFull(){
        return fruits.length == count;
    }

    public Fruit getFruitAt(int slot){
        return fruits[slot];
    }

    public boolean expand(int size){
//        expand size of array
        if (size < 1) return false;
        if (size >= 1){
            Fruit[] fruits1 = new Fruit[count+size];
            for (int i=0 ; i<fruits.length; i++){
            fruits1[i] = fruits[i];
            }
            fruits = fruits1;
            return true;
        }
//        fruits1[] assign new value to fruits[]
//        easy ways.
//        if (size >= 1){
//            fruits = Arrays.copyOf(fruits, (count+size));
//            return true;
//        }else {
//            return false;
//        }
        return false;
    }

    public int searchForFruitName(String name){
        for (int i=0 ; i < fruits.length ; i++ ){
            if (fruits[i].getName().equals(name)) return i;
        }
        return -1;
    }
}
