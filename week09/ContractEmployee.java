package week09;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employee
{
    private int workingDays;

    // Constructor using super
    public ContractEmployee(int employeeId, String name, double basicSalary,
                            int workingDays) {
        super(employeeId, name, basicSalary);
        this.workingDays = workingDays;
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return basicSalary * workingDays;
    }
}

