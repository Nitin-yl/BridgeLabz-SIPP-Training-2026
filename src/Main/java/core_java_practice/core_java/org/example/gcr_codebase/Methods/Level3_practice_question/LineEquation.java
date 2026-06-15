package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

import java.util.Scanner;

public class LineEquation {
    public static double findDistance(double x1, double y1,
                                      double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                        Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {

        double[] result = new double[2];

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        result[0] = slope;
        result[1] = intercept;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance = " + distance);

        if (x1 == x2) {
            System.out.println("Equation of Line: x = " + x1);
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);

            double m = line[0];
            double b = line[1];

            System.out.println("Slope (m) = " + m);
            System.out.println("Y-Intercept (b) = " + b);
            System.out.println("Equation of Line: y = "
                    + m + "x + " + b);
        }

        sc.close();
    }
}
