package kk_youtube.file.sorting;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args){
        int[] arr = {1,3,5,2,8,4};
        System.out.println(Arrays.toString(arr));
        bubblesortt(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesortt(int[] arr){
        boolean swapped;
       for(int i=0;i< arr.length ;i++){
        swapped = false;
        for(int j =0;j< arr.length - 1;j++){
            if(arr[j] > arr[j + 1]){
                int a = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = a;
                swapped = true;
            }
        }
        
        if(!swapped) {
            break;
        }
       }
    }
}
