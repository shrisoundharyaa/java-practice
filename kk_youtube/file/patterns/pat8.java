package kk_youtube.file.patterns;
import java.util.*;
public class pat8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=2 *n - 1;i++){
            int c = i > n ? 2 * n - i:i;
          
            for(int spc = 0; spc < n - c;spc++){
                System.out.print("  ");
            }
           for(int j = c; j>=1;j--){
            System.out.print(j + " ");
           }
           for(int j = 2;j <=c;j++){
            System.out.print(j + " ");
           }
           System.out.println();
        }
        in.close();
    }
    
}
