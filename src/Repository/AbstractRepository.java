package Repository;

import Domain.Entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractRepository<T extends Entity> implements IRepository<T> {
    protected List<T> data = new ArrayList<T>();

    @Override
    public Iterator<T> iterator() {
        return new ArrayList<T>(data).iterator();
    }
}
