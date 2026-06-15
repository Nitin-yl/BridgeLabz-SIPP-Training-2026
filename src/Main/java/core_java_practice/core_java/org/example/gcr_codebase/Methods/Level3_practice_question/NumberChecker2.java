package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

import java.util.Scanner;

public class NumberChecker2 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime Number      : " + isPrime(num));
        System.out.println("Neon Number       : " + isNeon(num));
        System.out.println("Spy Number        : " + isSpy(num));
        System.out.println("Automorphic Number: " + isAutomorphic(num));
        System.out.println("Buzz Number       : " + isBuzz(num));

        sc.close();
    }
}
