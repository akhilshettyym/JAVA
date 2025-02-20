package Assignments;
import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;         // Fixed constants

    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;                          // Method checks wtr the day is weekend (Sat or sun)
    }
}

public class UserInpEnum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = sc.nextLine().trim().toUpperCase();          // Convert input to uppercase and trim cuz if extar spaces gievn by user

        try {
            Day day = Day.valueOf(input); // Converting user inp to Enum 
            // that is if input from user is Monday then  |||   day = Day.Monday

            String formattedDay = day.name().charAt(0) + day.name().substring(1).toLowerCase();
            // This will first take the name using day. and it'll obtain the first letter say M from Monday
            // Then the rest of the string will be converted to lowercase that is from index 1.

            System.out.println(String.format("%s is a %s.", formattedDay, // for first %s wll return the formatted day 
                day.isWeekend() ? "weekend" : "weekday"                          // This will check wtr the day is weekday or weekend from above
            ));

        } catch (IllegalArgumentException e) {          // if user inputs sanday/ funday the Day.valueOf(input will throw an error) this is caught by catch block.
            System.out.println("Invalid input! Please enter a valid day.");
        }
        
        sc.close();
    }
}