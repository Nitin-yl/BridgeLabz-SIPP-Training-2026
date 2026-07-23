package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.Arrays;

public class BuildMinHeap {

    public void buildHeap(int[] priorities) {
        int n = priorities.length;

        // Start from the last non-leaf node
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    private void siftDown(int[] arr, int i, int size) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            siftDown(arr, smallest, size);
        }
    }

    public static void main(String[] args) {

        BuildMinHeap heap = new BuildMinHeap();

        int[] priorities = {40, 10, 30, 50, 60, 15, 5};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(priorities));

        heap.buildHeap(priorities);

        System.out.println("Min Heap:");
        System.out.println(Arrays.toString(priorities));
    }
}