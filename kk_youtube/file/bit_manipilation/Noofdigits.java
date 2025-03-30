package kk_youtube.file.bit_manipilation;
import java.util.*;
public class Noofdigits {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int base =  10;
        int  ans =  (int) ( Math.log(n)/ Math.log(base)) + 1;
        System.out.println(ans);;
        in.close();
    }
}
