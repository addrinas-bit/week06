package week08;


/**
 * Write a description of class EmployeeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeTest
{
    public static void main(String[] args)
    {
        EmployeeSalary es1= new EmployeeSalary(50000000);
        es1.displayEmployeeSalary();
        es1.setbasicSalary(1200000);
        es1.displayEmployeeSalary();
        
    }
}