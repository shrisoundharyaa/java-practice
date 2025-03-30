public class Sqrt {
    
}
///using linear search
class Solution {
    int floorSqrt(int n) {
        int ans = 1;
        for(int i=0;i<=n;i++){
            if(i * i <= n){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
}

//binary search 
// x: element to find square root
class Solution {
    int floorSqrt(int n) {
       int start = 1;
       int end = n;
       while(start <= end){
           int mid = start + (end - start) / 2;
           if(mid * mid == n) return mid;
           if(mid * mid >= n){
               end = mid - 1;
           }
           else{
               start = mid + 1;
           }
          
            }
       return end;
    }
}