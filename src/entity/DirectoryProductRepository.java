package entity;

import repository.Repository;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class DirectoryProductRepository implements Repository<Product> {

    File dir;

    public DirectoryProductRepository(File dir) {
        this.dir = dir;

    }

    public static Product loadFrom(File file) throws IOException {
        try (FileInputStream stream = new FileInputStream(file)) {
            try (Scanner scanner = new Scanner(file)) {

                Product productResult = new Product(Integer.parseInt(scanner.nextLine()),
                        scanner.nextLine(),
                        (int) Double.parseDouble(scanner.nextLine())
                );

                scanner.close();

                return productResult;
            }
        }
    }

    @Override
    public void save(Product obj) throws FileNotFoundException {


        try (FileOutputStream stream = new FileOutputStream(this.dir)) {
            try (PrintWriter writer = new PrintWriter(stream)) {
                writer.println(Integer.toString(obj.id));
                writer.println(obj.name);
                writer.println(Double.toString(obj.price));

                //writer.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Product> load(List<Integer> ids) throws IOException {
        List<Product> result = null;

        for (int id : ids) {
            File file = new File(String.valueOf(String.valueOf(this.dir) + "/" + String.valueOf(id) + ".txt"));
            result.add(loadFrom(file));
        }


        return result;
    }
}
