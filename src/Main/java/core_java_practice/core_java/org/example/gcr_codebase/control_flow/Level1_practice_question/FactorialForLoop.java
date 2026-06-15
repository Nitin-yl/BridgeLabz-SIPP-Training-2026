package Main.java.core_java_practice.core_java.org.example.gcr_codebase.control_flow.Level1_practice_question;

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("The number is not a natural number.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " = " + factorial);
        }

        sc.close();
    }
}
