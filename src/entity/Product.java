package entity;

public class Product implements Comparable<Product> {

    public int id;

    public String name;

    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.id == o.id) {
            return 1;
        }

        return 0;
    }
}
