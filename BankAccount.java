public class BankAccount {
    // Fields
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit amount money
    public void deposit(double amount){
        this.balance += amount;
    }

    // Method to withdraw amount money
    public void withdraw(double amount){
        this.balance -= amount;
    }

    // Method to display current balance
    public void displayBalance(){
        System.out.println("Current Balance: " + this.balance);
    }
}
/*
BankAccount bankAccount = new BankAccount("Dushyant", "101", 12000);
bankAccount.deposit(235.5);
bankAccount.withdraw(1300);
bankAccount.displayBalance();

Current Balance: 10935.5
 */