package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level1_practice_question;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        int sum = findSum(n);

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}
