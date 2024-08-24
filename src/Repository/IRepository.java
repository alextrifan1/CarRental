package Repository;

import Domain.Entity;

import java.util.Collection;

public interface IRepository<T extends Entity> extends Iterable<T> {
    public void add(T o);
    public void update(T o);
    public void remove(int id);
    public T find(int id);
    public Collection<T> get_all();
}
