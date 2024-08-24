package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car c;

    @BeforeEach
    void set_car() {
        c = new Car(1, "BMW", "X3");
    }

    @Test
    void get_brand() {
        assertEquals("BMW", c.get_brand());
    }

    @Test
    void get_model() {
        assertEquals("X3", c.get_model());
    }

    @Test
    void set_brand() {
        c.set_brand("Audi");
        assertEquals("Audi", c.get_brand());
    }

    @Test
    void set_model() {
        c.set_model("X5");
        assertEquals("X5", c.get_model());
    }
}