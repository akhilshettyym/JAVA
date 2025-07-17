package akhilshettyym.JAVA.Java_Basics;
import java.util.Scanner;

public class ZJ_Function {

    public static void sumOfTwo(int a, int b) {
        int sum = a + b;
        System.out.print("Sum of " + a + " and " + b + " is :" + sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a = sc.nextInt();
        System.out.print("Enter the number b :");
        int b = sc.nextInt();

        sumOfTwo(a, b);
        sc.close();
    }
}