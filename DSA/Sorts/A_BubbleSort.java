package akhilshettyym.JAVA.DSA.Sorts;
import java.util.Scanner;
// Time Complexity = O(n^2);
public class A_BubbleSort {
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
            for (int j = 0; j < s - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printSorted(arr);
        sc.close();
    }
}