package Ui;

import Domain.Car;
import Domain.Rental;
import Service.CarService;
import Service.RentalService;

import java.util.Collection;
import java.util.Scanner;

public class Console {
    private CarService carService;
    private RentalService rentalService;
    Scanner scanner = new Scanner(System.in);

    public Console(CarService carService, RentalService rentalService) {
        this.carService = carService;
        this.rentalService = rentalService;
    }

    public void run_menu() {
        while (true) {
            print_menu();
            String option = scanner.nextLine();
            switch (option) {
                case "a": {
                    print_cars();
                    break;
                }
                case "b": {
                    print_rentals();
                    break;
                }
                case "1": {
                    System.out.print("car id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("car brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("car model: ");
                    String model = scanner.nextLine();

                    add_car(id, brand, model);

                    break;
                }
                case "2": {
                    System.out.print("rent id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("car id: ");
                    int car_id = Integer.parseInt(scanner.nextLine());
                    System.out.print("start date: ");
                    String sd = scanner.nextLine();
                    System.out.print("end date: ");
                    String ed = scanner.nextLine();

                    add_rent(car_id, id, sd, ed);

                    break;
                }
                case "x": {
                    return;
                }
                default: {
                    System.out.println("wrong option -> try again");
                }
            }
        }
    }

    private void add_rent(int car_id, int id, String sd, String ed) {
        Car c = carService.get_by_id(car_id);
        Rental rental = new Rental(id, c, sd, ed);
        rentalService.add(rental);
    }

    private void print_rentals() {
        Collection<Rental> rentals = rentalService.get_all();
        for (Rental r : rentals) {
            System.out.println(r);
        }
    }

    private void print_cars() {
        Collection<Car> cars = carService.get_all();
        for (Car c : cars) {
            System.out.println(c);
        }
    }

    private void add_car(int id, String brand, String model) {
        Car c = new Car(id, brand, model);
        carService.add(c);
    }

    private void print_menu() {
        System.out.println("a. print all cars");
        System.out.println("b. print all rents");
        System.out.println("1. add car");
        System.out.println("2. add rent");
        System.out.println("x. good night");
    }
}
