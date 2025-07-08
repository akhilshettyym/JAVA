package akhilshettyym.JAVA.Java_Basics.Basic_Part_1;

import java.util.Scanner;

public class T_DecHex {
    public static void main(String args[]) {
        int dec, rem;
        String hexdec = "";
        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a decimal number: ");
        dec = sc.nextInt();

        while (dec > 0) {
            rem = dec % 16;
            hexdec = hex[rem] + hexdec;
            dec = dec / 16;
        }

        System.out.print("Hexadecimal number is: " + hexdec + "\n");
        sc.close();
    }
}