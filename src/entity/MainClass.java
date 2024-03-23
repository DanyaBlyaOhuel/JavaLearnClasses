package entity;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

public class MainClass {

    public static void main(String[] args) throws IOException {

        //
        File file = new File("src/entity/54323.txt");
        Person person = Person.loadFrom(file);

        TreeMap<Product, Double> products = new TreeMap<>();

        Product product1 = new Product(1, "mleko", 66.6);
        Product product2 = new Product(2, "rakija", 1313);
        Product product3 = new Product(3, "kinder delice", 56.7);
        Product product4 = new Product(4, "burek sa mesom", 228);
        Product product5 = new Product(5, "pljeskavoz", 1312);

        products.put(product1, 3d);
        products.put(product2, 1d);
        products.put(product3, 2d);
        products.put(product4, 2d);
        products.put(product5, 4d);

        Sale sale = new Sale(123, 1, person, products);
        System.out.println(sale);
        products.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println(products.size());
        System.out.println(product1);
        System.out.println(product5);


        // Using entrySet()
        System.out.println("Key/Value mappings: " + products.entrySet());

        // Using keySet()
        System.out.println("Keys: " + products.keySet());

        // Using values()
        System.out.println("Values: " + products.values());


    }


}
