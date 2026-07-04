package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Polymorphism;

class Vehicle {

    public double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 8;   // ₹8 per km
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 15;  // ₹15 per km
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 3;   // ₹3 per km
    }
}

// New class added without changing existing classes
class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(int km) {
        return km * 2;   // ₹2 per km
    }
}

public class TransportCompanyDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        int km = 50;

        for (Vehicle vehicle : vehicles) {

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Car Fuel Cost = ₹" + car.fuelCost(km));
            }
            else if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                System.out.println("Bus Fuel Cost = ₹" + bus.fuelCost(km));
            }
            else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("Bike Fuel Cost = ₹" + bike.fuelCost(km));
            }
            else if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                System.out.println("Electric Car Fuel Cost = ₹" + electricCar.fuelCost(km));
            }
        }
    }
}