package week09;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args) {

        // Saving Account object
        SavingAccount sa =
                new SavingAccount(101, "Ramesh", 50000, 5);

        System.out.println("---- Saving Account ----");
        sa.deposit(10000);
        System.out.println("Balance      : " + sa.getBalance());
        System.out.println("Interest     : " + sa.calculateInterest());

        System.out.println();

        // Current Account object
        CurrentAccount ca =
                new CurrentAccount(201, "Sita", 30000, 20000);

        System.out.println("---- Current Account ----");
        ca.deposit(5000);
        ca.withdraw(45000);
        System.out.println("Balance      : " + ca.getBalance());
    }
}

