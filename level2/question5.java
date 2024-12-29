
import java.util.*;

public class question5 {
    public static int GCD(int a,int b){
        while(b !=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
     
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int gcd = GCD(a,b);
        int lcm = a*b/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}


// import java.util.*;
// import java.math.BigInteger;

// public class question5 {
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
        
//         // Input two numbers
//         int a = scan.nextInt();
//         int b = scan.nextInt();
        
//         // Compute GCD using BigInteger's gcd method
//         BigInteger bigA = BigInteger.valueOf(a);
//         BigInteger bigB = BigInteger.valueOf(b);
//         int gcd = bigA.gcd(bigB).intValue();
        

//         // Compute LCM using the formula LCM(a, b) = (a * b) / GCD(a, b)
//         int lcm = (a * b) / gcd;
        
//         // Output GCD and LCM
//         System.out.println("GCD: " + gcd);
//         System.out.println("LCM: " + lcm);
//     }
// }
