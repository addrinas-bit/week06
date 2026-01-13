package week10;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account
{
    

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    // Override method
    @Override
    public double calculateInterest() {
        super.calculateInterest();
        return balance * 0.02; // 2% interest
    }

    // Overloaded method
    public double calculateInterest(double rate) {
        return balance * rate;
    }
}

