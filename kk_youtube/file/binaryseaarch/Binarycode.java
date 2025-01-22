package kk_youtube.file.binaryseaarch;
import java.util.*;

public class Binarycode {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int[] arr = {2,45,67,89,90,234,678};
       int target = 45;
       int ans = binarysearch(arr,target);
       System.out.println(ans);
       in.close();
    }
    static int binarysearch(int[] arr,int t){   
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // int mid = (start + end) / 2;
            //betterway to find mid reason in note
            int mid = start + (end - start) / 2;
            if(t > arr[mid]){
               start = mid + 1;
            }
            else if(t < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
