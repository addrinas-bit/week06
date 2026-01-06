package week07;


/**
 * Write a description of class Main2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main2
{
    public static void main(String[] args)
    {
        Rectangle rect1 = new Rectangle(12,15);
        Rectangle rect2 = new Rectangle(20,30);
        
        System.out.println("Rectangle 1:");
        System.out.println("Length:"+ rect1.length);
        System.out.println("Breadth:"+ rect1.breadth);
        System.out.println("Area:"+ (rect1.length * rect1.breadth));
        
        
        System.out.println("Rectangle 2:");
        System.out.println("Length:"+ rect2.length);
        System.out.println("Breadth:"+ rect2.breadth);
        System.out.println("Area:"+(rect2.length * rect2.breadth));
    }
}