package Lesson1_HomeWork.Employees;

import java.util.ArrayList;
import java.util.List;

public class Security extends Employee {
    private String areaOfGuarding;

    public Security(String department, String name, int id, int reputation, String areaOfGuarding) {
        super(department, name, id, reputation);
        this.areaOfGuarding = areaOfGuarding;
    }

    public static List<Employee> guards = new ArrayList<>();

    public static List<Employee> getGuards() {
        return guards;
    }

    @Override
    public void dailyRoutine() {

        System.out.println(super.getDepartment() + " " + super.getName() + " is guarding the area " + areaOfGuarding);
    }

    public static void fillList() {
        guards.add(new Security("Security officer", "Hanna", 1, 43, "Offices"));
        guards.add(new Security("Security worker", "Will", 2, 51, "Dealership hall"));


    }
}