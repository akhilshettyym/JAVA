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
        String input = sc.nextLine().trim().toUpperCase();                  

        try {
            Day day = Day.valueOf(input);                                   
            String formattedDay = day.name().charAt(0) + day.name().substring(1).toLowerCase();
                                                                            
            System.out.println(String.format("%s is a %s.", formattedDay, day.isWeekend() ? "weekend" : "weekday"));

        } catch (IllegalArgumentException e) {          
            System.out.println("Invalid input! Please enter a valid day.");
        }
        

        sc.close();
    }
}

/*5 - Fixed constants
8 - Method checks wtr the day is weekend (Sat or sun)
17 - Convert input to uppercase and trim cuz if extar spaces gievn by user
Converting user inp to Enum 
that is if input from user is Monday then  |||   day = Day.Monday 

This will first take the name using day. and it'll obtain the first letter say M from Monday
Then the rest of the string will be converted to lowercase that is from index 1.
for first %s wll return the formatted day 
This will check wtr the day is weekday or weekend from above
if user inputs sanday/ funday the Day.valueOf(input will throw an error) this is caught by catch block.

*/