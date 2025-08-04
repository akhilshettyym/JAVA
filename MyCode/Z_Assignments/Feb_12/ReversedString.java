package akhilshettyym.JAVA.MyCode.Z_Assignments.Feb_12;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        System.out.println("The reveresed string is :" + reversed);
        // System.out.println(reversed);
        sc.close();
    }
}