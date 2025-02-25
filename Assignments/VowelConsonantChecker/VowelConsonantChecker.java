// Write a program to Check whether a character is a vowel or consonant using switch statement

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character :");
        char ch  = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("--------------");
            System.out.println(ch + " is a vowel !");
            System.out.println("--------------");
            break;
        default:
            if (ch >= 'a' && ch <= 'z'){
                System.out.println("-------------------");
                System.out.println(ch + " is a consonent !");
                System.out.println("-------------------");
            }
            else{
                System.out.println(ch + " is not a alphabet !"); 
                System.out.println("Error !!! Please enter a valid character. !");
            }
        }
        sc.close();
    }
}