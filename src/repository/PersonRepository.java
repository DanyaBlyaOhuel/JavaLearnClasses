package repository;

import entity.Person;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface PersonRepository {

    public void save (Person person) throws FileNotFoundException;

    public Person load(int id) throws IOException;


}
