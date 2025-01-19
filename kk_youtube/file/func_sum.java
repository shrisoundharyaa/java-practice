package kk_youtube.file;
import java.util.*;
public class func_sum {
    public static void main(String[] args){
        // int ans =  sum2();
        // System.out.println(ans);
        String greetingg = greet();
        System.out.println(greetingg);

          
    }
    static int sum2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the num 1: ");
        int num1 = scan.nextInt();
        System.out.print("enter the num 2: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        scan.close();
        return sum;
        
    }
    static String greet(){
        Scanner scan = new Scanner(System.in);
        String greeting = scan.nextLine();
        scan.close();
        return greeting;
    }
    static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the num 1: ");
        int num1 = scan.nextInt();
        System.out.print("enter the num 2: ");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
        scan.close();
    }
}
