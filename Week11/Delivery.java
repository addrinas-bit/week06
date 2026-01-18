package Week11;


/**
 * Write a description of class Delivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Delivery
{
    private int orderID;
    private double distanceInKm;
    private String pickUpLocation;
    private String dropOffLocation;
    
    
    public Delivery(int orderID, double distance, String pickUp, String dropOff)
    {
        this.orderID= orderID;
        this.distanceInKm= distance;
        this.pickUpLocation= pickUp;
        this.dropOffLocation= dropOff;
    }
    
    public double getdistance()
    {
        return this.distanceInKm;
    }
    
    public abstract double calculateCharge();
    public abstract double extimateTime();
    
    
    
    
}