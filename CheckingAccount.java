public class CheckingAccount extends BankAccount {
    private double interestRate;
    private static final double OVERDRAFT_FEE = 30.0;

    //CONSTRUCTOR
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    //METHODS
    public void processWithdrawal(double amount) {
        double balance = getBalance();
        System.out.printf("Withdrawal: $%.2f%n", amount);
        if (amount > balance) {
            double newBalance = balance - amount - OVERDRAFT_FEE;
            System.out.printf("Not Sufficient Funds Overdraft Fee Charged $%.2f.%n", OVERDRAFT_FEE);
            setAccountBalance(newBalance);
        } else {
            withdraw(amount);
        }
    }

    //DISPLAY ACCOUNT

    @Override
    public void accountSummary() {
        super.accountSummary();
        System.out.printf("Interest Rate: %.2f%%%n", interestRate);
    }
}
