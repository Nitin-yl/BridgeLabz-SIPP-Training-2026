package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Sorting_Algorithms;

import java.util.Scanner;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] employeeIDs = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIDs[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i];
            int j = i - 1;

            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }

            employeeIDs[j + 1] = key;
        }

        System.out.println("Employee IDs in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(employeeIDs[i] + " ");
        }

    }
}