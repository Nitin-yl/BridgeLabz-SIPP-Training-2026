package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level3_practice_question;

import java.util.Scanner;

public class BMIReport {
    public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    public static void display(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");

        for (String[] strings : result) {
            System.out.println(strings[0] + "\t\t" +
                    strings[1] + "\t\t" +
                    strings[2] + "\t\t" +
                    strings[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " Weight: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Person " + (i + 1) + " Height: ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = calculateBMI(data);
        display(result);

        sc.close();
    }
}
