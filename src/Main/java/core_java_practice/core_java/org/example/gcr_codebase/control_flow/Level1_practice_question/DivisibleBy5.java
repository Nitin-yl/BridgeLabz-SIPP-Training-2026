package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level1_practice_question;

import java.util.Scanner;

public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean divisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + divisible);

        sc.close();
    }
}
