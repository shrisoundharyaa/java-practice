package kk_youtube.file.binaryseaarch;
import java.util.* ;
import java.io.*; 

 class ceilfloor {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
         int flo = floor(a,x,n);
         int cei = ceil(a,x,n);
         return new int[] {flo,cei};
    }
   
     static int floor(int[] arr,int x,int n){
          int start = 0;
          int end = n - 1;
          int ans = -1;
          while(start <= end ){
              int mid = start + (end - start) / 2;
              if(arr[mid] == x) return arr[mid];
              if(x > arr[mid]) {
                  ans = arr[mid];
                  start = mid + 1;
              }
              else{
                  end = mid - 1;
              }
          }
          return ans;
    }
     static int ceil(int[] arr,int x,int n){
          int start = 0;
          int end = n - 1;
          int ans = -1;
          while(start <= end ){
              int mid = start + (end - start) / 2;
              if(arr[mid] == x) return arr[mid];
              if(x < arr[mid]) {
                  ans = arr[mid];
                  end = mid - 1;
              }
              else{
                  start = mid + 1;
              }
          }
          return ans;
    }
}