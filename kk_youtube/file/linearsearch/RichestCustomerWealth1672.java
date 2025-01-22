package kk_youtube.file.linearsearch;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth1672 {
    
}
// class Solution {
//     static int sum(int[] n){
//         int total =0;
//              for(int i=0;i<n.length;i++){
//                      total += n[i];
//              }
//              return total;
//     }
//     public int maximumWealth(int[][] accounts) {
//         int[] arr = new int[accounts.length];
//         for(int i=0;i<accounts.length;i++){
//              arr[i] = sum(accounts[i]);
//             }
//         int max = 0;
//         for(int i=0;i<arr.length;i++){
//                 if(arr[i] > max){
//                     max = arr[i];
//                 }
//         }

//         return max;

//     }
// }

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0; // Variable to store the maximum wealth
        
        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0; // To calculate the wealth of the current customer
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j]; // Add wealth from each bank
            }
            maxWealth = Math.max(maxWealth, currentWealth); // Update max wealth
        }
        
        return maxWealth; // Return the maximum wealth found
    }
}
