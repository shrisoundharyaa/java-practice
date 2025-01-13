/*
  Largest Number
 */

package kk_youtube.file;
import java.util.*;

public class Largest_number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        // if(a>b && a>c){
        //     System.out.println("a is grater than b and c");
        // }
        // else if(b>c){
        //     System.out.println("b is grater than a, c");
        // }
       
        // else{
        //     System.out.println("c is grater than a,b");
        // }

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.println("Largest number is " + max);

        int max = Math.max(c, Math.max(a,b));
        System.out.println("largest number is " + max);

    }
}
