package week09;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
   private int doors;
   private String fuelTypes;
   
   public Car(int VehicleID, String brand, double basePrice, int doors, String fuelTypes)
   {
       super(VehicleID, brand, basePrice);
       this.doors= doors;
       this.fuelTypes= fuelTypes;
   }
   
   public double calculateFinalPrice()
   {
       return super.Baseprice + super.calculateTax() + 0.05 * super.Baseprice;
   }
   
   public void displayCarDetails()
   {
       super.displayVehicleInfo();
       System.out.println("No. of doors:"+ this.doors);
       System.out.println();
   }
}