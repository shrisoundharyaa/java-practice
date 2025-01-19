package kk_youtube.file;
import java.util.*;

public class nested {
      public static void main(String[] args){
           Scanner scan = new Scanner(System.in);
           int empid = scan.nextInt();
           scan.nextLine();  
           String depart = scan.next();

           switch(empid){
            case 1 -> System.out.println("soudharyaa shri");
            case 2 -> System.out.println("hari haran");
            case 3 -> {
                System.out.println("enter a number 3");
                switch(depart){
                     case "IT" -> System.out.println("information technology");
                     case "CSE" ->System.out.println("computer science and engineering");
                     default->System.out.println("no department found");
                }
            }
            default -> System.out.println("enter a valid id");
           }
      }
}
