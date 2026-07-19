package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    private Deque<Integer> printQueue = new ArrayDeque<>();

    void submitJob(int jobId) {
        printQueue.addLast(jobId);
    }

    void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
    }

    int printNextJob() {
        return printQueue.removeFirst();
    }

    public static void main(String[] args) {

        PrintQueue queue = new PrintQueue();

        queue.submitJob(1);
        queue.submitJob(2);
        queue.submitUrgentJob(99);
        queue.submitJob(3);

        while (!queue.printQueue.isEmpty()) {
            System.out.println(queue.printNextJob());
        }
    }
}