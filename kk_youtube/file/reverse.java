package kk_youtube.file;
import java.util.*;

public class reverse {
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          long n = scan.nextLong();
          long rev = 0;
          long temp = n;
          while(temp>0){
            long rem =  temp%10;
            rev = (rev * 10)+ rem;
            temp = temp/10;
          }
          System.out.println(rev);
          scan.close();
    }
}
