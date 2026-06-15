package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Methods.Level2_practice_question;

import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        StudentVoteChecker checker = new StudentVoteChecker();

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}
