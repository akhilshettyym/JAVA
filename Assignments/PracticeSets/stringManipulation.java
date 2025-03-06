package PracticeSets;

public class stringManipulation {
    public static void main(String[] args) {
        //Problem 1
        String name = "Hello, World!";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2
        String text = "Say I love you girl, but am out of time";
        text = text.replace(" ", "_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "AKHIL");
        System.out.println(letter);

        //Problem 4
        String text1 = "This string contains double  and tripple   spaces";
        text1 = text1.replace("  ", " ");
        text1 = text1.replace("   ", " ");
        System.out.println(text1);

    }
}
