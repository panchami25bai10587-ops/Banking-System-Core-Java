import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank bank =
                new Bank("ABC National Bank");

        ATM atm =
                new ATM(
                        501,
                        "Main Branch"
                );

        // --------------------------------
        // Sample Customers
        // --------------------------------

        bank.addCustomer(
                new Customer(
                        101,
                        "Panchami",
                        "panchami@gmail.com",
                        "9876543210"
                )
        );

        bank.addCustomer(
                new Customer(
                        102,
                        "Rahul",
                        "rahul@gmail.com",
                        "9876501234"
                )
        );

        // --------------------------------
        // Sample Accounts
        // --------------------------------

        bank.createAccount(
                101,
                1001,
                "Savings",
                10000
        );

        bank.createAccount(
                102,
                1002,
                "Current",
                15000
        );

        int choice;

        do {

            System.out.println("\n");
            System.out.println(
                    "=========================================="
            );

            System.out.println(
                    "          " + bank.getBankName()
            );

            System.out.println(
                    "          BANK MANAGEMENT SYSTEM"
            );

            System.out.println(
                    "=========================================="
            );

            System.out.println("1. Add Customer");
            System.out.println("2. Create Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Check Balance");
            System.out.println("7. Display Customers");
            System.out.println("8. Transaction History");
            System.out.println("9. Create Loan");
            System.out.println("10. Display Loans");
            System.out.println("11. ATM Information");
            System.out.println("12. Exit");

            System.out.println(
                    "=========================================="
            );

            System.out.print(
                    "Enter your choice: "
            );

            choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {

                // ----------------------------
                // Add Customer
                // ----------------------------

                case 1:

                    System.out.print(
                            "Enter Customer ID: "
                    );

                    int customerId =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Enter Name: "
                    );

                    String name =
                            scanner.nextLine();

                    System.out.print(
                            "Enter Email: "
                    );

                    String email =
                            scanner.nextLine();

                    System.out.print(
                            "Enter Phone: "
                    );

                    String phone =
                            scanner.nextLine();

                    bank.addCustomer(
                            new Customer(
                                    customerId,
                                    name,
                                    email,
                                    phone
                            )
                    );

                    break;

                // ----------------------------
                // Create Account
                // ----------------------------

                case 2:

                    System.out.print(
                            "Enter Customer ID: "
                    );

                    int id =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int accountNumber =
                            scanner.nextInt();

                    scanner.nextLine();

                    System.out.print(
                            "Enter Account Type: "
                    );

                    String type =
                            scanner.nextLine();

                    System.out.print(
                            "Enter Initial Balance: ₹"
                    );

                    double balance =
                            scanner.nextDouble();

                    bank.createAccount(
                            id,
                            accountNumber,
                            type,
                            balance
                    );

                    break;

                // ----------------------------
                // Deposit
                // ----------------------------

                case 3:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int depositAccount =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Amount: ₹"
                    );

                    double depositAmount =
                            scanner.nextDouble();

                    bank.deposit(
                            depositAccount,
                            depositAmount
                    );

                    break;

                // ----------------------------
                // Withdraw
                // ----------------------------

                case 4:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int withdrawAccount =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Amount: ₹"
                    );

                    double withdrawAmount =
                            scanner.nextDouble();

                    bank.withdraw(
                            withdrawAccount,
                            withdrawAmount
                    );

                    break;

                // ----------------------------
                // Transfer
                // ----------------------------

                case 5:

                    System.out.print(
                            "From Account: "
                    );

                    int fromAccount =
                            scanner.nextInt();

                    System.out.print(
                            "To Account: "
                    );

                    int toAccount =
                            scanner.nextInt();

                    System.out.print(
                            "Amount: ₹"
                    );

                    double transferAmount =
                            scanner.nextDouble();

                    bank.transfer(
                            fromAccount,
                            toAccount,
                            transferAmount
                    );

                    break;

                // ----------------------------
                // Balance
                // ----------------------------

                case 6:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int balanceAccount =
                            scanner.nextInt();

                    Account account =
                            bank.findAccount(
                                    balanceAccount
                            );

                    if (account != null) {
                        atm.checkBalance(account);
                    } else {
                        System.out.println(
                                "Account not found!"
                        );
                    }

                    break;

                // ----------------------------
                // Customers
                // ----------------------------

                case 7:

                    bank.displayAllCustomers();

                    break;

                // ----------------------------
                // Transaction History
                // ----------------------------

                case 8:

                    System.out.print(
                            "Enter Account Number: "
                    );

                    int transactionAccount =
                            scanner.nextInt();

                    Account transaction =
                            bank.findAccount(
                                    transactionAccount
                            );

                    if (transaction != null) {

                        transaction.displayTransactions();

                    } else {

                        System.out.println(
                                "Account not found!"
                        );
                    }

                    break;

                // ----------------------------
                // Create Loan
                // ----------------------------

                case 9:

                    System.out.print(
                            "Enter Loan ID: "
                    );

                    int loanId =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Customer ID: "
                    );

                    int loanCustomerId =
                            scanner.nextInt();

                    System.out.print(
                            "Enter Loan Amount: ₹"
                    );

                    double loanAmount =
                            scanner.nextDouble();

                    System.out.print(
                            "Enter Interest Rate (%): "
                    );

                    double interestRate =
                            scanner.nextDouble();

                    System.out.print(
                            "Enter Duration (years): "
                    );

                    int duration =
                            scanner.nextInt();

                    Loan loan =
                            new Loan(
                                    loanId,
                                    loanCustomerId,
                                    loanAmount,
                                    interestRate,
                                    duration
                            );

                    bank.addLoan(loan);

                    break;

                // ----------------------------
                // Display Loans
                // ----------------------------

                case 10:

                    bank.displayLoans();

                    break;

                // ----------------------------
                // ATM
                // ----------------------------

                case 11:

                    atm.displayATM();

                    break;

                // ----------------------------
                // Exit
                // ----------------------------

                case 12:

                    System.out.println(
                            "\nThank you for using "
                                    + bank.getBankName()
                                    + "!"
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }

        } while (choice != 12);

        scanner.close();
    }
}