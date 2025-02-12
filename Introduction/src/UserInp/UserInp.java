import java.util.Scanner;

public class UserInp {
    public static void main(String[] args) {
        System.out.println("It works !!!");
        Scanner sc = new Scanner(System.in); // System.in is to read from the keyboard.
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();        //float can also be used
        System.out.println("Enter the second number :");
        int num2 =sc.nextInt(); 
        int sum = num1+num2;
        System.out.println("The sum of the two numbers is :");
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        String str = sc.next(); // used to read just one word
        String str = sc.nextLine(); // used to read just one whole sentence
        System.out.println(str);

    }
}