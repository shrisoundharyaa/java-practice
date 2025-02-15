package kk_youtube.file.recrusion;
import java.util.*;
public class fibo {
    public static void main (String[] args){
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int ans = fibformula(n);
         System.out.println(ans);
         in.close();
    }
    //we derived this from formula...
    static int  fibformula(int n){
        //just for demo , use long instead
        return (int) (Math.pow(((1 + Math.sqrt(5))/ 2),n ) / Math.sqrt(5));
    }
    static int fib(int n){
        if(n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
