package entity;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    public double  iNN;
    public int id;

    public String firstName, secondName, lastName, sex, dateOfBirth;

    public Person(int id, String firstName,
                  String secondName,
                  String lastName,
                  String sex,
                  String dateOfBirth,
                  int iNN) {

        this.id = Objects.requireNonNull(id);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.iNN = iNN;
    }


    public static void saveTo(File file, Person person) throws FileNotFoundException {
        try (FileOutputStream stream = new FileOutputStream(file)) {
            try (PrintWriter writer = new PrintWriter(stream)) {
                writer.println(Double.toString(person.id));
                writer.println(person.firstName);
                writer.println(person.secondName);
                writer.println(person.lastName);
                writer.println(person.sex);
                writer.println(person.dateOfBirth);
                writer.println(person.iNN);

                writer.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Person loadFrom(File file) throws IOException {
        try (FileInputStream stream = new FileInputStream(file)) {
            try (Scanner scanner = new Scanner(file)) {

                Person personResult = new Person(Integer.parseInt(scanner.nextLine()),
                        scanner.nextLine(),
                        scanner.nextLine(),
                        scanner.nextLine(),
                        scanner.nextLine(),
                        scanner.nextLine(),
                        (int) Double.parseDouble(scanner.nextLine())
                );

                scanner.close();

                return personResult;
            }
        }
    }

    public static void SmartChoice() throws IOException {

        String choice, directory;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Save or Load?");

            choice = scanner.nextLine();



            if (choice.isEmpty()) {
                return;
            }

            if (choice.equals("Load")) {
                System.out.println("Enter the directory");

                directory = scanner.nextLine();


                if (directory.isEmpty()) {
                    return;
                }

                File file = new File(directory);

                Person person = loadFrom(file);
                System.out.println(person.id);
                System.out.println(person.firstName);
                System.out.println(person.secondName);
                System.out.println(person.lastName);
                System.out.println(person.sex);
                System.out.println(person.dateOfBirth);
                System.out.println(person.iNN);

            }

            if (choice.equals("Save")) {

                System.out.println("Write the id");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Write the firstName");
                String firstName = scanner.nextLine();
                System.out.println("Write the secondName");
                String secondName = scanner.nextLine();
                System.out.println("Write the lastName");
                String lastName = scanner.nextLine();
                System.out.println("Write the sex");
                String sex = scanner.nextLine();
                System.out.println("Write the dateOfBirth");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Write the iNN");
                int iNN = Integer.parseInt(scanner.nextLine());

                Person person = new Person(id,
                        firstName,
                        secondName,
                        lastName,
                        sex,
                        dateOfBirth,
                        iNN
                );

                System.out.println("Enter the directory");

                directory = scanner.nextLine();

                if (directory.isEmpty()) {
                    return;
                }

                File file = new File(directory);
                saveTo(file, person);


            }
        }

    }

}
