package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level1_practice_question;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled: Invalid index accessed.");
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
