package repository;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public abstract class MemoryRepository<T> implements Repository<T> {

    Map<Integer, T> storage;


    public abstract int getId(T obj);

    @Override
    public void save(T obj) throws FileNotFoundException {
        storage.put(getId(obj), obj);

    }


    public T load(Integer ids) throws IOException {

        return storage.get(ids);
    }

    @Override
    public List<T> load(List<Integer> ids) throws IOException {
        List<T> result = null;
        for (int id : ids) {
            result.add(load(id));
        }

        return result;
    }


}
