package Assignments;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CurrentDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();      // To get the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // To define the format 
        String formattedDate = today.format(formatter);
        System.out.println("Current Date: " + formattedDate);

        DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // (different format)
        String formattedDatee = today.format(formatterr);
        System.out.println("Current Date: " + formattedDatee);

        DateTimeFormatter formatterrr = DateTimeFormatter.ofPattern("yyyy-MM-dd"; "hrs:min:sec"); // (different format)
        String formattedDateee = today.format(formatterrr);
        System.out.println("Current Date: " + formattedDateee);
    }
}