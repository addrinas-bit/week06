package week10;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    
    public static void main(String[] args) {

        NormalOrder normal = new NormalOrder(1, "Aarav", 2000);
        PermiumOrder premium = new PermiumOrder(2, "Nisha", 3000);

        System.out.println("----- NORMAL ORDER INVOICE -----");
        System.out.println(normal);
        System.out.println("Final Amount: " + normal.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                normal.calculateFinalAmount(100));

        System.out.println();

        System.out.println("----- PREMIUM ORDER INVOICE -----");
        System.out.println(premium);
        System.out.println("Final Amount: " + premium.calculateFinalAmount());
        System.out.println("Final Amount (with discount): " +
                premium.calculateFinalAmount(200));
    }
}

