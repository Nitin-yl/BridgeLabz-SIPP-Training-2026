package Main.java.data_structure_and_algorithms.dsa.org.example.gcr_codebase.Heaps;

import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class EmergencyRoomTriage {

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(String name, int severity) {
        triageQueue.offer(new Patient(name, severity));
        System.out.println(name + " added with severity " + severity);
    }

    public Patient treatNext() {
        if (triageQueue.isEmpty()) {
            System.out.println("No patients waiting.");
            return null;
        }
        return triageQueue.poll();
    }

    public Patient peekPatient() {
        return triageQueue.peek();
    }

    public static void main(String[] args) {
        EmergencyRoomTriage er = new EmergencyRoomTriage();

        er.addPatient("John", 5);
        er.addPatient("Alice", 9);
        er.addPatient("Bob", 3);
        er.addPatient("Emma", 7);

        System.out.println("\nMost Severe Patient: " + er.peekPatient());

        System.out.println("\nTreating Patients:");
        while (er.peekPatient() != null) {
            System.out.println(er.treatNext());
        }
    }
}