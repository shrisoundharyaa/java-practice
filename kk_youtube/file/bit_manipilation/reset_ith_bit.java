package kk_youtube.file.bit_manipilation;
import java.util.*;
public class reset_ith_bit {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
   int i = in.nextInt();
    int ans = find(n,i);
    System.out.println(ans);
}

static int find( int n , int i){
    int ans = (n & ~ (1 << (i - 1)));
    return ans;
}
}
