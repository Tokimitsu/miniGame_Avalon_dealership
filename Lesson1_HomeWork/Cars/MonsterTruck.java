package Lesson1_HomeWork.Cars;

import java.util.ArrayList;
import java.util.List;

public class MonsterTruck extends Car {
    private double height;

    public MonsterTruck(String name, double engine, int maxSpeed, String modification, int price, double height, int id) {
        super(name, engine, maxSpeed, modification, price, id);
        this.height = height;
    }


    public static void fillList() {
        monsterCars.add(new MonsterTruck("Agar", 4.4, 350,
                "Grinder", 90000, 2.2, 1));
        monsterCars.add(new MonsterTruck("Ranger", 3.2, 220,
                "Crusher", 78000, 2.4, 2));
        monsterCars.add(new MonsterTruck("Chuck", 3.0, 240,
                "Legendary", 60000, 2.3, 3));
        monsterCars.add(new MonsterTruck("Apolonia", 3.7, 350,
                "Claw", 120000, 2.7, 4));
        monsterCars.add(new MonsterTruck("Lorry", 5.0, 420,
                "Boner", 1290000, 3.0, 5));
        monsterCars.add(new MonsterTruck("Lilliput", 4.2, 350,
                "Squeezer", 90000, 2.5, 6));
    }

    public static List<MonsterTruck> getMonsterCars() {
        return monsterCars;
    }

    public static void showCars() {
        monsterCars.forEach(System.out::println);
    }

    public static List<MonsterTruck> monsterCars = new ArrayList<>();

    @Override
    public void drive() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public int respectGain() {
        return 0;
    }
}
