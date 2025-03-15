package kk_youtube.file.binaryseaarch;

class Solution {
    int transitionPoint(int arr[]) {
       
        int ans = binarysearch(arr, 1,true);
        return ans;
    }
     int binarysearch(int[] arr,int t, boolean fristindex){
        int ans = -1;
        int start =0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start +(end - start)/2;;
            if(t > arr[mid]) start = mid + 1;
            else if(t < arr[mid]) end = mid + 1;
            else{
                ans = mid;
                if(fristindex) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}

//another 
class solution {
    int transitionPoint(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;  // Default value if no transition point is found
        
        // Handle edge cases
        if (arr[0] == 1) return 0;  // First element is 1 → transition at index 0
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Check if mid is the first occurrence of 1
            if (arr[mid] == 1) {
                ans = mid;
                end = mid - 1;  // Search the left half for an earlier occurrence
            } 
            else {
                start = mid + 1;  // Move right if arr[mid] == 0
            }
        }
        return ans;  // Will be -1 if no 1s are found
    }
}
