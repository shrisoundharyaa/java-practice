package kk_youtube.file.patterns;
import java.util.*;
public class pat6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<2 *n;i++){
            int cols = i > n? 2 * n - i : i;
            int space = n - cols;
            for(int k = 0; k< space;k++){
                System.out.print(" ");
            }
            for(int j=0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
    
}
