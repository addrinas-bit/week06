package Week12;
import java.util.ArrayList;


/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
    public static void main(String[] args)
    {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student("Ayush", "LIN1", 9767276030l));
        students.add(new Student("Rahul", "LIM1", 9866291561l));
        students.add(new Student("Gaurav", "LIN1", 9713065826l));
        
        System.out.println(students.get(0));
        
        for(Student std: students)
        {
            System.out.println(std);
        }
        
        for(int i=0; i<students.size(); i++)
        {
            if(students.get(i).getName().equals("Gaurav"))
            {
                students.get(i).setGroup("LIN1");
            }
        }
        
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        
        students.add(0, new Student("Aavaya", "L1C1", 9876543213L));
        
        System.out.println("std:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals("Rahul")) {
                students.get(i).setGroup("L1N2");
            }
        }
        
         System.out.println("std:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals("Ayush")) {
                students.get(i).setName("Aayush");
            }
        }

        System.out.println("std:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
    