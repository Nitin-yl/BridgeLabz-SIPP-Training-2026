package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level1_practice_question;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");

        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only");
        }

        sc.close();
    }
}
