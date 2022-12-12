package int101.test;
import int101.array.Student;

public class MainTest {
    public static void main(String[] args) {
        testArray();
    }
    
    public static void testArray(){
        Student ob1 = new Student("Bob");
        Student ob2 = new Student("a");
        Student ob3 = new Student("b");
        Student ob4 = new Student("c");
        Student ob5 = new Student("d");
        Student ob6 = new Student("e");
        Student ob7 = new Student("f");
        
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
        System.out.println(ob4.toString());
        System.out.println(ob5.toString());
        System.out.println(ob6.toString());
        System.out.println(ob7.toString());
    }
}
