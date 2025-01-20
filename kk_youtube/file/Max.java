package kk_youtube.file;

public class Max {
    public static void main(String[] args){
        int[] arr = {1, 2, 34, 52};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxx = arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i] > maxx){
            maxx = arr[i];
        }
       }
       return maxx;
    }
}
