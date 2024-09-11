import java.util.*;

public class question2{
    public  boolean isprime(int n){
        if(n<=1) return true;
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        question2 obj = new question2();
        int num = scan.nextInt();
        int end = scan.nextInt();
        int count =0;
        for(int i=1;i*num<=end;i++){
            int mul = i * num;
            if(!obj.isprime(mul)){
                System.out.println(mul);
               count++;  
            }
           
    }
    System.out.println("count of mul:"+ count);
}
}