package Week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    { 
        //int orderID, double distance, String pickUp, String dropOff
        Delivery d1= new CarDelivery(101, 10, "Kadhaghari", "Pepsicola");
        System.out.println(d1.calculateCharge());
        
        
        Delivery d2= new BikeDelivery(102, 20, "Sabdobato", "Lalitpur");
        System.out.println(d2.calculateCharge());
        
        Notifications d3= new CarDelivery(103, 30, "Bushanilkantha", "Lagankhel");
        d3.notify("Your order has been placed");
    }
    
    
}