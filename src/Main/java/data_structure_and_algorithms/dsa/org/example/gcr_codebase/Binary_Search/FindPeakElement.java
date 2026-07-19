package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Binary_Search;

import java.util.Scanner;

public class FindPeakElement {

    public static int findPeak(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean leftOk = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOk = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid;
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element: " + arr[peakIndex]);

        sc.close();
    }
}