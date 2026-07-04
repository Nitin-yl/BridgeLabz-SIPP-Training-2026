package Main.java.oops_practice.oops_pratices.org.example.story_base_codebase;

abstract class Vehicle {

    public abstract double fuelCost(double km);
}

class Car extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportDemo {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        double km = 100;

        for (Vehicle vehicle : fleet) {

            System.out.println("Fuel Cost: " + vehicle.fuelCost(km));

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("This is a Car");
            } else if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                System.out.println("This is a Bus");
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("This is a Bike");
            } else if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                System.out.println("This is an Electric Car");
            }

            System.out.println();
        }
    }
}