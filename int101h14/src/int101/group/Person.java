package int101.group;

public class Person {

    private static int nextId;
    private final int id;
    private final String name;

    public Person(String name) {
        this.id = nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }
}
