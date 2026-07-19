package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Queues;

import java.util.PriorityQueue;

public class HospitalTriage {

    static class Patient {

        int priority;
        String name;

        Patient(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Patient> triageQueue =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        triageQueue.offer(new Patient(3, "Aman"));
        triageQueue.offer(new Patient(1, "Riya"));
        triageQueue.offer(new Patient(2, "Karan"));

        while (!triageQueue.isEmpty()) {

            Patient p = triageQueue.poll();

            System.out.println(p.name + " Priority: " + p.priority);
        }
    }
}