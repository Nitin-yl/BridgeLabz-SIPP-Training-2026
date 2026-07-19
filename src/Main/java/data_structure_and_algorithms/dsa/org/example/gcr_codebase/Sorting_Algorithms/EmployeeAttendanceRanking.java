package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Sorting_Algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeAttendanceRanking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        System.out.println("Enter Employee IDs:");
        for (int i = 0; i < n; i++) {
            employeeIds[i] = sc.nextInt();
        }

        System.out.println("Enter Attendance Percentages:");
        for (int i = 0; i < n; i++) {
            attendance[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if (attendance[a] != attendance[b]) {
                    return attendance[b] - attendance[a];
                }
                return employeeIds[a] - employeeIds[b];
            }
        });

        System.out.println("Top " + k + " Employee IDs:");
        for (int i = 0; i < k; i++) {
            System.out.print(employeeIds[index[i]] + " ");
        }

        sc.close();
    }
}