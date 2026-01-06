package week08;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Atm
{
    public static void main(String[] args)
    {
       BankAccount account = new BankAccount(101, 5000.0, "Addrina Shrestha");

       
        System.out.println("Initial Balance: " + account.getBalance());

        
        account.deposit(2000);

        
        account.withdraw(1500);

        
        System.out.println("Final Balance: " + account.getBalance()); 
    }
}