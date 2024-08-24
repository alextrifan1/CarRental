package Domain;


public class Car extends Entity {
    private String brand;
    private String model;

    public Car(int id, String br, String mo) {
        super(id);
        this.brand = br;
        this.model = mo;
    }

    public String get_brand() {
        return this.brand;
    }
    public String get_model() {
        return this.model;
    }

    public void set_brand(String br) {
        this.brand = br;
    }

    public void set_model(String mo) {
        this.model = mo;
    }

    @Override
    public String toString() {
        return "Car: " + super.id + ", Brand: " + get_brand() + ", Model: " + get_model();
    }
}
