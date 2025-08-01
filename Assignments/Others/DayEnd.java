package akhilshettyym.JAVA.Assignments.Others;
import java.util.Scanner;
public class DayEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of a week :");
        String day = sc.nextLine().trim().toLowerCase();

        switch(day){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + " is a weekday.");
                break;

            case "saturday":
            case "sunday":
                System.out.println(day + " is a weekend.");
                break;
            
            default:
                System.out.println("Invalid input!!! Please enter a valid day of the week ");
        }
        sc.close();
    }
}
