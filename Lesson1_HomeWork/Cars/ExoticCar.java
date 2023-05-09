package Lesson1_HomeWork.Cars;

import java.util.ArrayList;
import java.util.List;

public class ExoticCar extends Car {
    private String originCountry;

    public static List<ExoticCar> getExoticCars() {
        return exoticCars;
    }

    public ExoticCar(String name, double engine, int maxSpeed, String modification, int price, String originCountry, int id) {
        super(name, engine, maxSpeed, modification, price, id);
        this.originCountry = originCountry;
    }

    @Override
    public void drive() {
        System.out.println("You are driving Exotic");
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public int respectGain() {
        return 250;
    }


    public static void fillList() {
        exoticCars.add(new ExoticCar("Lamborghini", 4.4, 350,
                "Elite", 90000, "Italy", 1));
        exoticCars.add(new ExoticCar("Lotus", 3.2, 220,
                "Sport", 78000, "United Kingdom", 2));
        exoticCars.add(new ExoticCar("Porsche", 3.0, 240,
                "Legendary", 60000, "Germany", 3));
        exoticCars.add(new ExoticCar("Ferrari", 3.7, 350,
                "Elite", 120000, "Italy", 4));
        exoticCars.add(new ExoticCar("Koenigsegg", 5.0, 420,
                "Ultra", 1290000, "Sweden", 5));
        exoticCars.add(new ExoticCar("Aston Martin", 4.2, 350,
                "Elite", 90000, "United Kingdom", 6));
    }


    public static void showCars() {
        exoticCars.forEach(System.out::println);
    }

    public static List<ExoticCar> exoticCars = new ArrayList<>();
}
