package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Inheritance;

class RestaurantPerson {

    protected String name;
    protected int id;

    public RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {

    void performDuties();
}

class Chef extends RestaurantPerson implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing food.");
    }
}

class Waiter extends RestaurantPerson implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}

public class RestaurantManagementSystem {

    public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Aman", 201);

        System.out.println("Chef Details");
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        System.out.println("Waiter Details");
        waiter.displayDetails();
        waiter.performDuties();
    }
}