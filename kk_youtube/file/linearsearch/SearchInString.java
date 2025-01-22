package kk_youtube.file.linearsearch;
import java.util.*;

public class SearchInString {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       char target = in.next().charAt(0);
        System.out.println(search2(str,target));
        in.close();
    }
    static boolean search(String str,char t){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(t == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
//enhanced for loop
    static boolean search2(String str,char t){
        if(str.length()==0){
            return false;
        }
        for(char i:str.toCharArray()){
            if(i==t){
                return false;
            }
        }
        return false;
    }
}
