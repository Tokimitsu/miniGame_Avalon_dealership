package Lesson1_HomeWork.Employees;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private String access;
    public static List<Employee> managers = new ArrayList<>();

    public static List<Employee> getManagers() {
        return managers;
    }

    public Manager(String department, String name, int id, int reputation, String access) {
        super(department, name, id, reputation);
        this.access = access;
    }
    @Override
    public void dailyRoutine() {

        System.out.println(super.getDepartment() + " " + super.getName() + " is managing the process with the access : " + access );
    }

    public static void fillList() {
        managers.add(new Manager("Sales", "John", 1, 13, "sales"));
        managers.add(new Manager("BookKeeping", "James", 2, 34, "wholeStack"));
    }
}


