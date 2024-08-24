package Domain;

public class Entity {
    protected int id;

    public Entity(int id) {
        this.id = id;
    }

    public int get_id() {
        return this.id;
    }

    public void set_id(int id) {
        this.id = id;
    }
}
