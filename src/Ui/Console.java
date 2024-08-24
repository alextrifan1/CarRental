package Ui;

import Domain.Car;
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
                    Collection<Car> cars = carService.get_all();
                    for (Car c : cars) {
                        System.out.println(c);
                    }
                }
                case "b": {
                    break;
                }
                case "1": {
                    break;
                }
                case "2": {
                    break;
                }
                case "x": {
                    return;
                }
                default: {
                    System.out.println("wrong option/ try again");
                }
            }
        }
    }

    private void print_menu() {
        System.out.println("a. print all cars");
        System.out.println("b. print all rents");
        System.out.println("1. add car");
        System.out.println("2. add rent");
        System.out.println("x. good night");
    }
}
