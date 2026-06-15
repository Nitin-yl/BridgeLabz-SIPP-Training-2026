package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level1_practice_question;

import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor) {

        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;

        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(
                    numberOfChocolates, numberOfChildren);

            System.out.println("Each child gets " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates = " + result[1]);
        }

        sc.close();
    }
}
