package week10;


/**
 * Write a description of class Deliverypartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deliverypartner
{
    private int partnerId;
    private String name;
    private double basePay;

    // Constructor
    public Deliverypartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    // Getters and Setters
    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    // Method to be overridden
    public double calculatePayment() {
        return basePay;
    }

    // toString() method
    @Override
    public String toString() {
        return "Partner ID: " + partnerId +
               ", Name: " + name +
               ", Base Pay: " + basePay;
    }
}