package week09;


/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAccount extends BankAccount
{
    private double interestRate;

    // Constructor using super
    public SavingAccount(int accountNumber, String accountHolderName,
                         double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return super.getBalance() * interestRate / 10;
    }
}



