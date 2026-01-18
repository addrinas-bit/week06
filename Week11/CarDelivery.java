package Week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery implements Notifications
{
    private static final double PER_KM_CHARGE= 50;
    private static final double MIN_PER_KM=4;
    public CarDelivery(int orderID, double distance, String pickUp, String dropOff)
    {
        super(orderID, distance, pickUp, dropOff);    
    }
    
    @Override
    public double calculateCharge()
    {
        return super.getdistance()* PER_KM_CHARGE;
    }
    
    @Override
    public double extimateTime()
    {
        return super.getdistance()* MIN_PER_KM;
        
    }
    
    @Override
    public void notify(String message)
    {
        System.out.println(message);
    }
}