package dp;
import java.util.*;
public class rope {
    public static void main(String[] args){
        int arr[] = {4,3,2,6};
        connectnropes(arr);


    }
    static void connectnropes(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int res  = 0;
        while(pq.size() > 1){
            int fristrope =  pq.poll();
            int secondrope = pq.poll();
            res = res + fristrope + secondrope;
            pq.add(fristrope + secondrope);
        }
        System.out.println(res);
    }
}
