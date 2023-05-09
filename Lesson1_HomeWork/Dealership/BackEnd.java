package Lesson1_HomeWork.Dealership;

import Lesson1_HomeWork.Cars.ExoticCar;
import Lesson1_HomeWork.Cars.Garage;
import Lesson1_HomeWork.Cars.MonsterTruck;
import Lesson1_HomeWork.Cars.MuscleCar;
import Lesson1_HomeWork.Employees.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BackEnd {

    static Scanner sc = new Scanner(System.in);

    public static void startGame() {
        ExoticCar.fillList();
        MuscleCar.fillList();
        MonsterTruck.fillList();
        Manager.fillList();
        Security.fillList();
        Salesman.fillList();
        intro();
    }

    public static void carShowIntro() {
        System.out.println("Hello and welcome to our Dealership!");
        System.out.println("------------------------------------");
        System.out.println("What kind of Cars you want to check out today?");
        System.out.println("------------------------------------");
        everyDayShow();
    }

    public static void everyDayShow() {
        System.out.println("------------------------------------");
        System.out.println("Type '1' for Exotic cars");
        System.out.println("Type '2' for Muscle cars");
        System.out.println("Type '3' for Monster Truck cars");
        System.out.println("------------------------------------");

        System.out.println("Type '0' to return to the beginning");
        int choice = sc.nextInt();

        if (choice == 1) {

            ExoticCar.showCars();
            exoticsection();
        } else if (choice == 2) {
            MuscleCar.showCars();
            muscleSection();
        } else if (choice == 3) {
            MonsterTruck.showCars();
            monsterSection();
        } else if (choice == 0) {
            start();
        } else {
            System.out.println("Choose the correct option please :) Let's try again now...");
            everyDayShow();
        }
    }

    public static void exoticsection() {
        System.out.println("------------------------------------");
        System.out.println("Are you interested in buying something?");
        System.out.println("------------------------------------");
        System.out.println("Or you want to look the other cars?");
        System.out.println("------------------------------------");
        System.out.println("type '1' to byu a car, or '0' to check out other cars");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("type the id number of a car you want to buy");
            int idChoice = sc.nextInt();
            switch (idChoice) {
                case 1 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 1).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(0));
                    ExoticCar.getExoticCars().remove(0);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 2 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 2).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(1));
                    ExoticCar.getExoticCars().remove(1);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 3 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 3).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(2));
                    ExoticCar.getExoticCars().remove(2);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 4 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 4).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(3));
                    ExoticCar.getExoticCars().remove(3);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 5 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 5).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(4));
                    ExoticCar.getExoticCars().remove(4);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 6 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + ExoticCar.getExoticCars().stream()
                            .filter(x -> x.getId() == 6).toList());
                    Garage.getGarage().add(ExoticCar.getExoticCars().get(5));
                    ExoticCar.getExoticCars().remove(5);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
            }
        } else if (choice == 0) {
            everyDayShow();
        } else {
            System.out.println("Choose the correct option please :) Let's try again now...");
            exoticsection();
        }
    }

    public static void muscleSection() {
        System.out.println("------------------------------------");
        System.out.println("Are you interested in buying something?");
        System.out.println("------------------------------------");
        System.out.println("Or you want to look the other cars?");
        System.out.println("------------------------------------");
        System.out.println("type '1' to byu a car, or type '0' to check out other cars");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("type the id number of a car you want to buy");
            int idChoice = sc.nextInt();
            switch (idChoice) {
                case 1 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 1).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(0));
                    MuscleCar.getMuscleCars().remove(0);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }

                }
                case 2 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 2).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(1));
                    MuscleCar.getMuscleCars().remove(1);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 3 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 3).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(2));
                    MuscleCar.getMuscleCars().remove(2);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 4 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 4).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(3));
                    MuscleCar.getMuscleCars().remove(3);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 5 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 5).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(4));
                    MuscleCar.getMuscleCars().remove(4);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 6 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MuscleCar.getMuscleCars().stream()
                            .filter(x -> x.getId() == 6).toList());
                    Garage.getGarage().add(MuscleCar.getMuscleCars().get(5));
                    MuscleCar.getMuscleCars().remove(5);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
            }
        } else if (choice == 0){
            everyDayShow();
        }

        else {
            System.out.println("Choose the correct option please :) Let's try again now...");
            muscleSection();
        }
    }

    public static void monsterSection() {
        System.out.println("------------------------------------");
        System.out.println("Are you interested in buying something?");
        System.out.println("------------------------------------");
        System.out.println("Or you want to look the other cars?");
        System.out.println("------------------------------------");
        System.out.println("type '1' to byu a car, or type '0' to check out other cars");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("type the id number of a car you want to buy");
            int idChoice = sc.nextInt();
            switch (idChoice) {
                case 1 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 1).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(0));
                    MonsterTruck.getMonsterCars().remove(0);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 2 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 2).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(1));
                    MonsterTruck.getMonsterCars().remove(1);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 3 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 3).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(2));
                    MonsterTruck.getMonsterCars().remove(2);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 4 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 4).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(3));
                    MonsterTruck.getMonsterCars().remove(3);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 5 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 5).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(4));
                    MonsterTruck.getMonsterCars().remove(4);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
                case 6 -> {
                    System.out.println("Congratulations, you have bought a brand-new " + MonsterTruck.getMonsterCars().stream()
                            .filter(x -> x.getId() == 6).toList());
                    Garage.getGarage().add(MonsterTruck.getMonsterCars().get(5));
                    MonsterTruck.getMonsterCars().remove(5);
                    System.out.println("Want to check your garage? Type 'y' or 'n' ?");
                    System.out.println("------------------------------------");
                    String g = sc.next();
                    if (g.equals("y")) {
                        Garage.getGarage().forEach(System.out::println);
                        everyDayShow();
                    } else {
                        everyDayShow();
                    }
                }
            }
        } else if (choice == 0){
            everyDayShow();
        }else {
            System.out.println("Choose the correct option please :) Let's try again now...");
            monsterSection();
        }
    }


    public static void intro() {
        System.out.println("Hello and welcome to our 'Avalon company' simulation");
        System.out.println("------------------------------------");
        System.out.println("Here you can perform some actions, which are quite limited for now");
        System.out.println("------------------------------------");
        start();
    }


    public static void start() {
        System.out.println("------------------------------------");
        System.out.println("To go to our stuff area, press '1'");
        System.out.println("To go to our car dealership area, press '2'");
        System.out.println("------------------------------------");
        int choice = sc.nextInt();

        if (choice == 1) {
            stuffAreaIntro();
        } else if (choice == 2) {
            carShowIntro();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            start();
        }

    }

    public static void stuffAreaIntro() {
        System.out.println("------------------------------------");
        System.out.println("Welcome to the stuff area. Here you can choose a person to speak with");
        System.out.println("------------------------------------");
        System.out.println("when you will see the list of people, just type the persons id to speak with him/her");
        stuffArea();
    }

    public static void stuffArea() {

        System.out.println("type '1' to continue");
        System.out.println("type '0' to return to the beginning");

        int choice = sc.nextInt();
        if (choice == 0) {
            start();
        } else if (choice == 1) {
            speakWithStuff();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            stuffArea();
        }
    }

    public static void speakWithStuff() {
        System.out.println("You have approached three doors, interesting...");
        System.out.println("------------------------------------");
        System.out.println("You see the signs on the doors... You can just type in the numbers on the door to enter");
        System.out.println("------------------------------------");
        rooms();
    }

    public static void rooms() {
        System.out.println("Room 1 - Managers department");
        System.out.println("Room 2 - Security department");
        System.out.println("Room 3 - Salesman department");
        System.out.println("------------------------------------");
        System.out.println("Type '0' to go back");
        int choice = sc.nextInt();
        if (choice == 1) {
            managersroom();
        } else if (choice == 2) {
            guardsroom();
        } else if (choice == 3) {
            salesroom();
        } else if (choice == 0) {
            start();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            rooms();
        }
    }


    public static void managersroom() {
        System.out.println("You knocked at the door..../n" +
                "- Enter! /n" +
                "Entering the room, you see two wierd looking people playing mini golf right on the floor...");
        Manager.getManagers().forEach(System.out::println);
        System.out.println("To speak with a person, type the id number");
        System.out.println("------------------------------------");
        System.out.println("Type '0' to exit the room");
        int secondChoice = sc.nextInt();

        if (secondChoice == 1) {
            Stories.johnsStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                managersroom();
            }
        } else if (secondChoice == 2) {
            Stories.jamesStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                managersroom();

            }
        } else if (secondChoice == 0) {
            rooms();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            managersroom();
        }
    }

    public static void guardsroom() {
        System.out.println("You knocked at the door..../n" +
                "- Enter! /n" +
                "Entering the room, you see two serious looking people staring at you precisely...");
        Security.getGuards().forEach(System.out::println);
        System.out.println("To speak with a person, type the id number");
        System.out.println("------------------------------------");
        System.out.println("Type '0' to exit the room");
        int choice = sc.nextInt();

        if (choice == 1) {
            Stories.hannasStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                guardsroom();
            }
        } else if (choice == 2) {
            Stories.willsStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                guardsroom();

            }
        } else if (choice == 0) {
            rooms();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            guardsroom();
        }
    }

    public static void salesroom() {
        System.out.println("You knocked at the door..../n" +
                "- Enter! /n" +
                "Entering the room, you see two fancy looking people sitting at the table, sipping coffee...");
        Salesman.getSalesMen().forEach(System.out::println);
        System.out.println("To speak with a person, type the id number");
        System.out.println("------------------------------------");
        System.out.println("Type '0' to exit the room");
        int secondChoice = sc.nextInt();

        if (secondChoice == 1) {
            Stories.alexsStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                salesroom();
            }
        } else if (secondChoice == 2) {
            Stories.georgesStory();
            System.out.println("After you spoke with the person, you can type '0' to return");
            int goBack = sc.nextInt();
            if (goBack == 0) {
                salesroom();

            }
        } else if (secondChoice == 0) {
            rooms();
        } else {
            System.out.println("Please, choose a proper option, now let's start again");
            salesroom();
        }
    }
}







