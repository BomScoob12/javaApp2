package int101.array;

public class Student {

    private static boolean[] allId;
    private int id;
    private String name;

    public Student(String name) {
        boolean[] allId = new boolean[10];
        this.name = name;
        int idTest;
        for (int i = 0; i==i ; i++) {
            idTest = (int)(Math.random() * 10);
            if (allId[i] == false) {
                id = idTest;
                allId[i] = true;
                break;
            }

        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

}
