package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.PriorityQueue;

public class KthLargestScore {

    public int findKthLargest(int[] scores, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {

            if (minHeap.size() < k) {
                minHeap.offer(score);
            }
            else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        KthLargestScore obj = new KthLargestScore();

        int[] scores = {85, 92, 78, 96, 88, 91, 75, 99, 89};

        int k = 3;

        int kthLargest = obj.findKthLargest(scores, k);

        System.out.println(k + "rd Largest Score: " + kthLargest);
    }
}