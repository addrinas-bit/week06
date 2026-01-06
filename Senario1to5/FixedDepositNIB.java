package Senario1to5;
import java.util.Scanner;


/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
     public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a deposit amount (Amount should be over 1000) : ");
            double P = scan.nextDouble();
            if(P<1000){
                continue;
            } 
            System.out.println("Enter annual interest rate(8-12%) : ");
            double annualrate= scan.nextDouble();
            if(annualrate > 12 || annualrate < 8){
                continue;
            }
            System.out.println("Enter duration in years, Duration should be less than 5 years : ");
            int year= scan.nextInt();
            if(year>5){
                continue;
            }
            int month= year * 12;
            double monthlyrate= annualrate/12/100;

            double A = P * Math.pow(1 + monthlyrate, month);
            double feerate= 0.005;
            double fee= P*feerate;
            double totalamount= A-fee;
            scan.nextLine();

            System.out.println("Fixed deposit amount : ");
            System.out.println("Principle : (P)" + P);
            System.out.println("Maturity : (A)" + A);
            System.out.println("Fee : " +fee);
            System.out.println("Total amount : " + totalamount);

            System.out.println("Do you want to continue ? ");
            String choice= scan.nextLine();

            if(!choice.equalsIgnoreCase("yes")){
                break;
            }
        }
    }
}