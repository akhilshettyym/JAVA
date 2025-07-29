package akhilshettyym.JAVA.DSA.Functions;
import java.util.Scanner;

public class A_Avg {
    public static void avgOfTwo(int num1, int num2, int num3) {
        int avg = (num1 + num2 + num3) / 3;
        System.out.println("The average of numbers are :" + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number :");
        int num3 = sc.nextInt();
        avgOfTwo(num1, num2, num3);
        sc.close();
    }
}