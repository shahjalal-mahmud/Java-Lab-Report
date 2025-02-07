abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void calculateInterest();

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate = 5.0; 

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

public class Problem08 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("001", 1000);
        savings.displayBalance();
        savings.calculateInterest();
        savings.displayBalance();

        System.out.println();

        CurrentAccount current = new CurrentAccount("002", 2000);
        current.displayBalance();
        current.calculateInterest();
        current.displayBalance();
    }
}
