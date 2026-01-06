package week08;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private long Accountnumber;
    private double balance;
    private String name;
    
    public BankAccount(long Accountnumber, double balance, String name)
    {
        this.Accountnumber= Accountnumber;
        this.balance= balance;
        this.name= name;
    }
    public void setBalance(double  balance)
    {
        this.balance= balance;
    }
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Withdrawal failed (Insufficient balance or invalid amount)");
            return false;
        }
    }
}
