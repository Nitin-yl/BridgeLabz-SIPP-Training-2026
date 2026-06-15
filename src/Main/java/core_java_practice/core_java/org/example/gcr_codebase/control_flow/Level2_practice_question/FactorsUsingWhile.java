package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level2_practice_question;

import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            int counter = number - 1;

            System.out.println("Factors of " + number + " are:");

            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        sc.close();
    }
}
