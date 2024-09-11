package level1;

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect user inputs
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (r) (in percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int numberOfCompounds = scanner.nextInt();
        
        System.out.print("Enter the time in years (t): ");
        double time = scanner.nextDouble();
        
        // Convert the annual interest rate from percentage to decimal
        rate = rate / 100;
        
        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / numberOfCompounds), numberOfCompounds * time);
        
        // Calculate the compound interest
        double compoundInterest = amount - principal;
        
        // Display the results
        System.out.printf("The amount after %.2f years is: %.2f%n", time, amount);
        System.out.printf("The compound interest is: %.2f%n", compoundInterest);
        
        scanner.close();
    }
}

