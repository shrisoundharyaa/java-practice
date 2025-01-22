package kk_youtube.file.linearsearch;
import java.util.*;
public class SearchInRange {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int target = in.nextInt();
        int start = 2;
        int end = 5;
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
          arr[i] = in.nextInt();
        }
        System.out.println(search(arr,target,start,end));
        in.close();
    }
    static int search(int[] arr,int t,int start,int end){
        if(arr.length < 0){
            return -1;
        }
           for(int i=start;i<=end;i++){
            if(arr[i] == t){
                return i;
            }
           }
           return -1;
    }
}
