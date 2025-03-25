package kk_youtube.file.Math;
import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<=n;i++){
        System.out.println( i + " " +isprime(i));
        in.close();
        }

    }
    static boolean isprime(int n){
        if(n <= 1) return false;
        for(int i = 2; i * i <= n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
