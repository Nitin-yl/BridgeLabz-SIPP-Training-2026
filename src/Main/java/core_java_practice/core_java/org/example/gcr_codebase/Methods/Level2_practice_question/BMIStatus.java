package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level2_practice_question;

import java.util.Scanner;

public class BMIStatus {
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0;

            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void display(double[][] data, String[] status) {

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    data[i][0], data[i][1], data[i][2], status[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);

        String[] status = getBMIStatus(data);

        display(data, status);

        sc.close();
    }
}
