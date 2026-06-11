package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level2_practice_question;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient +
                " and Reminder is " + remainder +
                " of two number " + number1 +
                " and " + number2);

        input.close();
    }
}
