package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Input_Output.Scenario_Based_Question;

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    int employeeId;
    String name;
    String department;
    double salary;

    public Employee(int employeeId, String name,
                    String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nSalary: " + salary;
    }
}

public class EmployeeSkillAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, department, salary);

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(
                             new FileOutputStream("employee.ser"))) {

            oos.writeObject(emp);
            System.out.println("Employee object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(
                             new FileInputStream("employee.ser"))) {

            Employee recoveredEmployee =
                    (Employee) ois.readObject();

            System.out.println("\nRecovered Employee Information:");
            System.out.println(recoveredEmployee);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization.");
        }

        sc.close();
    }
}