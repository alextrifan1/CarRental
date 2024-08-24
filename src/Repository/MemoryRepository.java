package Repository;

import Domain.Entity;

import java.util.ArrayList;
import java.util.Collection;

public class MemoryRepository<T extends Entity> extends AbstractRepository<T> {

    @Override
    public void add(T o) {
        if (find(o.get_id()) == null)
            this.data.add(o);
    }

    @Override
    public void remove(int id) {
        for (T it : this.data) {
            if (it.get_id() == id) {
                this.data.remove(it);
                break;
            }
        }
    }

    @Override
    public void update(T o) {
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).get_id() == o.get_id()) {
                this.data.set(i, o);
                return;
            }
        }
    }

    @Override
    public T find(int id) {
        for (T it : this.data) {
            if (it.get_id() == id) {
                return it;
            }
        }
        return null;
    }

    @Override
    public Collection<T> get_all() {
        return new ArrayList<>(this.data);
    }

}
