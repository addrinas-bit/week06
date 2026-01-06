package week07;


/**
 * Write a description of class Mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobile
{
    String brand;
    double price;
    
     public Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
    
    
     void isAffordable() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs. " + price);
        System.out.println("This mobile is affordable");
    }
    
}