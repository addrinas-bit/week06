package week07;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accountNumber;
    String holderName;
    double balance;
    
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Rs. " + amount + " to " + holderName);
    }
    
     void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Rs. " + amount + " from " + holderName);
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }
    
     void displayBalance() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("----------------------------");
    }
    
    
}

