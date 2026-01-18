package Week11;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends Delivery
{
    private static final double PER_KM_CHARGE= 500;
    private static final double MIN_PER_KM=5;
    public BikeDelivery(int orderID, double distance, String pickUp, String dropOff)
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
}