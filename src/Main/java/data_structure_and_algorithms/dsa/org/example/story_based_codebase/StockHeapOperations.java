package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.Collections;
import java.util.PriorityQueue;

public class StockHeapOperations {

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    static void buildMaxHeap(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapSort(int[] arr) {
        int n = arr.length;

        buildMaxHeap(arr);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int[] marketCap = {1200, 500, 2500, 1800, 900, 3000, 1500};

        buildMaxHeap(marketCap);

        System.out.println("Max Heap:");
        for (int value : marketCap) {
            System.out.print(value + " ");
        }

        int[] stocks = {1200, 500, 2500, 1800, 900, 3000, 1500};
        int k = 3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stock : stocks) {
            pq.offer(stock);
        }

        System.out.println("\n\nTop " + k + " Performing Stocks:");
        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }

        heapSort(stocks);

        System.out.println("\nHeap Sort (Ascending):");
        for (int value : stocks) {
            System.out.print(value + " ");
        }
    }
}