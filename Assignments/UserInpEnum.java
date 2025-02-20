package Assignments;
import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class UserInpEnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = sc.nextLine().trim().toUpperCase(); // Convert input to uppercase

        try {
            Day day = Day.valueOf(input); // Convert user input to Enum
            String formattedDay = day.name().charAt(0) + day.name().substring(1).toLowerCase();

            System.out.println(String.format("%s is a %s.", 
                formattedDay, 
                day.isWeekend() ? "weekend" : "weekday"
            ));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input! Please enter a valid day.");
        }
        
        sc.close();
    }
}