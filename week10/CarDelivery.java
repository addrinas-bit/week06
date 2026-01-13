package week10;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Deliverypartner
{
    public CarDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 500; 
    }


    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 100);
    }
}