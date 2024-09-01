import java.util.Scanner;

public class max11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of items
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        // Create an array to store the item values
        int[] items = new int[n];

        // Prompt the user to enter the item values
        System.out.println("Enter the item values (discount percentages):");
        for (int i = 0; i < n; i++) {
            items[i] = scanner.nextInt();
        }

        // Calculate the maximum product of any two items
        int maxProduct = maxProduct(items);

        // Display the result
        System.out.println("The maximum possible product of any two items is: " + maxProduct);

        scanner.close();
    }

    // Function to find the maximum product of any two items
    public static int maxProduct(int[] items) {
        int maxProduct = 0;

        // Iterate through all pairs of items and calculate their product
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                int product = items[i] * items[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}
