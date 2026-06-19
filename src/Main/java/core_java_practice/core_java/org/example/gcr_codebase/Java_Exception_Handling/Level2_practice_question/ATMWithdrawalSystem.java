package Main.java.core_java_practice.core_java.org.example.gcr_codebase.Java_Exception_Handling.Level2_practice_question;

class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(double balance, double withdrawalAmount) {
        super("Insufficient Balance! Available: ₹" + balance +
                ", Requested: ₹" + withdrawalAmount);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}

public class ATMWithdrawalSystem {

    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        balance -= amount;
        System.out.println("Withdrawal Successful!");
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        ATMWithdrawalSystem account = new ATMWithdrawalSystem();

        try {
            account.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}