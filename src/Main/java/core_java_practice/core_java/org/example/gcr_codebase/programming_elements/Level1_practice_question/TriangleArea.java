package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;

        double areaInch2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The area of the triangle in square centimeters is "
                + areaCm2 + " and in square inches is " + areaInch2);

        input.close();
    }
}
