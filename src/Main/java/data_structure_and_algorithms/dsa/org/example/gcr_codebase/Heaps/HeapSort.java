package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.Arrays;

public class HeapSort {

    public void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMax(arr, i, n);
        }

        for (int end = n - 1; end > 0; end--) {

            // Swap root (largest) with last element
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            // Restore max heap for the remaining elements
            siftDownMax(arr, 0, end);
        }
    }

    private void siftDownMax(int[] arr, int i, int size) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            siftDownMax(arr, largest, size);
        }
    }

    public static void main(String[] args) {

        HeapSort sorter = new HeapSort();

        int[] readings = {25, 12, 36, 8, 15, 42, 30};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(readings));

        sorter.heapSort(readings);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(readings));
    }
}