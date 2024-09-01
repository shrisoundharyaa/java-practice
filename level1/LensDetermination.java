package level1;

import java.util.Scanner;

public class LensDetermination {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter your vision type (Nearsighted/Farsighted): ");
        String visionType = scanner.nextLine();
        
        // Determine the lens type
        String lensType = determineLensType(visionType);
        
        // Display the result
        if (lensType != null) {
            System.out.println("Suitable Lens Type: " + lensType);
        } else {
            System.out.println("Invalid vision type entered. Please consult an eye specialist.");
        }
        
        scanner.close();
    }
    
    public static String determineLensType(String visionType) {
        if ("Nearsighted".equalsIgnoreCase(visionType)) {
            return "Concave Lens";
        } else if ("Farsighted".equalsIgnoreCase(visionType)) {
            return "Convex Lens";
        } else {
            return null;
        }
    }
}
