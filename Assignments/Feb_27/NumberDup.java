package Assignments.Feb_27;
// 2. Write a Java program that reads a list of integers from the user and throws ane
// exception if any numbers are duplicates.
import java.util.*;

public class NumberDup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> numbers = new HashSet<Integer>(); // cuz no duplicates

        System.out.println("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().split(" ");

        try {
            for (String num : input) {
                int number = Integer.parseInt(num);
                if (!numbers.add(number)) {
                    throw new RuntimeException("Duplicate number found: " + number);
                }
            }
            System.out.println("All numbers are unique! ");
        } 
        
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        
        finally {
            sc.close();
        }
    }
}