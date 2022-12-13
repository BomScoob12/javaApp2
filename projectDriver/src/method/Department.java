package method;

public class Department {
    private static int code = 400;
    private String title;
    private Person[] staff;
    private static int count;
    private static final int BIRTH = 18;
    
    public Department(String title){
        if (title == null || title.isBlank()) {
            this.title = "Srtisrinan";
        }
        this.title = title;
        code++;
        staff = new Person[10+BIRTH];
    }

    public static int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public static int getCount() {
        return count;
    }
    
    public boolean addStaff(String firstname, String lastname, int type){
        if (isBlank(firstname)) return false;
        if (isBlank(lastname)) return false;
        Person p = new Person(firstname,lastname,type);
        staff[count++] = p;
        return true;
    }
    
    private boolean isBlank(String name){
        return name.isBlank() || name ==null;
    }
    
    public int getTypeCount(int type){
        int result = 0;
        for (int i = 0; i < count; i++) {
            if (type == staff[i].getType()) {
                result++;
            }
        }
        return result;
    }
    
    public int[] getAllCodes(){
        int[] allCode = new int[count];
        for (int i = 0; i < count; i++) {
            allCode[i] = staff[i].getCode();
        }
        return allCode;
    }
    
    public Person getStaff(int code){
        for (int i = 0; i < count; i++) {
            if (staff[i].getCode() == code) {
                return staff[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("[Department: %d (%s) %d]",code,title,count);
    }
    
    public int[] getAllType(){
        int[] allType = new int[count];
        int typeCount = 0;
        for (int i = 0; i < count; i++) {
            if (isUnique(allType, staff[i].getType())) {
                allType[typeCount++] = staff[i].getType();
            }
        }
        int[] result = new int[typeCount];
        System.arraycopy(allType,0,result,0, typeCount);
        return result;
    }
    
    private boolean isUnique(int[] all, int type){
        for (int i = 0; i < count; i++) {
            if (all[i] == type) {
                return false;
            }
        }
        return true;
    }
}
