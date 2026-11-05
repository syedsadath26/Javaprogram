class BankAccount {
    String account_holder_name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.account_holder_name = "Vani";
        account.balance = 1000;

        System.out.println("Account Holder: " + account.account_holder_name);

        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
    }
}