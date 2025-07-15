package akhilshettyym.JAVA.Programs.ArrayOperation;

import java.util.HashSet;

public class K_Unique {
  public static void main(String[] args) {
    int[] arr = {2, 3, 2, 4, 5, 3, 6};

    HashSet<Integer> unique = new HashSet<>();

    System.out.println("Array without duplicates:");
    for (int num : arr) {
      if (unique.add(num)) {
        System.out.print(num + " ");
      }
    }
  }
}