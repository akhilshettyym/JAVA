package Assignments;
import java.util.Scanner;

enum Day {
    sunday, monday, tuesday, wednesday, thursday, friday, saturday;

    public boolean isWeekend(){
        return this == saturday || this == sunday;
    }
}

public class UserInpEnum {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a day of the week :");
        String input = sc.nextLine().trim().toUpperCase();

        try{
            Day day = Day.valueOf(input);
            System.out.println(String.format("%s is a %s.", day.name().charAt(0),
             day.name.substring(1).toLowerCase(),
             day.isWeekend() ? "weekend" : "weekday"
            ));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input ! Please enter a valid day");
        }
        sc.close();
    }
}
