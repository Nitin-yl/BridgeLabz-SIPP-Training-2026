package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side +
                " whose perimeter is " + perimeter);

        input.close();
    }
}
