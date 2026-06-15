package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Arrays.Level1_practice_question;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        for (int j : age) {
            if (j < 0) {
                System.out.println("Invalid age: " + j);
            } else if (j >= 18) {
                System.out.println("The student with age " + j + " can vote.");
            } else {
                System.out.println("The student with age " + j + " cannot vote.");
            }
        }

        sc.close();
    }
}
