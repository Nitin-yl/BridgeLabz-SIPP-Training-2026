package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level1_practice_question;

import java.util.Scanner;

public class Handshakes {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of possible handshakes = " + handshakes);

        sc.close();
    }
}
