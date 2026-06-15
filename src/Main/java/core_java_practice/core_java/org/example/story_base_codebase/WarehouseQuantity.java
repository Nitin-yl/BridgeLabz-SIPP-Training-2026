package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

import java.util.HashSet;
import java.util.Scanner;

public class WarehouseQuantity {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : stock) {
            if (num > max) max = num;
            if (num < min) min = num;

            total += num;

            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("\nMaximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + total);

        if (duplicates.isEmpty()) {
            System.out.println("No Duplicates Found");
        } else {
            System.out.println("Duplicate Values = " + duplicates);
        }

        System.out.print("\nEnter k for rotation: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.print("Rotated Stock Array: ");
        for (int num : stock) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nEnter rows and columns of shelf grid: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        System.out.println("Enter shelf grid values:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        int[][] transposed = transposeMatrix(shelf);

        System.out.println("\nTransposed Shelf Grid:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
