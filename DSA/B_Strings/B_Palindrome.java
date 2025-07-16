package akhilshettyym.JAVA.DSA.B_Strings;

public class B_Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";

        System.out.println("Reversed String :" + isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}