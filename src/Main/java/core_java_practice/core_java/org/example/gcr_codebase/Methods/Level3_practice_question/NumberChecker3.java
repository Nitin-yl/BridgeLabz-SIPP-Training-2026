package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level3_practice_question;

import java.util.Scanner;

public class NumberChecker3 {
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

        public static int[] reverseArray(int[] arr) {
            int[] reverse = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                reverse[i] = arr[arr.length - 1 - i];
            }

            return reverse;
        }

        public static boolean areArraysEqual(int[] arr1, int[] arr2) {
            if (arr1.length != arr2.length) {
                return false;
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }

            return true;
        }

        public static boolean isPalindrome(int[] digits) {
            int[] reverse = reverseArray(digits);
            return areArraysEqual(digits, reverse);
        }

        public static boolean isDuckNumber(int[] digits) {
            for (int digit : digits) {
                if (digit == 0) {
                    return true;
                }
            }
            return false;
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

            int[] reverse = reverseArray(digits);

            System.out.print("Reversed Array: ");
            for (int digit : reverse) {
                System.out.print(digit + " ");
            }
            System.out.println();

            System.out.println("Arrays Equal = " +
                    areArraysEqual(digits, reverse));

            System.out.println("Palindrome Number = " +
                    isPalindrome(digits));

            System.out.println("Duck Number = " +
                    isDuckNumber(digits));

            sc.close();
        }
    }
}
