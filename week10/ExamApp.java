package week10;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp
{
    public static void main(String[] args) {

ScienceStudents scienceStudent =
new ScienceStudents(1, "Aayush", 48);

ManagementStudents managementStudent =
new ManagementStudents(2, "Yasuu", 43);

System.out.println("Science Student:");
System.out.println(scienceStudent);
System.out.println("Result: " + scienceStudent.calculateResult());
System.out.println("Result with Grace: " +
scienceStudent.calculateResult(5));

System.out.println("\nManagement Student:");
System.out.println(managementStudent);
System.out.println("Result: " + managementStudent.calculateResult());
System.out.println("Result with Grace: " +
managementStudent.calculateResult(4));
}
}