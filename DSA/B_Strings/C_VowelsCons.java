package akhilshettyym.JAVA.DSA.B_Strings;

public class C_VowelsCons {
    public static void main(String[] args) {
        String str = "akhil";
        countVowelsAndConsonants(str);
    }

    public static void countVowelsAndConsonants(String s) {
        int vowels = 0;
        int consonants = 0;
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels:" + vowels + " consonants " + consonants);
    }
}