package kk_youtube.file;
import java.util.*;


public class armstrong {

    static int count(int n){
        int m =  0;
        int temp = n;
        while(temp>0){
            m++;
            temp = temp/10;
        }
        return m;
    }

    static int total(int n,int s){
        int temp = n;
        int count = 0;
        while(temp>0){
           int rem = temp%10;
           count += (int) Math.pow(rem,s) ;  
           temp = temp/10;  
           

        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int size = count(num);
        int arm = total(num,size);
        if(num == arm){
            System.out.println("it is a armstrong number");
        }
        else{
            System.out.println("it is  not a armstrong number");
        }
        scan.close();
    }
}
