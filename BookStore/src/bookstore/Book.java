package bookstore;

public class Book {

    private final int id;
    private static int latestId;
    private final String name;
    private final String author;
    private double price;
    

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        id = latestId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookStore{" + "id=" 
                + id + ", name=" + name 
                + ", author=" + author 
                + ", price=" + price + '}';
    }

    boolean isBlank() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
