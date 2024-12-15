public class Main {
    public static void main(String[] args) {
        BankAccount account;

        account = new CheckingAccount("Malyk", "Parker", 548125, 4.5);
        account.deposit(501548.24);
        ((CheckingAccount) account).processWithdrawal(601587.45);
        account.accountSummary();
    }
}        
