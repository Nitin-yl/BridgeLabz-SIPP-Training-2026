package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level2_practice_question;

import java.util.Scanner;

public class PowerUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        long result = 1;
        int counter = 0;

        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println(number + " raised to the power " + power + " = " + result);

        sc.close();
    }
}
