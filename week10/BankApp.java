package week10;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, "Ram Sharma", 50000);
        CurrentAccount ca = new CurrentAccount(201, "Sita Thapa", 80000);

        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest (custom rate): " + sa.calculateInterest(0.06));

        System.out.println();

        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest (custom rate): " + ca.calculateInterest(0.03));
    }
}

