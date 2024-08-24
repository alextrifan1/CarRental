package Service;

import Domain.Rental;
import Repository.AbstractRepository;

import java.util.Collection;
import java.util.List;

public class RentalService extends Service<Rental> {

    public RentalService(AbstractRepository<Rental> repository) {
        this.repository = repository;
    }
    @Override
    public void add(Rental o) {
        repository.add(o);
    }

    @Override
    public void remove(Rental o) {
        repository.remove(o.get_id());
    }

    @Override
    public void update(Rental o) {
        repository.update(o);
    }

    @Override
    public Rental get_by_id(int id) {
        return repository.find(id);
    }

    @Override
    public Collection<Rental> get_all() {
        return repository.get_all();
    }
}
