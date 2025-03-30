package kk_youtube.file.bit_manipilation;
import java.util.*;
public class LC231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      System.out.println( check(n));
       scan.close();
    }
    static boolean  check(int n){
        if(n == 1) return true;
        if(n <= 0) return false;
        return (n & (n - 1)) == 0 ? true : false;
    }
   

}
