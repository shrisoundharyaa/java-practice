package kk_youtube.file.Math;
import java.util.*;
//prime number upto n  Sieve of Eratosthenes algorithm 
public class Seive {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] primes = new boolean[n + 1];
        for(int i = 2;i*i<=n;i++){
            if(!primes[i]){
                for(int j = i * 2;j <=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i + " ");
            }
        }
        in.close();
    }
}
