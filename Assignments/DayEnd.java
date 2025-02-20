package Assignments;
import java.util.Scanner;
public class DayEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out("Enter a day of a week :");
        String day = sc.nextLine().trim().toLowerCase();

        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(day + "is a weekday.");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println(day + "is a weekend.");
                break;
            
            // default:
            //     System.out.println("Invalid input!!! Please enter a valid day of the week ");
        }
        sc.close();
    }
}
