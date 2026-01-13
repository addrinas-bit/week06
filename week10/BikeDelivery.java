package week10;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends Deliverypartner
{
   

    public BikeDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 200; 
    }

    
    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 50);
    }
}
