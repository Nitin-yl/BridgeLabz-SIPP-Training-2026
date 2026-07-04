package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookDemo {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate Phone Number! Contact not added.");
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
            System.out.println("\nContact Found");
            System.out.println("Name  : " + contact.name);
            System.out.println("Phone : " + contact.phone);
            System.out.println("Email : " + contact.email);
        } else {
            System.out.println("\nContact not found.");
        }
    }

    public static void deleteContact(String name) {

        Contact contact = contactMap.get(name);

        if (contact != null) {
            contacts.remove(contact);
            contactMap.remove(name);
            phoneNumbers.remove(contact.phone);

            System.out.println(name + " deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts, Comparator.comparing(c -> c.name));

        System.out.println("\nAddress Book");

        for (Contact contact : contacts) {
            System.out.println();
            System.out.println("Name  : " + contact.name);
            System.out.println("Phone : " + contact.phone);
            System.out.println("Email : " + contact.email);
        }
    }

    public static void main(String[] args) {

        addContact("Nitin", "9876543210", "nitin@gmail.com");
        addContact("Rahul", "9123456789", "rahul@gmail.com");
        addContact("Priya", "9988776655", "priya@gmail.com");

        addContact("Aman", "9876543210", "aman@gmail.com");

        searchContact("Rahul");

        deleteContact("Priya");

        displayContacts();
    }
}