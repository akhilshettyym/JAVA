package akhilshettyym.JAVA.Assignments.Others;

import java.util.ArrayList;
import java.util.Collections;
public class AutoBoxing {
    public static void main(String[] args) {


        // Autoboxing
        ArrayList<Integer> numbers = new ArrayList<>();     // Array list creation

        // Adding integer values (AutoBoxing as said will happen automatically)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Printing the ArrayList
        System.out.println("-----------------------------------------");
        System.out.println("Conversion of an int back to integer !!!");
        System.out.println("------------------------------------------");
        System.out.println("Array elements are : " + numbers);

        numbers.remove(Integer.valueOf(30));
        System.out.println("Updated list after the removal of an element from the Array list :" + numbers);

        int maxValue = Collections.max(numbers);
        System.out.println("The maximum value in the Array list is :" + maxValue + "\n");

        // Unboxing : happens automatically when get is used
        System.out.println("--------------------------------------------------------");
        System.out.println("Conversion of an interger back to its primitive int !!!");
        System.out.println("--------------------------------------------------------");
        int num = numbers.get(1);
        System.out.println("The value at index 1 is : " + num + "\n");
    }
}