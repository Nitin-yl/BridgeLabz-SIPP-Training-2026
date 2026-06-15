package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Arrays.Level2_practice_question;

import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest Friend: " + friends[youngestIndex]
                + " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + friends[tallestIndex]
                + " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
