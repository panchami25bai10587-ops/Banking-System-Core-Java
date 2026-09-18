import java.util.ArrayList;

public class Bank {

    private String bankName;

    private ArrayList<Customer> customers;
    private ArrayList<Loan> loans;

    public Bank(String bankName) {

        this.bankName = bankName;

        customers = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    // -----------------------------
    // Customer Management
    // -----------------------------

    public void addCustomer(Customer customer) {

        if (findCustomer(customer.getCustomerId()) != null) {

            System.out.println(
                    "Customer ID already exists!"
            );

            return;
        }

        customers.add(customer);

        System.out.println(
                "Customer added successfully!"
        );
    }

    public Customer findCustomer(int customerId) {

        for (Customer customer : customers) {

            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }

        return null;
    }

    // -----------------------------
    // Account Management
    // -----------------------------

    public Account findAccount(int accountNumber) {

        for (Customer customer : customers) {

            Account account =
                    customer.findAccount(accountNumber);

            if (account != null) {
                return account;
            }
        }

        return null;
    }

    public void createAccount(
            int customerId,
            int accountNumber,
            String accountType,
            double initialBalance) {

        Customer customer =
                findCustomer(customerId);

        if (customer == null) {

            System.out.println(
                    "Customer not found!"
            );

            return;
        }

        if (findAccount(accountNumber) != null) {

            System.out.println(
                    "Account already exists!"
            );

            return;
        }

        if (initialBalance < 0) {

            System.out.println(
                    "Invalid initial balance!"
            );

            return;
        }

        Account account =
                new Account(
                        accountNumber,
                        accountType,
                        initialBalance
                );

        customer.addAccount(account);

        System.out.println(
                "Account created successfully!"
        );
    }

    // -----------------------------
    // Deposit
    // -----------------------------

    public void deposit(
            int accountNumber,
            double amount) {

        Account account =
                findAccount(accountNumber);

        if (account == null) {

            System.out.println(
                    "Account not found!"
            );

            return;
        }

        if (account.deposit(amount)) {

            System.out.println(
                    "Deposit successful!"
            );

        } else {

            System.out.println(
                    "Invalid amount!"
            );
        }
    }

    // -----------------------------
    // Withdrawal
    // -----------------------------

    public void withdraw(
            int accountNumber,
            double amount) {

        Account account =
                findAccount(accountNumber);

        if (account == null) {

            System.out.println(
                    "Account not found!"
            );

            return;
        }

        if (account.withdraw(amount)) {

            System.out.println(
                    "Withdrawal successful!"
            );

        } else {

            System.out.println(
                    "Withdrawal failed!"
            );
        }
    }

    // -----------------------------
    // Transfer
    // -----------------------------

    public void transfer(
            int fromAccount,
            int toAccount,
            double amount) {

        Account source =
                findAccount(fromAccount);

        Account destination =
                findAccount(toAccount);

        if (source == null || destination == null) {

            System.out.println(
                    "Invalid account number."
            );

            return;
        }

        if (amount <= 0) {

            System.out.println(
                    "Invalid transfer amount."
            );

            return;
        }

        if (source.getBalance() < amount) {

            System.out.println(
                    "Insufficient balance."
            );

            return;
        }

        source.withdraw(amount);
        destination.deposit(amount);

        System.out.println(
                "Transfer successful!"
        );

        System.out.println(
                "Transferred: ₹" + amount
        );
    }

    // -----------------------------
    // Loan Management
    // -----------------------------

    public void addLoan(Loan loan) {

        loans.add(loan);

        System.out.println(
                "Loan added successfully!"
        );
    }

    public Loan findLoan(int loanId) {

        for (Loan loan : loans) {

            if (loan.getLoanId() == loanId) {
                return loan;
            }
        }

        return null;
    }

    public void displayLoans() {

        System.out.println(
                "\n========== LOANS =========="
        );

        if (loans.isEmpty()) {

            System.out.println(
                    "No loans available."
            );

            return;
        }

        for (Loan loan : loans) {
            loan.displayLoan();
        }
    }

    // -----------------------------
    // Display Customers
    // -----------------------------

    public void displayAllCustomers() {

        System.out.println(
                "\n========== CUSTOMERS =========="
        );

        for (Customer customer : customers) {
            customer.displayCustomer();
        }
    }
}