import java.util.*;
import java.util.Scanner;

public class A_ReadNumbers {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to be displayed: ");
        n = s.nextInt();
        System.out.println("The number entered is: " + n);
        s.close();
    }
}