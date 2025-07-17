package akhilshettyym.JAVA.Java_Basics;
import java.util.Scanner;

public class ZJ_Function {

    public static void sumOfTwo(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of a " + a + " and b " + b + " is :" + sum);
        return;
    }

    public static void mulOfTwo(int a, int b) {
        int mul = a * b;
        System.out.print("Product of a " + a + " and b " + b + " is :" + mul);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a = sc.nextInt();
        System.out.print("Enter the number b :");
        int b = sc.nextInt();

        sumOfTwo(a, b);
        mulOfTwo(a, b);
        sc.close();
    }
}