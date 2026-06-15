package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level2_practice_question;

import java.util.Scanner;

public class NumberChecker {
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nResults:");

        for (int number : numbers) {

            if (isPositive(number)) {

                if (isEven(number)) {
                    System.out.println(number + " is Positive and Even");
                } else {
                    System.out.println(number + " is Positive and Odd");
                }

            } else {
                System.out.println(number + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);

        System.out.println("\nComparison of First and Last Elements:");

        if (result == 1) {
            System.out.println(numbers[0] + " is Greater than " + numbers[4]);
        } else if (result == 0) {
            System.out.println(numbers[0] + " is Equal to " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[4]);
        }

        sc.close();
    }
}
