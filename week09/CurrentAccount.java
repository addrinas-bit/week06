package week09;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    // Constructor using super
    public CurrentAccount(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Withdraw amount with overdraft support
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;      // optional, but usually you return true here
        } else {
            System.out.println("Withdrawal denied: overdraft limit exceeded");
            return false;
        }
    }
}   

   
   



