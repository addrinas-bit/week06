package week08;


/**
 * Write a description of class HospitalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalTest
{
    public static void main(String[] args) {

        Patient p1 = new Patient("Anita", 30, 5, 2000);
        Patient p2 = new Patient("Ramesh", 45, 10, 1800);

        System.out.println("---- Patient 1 Details ----");
        p1.displayDetails();
        System.out.println("Total Bill: " + p1.calculateTotalBill());

        System.out.println("\n---- Patient 2 Details ----");
        p2.displayDetails();
        System.out.println("Total Bill: " + p2.calculateTotalBill());
    }
}

