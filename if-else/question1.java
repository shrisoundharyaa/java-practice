// positive negative number print

import java.util.Scanner;

class question1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num == 0){
            System.out.println("neither positive or negative");
        }
        else if(num > 0){
            System.out.println("number is positive");
        }
        else{
           System.out.println("the number is negative");
        }
        
    }
}
