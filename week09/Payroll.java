package week09;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(String[] args) {

        // Permanent Employee object
        PermanentEmployee pe =
                new PermanentEmployee(101, "Aarav", 40000, 8000, 6000);

        System.out.println("---- Permanent Employee ----");
        pe.displayEmployee();
        System.out.println("Total Salary : " + pe.calculateTotalSalary());

        System.out.println();

        // Contract Employee object
        ContractEmployee ce =
                new ContractEmployee(201, "Sita", 1500, 20);

        System.out.println("---- Contract Employee ----");
        ce.displayEmployee();
        System.out.println("Total Salary : " + ce.calculateTotalSalary());
    }
}

