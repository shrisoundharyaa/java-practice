package kk_youtube.file.binaryseaarch;

public class Lc702similar {
    public static void main(String[] args){
    int [] arr ={2,4,5,6,7,89,90,95,100,120,134,234,255,278,289,300,345,354,367,388,399,400,456,500,554};
    int target = 120;
   System.out.println(ans(arr,target));

}
     static int  ans(int[] arr,int t){
          int start =0;
          int end = 1;
          while(t > arr[end]){
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            //check the array not index of bound 
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
            start =  newstart;
          }
          return search(arr,t,start,end);
     }
     static int search(int[] arr,int t, int start,int end){
               while(start<=end){
                  int mid = start + (end - start) / 2;
                  if(t > arr[mid]){
                    start = mid + 1;
                  }
                  else if(t<arr[mid]){
                    end = mid - 1;
                  }
                  else{
                    return mid;
                  }
               }
               return start;
     }
}