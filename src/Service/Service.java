package Service;

import Domain.Entity;
import Repository.AbstractRepository;
import Repository.MemoryRepository;

import java.util.Collection;

public abstract class Service<T extends Entity> {
    protected AbstractRepository<T> repository;
    public abstract void add(T o);
    public abstract void remove(T o);
    public abstract void update(T o);
    public abstract T get_by_id(int id);
    public abstract Collection<T> get_all();
}
