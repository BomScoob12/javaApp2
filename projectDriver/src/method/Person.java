package method;

import java.util.Objects;

public class Person {

    private static int code;
    private String firstname;
    private String lastname;
    private final int type;
    private static int myId = 83;

    public Person(String firstname, String lastname, int type) {
        if (firstname == null || firstname.isBlank()) {
            this.firstname = "Sarawit";
        }
        if (lastname == null || lastname.isBlank()) {
            this.lastname = "Kraukham";
        }
        this.firstname = firstname;
        this.lastname = lastname;
        code = myId++;
        if (type >= 0) {
            this.type = 1;
        } else {
            this.type = type;
        }
    }
    
    public Person(String firstname, String lastname){
        this(firstname, lastname, 1);
    }

    public static int getCode() {
        return code;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public final int getType() {
        return type;
    }

    public void setFirstname(String firstname) {
        if(!firstname.isBlank() || firstname != null) this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        if(!lastname.isBlank() || lastname != null) this.lastname = lastname;
    }

    @Override
    public String toString() {
        return String.format("[Person: %d (%s %s) %d]",code,firstname,lastname,type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstname, other.firstname)) {
            return false;
        }
        return Objects.equals(this.lastname, other.lastname);
    }
    
}
