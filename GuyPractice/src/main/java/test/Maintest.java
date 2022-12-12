package test;

import applications.Application;
import applications.Os;

public class Maintest {
    public static void main(String[] args) {
//        testApplication();
        testOs();
    }

    private static void testApplication(){
        Application ob1 = new Application("Bass","NoNoNoNo", 2);
        System.out.println(ob1.getSize());
        System.out.println(ob1.toString());
    }

    private static void testOs(){
        Os gog = new Os("Windows",50);
        Application ob1 = new Application("Bass","NoNoNoNo", 4);
        Application ob2 = new Application("Gog","NoNoNoNo", 8);
        Application ob3 = new Application("Sao","NoNoNoNo", 1);
        Application ob4 = new Application("Oper","NoNoNoNo", 3);
        Application ob5 = new Application("BsD","NoNoNoNo", 10);
        Application ob6 = new Application("Blaaa","NoNoNoNo", 8);
        Application ob7 = new Application("Blaaa","NoNoNoNo", 10);
        gog.addApplication(ob1);
        gog.addApplication(ob2);
        gog.addApplication(ob3);
        gog.addApplication(ob4);
        gog.addApplication(ob5);
        gog.addApplication(ob6);
        gog.addApplication(ob7);
        System.out.println(gog.getStorageSize()+ " Remain");
        System.out.println(gog.getUsedStorage()+ " used");
        System.out.println(gog.toString());
        System.out.println(gog.getApplicationIdByName("Blaaa"));
        System.out.println(gog.getApplicationIdByName("Bass"));

    }

}
