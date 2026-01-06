package Senario1to5;
import java.util.Scanner;


/**
 * Write a description of class XFXcinema here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class XFXcinema
{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double totalprice;

        System.out.println("Select age group Child/Adult/Senior: ");
        String agegroup = scan.nextLine();

        System.out.println("Select movie language English/Nepali/Hindi: ");
        String language = scan.nextLine();

        System.out.println(" Are they registered student? yes/no : ");
        String student = scan.nextLine();
        
        System.out.println("Is It festival day? yes/no : ");
        String festival = scan.nextLine();

        switch (agegroup) {
            case "child":
                totalprice = 150.0;
                break;
            case "adult":
                totalprice = 250.0;
                break;
            case "senior":
                totalprice = 200.0;
                break;
            default:
                System.out.println("Invalid age group");
                return;
        }

        switch (language) {
            case "hindi":
                totalprice += 50.0; 
                System.out.println("Hindi Surcharge (+Rs. 50): Rs. " + totalprice);
                break;
            case "english":
                totalprice += 100.0; 
                System.out.println("English Surcharge (+Rs. 100): Rs. " + totalprice);
                break;
            case "nepali":
                System.out.println("Nepali Movie: No is Surcharge.");
                break;
            default:
                System.out.println("language is not available. No surcharge is applied.");
        }

        if (student.equals("yes")){
            double studentDiscount = totalprice * 0.20;
            totalprice -= studentDiscount;
            System.out.println("Student Discount: Rs. " + studentDiscount);
        }
        
        if (festival.equals("yes")) {
            double festivalDiscount = totalprice * 0.15;
            totalprice -= festivalDiscount;
            System.out.println("Festival Discount: Rs. " + festivalDiscount);
        }
        
        System.out.println("TOTAL TICKET PRICE: Rs. " + totalprice);

    }
}
