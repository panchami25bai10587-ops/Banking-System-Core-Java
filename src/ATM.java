public class ATM {

    private int atmId;
    private String location;

    public ATM(int atmId, String location) {
        this.atmId = atmId;
        this.location = location;
    }

    public void checkBalance(Account account) {

        if (account == null) {
            System.out.println("Invalid account.");
            return;
        }

        System.out.println(
                "Current Balance: ₹" +
                account.getBalance()
        );
    }

    public void withdraw(Account account, double amount) {

        if (account == null) {
            System.out.println("Invalid account.");
            return;
        }

        if (account.withdraw(amount)) {

            System.out.println(
                    "ATM withdrawal successful."
            );

            System.out.println(
                    "Withdrawn: ₹" + amount
            );

        } else {

            System.out.println(
                    "Withdrawal failed."
            );
        }
    }

    public void deposit(Account account, double amount) {

        if (account == null) {
            System.out.println("Invalid account.");
            return;
        }

        if (account.deposit(amount)) {

            System.out.println(
                    "ATM deposit successful."
            );

            System.out.println(
                    "Deposited: ₹" + amount
            );

        } else {

            System.out.println(
                    "Invalid deposit amount."
            );
        }
    }

    public void displayATM() {

        System.out.println("--------------------------------");
        System.out.println("ATM ID   : " + atmId);
        System.out.println("Location : " + location);
        System.out.println("--------------------------------");
    }
}