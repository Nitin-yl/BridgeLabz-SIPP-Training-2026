package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level2_practice_question;

import java.util.Scanner;

public class FactorsOperations {
    public static int[] findFactors(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }

        return sum;
    }

    public static long findProduct(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }

        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;

        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        System.out.println("\nSum of Factors = " + findSum(factors));
        System.out.println("Product of Factors = " + findProduct(factors));
        System.out.println("Sum of Squares of Factors = " + findSumOfSquares(factors));

        sc.close();
    }
}
