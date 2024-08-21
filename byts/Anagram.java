package byts;

import java.util.Scanner;
import java.util.Arrays; // Import the Arrays class for sorting and comparison

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If the lengths are not the same, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        // Sort the character arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Compare sorted arrays
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}

//other way
// static boolean isAnagram(String a, String b) {
//     a= a.replaceAll("\\s","").toLowerCase();
//     b= b.replaceAll("\\s","").toLowerCase();
//     if(a.length()!=b.length()){
//         return false;
//     }
//     for (int i=0;i<a.length();i++){
//         int ca=0;
//         int cb=0;
//         for(int j=0;j<a.length();j++){
//             if(a.charAt(i)==a.charAt(j)){
//                 ca++;
//             }
//             if(a.charAt(i)==b.charAt(j)){
//                 cb++;
//             }
//         }
//         if(ca==cb){
//             continue;
//         }
//         return false;
//     }
//     return true;
// }
