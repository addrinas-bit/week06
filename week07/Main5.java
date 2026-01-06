package week07;


/**
 * Write a description of class Main5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main5
{
    public static void main(String[] args)
    { 
       Mobile m1 = new Mobile("Samsung", 25000);
       Mobile m2 = new Mobile("Apple", 340000);
       Mobile m3 = new Mobile("Redmi", 18000);
        
       System.out.println("Affordable Mobiles (Price < 20000):\n");

       m1.isAffordable();
       m2.isAffordable();
       m3.isAffordable();
    }
}