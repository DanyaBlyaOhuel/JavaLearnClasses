package repository;

import entity.Person;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Repository <T> {

    public void save (T obj) throws FileNotFoundException;

    public List<T> load(List<Integer> ids) throws IOException;


}
