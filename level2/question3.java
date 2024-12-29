import java.util.*;

public class question3 {
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
        
          while(a>=10){
            int temp = a;
            int sum = 0;
          while(temp>0){
            int rem = temp%10;
            sum += rem;
            temp/=10;
          }
          a = sum;
        }
          
          System.out.println(a);
    }
}
