// package Assignments.Feb_20;
// import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CurrentDate {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();      // To get the current date and i also did time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // To define the format 
        String formattedDate = today.format(formatter);
        System.out.println("Current Date: " + formattedDate);

        DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // (different format)
        String formattedDatee = today.format(formatterr);
        System.out.println("Current Date: " + formattedDatee);

        DateTimeFormatter formatterrr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // With time
        String formattedDateee = today.format(formatterrr);
        System.out.println("Current Date and time : " + formattedDateee);
    }
}