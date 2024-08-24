package Domain;

//Închiriere (ID, mașina : Mașină, data început, data sfârșit).

public class Rental extends Entity {
    private Car car;
    private String start_date;
    private String end_date;

    public Rental(int id, Car c, String sd, String ed) {
        super(id);
        this.car = c;
        this.start_date = sd;
        this.end_date = ed;
    }

    public Car get_car() {
        return this.car;
    }
    public String get_start_date() {
        return this.start_date;
    }
    public String get_end_date() {
        return this.end_date;
    }

    public void set_car(Car c) {
        this.car = c;
    }
    public void set_start_date(String sd) {
        this.start_date = sd;
    }
    public void set_end_date(String ed) {
        this.end_date = ed;
    }

    @Override
    public String toString() {
        return "Rent : "+ super.get_id() + ", " + car.toString() + ", Period: " + get_start_date() + " -> " + get_end_date();
    }
}
