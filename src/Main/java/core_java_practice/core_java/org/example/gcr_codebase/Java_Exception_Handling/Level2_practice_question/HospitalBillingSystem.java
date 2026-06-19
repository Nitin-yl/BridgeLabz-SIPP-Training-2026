package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level2_practice_question;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    public static void makePayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds!");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] patientBills = {5000, 7000, 3000, 9000};

        try {
            System.out.print("Enter patient index: ");
            int index = Integer.parseInt(sc.nextLine());

            int bill = patientBills[index];

            System.out.print("Enter number of items/services: ");
            int items = Integer.parseInt(sc.nextLine());

            int costPerItem = bill / items;

            System.out.println("Cost per item: " + costPerItem);

            System.out.print("Enter payment amount: ");
            double payment = Double.parseDouble(sc.nextLine());

            makePayment(bill, payment);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index!");

        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero!");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input!");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Hospital billing process completed.");
            sc.close();
        }
    }
}