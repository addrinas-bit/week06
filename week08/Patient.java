package week08;


/**
 * Write a description of class Patient here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient
{
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;

    // Parameterized constructor
    Patient(String patientName, int age, int daysAdmitted, double dailyCharge) {
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    // Getter for daysAdmitted
    public int getDaysAdmitted() {
        return daysAdmitted;
    }

    // Setter for daysAdmitted
    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    // Method to calculate total hospital bill
    double calculateTotalBill() {
        double totalBill = daysAdmitted * dailyCharge;

        // Apply 10% discount if admitted for more than 7 days
        if (daysAdmitted > 7) {
            totalBill = totalBill - (totalBill * 0.10);
        }

        return totalBill;
    }

    // Method to display patient details
    void displayDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
}

