package kk_youtube.file.patterns;
import java.util.*;
public class pat9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int originalN = n;
         n = 2 * n - 1;
        for(int row=0; row<n ;row++){
            for(int col=0; col<n ;col++){
                int everyindex = originalN - Math.min(Math.min(row,col),Math.min(n - col - 1,n - row - 1));
                System.out.print(everyindex + " ");
            }
            System.out.println();
        }
      in.close();
    }
    
}
