package kk_youtube.file;
import java.util.*;
public class Low_up {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if(ch > 'a' && ch < 'z'){
            System.out.println("lowercase");
        }
     else{
        System.out.println("uppercase");
     }

    }
}
