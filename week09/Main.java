package week09;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Ram", 30000, "Math", 5000);
        System.out.println("Teacher Annual Salary: " + teacher.calculateAnnualSalary());

        Staff staff = new Staff(2, "Sita", 160, 200);
        System.out.println("Staff Salary: " + staff.calculateSalary());

        // Printing static variable
        System.out.println("College Name: " + Person.collegeName);
    }
}