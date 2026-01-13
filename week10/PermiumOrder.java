package week10;


/**
 * Write a description of class PermiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermiumOrder extends Order
{
    

    public PermiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    // Override method
    @Override
    public double calculateFinalAmount() {
        super.calculateFinalAmount();
        return amount - 100; // premium discount
    }

    // Overloaded method
    public double calculateFinalAmount(double discountAmount) {
        return amount - discountAmount;
    }
}

