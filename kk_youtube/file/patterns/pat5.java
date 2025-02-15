package kk_youtube.file.patterns;
import java.util.*;
public class pat5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for(int i = 0;i<n;i++){
        //       for(int j= 0;j<=i;j++){
        //         System.out.print("*");
        //       }
        //       System.out.println();
        //     }
        //     for(int i = 0;i<n;i++){
        //         for(int j = n - 1;j > i;j--){
        //           System.out.print("*");
        //         }
        //         System.out.println();
        //       }
              for(int i = 1;i< 2 * n;i++){
                int cols = i > n ? 2 * n - i  : i;
                for(int j = 1;j<=cols;j++){
                  System.out.print("*");
                }
                System.out.println();
              }
              in.close();

        }
       
    
}
