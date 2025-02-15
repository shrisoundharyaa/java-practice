package kk_youtube.file.patterns;
import java.util.*;
public class pat7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            for(int spc = 0;spc< n - i;spc++){
                System.out.print("  ");
            }
            for(int j = i;j > 0;j--){
                System.out.print(j + " ");
            }
            for(int j = 2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
