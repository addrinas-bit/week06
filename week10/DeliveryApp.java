package week10;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args) {

        BikeDelivery bikePartner = new BikeDelivery(101, "Ramesh", 5000);
        CarDelivery carPartner = new CarDelivery(102, "Suresh", 7000);

        System.out.println("Bike Delivery Partner Details:");
        System.out.println(bikePartner);
        System.out.println("Payment: " + bikePartner.calculatePayment());
        System.out.println("Payment with extra orders: " +
                bikePartner.calculatePayment(5));

        System.out.println("\nCar Delivery Partner Details:");
        System.out.println(carPartner);
        System.out.println("Payment: " + carPartner.calculatePayment());
        System.out.println("Payment with extra orders: " +
                carPartner.calculatePayment(3));
    }
}