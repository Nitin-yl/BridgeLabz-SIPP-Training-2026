package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Sorting_Algorithms;

import java.util.Scanner;

public class SelectionSortExamScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Exam scores in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }

        sc.close();
    }
}