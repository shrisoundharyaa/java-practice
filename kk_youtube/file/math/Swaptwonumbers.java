package kk_youtube.file.math;
// https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1
import java.util.*;
public class Swaptwonumbers {
   

}

class Solution{
    static List<Integer> get(int a,int b)
    {     //if imagine we too a = 5 , b = 6
        a = a ^ b; //here a = 5 -> 101 ^ 6 -> 110 = 011 -> 3; so , now a = 3;
        b = a ^ b; //here b = 3 -> 011 ^ 6 -> 110 = 101 -> 5; so ,now b = 5;
        a = a ^ b; //here  a = 3 -> 011 ^ 5 -> 101 = 6 -> 110; so , now a = 6;
          return Arrays.asList(a, b); // to print as list we use Arrays.asList(a,b);
    } public static void main(String[] args) {
        System.out.println(get(3, 5)); // Example test case
    }
}