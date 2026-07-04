package Main.java.oops_practice.oops_pratices.org.example.story_base_codebase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

class Contact implements Comparable<Contact> {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Phone: " + phone +
                ", Email: " + email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println(name + " added successfully.");
    }

    public static void searchContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void deleteContact(String name) {

        Contact contact = contactMap.remove(name);

        if (contact != null) {
            contacts.remove(contact);
            phoneNumbers.remove(contact.phone);
            System.out.println(name + " deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts);

        System.out.println("\nAddress Book:");

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Aman", "9876543211", "aman@gmail.com");
        addContact("Neha", "9876543212", "neha@gmail.com");

        addContact("Riya", "9876543210", "riya@gmail.com");

        System.out.println();

        searchContact("Aman");

        System.out.println();

        deleteContact("Rahul");

        displayContacts();
    }
}