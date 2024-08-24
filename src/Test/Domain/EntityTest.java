package Domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {
    Entity e;

    @BeforeEach
    void set_up() {
        e = new Entity(1);
    }

    @Test
    void get_id() {
        assertEquals(1, e.get_id());
    }

    @Test
    void set_id() {
        e.set_id(2);
        assertEquals(2, e.get_id());
    }
}