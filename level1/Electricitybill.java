package level1;
import java.util.*;

 public class Electricitybill {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       // Get the number of units consumed
       System.out.print("Enter the number of units consumed: ");
       int units = scan.nextInt();

       double billAmount = 0;

       // Calculate the bill amount based on units consumed
       if (units <= 100) {
           billAmount = units * 1.50;
       } else if (units <= 200) {
           billAmount = (100 * 1.50) + ((units - 100) * 2.50);
       } else {
           billAmount = (100 * 1.50) + (100 * 2.50) + ((units - 200) * 3.50);
       }

       // Print the bill amount formatted to two decimal places
       System.out.printf("Your total electricity bill is: $%.2f%n", billAmount);//%n similar to /n
       // Format the bill amount to two decimal places using String.format()
       String formattedBillAmount = String.format("%.2f", billAmount);

       // Print the formatted bill amount
       System.out.println("Your total electricity bill is: $" + formattedBillAmount);

       scan.close();
   }
}
