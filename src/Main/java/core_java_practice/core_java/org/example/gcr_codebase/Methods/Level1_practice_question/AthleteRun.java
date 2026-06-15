package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level1_practice_question;

import java.util.Scanner;

public class AthleteRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (m): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (m): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (m): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("Number of rounds required to complete 5 km run = " + rounds);

        sc.close();
    }
}
