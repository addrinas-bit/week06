package week08;


/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
   //attribute
    private int id;
   private String name;
   private String address;
   private long phoneNumber;
   private static String collegeName = "United College";
   
   
   
   //setters and getter (string name)
   //constructor(class name)
    public Students(int id, String name, String address, long phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    //behaviour
    public void DisplayInfo()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
    
}