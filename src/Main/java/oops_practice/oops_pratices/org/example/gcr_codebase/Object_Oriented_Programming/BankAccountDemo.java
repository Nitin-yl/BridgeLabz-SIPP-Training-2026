package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Object_Oriented_Programming;

class BankAccount {

    private int accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    public BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal failed! Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Account Holder : " + holder);
        System.out.println("Balance        : " + balance);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Rahul", 10000);
        BankAccount acc2 = new BankAccount(102, "Aman", 15000);
        BankAccount acc3 = new BankAccount(103, "Neha", 20000);

        System.out.println("Transactions for Rahul");
        acc1.deposit(1000);
        acc1.withdraw(500);
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.withdraw(10000);

        System.out.println("\nTransactions for Aman");
        acc2.deposit(500);
        acc2.withdraw(1000);
        acc2.deposit(2500);
        acc2.withdraw(7000);
        acc2.withdraw(300);

        System.out.println("\nTransactions for Neha");
        acc3.deposit(4000);
        acc3.withdraw(1500);
        acc3.deposit(1000);
        acc3.withdraw(25000);
        acc3.withdraw(500);

        System.out.println("\nFinal Account Statements");
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}