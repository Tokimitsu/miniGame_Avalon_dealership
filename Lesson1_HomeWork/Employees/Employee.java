package Lesson1_HomeWork.Employees;

public class Employee {
    private String department;
    private String name;
    private int id;
    private int reputation;

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + department + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", reputation=" + reputation +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getReputation() {
        return reputation;
    }

    public Employee(String position, String name, int id, int reputation) {
        this.department = position;
        this.name = name;
        this.id = id;
        this.reputation = reputation;
    }

    public void dailyRoutine() {
        System.out.println();
    }
}
