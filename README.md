# CTA-Option-1-BankAccount

# Superclass : BankAccount
    Constructors
        public bankAccount (firstName, lastName, accountID,)
        Initialize 0 Balance
    Methods
        Deposit
            public void deposit
            if-else (Ammount Needs to be Greater than 0)
        Withdrawal
            public void withdraw
            if-else (Ammount Needs to be Greater than 0 and Ammount Needs to be Less than or Equal to Balance)
    Getters and Setters
        Get Set firstName
        Get Set lastName
        Get Set accountID
        Get Balance (Do Not Set Balance)
    Summary of BankAccount
        Print Account Summary
            First Name
            Last Name 
            Account ID
            Balance


# Subclass : CheckingAccount
    Inheritrance From BankAccount
        Checking Account Extends Bank Account
        Define OVERDREAFT_FEE
    Constructor
        Public checkingAccount
            firstName
            lastName
            accountID
            interestRate
        Super
            firstName
            lastName
            accountID
    Method
        processWithdrawal
            if-else (If Ammount is Greater than Balacne Charge Overdraft Fee Else Withdraw Amount)  
    Display Account
        Display Account details


# Main
    Display Account
