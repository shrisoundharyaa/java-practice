package kk_youtube.file.binaryseaarch;
import java.util.*;

public class ceiling {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int[] arr = {2,3,5,9,14,16,18};
    int target = 15;
    int ans  = Ceiling(arr,target);
    System.out.println(ans);
    in.close();
    }
    static int Ceiling(int[] arr,int t){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +  (end - start) / 2;
            if(t > arr[mid]){
                start = mid + 1;
            }
            else if( t < arr[mid]){
               end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
