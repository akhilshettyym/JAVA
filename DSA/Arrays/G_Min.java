package akhilshettyym.JAVA.DSA.Arrays;

public class G_Min {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 };

        int max = findMax(arr);
        System.out.println("The maximum number in an array is :" + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }
}