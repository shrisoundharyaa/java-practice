package level2;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        int a1 = 0, add = 0;
        int multiply=0;
        int div=0;
        while (a != 1) {
            if (a % 2 == 0) {     
                div = a>>>1; 
                a=div; 
            } else {              
                a1 = a<<1;    
                add = a + 1;      
                multiply = add^a1;
                a=multiply; 
            }
            count++;
        }

        System.out.println(count);
    }
}
