package kk_youtube.file.bit_manipilation;

import java.util.Scanner;

public class Magicnumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            ans += last * base;
            base = base * 5;
            n = n >> 1; // if 1 1 0 means its discard 0  and next iteration 1 will discard
        }
        System.out.println(ans);
        scan.close();
    }
}
