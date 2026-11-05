class BankAccount {
    private int accountNumber;
    private double balance;

    static int accountCount = 0;
    final int accountID;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCount++;
        accountID = accountCount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: Rs. " + amount);
        } else {
            System.out.println("Invalid deposit!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs. " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTest {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, 5000);

        System.out.println("Account ID: " + b1.accountID);
        System.out.println("Initial Balance: Rs. " + b1.getBalance());

        b1.deposit(1000);
        b1.withdraw(500);

        System.out.println("Final Balance: Rs. " + b1.getBalance());
        System.out.println("Total Accounts: " + BankAccount.accountCount);
    }
}