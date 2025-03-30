package kk_youtube.file.bit_manipilation;
import java.util.*;
public class find_ith_bit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
       int i = in.nextInt();
       
       System.out.println("The " + i + "th bit of " + n + " is: " + find(n,i));
    }
    static int find( int n , int i){
         return (n & (1 << (i - 1))) != 0 ? 1 : 0;
    }
}
