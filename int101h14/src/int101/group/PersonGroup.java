package int101.group;

public class PersonGroup {

    private Person[] persons;
    private int count;

    public PersonGroup(int size) {
        persons = new Person[size > 1 ? size : 2];
    }

    public PersonGroup() {
        this(2);
    }

    public boolean add(Person p) {
        if (p == null || contain(p)) {
            return false;
        }
        if (count == persons.length) {
            expand();
        }
        persons[count++] = p;
        return true;
    }

    public boolean contain(Person p) {
        if (p == null) {
            return false;
        }
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == p) {
                return true;
            }
        }
        return false;
    }

    public void expand() {
        Person[] newPerson = new Person[persons.length << 1];//mean change from 0001 to 0100
        System.arraycopy(persons, 0, newPerson, 0, count); //array copy
    }
}
