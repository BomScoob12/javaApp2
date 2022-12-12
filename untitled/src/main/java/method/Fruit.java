package method;

import java.util.Objects;

public class Fruit {
    private String name;
    private double price;
    private int quality;

    public Fruit(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return name + '(' + "price:" + price + " quality:" + quality + ')';
    }

//    public boolean equals(Fruit f) {
//        return this.getName().equals(f.getName()) && this.getPrice() == f.getPrice() && this.getQuality() == f.getQuality();
//    }

    //    @Override
    public boolean equals(Fruit f) {
        if (this == f) return true;
        if (f == null || this.getClass() != f.getClass()) return false;
        Fruit fruit = (Fruit) f;
        return Double.compare(fruit.price, price) == 0 && quality == fruit.quality && Objects.equals(name, fruit.name);
    }

    public int compareTo(Fruit f) {
        if (this.getQuality() > f.getQuality() || f.equals(null)) return 1;
        if (this.getQuality() < f.getQuality()) return -1;
        if (this.getQuality() == f.getQuality()) return 0;
        return 999;
    }

}
