package factory;

public abstract class SimpleEntityFactory<T> implements EntityFactory<T> {

    private int nextId;

    protected int getNextId() {
        int result = 0;
        if (nextId == 0) {
            result = 1;
        } else {
            result = nextId;
        }

        nextId += 1;

        return result;
    }
}
