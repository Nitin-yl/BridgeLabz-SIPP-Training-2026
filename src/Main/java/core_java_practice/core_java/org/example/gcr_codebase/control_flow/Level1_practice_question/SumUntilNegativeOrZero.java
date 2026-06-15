package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level1_practice_question;

import java.util.Scanner;

public class SumUntilNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;
        }

        System.out.println("Total sum = " + total);

        sc.close();
    }

}
