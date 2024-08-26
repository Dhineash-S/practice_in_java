
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        

        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);
        

        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        

        System.out.println("The number of days between " + firstDate + " and " + secondDate + " is: " + daysBetween + " days.");
        
    }
}
// output:
// Enter the first date (yyyy-MM-dd): 2021-12-16
// Enter the second date (yyyy-MM-dd): 2024-12-16
// The number of days between 2021-12-16 and 2024-12-16 is: 1096 days.