package kk_youtube.file.linearsearch;
import java.util.*;

public class SearchInArray {
    public static void main(String[] args){
          Scanner in = new Scanner(System.in);
          int n = in.nextInt();
          int target = in.nextInt();
          int[] arr = new int[n];
          for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
          }
          System.out.println(search(arr,target));
          in.close();

    }
    //return the index if the targe is found or other it return -1
    static int search(int[] arr,int t){
        if(arr.length < 0){
            return -1;
        }
           for(int i=0;i<arr.length;i++){
            if(arr[i] == t){
                return i;
            }
           }
           return -1;
    }
    
}
