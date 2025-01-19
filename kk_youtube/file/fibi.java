package kk_youtube.file;
import java.util.*;

public class fibi {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int x =0;
       
       int y = 1;
    //    int z = 0;
       int count = 2;
       if(n == 0){
        System.out.println(x);
       }
       else{
       while(count <= n){
      int  z = x + y;
        x = y;
        y = z;
       
        count++;
       }
       System.out.println(y);
    }
    scan.close();
    }
}
 