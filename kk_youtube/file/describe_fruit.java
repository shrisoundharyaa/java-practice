package kk_youtube.file;
import java.util.*;

public class describe_fruit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();

        // switch (fruit) {
        //        case "Mango":
        //            System.out.println("king of the fruit");
        //            break;
               
        //       case "Orange":
        //           System.out.println("king of the fruit");
        //           break;
              
        //       case "Apple":
        //           System.out.println("king of the fruit");
        //           break;
        //     default:
        //         System.out.println("enter a falid friut");
           
          
        // }

        String result = switch (fruit) {
            case "Mango" -> "King of the fruit";
            case "Orange" -> "Citrus fruit";
            case "Apple" -> "Keeps the doctor away";
            default -> "Enter a valid fruit";
        };

        System.out.println(result);
        scan.close();
    }
    
}
