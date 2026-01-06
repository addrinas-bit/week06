package week08;


/**
 * Write a description of class EmployeeSalary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSalary
{
    private double basicSalary;
    
    public EmployeeSalary(double basicSalary)
    {
        this.basicSalary= basicSalary;
    }
    
    public void setbasicSalary(double basicSalary)
    {
        this.basicSalary= basicSalary;
    }
    public double getbasicSalary()
    {
        return this.basicSalary= basicSalary;
    }
    
    public double calculateGrossSalary()
    {
        double bonus= 0.20* this.basicSalary;
        return this.basicSalary+bonus;
    }
    
    public void displayEmployeeSalary()
    {
        System.out.println("Basic Salary:"+ getbasicSalary());
        double grossSalary= calculateGrossSalary();
        System.out.println("Gross Salary:"+ grossSalary);
        
        
        
    }
}