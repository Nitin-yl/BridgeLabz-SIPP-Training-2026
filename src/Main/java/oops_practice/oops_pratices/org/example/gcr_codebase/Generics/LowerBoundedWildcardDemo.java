package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Generics;

import java.util.ArrayList;
import java.util.List;

class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }
}

public class LowerBoundedWildcardDemo {

    public static void addManagers(List<? super Manager> employees) {

        employees.add(new Manager("Nitin"));
        employees.add(new Manager("Rahul"));

        System.out.println("Managers added successfully.");
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        addManagers(employeeList);

        System.out.println("\nEmployee List:");

        for (Object obj : employeeList) {
            System.out.println(obj);
        }
    }
}