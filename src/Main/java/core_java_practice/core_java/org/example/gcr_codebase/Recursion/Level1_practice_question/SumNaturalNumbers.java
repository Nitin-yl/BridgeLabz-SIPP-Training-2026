package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level1_practice_question;

import java.util.Scanner;

public class SumNaturalNumbers {
    static int sum(int n) {
        if (n == 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
}
