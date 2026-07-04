package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Collection_Framework;

import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> parkedVehicles = new ArrayList<>();

    public static void addVehicle(String vehicleNumber) {
        parkedVehicles.add(vehicleNumber);
        System.out.println(vehicleNumber + " entered the parking area.");
    }

    public static void removeVehicle(String vehicleNumber) {
        if (parkedVehicles.remove(vehicleNumber)) {
            System.out.println(vehicleNumber + " exited the parking area.");
        } else {
            System.out.println(vehicleNumber + " not found.");
        }
    }

    public static void searchVehicle(String vehicleNumber) {
        if (parkedVehicles.contains(vehicleNumber)) {
            System.out.println(vehicleNumber + " is currently parked.");
        } else {
            System.out.println(vehicleNumber + " is not parked.");
        }
    }

    public static void displayVehicles() {
        System.out.println("\nParked Vehicles:");

        if (parkedVehicles.isEmpty()) {
            System.out.println("Parking area is empty.");
        } else {
            for (String vehicle : parkedVehicles) {
                System.out.println(vehicle);
            }
        }

        System.out.println("\nTotal Occupied Parking Slots: " + parkedVehicles.size());
    }

    public static void main(String[] args) {

        addVehicle("DL01AB1234");
        addVehicle("UP32XY5678");
        addVehicle("HR26PQ9999");

        searchVehicle("UP32XY5678");

        removeVehicle("DL01AB1234");

        displayVehicles();
    }
}