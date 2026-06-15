package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level1_practice_question;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}
