package kk_youtube.file;
import java.util.*;

public class Reverse2 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr);
       

    }
     static void reverse2(int[] arr1){
           int start =0;
           int end = arr1.length - 1;
           while(start < end){
            swap(arr1,start,end);
            start++;
            end--;
           }
     }

     static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
 }
    
 //metthod 2
 static void reverse(int[] arr){
        for(int i=arr.length -1;i>=0 ;i--){
             System.out.print(arr[i]+" ");

        }
    }
}
