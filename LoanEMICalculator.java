import java.util.Scanner;

public class LoanEMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal loan amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the loan tenure (in years): ");
        int tenure = scanner.nextInt();
        
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = tenure * 12;
        
        double emi = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                     / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        
        System.out.println("Your monthly EMI is: Rs" + emi);
        
    }
}
// output
// Enter the principal loan amount: 50000
// Enter the annual interest rate (in %): 1
// Enter the loan tenure (in years): 1
// Your monthly EMI is: Rs4189.270577790265