package akhilshettyym.JAVA.DSA.Sorts;

import java.util.Scanner;

public class B_SelectionSort {
    public static void printSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.print("Enter the elements of an array :");
        for (int i = 0; i < s; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < s - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < s; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printSorted(arr);
        sc.close();
    }
}