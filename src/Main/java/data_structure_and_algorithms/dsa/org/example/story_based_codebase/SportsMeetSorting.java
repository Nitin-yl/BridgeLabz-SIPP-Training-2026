package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.Arrays;

public class SportsMeetSorting {
    public static void main(String[] args) {

        int[] scores = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(scores));

        int[] bubble = scores.clone();
        bubbleSort(bubble);

        int[] insertion = scores.clone();
        insertionSort(insertion);

        topThree(scores);
    }

    public static void bubbleSort(int[] arr) {

        int swaps = 0;
        boolean sorted = false;

        System.out.println("\nBubble Sort Trace:");

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));

            if (!swapped) {
                sorted = true;
                break;
            }
        }

        if (swaps == 0)
            sorted = true;

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Swaps: " + swaps);
        System.out.println("Already Sorted (Best Case): " + sorted);
    }

    public static void insertionSort(int[] arr) {

        System.out.println("\nInsertion Sort Trace:");

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void topThree(int[] arr) {

        int[] temp = arr.clone();

        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] < temp[j]) {
                    int t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        System.out.println("\nTop 3 Medalists:");
        System.out.println("Gold   : " + temp[0]);
        System.out.println("Silver : " + temp[1]);
        System.out.println("Bronze : " + temp[2]);
    }
}
