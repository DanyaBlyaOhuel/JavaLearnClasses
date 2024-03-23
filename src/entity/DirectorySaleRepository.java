//package entity;
//
//import repository.Repository;
//
//import java.io.*;
//import java.util.List;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class DirectorySaleRepository implements Repository<Sale> {
//    File dir;
//
//    public DirectorySaleRepository(File dir) {
//        this.dir = dir;
//
//    }
//
//    public static Sale loadFrom(File file) throws IOException {
//        try (FileInputStream stream = new FileInputStream(file)) {
//            try (Scanner scanner = new Scanner(file)) {
//
//               Sale productResult = new Sale(Integer.parseInt(scanner.nextLine()));
//
//                        /*
//                        (int) Double.parseDouble(scanner.nextLine()),
//                        scanner.nextLine(),
//                        scanner.nextLine()
//
//
//                );
//
//                scanner.close();*/
//
//                return productResult;
//            }
//        }
//    }
//
//    @Override
//    public void save(Sale obj) throws FileNotFoundException {
//        TreeMap<Product, Double> t1 = new TreeMap<Product, Double>();
//
//
//        try (FileOutputStream stream = new FileOutputStream(this.dir)) {
//            try (PrintWriter writer = new PrintWriter(stream)) {
//                writer.println(Integer.toString(obj.id));
//                writer.println(Double.toString(obj.amount));
//                //writer.println(obj.person);
//                writer.println(obj.person.id);
//                writer.println(obj.person.firstName);
//                writer.println(obj.person.secondName);
//                writer.println(obj.person.lastName);
//                writer.println(obj.person.sex);
//                writer.println(obj.person.dateOfBirth);
//                writer.println(obj.person.iNN);
//                //writer.println(obj.products);
//                while (obj.iterator().hasNext()) {
//                    t1.put(writer.println(obj.person.sex), "Let's");
//                    t1.put(5, "see");
//                    t1.put(2, "TreeMap class");
//                    t1.put(27, "methods");
//                    t1.put(9, "in java.");
//
//                    System.out.println("TreeMap using first constructor is:" + t1);
//                }
//
//
//
//                //writer.close();
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @Override
//    public List<Sale> load(List<Integer> ids) throws IOException {
//        List<Sale> result = null;
//
//        for (int id : ids) {
//            File file = new File(String.valueOf(String.valueOf(this.dir) + "/" + String.valueOf(id) + ".txt"));
//            result.add(loadFrom(file));
//        }
//
//
//        return result;
//    }
//}
