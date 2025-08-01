package akhilshettyym.JAVA.Assignments.Feb_25;
// 2. Write a program to convert HashMap Keys to HashSet using iterator.
import java.util.*;

public class HashMap_HashSet {
    public static void main(String[] args) {
        // HashMap with food items and their ratings
        HashMap<String, Integer> foodRating = new HashMap<String, Integer>();
        foodRating.put("Alfredo Pasta", 9);
        foodRating.put("Dum Biryani", 10);
        foodRating.put("Kori Rotti", 9);
        foodRating.put("Croissant", 7);
        foodRating.put("No Bun Burger", 8);
        foodRating.put("Lotus Biscoff Cheese Cake", 10);

        HashSet<String> food = new HashSet<String>(); // HashSet to store keys

        // Using an iterator to add keys from HashMap to HashSet
        Iterator<String> iterator = foodRating.keySet().iterator();
        while (iterator.hasNext()) {
            food.add(iterator.next());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("HashSet containing Delicacies are (keys): " + food);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
    }
}