package level1;

import java.util.Scanner;

 class StringCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect user input
        System.out.print("Enter a string: ");
        String word= scanner.nextLine();
        
        // Convert to lowercase
        String lowerCaseString = word.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);
        
        // Convert to uppercase
        String upperCaseString = word.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);
        
        scanner.close();
    }
}

