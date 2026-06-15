package Main.java.core_java_practice.core_java.org.example.gcr_codebase.String.Level2_practice_question;

import java.util.Scanner;

public class VotingEligibility {
    public static int[] getAges(int n, Scanner sc) {
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        int[] ages = getAges(numberOfStudents, sc);

        String[][] result = checkVotingEligibility(ages);

        displayResult(result);

        sc.close();
    }
}
