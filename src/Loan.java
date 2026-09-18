public class Loan {

    private int loanId;
    private int customerId;
    private double loanAmount;
    private double interestRate;
    private int durationYears;
    private boolean active;

    public Loan(
            int loanId,
            int customerId,
            double loanAmount,
            double interestRate,
            int durationYears) {

        this.loanId = loanId;
        this.customerId = customerId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.durationYears = durationYears;
        this.active = true;
    }

    public int getLoanId() {
        return loanId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public boolean isActive() {
        return active;
    }

    public void closeLoan() {
        active = false;
    }

    public double calculateTotalAmount() {

        double interest =
                loanAmount *
                interestRate *
                durationYears / 100;

        return loanAmount + interest;
    }

    public void displayLoan() {

        System.out.println("--------------------------------");
        System.out.println("Loan ID       : " + loanId);
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Loan Amount   : ₹" + loanAmount);
        System.out.println("Interest Rate : " + interestRate + "%");
        System.out.println("Duration      : " + durationYears + " years");
        System.out.println(
                "Total Amount  : ₹" +
                calculateTotalAmount()
        );
        System.out.println(
                "Status        : " +
                (active ? "Active" : "Closed")
        );
        System.out.println("--------------------------------");
    }
}