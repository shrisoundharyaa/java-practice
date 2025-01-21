package kk_youtube.file;
import java.util.*;

public class stable {
    static boolean isstable(int n){
               int temp = n;
               int[] freq = new int[10];
                while(temp>0){
                    int rem = temp%10;
                    freq[rem]++;
                    temp = temp/10;

                }
              int commonfreq =0;
              for(int i=0;i<freq.length;i++){
                if(freq[i] > 0){
                    commonfreq = freq[i];
                    break;
                }
                
              }

              for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                 if(freq[i] != commonfreq){
                    return false;
                  }
                }

                
              }
              return true;
               
    }
    public static void main(String[] arg){
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] arr = new int[n];
           for(int i=0;i<n;i++){
               arr[i] = in.nextInt();
           }
           int stable=0;
           int unstable = 0;
           for(int i=0;i<arr.length;i++){
                 if(isstable(arr[i])){
                    stable += arr[i];
                 }
                 else{
                    unstable += arr[i];
                 }
           }

           int result = stable - unstable;
           System.out.println(result);
           in.close();
    }
}
