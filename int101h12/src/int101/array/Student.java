package int101.array;

import java.util.Random;

public class Student {

    private int id;
    private String name;
    private static boolean[] allIds = new boolean[10];

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
        Random rand = new Random();
        id = rand.nextInt(10);
        while (allIds[id] = false){
        if (isUnique(id)) {
            allIds[id] = true;
        }else{
            id = rand.nextInt(10);
        }
        }

    }

    private boolean isUnique(int id) {
        for (int i = 0; i < 10; i++) {
            if (allIds[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

}
