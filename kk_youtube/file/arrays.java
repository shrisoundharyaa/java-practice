package kk_youtube.file;
import java.util.*;

public class arrays {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         //array of primitives
         int n = scan.nextInt();
         
         int[] arr = new int[n];

         for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
         }

         for(int i=0;i<arr.length;i++){
            System.out.print( + arr[i]+ " ");
         }
         //enhaced for loop
         for(int i : arr){   //for every element in the array , print the element
            System.out.print(i + " ");//here i represents the elemrnt of the array 
         }

         System.out.println(Arrays.toString(arr));
         
         
         //array of object
         String[] str = new String[2];

         for(int i=0;i<str.length;i++){
            str[i] = scan.next();
         }

        
           System.out.println(Arrays.toString(str));
         





         scan.close();
    }
    
}
