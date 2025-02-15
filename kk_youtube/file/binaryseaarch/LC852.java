//brute force
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        int max =  0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max ){
                max = arr[i];
                peak = i;
            }
        }
        return peak;
    }
}



//optimized solution using binary search
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
             int start =0;
             int end = arr.length - 1;
             while(start < end ){
                int mid = start + (end - start) / 2;
                if(arr[mid] >arr[mid + 1]){//the number in des order
                    end = mid;
             }
             else{
                start = mid + 1; // it lise in asen order
             }
        }
        return start;//return start or end anything.
    }
}