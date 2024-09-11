package level1;

import java.util.Scanner;

public class NumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Convert to octal
        String octalString = Integer.toOctalString(number);
        System.out.println("Octal: " + octalString);
        
        // Convert to hexadecimal
        String hexString = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hexString.toUpperCase());
        
        // Convert to binary (optional)
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary: " + binaryString);
        
        // Decimal is the number itself
        System.out.println("Decimal: " + number);
        
        scanner.close();
    }
}

