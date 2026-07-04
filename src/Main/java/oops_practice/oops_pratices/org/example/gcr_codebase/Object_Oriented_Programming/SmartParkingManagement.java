package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Object_Oriented_Programming;

class Vehicle {

    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equalsIgnoreCase("Car")) {
                vehicle.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleType().equalsIgnoreCase("Bike")) {
                vehicle.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP32AB1234", "Rahul", "Car");
        vehicles[1] = new Vehicle("UP32CD5678", "Aman", "Bike");
        vehicles[2] = new Vehicle("UP32EF9012", "Neha", "Car");
        vehicles[3] = new Vehicle("UP32GH3456", "Riya", "Bike");
        vehicles[4] = new Vehicle("UP32IJ7890", "Arjun", "Car");
        vehicles[5] = new Vehicle("UP32KL1122", "Priya", "Bike");
        vehicles[6] = new Vehicle("UP32MN3344", "Karan", "Car");
        vehicles[7] = new Vehicle("UP32OP5566", "Simran", "Bike");
        vehicles[8] = new Vehicle("UP32QR7788", "Vikas", "Car");
        vehicles[9] = new Vehicle("UP32ST9900", "Anjali", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}