package akhilshettyym.JAVA.Java_Basics.Basic_Part_1;
import java.util.Scanner;
public class K_AreaPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :");
        int r = sc.nextInt();
        System.out.println("Perimeter of the circle is :"+ (2*3.14*r));
        System.out.println("Area of the circle is :"+ (3.14*(r^2)));
        sc.close();
    }
}
