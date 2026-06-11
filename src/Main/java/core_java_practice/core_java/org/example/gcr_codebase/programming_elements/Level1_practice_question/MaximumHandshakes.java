package Main.java.core_java_practice.core_java.org.example.gcr_codebase.programming_elements.Level1_practice_question;

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}
