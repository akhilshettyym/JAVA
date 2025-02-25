package Assignments.Percentage;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("PERCENTAGE CALCULATOR !!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of each subject:");

        System.out.print("Enter the marks of subject 1: ");
        float s1 = sc.nextFloat();
        
        System.out.print("Enter the marks of subject 2: ");
        float s2 = sc.nextFloat();
        
        System.out.print("Enter the marks of subject 3: ");
        float s3 = sc.nextFloat();
        
        System.out.print("Enter the marks of subject 4: ");
        float s4 = sc.nextFloat();
        
        System.out.print("Enter the marks of subject 5: ");
        float s5 = sc.nextFloat();
        
        System.out.print("Enter the marks of subject 6: ");
        float s6 = sc.nextFloat();

        sc.close();

        float total = s1 + s2 + s3 + s4 + s5 + s6;
        System.out.println("Total marks out of 600: " + total);

        float percentage = (total / 600) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}