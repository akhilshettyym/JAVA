// package Assignments.Feb_26;
/*By using  TreeSet and TreeMap, perform basic operations like adding elements to them, addition, 
deletion and iteration for below examples.
2.For TreeMap use String as Key and String as a Value.*/
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("One", "Apple");
        map.put("Three", "Banana");
        map.put("Four", "Cherry");
        map.put("Five", "Date");
        map.put("Two", "Blueberry");
        System.out.println("-------------------------------------------------------------------------------------------------");
        // Displaying the TreeMap (Keys are automatically sorted in ascending order which is default)
        System.out.println("TreeMap: " + map);
        System.out.println("-------------------------------------------------------------------------------------------------");


        // Accessing an element
        System.out.println("Value of key 'Three': " + map.get("Three"));
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Removing an element
        map.remove("Four");
        System.out.println("After removing key 'Four': " + map);
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Checking if a key or value exists
        System.out.println("Contains key 'Two'? " + map.containsKey("Two"));
        System.out.println("Contains value 'Cherry'? " + map.containsValue("Cherry"));
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Iterating through TreeMap using forEach
        System.out.println("Iterating over TreeMap:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("First Key: " + map.firstKey());   
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher Key than 'Three': " + map.higherKey("Three"));
        System.out.println("Lower Key than 'Three': " + map.lowerKey("Three"));
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Keys before 'Four': " + map.headMap("Four"));
        System.out.println("Keys from 'Three' onwards: " + map.tailMap("Three"));
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Keys from 'Two' to 'Four' in Descending Order: " + map.descendingMap().subMap("Two", "Four"));
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Sorting in descending order
        System.out.println("Descending Order TreeMap: " + map.descendingMap());
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}