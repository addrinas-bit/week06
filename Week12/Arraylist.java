package Week12;
import java.util.ArrayList;


/**
 * Write a description of class Arraylist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arraylist
{
    public static void main(String[] args) {

      ArrayList <String> names= new ArrayList<>();
      names.add("Addrina");
      names.add("Yasu");
      names.add("Aayush");
      names.add("Islington");
      
      System.out.println("Names:" + names);
      
      
      ArrayList<Integer> numbers= new ArrayList<>();
      numbers.add(10);
      numbers.add(20);
      numbers.add(30);
      numbers.add(40);
      
      System.out.println("Numbers:"+ numbers);
    }
}