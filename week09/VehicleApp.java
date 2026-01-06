package week09;


/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1= new Car(101, "KIA", 250000, 4, "Petrol");
        c1.displayCarDetails();
        
        Bike b1= new Bike(202, "Silver Stallion", 1200000, 5);
        b1.displayBikeDetails();
    }
}