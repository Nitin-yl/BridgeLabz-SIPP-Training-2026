package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static int[] maxThroughputWindow(int[] readings, int k) {

        int n = readings.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k)
                deque.pollFirst();

            while (!deque.isEmpty() &&
                    readings[deque.peekLast()] <= readings[i])
                deque.pollLast();

            deque.offerLast(i);

            if (i >= k - 1)
                result[i - k + 1] = readings[deque.peekFirst()];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] readings = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(maxThroughputWindow(readings, k)));
    }
}