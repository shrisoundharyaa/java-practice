import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class midpositive10 {

    public static int findMidPositive(List<Integer> arr) {
        // Filter positive numbers
        List<Integer> positiveNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                positiveNumbers.add(num);
            }
        }

        // If there are no positive numbers, return an empty array
        if (positiveNumbers.isEmpty()) {
            return -1; // You can choose a specific value to indicate an empty result
        }

        // Sort the positive numbers in ascending order
        Collections.sort(positiveNumbers);

        // Find the middle index
        int midIndex = positiveNumbers.size() / 2;

        // Find the positive number in the exact middle
        int midPositiveNumber = positiveNumbers.get(midIndex);

        return midPositiveNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of celestial bodies: ");
        int n = scanner.nextInt();

        List<Integer> celestialBodies = new ArrayList<>();
        System.out.println("Enter the magnitudes of celestial bodies:");

        for (int i = 0; i < n; i++) {
            int magnitude = scanner.nextInt();
            celestialBodies.add(magnitude);
        }

        int result = findMidPositive(celestialBodies);
        System.out.println("The positive number in the exact middle is: " + result);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
