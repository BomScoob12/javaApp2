package projectDriver;

import method.Department;
import method.Person;
import java.util.Arrays;

public class ProjectDriver {

    public static void main(String[] args) {
        testDepartment();
//        testPerson();
    }

    private static void testDepartment() {
        Department bangmod = new Department("Mod");
        bangmod.addStaff("", "", -1);
        bangmod.addStaff("GoG", "Faf", -3);
        bangmod.addStaff("GsdoG", "Fasf", -8);
        bangmod.addStaff("fusf", "eaqe", -2);
        bangmod.addStaff("fuf", "eae", -9);
        System.out.println("De1" + bangmod.toString());
        System.out.println("De1Count" + Arrays.toString(bangmod.getAllCodes()));
        System.out.println("De1Getstaff" + bangmod.getStaff(83));
        System.out.println("TypeCount " + bangmod.getTypeCount(-9));
        System.out.println("All" + Arrays.toString(bangmod.getAllType()));
        Department bangmod2 = new Department("");
    }

    private static void testPerson() {
        Person ob1 = new Person("", "", -1);
        Person ob2 = new Person("GoG", "Faf", -2);
        Person ob3 = new Person("fuf", "eae", -4);

        System.out.println("1 " + ob1.toString());
        System.out.println("2 " + ob2.toString());
        System.out.println("3 " + ob3.toString());
    }
}
