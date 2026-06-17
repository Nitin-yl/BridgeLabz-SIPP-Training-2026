package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Recursion.Level1_practice_question;

import java.util.Scanner;

public class Power {
    static int power(int x, int n) {
        if (n == 0)
            return 1;

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(x, n));

        sc.close();
    }
}
