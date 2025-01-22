package kk_youtube.file.binaryseaarch;

public class agnostic {
    public static void main(String[] args){
        // int[] arr = {2,45,67,89,90,234,678};
        int[] arr = {345,67,34,24,22,11};
         int target = 24;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[] arr,int t){   
        int start = 0;
        int end = arr.length - 1;
        boolean asec = arr[start] < arr[end];
        while(start <= end){
            // int mid = (start + end) / 2;
            //betterway to find mid reason in note
            int mid = start + (end - start) / 2;

        if(arr[mid] == t){
                return mid;
            }


        if(asec){
                  if(t > arr[mid]){
                  start = mid + 1;
                }
                   else {
                  end = mid - 1;
            }
        }

        else{
            if(t > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        }
        return -1;
    }
}
