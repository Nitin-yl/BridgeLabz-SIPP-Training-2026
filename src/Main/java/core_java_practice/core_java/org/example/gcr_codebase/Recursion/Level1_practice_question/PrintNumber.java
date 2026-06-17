package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level1_practice_question;

import java.util.Scanner;

public class PrintNumber {
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printNumbers(N);

        sc.close();
    }
}
