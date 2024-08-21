package byts;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        // Reverse the string
        String reverse = new StringBuilder(A).reverse().toString();
        
        // Compare original string with the reversed string
        if (A.equals(reverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
