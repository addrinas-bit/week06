package week06;
import java.util.Scanner;


/**
 * Write a description of class Week06 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week06
{
    public static void main(String[] args)
    {
        //Q-1
        int[] arr; //1D array
        arr= new int[5]; //Array construction
        int[] arrg= {10, 20, 30, 40, 50};
        
        
        
        
        //Q-2
        int[][] matrix;
        matrix= new int[3][4];
        int[][] matixx= { {1,2,3,4},{5,6,7,8},{9,1,2,3} };
        
        //Q-3
        String[] students = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};
         System.out.println("Student name");
         for (int i = 0; i< students.length; i++)
         {
           System.out.println(students[i]); 
         }
         System.out.println(students[2]);
         
         students[4]="Aayush";
         System.out.println(students[4]);
         
         students[4]="Aayush";
         Scanner scan= new Scanner(System.in);
        int index= scan.nextInt();
         String value= scan.next();
         students[index]= value;
         
         for (int i=0; i< students.length; i++) {
            System.out.println(students[i]);           
            
           }
           
         
         
}
}