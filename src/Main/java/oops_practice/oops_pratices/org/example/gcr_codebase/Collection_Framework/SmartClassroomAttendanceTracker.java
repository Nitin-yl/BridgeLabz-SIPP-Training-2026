package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        if (!attendance.containsKey(subject)) {
            attendance.put(subject, new ArrayList<>());
        }

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " is already marked present in " + subject);
        }
    }

    public static void displayAttendance() {

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Nitin");
        markAttendance("Java", "Rahul");
        markAttendance("Python", "Priya");
        markAttendance("Python", "Aman");
        markAttendance("Java", "Nitin");
        markAttendance("DBMS", "Rohit");

        displayAttendance();
    }
}