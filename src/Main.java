import Domain.Car;
import Domain.Rental;
import Repository.AbstractRepository;
import Repository.IRepository;
import Repository.MemoryRepository;
import Service.CarService;
import Service.RentalService;
import Ui.Console;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car(1, "BMW", "X3");
        Car c2 = new Car(2, "BMW", "X5");
        Car c3 = new Car(3, "BMW", "M3");
        Car c4 = new Car(4, "BMW", "M5");

        AbstractRepository<Car> carRepository = new MemoryRepository<>();
        AbstractRepository<Rental> rentalRepository = new MemoryRepository<>();
        CarService carService = new CarService(carRepository);
        RentalService rentalService = new RentalService(rentalRepository);

        carService.add(c1);
        carService.add(c2);
        carService.add(c3);
        carService.add(c4);

        Console console = new Console(carService, rentalService);
        console.run_menu();
    }
}