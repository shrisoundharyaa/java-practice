package kk_youtube.file.patterns;
import java.util.*;
public class pat3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = n;j >i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();

    }
    
}
