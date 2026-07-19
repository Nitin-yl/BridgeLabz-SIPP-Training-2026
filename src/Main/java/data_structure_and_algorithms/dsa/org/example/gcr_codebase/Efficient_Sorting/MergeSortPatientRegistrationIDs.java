package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Efficient_Sorting;

import java.util.Scanner;

public class MergeSortPatientRegistrationIDs {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        int[] patientIDs = new int[n];

        System.out.println("Enter patient registration IDs:");
        for (int i = 0; i < n; i++) {
            patientIDs[i] = sc.nextInt();
        }

        mergeSort(patientIDs, 0, n - 1);

        System.out.println("Sorted Patient Registration IDs:");
        System.out.print("[");

        for (int i = 0; i < n; i++) {
            System.out.print(patientIDs[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        System.out.println("]");

        sc.close();
    }
}