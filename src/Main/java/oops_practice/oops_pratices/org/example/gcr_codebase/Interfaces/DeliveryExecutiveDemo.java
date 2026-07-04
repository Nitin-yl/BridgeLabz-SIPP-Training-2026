package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Interfaces;

interface FoodDelivery {

    void deliverFood(String customerName);

    default void trackOrder() {
        System.out.println("Food Order: Out for Delivery");
    }

    static String generateDeliveryCode() {
        return "FD1001";
    }
}

interface GroceryDelivery {

    void deliverGroceries(String customerName);

    default void trackOrder() {
        System.out.println("Grocery Order: Out for Delivery");
    }
}

class DeliveryExecutive implements FoodDelivery, GroceryDelivery {

    @Override
    public void deliverFood(String customerName) {
        System.out.println("Food delivered to " + customerName);
    }

    @Override
    public void deliverGroceries(String customerName) {
        System.out.println("Groceries delivered to " + customerName);
    }

    // Resolve default method conflict
    @Override
    public void trackOrder() {
        FoodDelivery.super.trackOrder();
        GroceryDelivery.super.trackOrder();
    }
}

public class DeliveryExecutiveDemo {

    public static void main(String[] args) {

        String[] customers = {
                "Nitin",
                "Rahul",
                "Priya",
                "Aman"
        };

        DeliveryExecutive executive = new DeliveryExecutive();

        System.out.println("Delivery Code: " + FoodDelivery.generateDeliveryCode());

        System.out.println("\nProcessing Deliveries:");

        for (String customer : customers) {

            System.out.println("\nCustomer: " + customer);

            executive.trackOrder();
            executive.deliverFood(customer);
            executive.deliverGroceries(customer);
        }
    }
}