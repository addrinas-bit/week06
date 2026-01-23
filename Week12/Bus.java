package Week12;


/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus {

    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;

    // Constructor
    public Bus(String numberPlate, String color, String route,
               String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    // Method to display bus description
    public void displayDescription() {
        System.out.println("Number Plate: " + numberPlate);
        System.out.println("Color: " + color);
        System.out.println("Route: " + route);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Available: " + availableStatus);
        System.out.println("Rate: " + rate);
    }
}
