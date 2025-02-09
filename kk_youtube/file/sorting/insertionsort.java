package kk_youtube.file.sorting;
import java.util.*;
public class insertionsort {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length - 1;i++){
            for(int j= i + 1;j > 0;j--){
                  if(arr[j] < arr[j - 1]){
                    int a=  arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                  }
            }
        }
    }
}
