package kk_youtube.file.linearsearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
class Solution {
 
    static boolean iseven(int n){
          int temp =n;
          int cnt = 0;
          while(temp > 0){
            cnt++;
            temp = temp/10;
          }
          if(cnt%2==0){
            return true;
          }
          return false;
    }
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
              if(iseven(nums[i])){
                count++;
              }
        }
        return count;
    }
}