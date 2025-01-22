package kk_youtube.file.linearsearch;
import java.util.*;


public class min {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
          arr[i] = in.nextInt();
        }
        System.out.println(min_num(arr));
        in.close();
    }
    static  int min_num(int[] arr){
        int min_n = 0;
        for(int i=0;i<arr.length;i++){
                if(arr[i] < min_n){
                    min_n = arr[i];
                }
        }
        return min_n;
    }
}
