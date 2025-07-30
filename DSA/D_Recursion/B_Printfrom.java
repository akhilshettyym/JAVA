package akhilshettyym.JAVA.DSA.D_Recursion;

import java.util.Scanner;

public class B_Printfrom {
    // using for loop
    public static void printNum1(int init, int fin){
        for(int i=init; i<=fin; i++){
            System.out.println(i);
        }
    }
    
    // Using recurion
    public static void printNum2(int init, int fin){
        if(init == fin){
            return;
        }
        System.out.println(init);
        printNum2(init-1, fin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your choice - (1:for loop) and (2:Recursion) :");
        int c = sc.nextInt();
        
        if(c == 1){
            System.out.println("Running for loop ...");
            System.out.print("Enter the initial value :");
            int init = sc.nextInt();
            System.out.print("Enter the final value :");
            int fin = sc.nextInt();
            
            printNum1(init, fin);
        } else {
            System.out.println("Running for recursion ...");
            System.out.print("Enter the initial value :");
            int init = sc.nextInt();
            System.out.print("Enter the final value :");
            int fin = sc.nextInt();
           
            printNum2(init, fin);
        }
        sc.close();
}
}
