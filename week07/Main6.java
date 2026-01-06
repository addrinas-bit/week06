package week07;


/**
 * Write a description of class Main6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main6
{
    public static void main(String[] args)
    {
      Result r1 = new Result(80, 75, 90);
      Result r2 = new Result(65, 70, 85);  
      
      r1.calculateTotal();
      r1.calculatePercentage();
      r1.displayResult();

        
      r2.calculateTotal();
      r2.calculatePercentage();
      r2.displayResult();
      
    }
}