package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKLargestCustomers {

    public List<Integer> topKLargest(int[] transactions, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);
            }
            else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        List<Integer> result = new ArrayList<>(minHeap);

        Collections.sort(result, Collections.reverseOrder());

        return result;
    }

    public static void main(String[] args) {

        TopKLargestCustomers obj = new TopKLargestCustomers();

        int[] transactions = {
                1200, 4500, 1800, 6200, 3000,
                9000, 2500, 7000, 5100
        };

        int k = 3;

        List<Integer> topCustomers = obj.topKLargest(transactions, k);

        System.out.println("Top " + k + " Highest Transaction Amounts:");
        System.out.println(topCustomers);
    }
}