import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{




    public static void main(String[] args) {

        // Create generic ArrayLists
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        // Add elements to numbers ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Add String elements to names ArrayList
        names.add("Ram");
        names.add("Sita");
        names.add("Hari");
        names.add("Gita");
        names.add("Nita");
        names.add("Rita");

        // Traverse using for-each loop
        System.out.println("Numbers (for-each loop):");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nNames (for-each loop):");
        for (String name : names) {
            System.out.println(name);
        }

        // Traverse using Iterator interface
        System.out.println("\nNumbers (Iterator):");
        Iterator<Integer> numIterator = numbers.iterator();
        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }

        System.out.println("\nNames (Iterator):");
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

        // Remove the 3rd element of names ArrayList (index 2)
        names.remove(2);

        // Print size of both ArrayLists
        System.out.println("\nSize of numbers ArrayList: " + numbers.size());
        System.out.println("Size of names ArrayList: " + names.size());

        // Clear all items of numbers ArrayList
        numbers.clear();

        // Get the 3rd and 5th element of names ArrayList
        System.out.println("\n3rd element of names: " + names.get(2));
        System.out.println("5th element of names: " + names.get(4));
    }
}



