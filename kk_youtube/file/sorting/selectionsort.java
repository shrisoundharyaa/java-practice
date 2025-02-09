package kk_youtube.file.sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args){
        int[] arr ={1,6,5,8,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastindex = arr.length - i - 1;
           int maxindex = max(arr,0,lastindex);
           swap(arr,maxindex,lastindex);
        }
    }
    static int  max(int[] arr,int i,int n){
        int maxx=i;
             for(i=0;i<=n;i++){
                if(arr[i] > arr[maxx]){
                    maxx = i;
                }
             }
             return maxx;
    }
    static void swap(int[] arr,int frist,int second){
        int a = arr[frist];
        arr[frist] = arr[second];
        arr[second] = a;
    }
}
