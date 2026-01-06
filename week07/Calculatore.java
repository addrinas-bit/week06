package week07;


/**
 * Write a description of class Calculatore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculatore
{
    // instance methods --> objects needs to be created
    //void retuentype + no parameters
     public void displayInfo()
     {
        System.out.println("Welcome to calculator app");
     }
     
     //void return type+ parameters
     public void add(int a, int b)
     {
         System.out.println("The sum oof two numbers are: "+(a+b));
     }
     //return type+ no parameters
     public int getFixedNumber()
     {
         return 10;
     }
      //return type+ parameters
      public int multiply(int a, int b)
      {
          return a*b;
      }
      //Static methods -->className reference
      public static int square(int a)
      {
        return a*a;  
      }
          
      }
     
