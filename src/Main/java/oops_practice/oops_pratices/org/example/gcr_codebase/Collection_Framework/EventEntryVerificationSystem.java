package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Collection_Framework;

import java.util.HashSet;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println(email + " is already registered.");
        }
    }

    public static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("\nTotal Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("nitin@gmail.com");
        registerParticipant("rahul@gmail.com");
        registerParticipant("priya@gmail.com");
        registerParticipant("nitin@gmail.com");

        displayParticipants();
    }
}