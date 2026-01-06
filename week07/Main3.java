package week07;


/**
 * Write a description of class Main3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main3
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee(1, "Addrina", 150000);
        Employee emp2 = new Employee(2, "Yashaswi", 140000);
        Employee emp3 = new Employee(3, "Aayush", 130000);
        
        System.out.println("Employee Details:");
        System.out.println( emp1.id + " " + emp1.name + " " + emp1.salary);
        System.out.println(emp2.id + " " + emp2.name + " " + emp2.salary);
        System.out.println(emp3.id + " " + emp3.name + " " + emp3.salary);
        
        //Highest salary
        Employee highest = emp1;

        if (emp2.salary > highest.salary) {
            highest = emp2;
        }
        if (emp3.salary > highest.salary) {
            highest = emp3;
        }
        
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println("ID: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);
        
        
        
        
        
        
    }
}