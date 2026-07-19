package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.Random;

public class LibrarySortingComparison {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void countingSort(int[] arr) {

        int[] count = new int[21];

        for (int value : arr)
            count[value]++;

        int index = 0;

        for (int i = 1; i <= 20; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void test(int size) {

        Random random = new Random();

        int[] mergeArray = new int[size];
        int[] quickArray = new int[size];
        int[] countArray = new int[size];

        for (int i = 0; i < size; i++) {
            int year = random.nextInt(2026);
            mergeArray[i] = year;
            quickArray[i] = year;

            // Genre codes from 1 to 20
            countArray[i] = random.nextInt(20) + 1;
        }

        long start, end;

        start = System.nanoTime();
        mergeSort(mergeArray, 0, size - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        quickSort(quickArray, 0, size - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort (" + size + ") : " + (end - start) + " ns");

        start = System.nanoTime();
        countingSort(countArray);
        end = System.nanoTime();
        System.out.println("Counting Sort (" + size + ") : " + (end - start) + " ns");

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Runtime Comparison\n");

        test(100);
        test(1000);
        test(10000);
    }
}