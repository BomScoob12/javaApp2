package test;

import method.Fruit;
import method.FruitCollection;

public class MainTest {
    public static void main(String[] args) {
//        testToString();
//        testArrayCount();
        testFruitAndArray();
    }
    private static void testToString(){
        Fruit f = new Fruit("Mango", 12.5, 5);
        System.out.println(f);
    }
    private static void testArrayCount(){
        FruitCollection t = new FruitCollection(4);
        System.out.println(t.getCount());
        t.addFruit("mango", 10, 4);
        t.addFruit("jkjk", 10, 1);
        t.addFruit("jkjk", 10, 1);
        t.addFruit("jkjk", 10, 1);
        System.out.println(t.getCount()+ "....");
        System.out.println(t.isFull());
    }
    private static void testFruitAndArray(){
//        Fruit a = new Fruit("Apple", 150.9, 5);
//        Fruit b = new Fruit("Banana", 48.52, 6);
//        System.out.println(a);
//        System.out.println(a.equals(b)+ "Equals");
//        System.out.println(a.compareTo(b));
        FruitCollection fc = new FruitCollection(2);
        fc.addFruit("Cherry", 85.179, 8);
        fc.addFruit("Date", 94.62, 9);
        fc.expand(1);
        fc.addFruit("Kiwi", 64.93, 7);
        int s = fc.searchForFruitName("Kiwi");
        if (s>=0) {
            System.out.println(fc.getFruitAt(s));
        }
    }
}
