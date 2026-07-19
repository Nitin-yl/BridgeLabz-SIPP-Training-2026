package Main.java.data_structure_and_algorithms.dsa.org.example.story_based_codebase;

import java.util.*;

public class HospitalQueueSystem {

    // Priority Queue
    static class Patient {

        int urgency;
        String name;

        Patient(int urgency, String name) {
            this.urgency = urgency;
            this.name = name;
        }
    }

    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.urgency - b.urgency);

    static void admitPatient(int urgency, String name) {
        triageQueue.offer(new Patient(urgency, name));
    }

    static Patient treatNextPatient() {
        return triageQueue.poll();
    }

    // Sliding Window Maximum
    static int[] slidingWindowMaximum(int[] vitals, int k) {

        int n = vitals.length;
        int[] ans = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() &&
                    deque.peekFirst() <= i - k)
                deque.pollFirst();

            while (!deque.isEmpty() &&
                    vitals[deque.peekLast()] <= vitals[i])
                deque.pollLast();

            deque.offerLast(i);

            if (i >= k - 1)
                ans[i - k + 1] = vitals[deque.peekFirst()];
        }

        return ans;
    }

    // Circular Queue
    static class CircularQueue {

        int[] queue;
        int front;
        int count;

        CircularQueue(int size) {
            queue = new int[size];
            front = 0;
            count = 0;
        }

        boolean enqueue(int process) {

            if (count == queue.length)
                return false;

            queue[(front + count) % queue.length] = process;
            count++;

            return true;
        }

        int dequeue() {

            if (count == 0)
                throw new RuntimeException("Queue Empty");

            int value = queue[front];

            front = (front + 1) % queue.length;
            count--;

            return value;
        }
    }

    public static void main(String[] args) {

        // Priority Queue
        admitPatient(3, "Aman");
        admitPatient(1, "Riya");
        admitPatient(2, "Karan");

        System.out.println("Patients Treated:");

        while (!triageQueue.isEmpty()) {

            Patient p = treatNextPatient();

            System.out.println(p.name + " (Urgency: " + p.urgency + ")");
        }

        // Sliding Window Maximum
        int[] vitals = {70, 72, 68, 75, 74, 80, 78};
        int k = 3;

        System.out.println("\nMaximum Patient Vitals:");
        System.out.println(Arrays.toString(slidingWindowMaximum(vitals, k)));

        // Circular Queue
        CircularQueue scheduler = new CircularQueue(5);

        scheduler.enqueue(101);
        scheduler.enqueue(102);
        scheduler.enqueue(103);

        System.out.println("\nRound Robin Scheduler:");

        System.out.println(scheduler.dequeue());
        System.out.println(scheduler.dequeue());

        scheduler.enqueue(104);
        scheduler.enqueue(105);

        System.out.println(scheduler.dequeue());
    }
}