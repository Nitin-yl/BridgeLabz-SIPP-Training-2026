package Main.java.core_java_practice.core_java.org.example.story_base_codebase;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void processPayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        try {
            int totalBill = 1000;
            int items = 0;
            int average = totalBill / items;
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. Number of bill items cannot be zero.");
        }

        try {
            String[] patients = {"Rahul", "Aman", "Neha"};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "ABC";
            int age = Integer.parseInt(input);
            System.out.println(age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter a valid number.");
        }

        try {
            processPayment(5000, 3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}