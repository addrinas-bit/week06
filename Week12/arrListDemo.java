package Week12;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * Write a description of class arrListDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        
        System.out.println("numbers:"+numbers);
        
        names.add("Addrina");
        names.add("Aayush");
        names.add("Yashaswi");
        names.add("Islington");
        names.add("Shrestha");
        names.add("Workshop");
        
        System.out.println("names:"+names);
        
        for(int arrListDemo: numbers)
        {
            System.out.println(arrListDemo);
        }
        
        for(String arrListDemo: names)
        {
            System.out.println(arrListDemo);
        }
        
        Iterator<Integer> itr= numbers.iterator();
         
        while(itr.hasNext())
        {
            int marks= itr.next();
            System.out.println(marks);
        }
        
        Iterator<String> it= names.iterator();
         
        while(it.hasNext())
        {
            String name= it.next();
            System.out.println(name);
        }
        
        //remove
        names.remove(2);
        
        //size
        System.out.println(names.size());
        System.out.println(numbers.size());
        
        //clear
        numbers.clear();
        System.out.println(numbers);
        
        //get and set
        System.out.println(names.get(3));
        names.add("Florence");
        System.out.println(names.get(5));


    }
}