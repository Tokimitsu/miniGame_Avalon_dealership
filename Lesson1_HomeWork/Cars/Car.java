package Lesson1_HomeWork.Cars;

public abstract class Car {
    private String name;
    private double engine;
    private int maxSpeed;
    private String modification;
    private int price;
    private int id;


    public int getId() {
        return id;
    }

    public Car(String name, double engine, int maxSpeed, String modification, int price, int id) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.modification = modification;
        this.price = price;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public double getEngine() {
        return engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModification() {
        return modification;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                ", modification='" + modification + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public abstract void drive();

    public abstract boolean isAvailable();

    public abstract int respectGain();

}
