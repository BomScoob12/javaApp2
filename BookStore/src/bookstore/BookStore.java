package bookstore;

public class BookStore {

    private int id;
    private static int latestId;
    private String name;
    private Book[] books;
    private int size;

    public BookStore(String name, int size) {
        this.name = name;
        id = latestId++;
        books = new Book[size];
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addBook(Book newBook) {
        int[] temp = new int[size];
        
    }

    private int randomId(){
        return random(size-1,0);
    }
    private int random(int max, int min){
        return (int) (Math.random() * (max-min) + min);
    }
}
