package Service;

import Domain.Car;
import Repository.AbstractRepository;

import java.util.Collection;

public class CarService extends Service<Car> {

    public CarService(AbstractRepository<Car> repository) {
        this.repository = repository;
    }
    @Override
    public void add(Car o) {
        repository.add(o);
    }

    @Override
    public void remove(Car o) {
        repository.remove(o.get_id());
    }

    @Override
    public void update(Car o) {
        repository.update(o);
    }

    @Override
    public Car get_by_id(int id) {
        return repository.find(id);
    }

    @Override
    public Collection<Car> get_all() {
        return repository.get_all();
    }
}
