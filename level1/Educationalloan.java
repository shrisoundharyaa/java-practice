package level1;
import java.util.*;

public class Educationalloan {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int age = scan.nextInt();
      
      if (age>=18 && age<=30){
        System.out.println("you are eligible for loan $20000");
      }
      else {
        System.out.println("you are not eligible for loan");
      }
    }
}
