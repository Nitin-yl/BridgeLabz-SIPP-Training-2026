package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Arrays.Level2_practice_question;

import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3]; // Physics, Chemistry, Maths
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentages[i] = total / 3;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%c%n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentages[i],
                    grades[i]);
        }

        sc.close();
    }
}
