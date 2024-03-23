package entity;

import java.util.Iterator;
import java.util.TreeMap;

public class Sale implements Iterable<Product> {

    public int id;

    public double amount;

    public Person person;

    TreeMap<Product, Double> products;

    public Sale(int id, double amount, Person person, TreeMap<Product, Double> products) {
        this.id = id;
        this.amount = amount;
        this.person = person;
        this.products = products;

    }


    @Override
    public Iterator<Product> iterator() {
        return products.keySet().iterator();
    }


}
