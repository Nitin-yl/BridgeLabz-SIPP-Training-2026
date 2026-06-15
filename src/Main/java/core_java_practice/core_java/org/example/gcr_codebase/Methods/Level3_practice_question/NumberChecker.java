package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

import java.util.Scanner;

public class NumberChecker {
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

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, power);
        }

        return sum == num;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit = " + smallest);
        System.out.println("Second Smallest Digit = " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("Number of Digits = " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Duck Number = " + isDuckNumber(digits));
        System.out.println("Armstrong Number = " + isArmstrong(num, digits));

        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);

        sc.close();
    }
}
