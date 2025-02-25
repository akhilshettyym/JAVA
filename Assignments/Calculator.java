package Assignments;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Hypotenuse");
            System.out.println("6. Area of a Circle");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice (1-8): ");

            int choice = sc.nextInt();
            double num1, num2;

            switch(choice) {

                case 1:
                System.out.println("---------------------------");
                System.out.println("\tAddition");
                System.out.println("---------------------------");
                System.out.print("Enter the first number :");
                num1 = sc.nextDouble();
                System.out.print("Enter the Second number :");               
                num2 = sc.nextDouble();
                System.out.println("---------------------------");
                System.out.println("Result : " + (num1 + num2));
                System.out.println("===========================");
                break;

                case 2:
                System.out.println("---------------------------");
                System.out.println("\tSubraction");
                System.out.println("---------------------------");
                System.out.print("Enter the first number :");
                num1 = sc.nextDouble();
                System.out.print("Enter the Second number :");               
                num2 = sc.nextDouble();
                System.out.println("---------------------------");
                System.out.println("Result : " + (num1 - num2));
                System.out.println("===========================");
                break;

                case 3:
                System.out.println("---------------------------");
                System.out.println("\tMultiplication");
                System.out.println("---------------------------");
                System.out.print("Enter the first number :");
                num1 = sc.nextDouble();
                System.out.print("Enter the Second number :");               
                num2 = sc.nextDouble();
                System.out.println("---------------------------");
                System.out.println("Result : " + (num1 * num2));
                System.out.println("===========================");
                break;

                case 4:
                System.out.println("---------------------------");
                System.out.println("\tDivision");
                System.out.println("---------------------------");
                System.out.print("Enter the first number :");
                num1 = sc.nextDouble();
                System.out.print("Enter the Second number :");               
                num2 = sc.nextDouble();
                if (num2 != 0){
                    System.out.println("---------------------------");
                    System.out.println("Result : " + (num1 / num2));
                    System.out.println("===========================");
                }
                else{
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

                case 5:
                System.out.println("---------------------------");
                System.out.println("\tHypotenuse");
                System.out.println("---------------------------");
                System.out.print("Enter the first side of the triangle :");
                double a = sc.nextDouble();
                System.out.print("Enter the Second side of the triangle :");
                double b = sc.nextDouble();
                System.out.println("-----------------------------------------------");
                System.out.println("Hypotensue of a triangle is :" + Math.hypot(a, b));
                System.out.println("===============================================");
                break;

                case 6:
                System.out.println("---------------------------------");
                System.out.println("\tArea of a circle");
                System.out.println("---------------------------------");
                System.out.print("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                System.out.println("---------------------------");
                System.out.println("Area of Circle: " + (3.14 * r * r));
                System.out.println("===========================");
                break;

                case 7:
                System.out.println("---------------------------");
                System.out.println("\tSquare root");
                System.out.println("---------------------------");
                System.out.print("Enter a number: ");
                double n = sc.nextDouble();
                if (n >= 0) {
                    System.out.println("---------------------------");
                    System.out.println("Square Root: " + Math.sqrt(n));
                    System.out.println("===========================");
                } else {
                    System.out.println("Error: Square root of a negative number is not defined!");
                }
                break;

                case 8:
                System.out.println("---------------------------");
                System.out.println("Exiting the calculator...");
                System.out.println("---------------------------");
                sc.close();
                System.exit(0);

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                }   
       }
    }
}