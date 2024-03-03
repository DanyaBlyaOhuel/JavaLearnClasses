package repository;

import entity.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class DirectoryPersonRepository implements Repository<Person> {

    File dir;

    public DirectoryPersonRepository(File dir) {
        if (!dir.isDirectory()) {
            if (!dir.exists()) {
                dir.mkdirs();
            } else {
                throw new IllegalArgumentException();
            }

        }
        this.dir = dir;

    }

    @Override
    public void save(Person person) throws FileNotFoundException {
        File file = new File(String.valueOf(String.valueOf(this.dir) + "/" + String.valueOf(person.id) + ".txt"));

        Person.saveTo(file, person);

    }
/*
    @Override
    public Person load(int id) throws IOException {
        File file = new File(String.valueOf(String.valueOf(this.dir) + "/" + String.valueOf(id) + ".txt"));

        return Person.loadFrom(file);
    }*/

    @Override
    public List<Person> load(List<Integer> ids) throws IOException {
        List<Person> result = null;
        for (int id : ids) {
            File file = new File(String.valueOf(String.valueOf(this.dir) + "/" + String.valueOf(id) + ".txt"));
            result.add(Person.loadFrom(file));
        }

        return result;
    }
}
