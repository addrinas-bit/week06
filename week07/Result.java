package week07;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int subject1;
    int subject2;
    int subject3;
    int total;
    double percentage;
    
     public Result(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    
    void calculateTotal() {
        total = subject1 + subject2 + subject3;
    }
    
     void calculatePercentage() {
        percentage = (total / 300.0) * 100;
    }
    
    void displayResult() {
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}