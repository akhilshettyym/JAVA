import java.util.Scanner;
public class StarPatternInp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max number upto which u want to print a number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
    }
        for (int i = n-1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}