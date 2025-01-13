package kk_youtube.file;
import java.util.*;

public class fibiseries {
    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int n  = scan.nextInt();
       int x=0;
       int  y = 1;
       System.out.printf("%d %d",x,y);
       int count = 2;
       while(count <= n){
          int z = x + y;
          System.out.printf( " "+"%d"+ " ",z);
          x =y;
          y = z;
          count ++;
       }
    }
}
