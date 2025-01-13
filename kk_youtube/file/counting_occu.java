package kk_youtube.file;
import java.util.*;

public class counting_occu {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        long  n = scan.nextLong();
        int target = scan.nextInt();
        Long temp =n;
        int count =0;
        while(temp>0){
            int rem = (int)(temp % 10);
            if(rem == target){
                count++;
            }
            temp = temp/10;
        }
        System.out.printf("ocuurance of %d is %d",n,count);
    }
}  
