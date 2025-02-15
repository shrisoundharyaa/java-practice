package kk_youtube.file.recrusion;
import java.util.*;
public class binarysearch {
    public static void main(String[] args){
        int[] arr = {2,3,55,66,78};
        int target = 78;
        int ans = search(arr, target,0,arr.length - 1);
        System.out.println(ans);

    }
    static int search(int [] arr,int t,int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s +(e - s) / 2;
        if(t == arr[mid]){
            return mid;
        }
        if( t > arr[mid]){
            return search(arr,t,mid + 1,e);
        }
        return search(arr,t,s,mid - 1);
    }
}
