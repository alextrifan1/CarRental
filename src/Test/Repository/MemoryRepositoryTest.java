package Repository;

import Domain.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryRepositoryTest {
    private AbstractRepository<Car> repository;
    private Car c1;
    private Car c2;

    @BeforeEach
    void set_r(){
        c1 = new Car(1, "BMW", "X3");
        c2 = new Car(2, "BMW", "X5");
        repository = new MemoryRepository<>();
        repository.add(c1);
        repository.add(c2);
    }

    @Test
    void add() {
        Car c3 = new Car(3, "BMW", "M3");
        repository.add(c3);
        assertEquals(3, repository.data.size());
    }

    @Test
    void remove() {
        repository.remove(2);
        assertEquals(1, repository.data.size());
    }

    @Test
    void update() {
        Car c = new Car(2, "BMW", "M3");
        repository.update(c);
        assertEquals(c, repository.find(2));
    }

    @Test
    void find() {
        assertEquals(c2, repository.find(2));
    }

    @Test
    void get_all() {
        assertEquals(2, repository.get_all().size());
    }
}