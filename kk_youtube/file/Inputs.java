package kk_youtube.file;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter you rollnumber: ");
        int rollnum = scan.nextInt();
        
        scan.nextLine(); 
        System.out.println("your roll number is " + rollnum);
       
        
        System.out.print("enter your name : ");
        String name = scan.nextLine();
        System.out.println("your name is  : " + name);

        System.out.print("enter your name : ");
        char fristhalf = scan.next().charAt(0);
        scan.nextLine(); 
        System.out.println(" fristhalf of your name is  : " + fristhalf);

      

        System.out.print("enter your Area : ");
        float Area = scan.nextFloat();
        System.out.println("Area is " + Area);
        
        

        System.out.print("enter your Perimeter : ");
        double Perimeter = scan.nextDouble();
        System.out.println("Perimeter is " + Perimeter);

        System.out.print("Enter a boolean value (true/false): ");
        boolean flag = scan.nextBoolean(); // Reads a boolean value
        System.out.println("You entered: " + flag);
       


    }
}
