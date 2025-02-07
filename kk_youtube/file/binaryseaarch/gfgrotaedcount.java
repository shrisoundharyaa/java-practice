package kk_youtube.file.binaryseaarch;
//https://www.geeksforgeeks.org/problems/rotation4723/1?itm_source=geeksforgeeks
import java.util.*;

class Solution {
    public int findKRotation(List<Integer> arr) {
        int pivot = findpivot(arr);
        
        return pivot;
        
        
    }
    int findpivot(List<Integer> arr){
        int start = 0;
        int end = arr.size() - 1;
        while(start < end ){
            int mid = start + (end - start) / 2;
            if(mid < end && arr.get(mid) > arr.get(mid + 1)) return mid + 1;
            if(mid > start && arr.get(mid) < arr.get(mid - 1)) return mid;
            if(arr.get(0) >= arr.get(mid)) end = mid - 1;
            else start = mid + 1;
        }
        return 0;
    }
}
