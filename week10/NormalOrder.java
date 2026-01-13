package week10;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order
{
    

    public NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    // Override method
    @Override
    public double calculateFinalAmount() {
        super.calculateFinalAmount();
        return amount + 50; // delivery charge
    }

    // Overloaded method
    public double calculateFinalAmount(double discountAmount) {
        return (amount + 50) - discountAmount;
    }
}

