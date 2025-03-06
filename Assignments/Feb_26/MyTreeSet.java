// package Assignments.Feb_26;
/*By using  TreeSet and TreeMap, perform basic operations like adding elements to them, addition, 
deletion and iteration for below examples.
1.For TreeSet use Integer.*/
import java.util.TreeSet;
public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> SetTree = new TreeSet<Integer>();
        SetTree.add(70);
        SetTree.add(49);
        SetTree.add(36);
        SetTree.add(13);
        SetTree.add(100);
        System.out.println("------------------------------------------");
        System.out.println("A sorted array is produced automatically.");
        System.out.println("SetTree: " + SetTree);
        System.out.println("------------------------------------------");

        // Checking if specific element exists.
        System.out.println("Checking if specific element exists.");
        System.out.println("Is 49 in the set? " + SetTree.contains(49));
        System.out.println("Is 50 in the set? " + SetTree.contains(50));
        System.out.println("------------------------------------------");

        // Getting the first (smallest) element and last (largest) element.
        System.out.println("Getting the first (smallest) element");
        System.out.println("Smallest (first) element is: " + SetTree.first());
        System.out.println("Largest (last) elemnet is : " + SetTree.last());
        System.out.println("----------------------------------------------------");

        // Removing an element
        SetTree.remove(100);
        System.out.println("After removing '100' from the list :" +SetTree);
        System.out.println("----------------------------------------------------");

        // Getting higher and lower elements
        System.out.println("Element higher than 70: " + SetTree.higher(70));
        System.out.println("Element lower than 36: " + SetTree.lower(36));
        System.out.println("----------------------------------------------------");

        // Polling first and last elements (retrieves and removes)
        System.out.println("Polling first element: " + SetTree.pollFirst());
        System.out.println("Polling last element: " + SetTree.pollLast());
        System.out.println("SetTree after polling: " + SetTree);
        System.out.println("----------------------------------------------------");

        // Printing elements in descending order
        System.out.println("SetTree in Descending Order: " + SetTree.descendingSet());
        System.out.println("----------------------------------------------------");

        // Checking size of the SetTree
        System.out.println("Size of SetTree: " + SetTree.size());
        System.out.println("----------------------------------------------------");

        // Checking if the SetTree is empty
        System.out.println("Is SetTree empty? " + SetTree.isEmpty());
        System.out.println("----------------------------------------------------");

        // Clearing all elements
        SetTree.clear();
        System.out.println("SetTree after clear(): " + SetTree);
        System.out.println("----------------------------------------------------");
    }
}
