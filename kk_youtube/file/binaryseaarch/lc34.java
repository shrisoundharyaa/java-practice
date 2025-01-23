package kk_youtube.file.binaryseaarch;

// public class lc34 {
    
// }
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
         ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public  int search(int[] nums, int t,boolean findindexstart){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            // int mid = (start + end) / 2;
            //betterway to find mid reason in note
            int mid = start + (end - start) / 2;
            if(t > nums[mid]){
               start = mid + 1;
            }
            else if(t < nums[mid]){
                end = mid - 1;
            }
            else{
               ans = mid;
               if(findindexstart){
                     end = mid - 1;
               }
               else{
                start = mid + 1;
               }
            }
        }
        return ans;
    } 
}
