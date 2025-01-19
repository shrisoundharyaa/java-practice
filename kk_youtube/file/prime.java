package kk_youtube.file;
import java.util.*;

public class prime {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        find_prime(a);

    }
    static void find_prime(int n){
        if(n<=1){
            System.out.println("it is not a  prime number");
            return;
        }
        else{
            for(int i=2;i * i<n;i++){
                  if(n%i==0){
                    System.out.println("it is not a prime number");
                    return;
                  }
                  
            }
            
        }
        System.out.println("it is a prime number ");
    }
}
