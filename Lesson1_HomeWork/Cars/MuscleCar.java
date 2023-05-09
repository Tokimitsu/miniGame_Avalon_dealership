package Lesson1_HomeWork.Cars;

import java.util.ArrayList;
import java.util.List;

public class MuscleCar extends Car {

    private String vinyl;


    public MuscleCar(String name, double engine, int maxSpeed, String modification, int price, String vinyl, int id) {
        super(name, engine, maxSpeed, modification, price, id);
        this.vinyl = vinyl;
    }

    @Override
    public void drive() {
        System.out.println("You are driving like a Muscle!");
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public int respectGain() {
        return 100;
    }

    public static List<MuscleCar> getMuscleCars() {
        return muscleCars;
    }

    public static void fillList() {
        muscleCars.add(new MuscleCar("Dodge", 4.4, 350,
                "Heavy", 90000, "Bones", 1));
        muscleCars.add(new MuscleCar("Ford", 3.2, 220,
                "Push", 78000, "Blood", 2));
        muscleCars.add(new MuscleCar("Mustang", 3.0, 240,
                "GT", 60000, "Engine", 3));
        muscleCars.add(new MuscleCar("GMC", 3.7, 350,
                "Anger", 120000, "Skeleton", 4));
        muscleCars.add(new MuscleCar("Chevrolet", 5.0, 420,
                "Ultra", 1290000, "Claws", 5));
        muscleCars.add(new MuscleCar("Pontiac", 4.2, 350,
                "Mega", 90000, "Vampire", 6));
    }


    public static void showCars() {
        muscleCars.forEach(System.out::println);
    }

    public static List<MuscleCar> muscleCars = new ArrayList<>();

}
