package kk_youtube.file.binaryseaarch;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
class Solution {
    public boolean search(int[]arr, int target) {
        int pivot = findpivot(arr);
        if(pivot == -1){
            return binarysearch(arr,target,0,arr.length - 1);
        }
        if(arr[pivot] == target){
            return true;
        }
        if(target >= arr[0] )  return binarysearch(arr,target,0,pivot - 1);
       
        return binarysearch(arr,target,pivot + 1,arr.length - 1);
    }
    int findpivot(int[] arr){
        int start = 0;
        int end =arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] >arr[mid + 1]) return mid;
            if(mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if(arr[start] ==  arr[mid] && arr[end] ==arr[mid]){
                if(arr[start] > arr[start + 1]) return start;
            
            start++;
                if(arr[end] < arr[end - 1]) return end - 1;
            end--;
            }
            else if(arr[start] > arr[mid] || arr[start] == arr[mid] && arr[mid] < arr[end] ) end  = mid - 1;
            else start = mid + 1;

        }
        return -1;
    }
    boolean binarysearch(int[]arr,int t,int start,int end){
        while(start <= end){
              int mid = start + (end - start) / 2;
               if(t >arr[mid]) start = mid + 1;
               else if(t <arr[mid]) end = mid - 1;
               else return true;

        }
        return false;
    }
}