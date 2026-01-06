package week07;


/**
 * Write a description of class Main4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main4
{
    public static void main(String[] args) 
    {
       Laptop l1 = new Laptop("Dell", 16, 95000);
        Laptop l2 = new Laptop("HP", 8, 85000);
        Laptop l3 = new Laptop("Lenovo", 32, 125000); 
        
        System.out.println("Laptops with RAM greater than 8GB:\n");

        
        if (l1.ram > 8) 
        l1.display();
        
        
        if (l2.ram > 8)
        l2.display();
        
        
        
        if (l3.ram > 8) 
        l3.display();
    }
}