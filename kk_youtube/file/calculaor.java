package kk_youtube.file;
import java.util.*;
public class calculaor {
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
     
      int ans =0;
      while(true){
        System.out.print("enter your operator: ");
      char ch = scan.next().trim().charAt(0);
        if(ch == '+'||ch == '-'||ch == '*'||ch == '/'||ch == '%'){
            System.out.print("enter your two number: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
    
            if(ch == '+'){
                ans = a +b;
            }
            if(ch == '-'){
                ans = a - b;
            }
            if(ch == '*'){
                ans = a * b;
            }
            if(ch == '/'){
                ans = a/b;
            }
            if(ch == '%'){
                ans = a%b;
            }
        }
       else  if(ch == 'X' || ch == 'x'){
            break;
        }
        else{
            System.out.println("invalid operator");
        }
        System.out.println("answer is: " + ans);
      }


    }
    
}
