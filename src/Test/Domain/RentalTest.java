package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {

    Rental r;
    Car c;

    @BeforeEach
    void set_rental() {
        c = new Car(1, "BMW", "X3");
        r = new Rental(1, c, "01:12:2024", "10:12:2024");
    }

    @Test
    void get_car() {
        assertEquals(c, r.get_car());
    }

    @Test
    void get_start_date() {
        assertEquals("01:12:2024", r.get_start_date());
    }

    @Test
    void get_end_date() {
        assertEquals("10:12:2024", r.get_end_date());
    }

    @Test
    void set_car() {
    }

    @Test
    void set_start_date() {
    }

    @Test
    void set_end_date() {
    }
}