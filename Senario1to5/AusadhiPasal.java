package Senario1to5;
import java.util.Scanner;


/**
 * Write a description of class AusadhiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AusadhiPasal
{
    public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      System.out.println("enter medicine");
      String medicine1 = scan.nextLine();
      String medicine2 = scan.nextLine();
      String medicine3 = scan.nextLine();

      System.out.println("Quantities");
      int available1 = scan.nextInt();
      int available2 = scan.nextInt();
      int available3 = scan.nextInt();

      System.out.println("Price");
      double price1 = scan.nextDouble();
      double price2 = scan.nextDouble();
      double price3 = scan.nextDouble();

      scan.nextLine();

      System.out.println("Aushadi Pasal");
      System.out.println(medicine1 + " , " + " Quantity : " + available1 + ", " + " Price: "+ price1);
      System.out.println(medicine2 + " , " + " Quantity : " + available2 + ", " + " Price: "+ price2);
      System.out.println(medicine3 + " , " + " Quantity : " + available3 + ", " + " Price: "+ price3);

      scan.close();






    }

}

