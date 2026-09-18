import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private String accountType;
    private double balance;

    private ArrayList<Transaction> transactions;

    public Account(int accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            return false;
        }

        balance += amount;

        transactions.add(
                new Transaction(
                        "Deposit",
                        amount,
                        "Money deposited"
                )
        );

        return true;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;

        transactions.add(
                new Transaction(
                        "Withdrawal",
                        amount,
                        "Money withdrawn"
                )
        );

        return true;
    }

    public void displayAccount() {

        System.out.println("--------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("--------------------------------");
    }

    public void displayTransactions() {

        System.out.println("\n========== TRANSACTIONS ==========");

        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}