import java.util.*;
public class question7
{
    public static boolean isprime(int n){
        if(n<=1) return false;
        else{
            for(int i=2;i<n/2;i++){
                if(n%2==0) return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int count =0;
         for(int i=1;i<n;i++){
             if(isprime(i)){
                 count++;
             }
         }
         System.out.println(count);
	}
}