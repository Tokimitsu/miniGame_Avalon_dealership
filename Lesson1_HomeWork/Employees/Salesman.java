package Lesson1_HomeWork.Employees;

import java.util.ArrayList;
import java.util.List;

public class Salesman extends Employee {
    private String responsibility;

    public Salesman(String department, String name, int id, int reputation, String responsibility) {
        super(department, name, id, reputation);
        this.responsibility = responsibility;
    }

    public static List<Employee> salesMen = new ArrayList<>();

    public static List<Employee> getSalesMen() {
        return salesMen;
    }

    @Override
    public void dailyRoutine() {

        System.out.println(super.getDepartment() + " " + super.getName() + " is " + responsibility);
    }

    public static void fillList() {
        salesMen.add(new Salesman("Sales", "Alex", 1, 24, "Selling cars"));
        salesMen.add(new Salesman("Sales", "George", 2, 16, "Cold sales"));

    }


}



