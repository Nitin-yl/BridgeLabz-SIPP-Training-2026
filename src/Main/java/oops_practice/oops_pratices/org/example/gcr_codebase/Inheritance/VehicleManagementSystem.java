package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Inheritance;

class Vehicle {

    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle");
        ev.displayDetails();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");
        pv.displayDetails();
        pv.refuel();
    }
}