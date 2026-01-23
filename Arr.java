import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arr
{
    public static void main(String [] args)
    {
        //raw Arraylist
        ArrayList arrlist= new ArrayList();
        arrlist.add(101);
        arrlist.add("Addrina");
        arrlist.add(50.40);
        
        System.out.println(arrlist);
        
        arrlist.add(1, 100);
        System.out.println(arrlist);
        
        //Generic Arraylist
        ArrayList<Integer> arrylist= new ArrayList<>();
        
        System.out.println(arrylist.isEmpty());
        arrylist.add(101);
        System.out.println(arrylist.isEmpty());
        System.out.println(arrylist.size());
        
        System.out.println(arrylist);
        
        //remove, access, and update
        arrlist.remove(0);
        System.out.println(arrlist);
        
        System.out.println(arrlist.get(0));
        arrlist.set(0, 87);
        System.out.println(arrlist);
        
        //contains, indexOf, clear
        System.out.println(arrlist.contains(87));
        System.out.println(arrlist.indexOf(87));
        arrlist.clear();
        System.out.println(arrlist);
        
        //traversing an arraylist elements
        
        for(int arr: arrylist)
        {
            System.out.println(arr);
        }
        
        
        //Iterator interface
        Iterator<Integer> itr= arrlist.iterator();
         
        while(itr.hasNext())
        {
            int marks= itr.next();
            System.out.println(marks);
        }
    }
}