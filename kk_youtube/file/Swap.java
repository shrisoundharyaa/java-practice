package kk_youtube.file;
import java.util.*;

public class Swap {
    public static void main(String[] args) {
      
        int[] arr = {1, 2, 34, 52};
        
        
        swap(arr, 0, 3);
        
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
    }
}
