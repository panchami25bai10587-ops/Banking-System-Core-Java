import java.util.ArrayList;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String phone;

    private ArrayList<Account> accounts;

    public Customer(
            int customerId,
            String name,
            String email,
            String phone) {

        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;

        accounts = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {

        accounts.add(account);

        System.out.println(
                "Account added successfully!"
        );
    }

    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public void displayCustomer() {

        System.out.println("\n================================");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Email       : " + email);
        System.out.println("Phone       : " + phone);

        System.out.println("\nAccounts:");

        if (accounts.isEmpty()) {

            System.out.println("No accounts.");

        } else {

            for (Account account : accounts) {
                account.displayAccount();
            }
        }

        System.out.println("================================");
    }
}