package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level1_practice_question;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankTransactionDemo {

    private double balance;

    public BankTransactionDemo(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankTransactionDemo account = new BankTransactionDemo(1000.0);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }

        sc.close();
    }
}