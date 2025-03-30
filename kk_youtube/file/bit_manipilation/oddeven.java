package kk_youtube.file.bit_manipilation;
import java.util.*;
public class oddeven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.err.println(odd(n)); 
       in.close();
    }
    static boolean odd(int i){
        return ((i & 1) == 1);
    }
}
