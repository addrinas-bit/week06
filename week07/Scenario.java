package week07;


/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[] args)
    {
        BankAccount acc1 = new BankAccount(101, "Addrina", 50000);
        BankAccount acc2 = new BankAccount(102, "Aayush", 1000);
        
         acc1.deposit(2000);
        acc1.withdraw(3000);
        
        acc2.deposit(5000);
        acc2.withdraw(4000);
        
        System.out.println("\nFinal Account Details:\n");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}