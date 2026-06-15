package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

import java.util.Scanner;

public class NumberChecker1 {
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    public static int[] getDigitsArray(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }

        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        int sum = sumOfDigits(digits);

        return num % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("Count of Digits = " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of Digits = " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits = " + sumOfSquares(digits));
        System.out.println("Harshad Number = " + isHarshadNumber(num, digits));

        int[][] frequency = digitFrequency(digits);

        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

        sc.close();
    }
}
