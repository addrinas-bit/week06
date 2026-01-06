package week09;


/**
 * Write a description of class Staff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Staff extends Person
{
    int workingHours;
    double ratePerHour;

    // Constructor
    Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); // basicSalary not needed for staff
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    // Method to calculate staff salary
    double calculateSalary() {
        return workingHours * ratePerHour;
    }
}