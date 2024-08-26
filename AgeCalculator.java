
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
        String dobInput = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        LocalDate currentDate = LocalDate.now();
        
        Period age = Period.between(dob, currentDate);
        
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
    
    }
}
/*output:
 * Enter your date of birth (yyyy-MM-dd): 2003-10-20
   You are 20 years, 10 months, and 6 days old.
 */