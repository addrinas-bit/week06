package week09;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employee
{
    private double hra;
    private double da;

    public PermanentEmployee(int employeeId, String name, double basicSalary,
                             double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    public double calculateTotalSalary() {
        return basicSalary + hra + da + calculateBonus();
    }
}

