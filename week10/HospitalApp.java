package week10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    
    public static void main(String[] args)
    {
        Doctor d1 = new Doctor(
                101,
                "Dr. Ramesh",
                "Cardiologist",
                2000
        );

        Nurse n1 = new Nurse(
                201,
                "Sita",
                "Day",
                3000
        );

        Nurse n2 = new Nurse(
                202,
                "Gita",
                "Night",
                5000
        );

        System.out.println("----- DOCTOR DETAILS -----");
        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary());
        System.out.println("Doctor Salary (with emergencies): " +
                d1.calculateSalary(4));

        System.out.println("\n----- NURSE DETAILS -----");
        System.out.println(n1);
        System.out.println("Nurse Salary: " + n1.calculateSalary());

        System.out.println("\n----- NURSE DETAILS -----");
        System.out.println(n2);
        System.out.println("Nurse Salary: " + n2.calculateSalary());
    }
}

