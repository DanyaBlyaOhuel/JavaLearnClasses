package entity;

import java.util.Objects;

public class Person {
    public double id, iNN;

    public String firstName, secondName, lastName, sex, dateOfBirth;

    public Person(double id, String firstName,
                  String secondName,
                  String lastName,
                  String sex,
                  String dateOfBirth) {

        this.id = Objects.requireNonNull(id);
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

}
