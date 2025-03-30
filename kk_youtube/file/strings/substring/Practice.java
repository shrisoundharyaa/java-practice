import java.util.*;
public class Practice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        // String p =" ";
        System.out.println(skipappNotapple(s));
    }
    //with return type
    static String skip(String up){
        if(up.isEmpty()){
            return " ";

        }
        char ch = up.charAt(0);
        if(ch == 'a') return skip(up.substring(1));
        
        else return ch + skip(up.substring(1));
    }
    //without return type
    static void skip( String p ,String up){
        if(up.isEmpty()){
           System.out.println(p);
           return;

        }
        char ch = up.charAt(0);
        if(ch == 'a') skip(p ,up.substring(1));
        
        else  skip(p  + ch,up.substring(1));
    }
    
    //skip a string
    static String skipapple(String up){
        if(up.isEmpty()){
            return " ";

        }
       
        if(up.startsWith("apple")) return skipapple(up.substring(5));
        
        else return up.charAt(0) + skipapple(up.substring(1));
    }

    static String skipappNotapple(String up){
        if(up.isEmpty()){
            return " ";

        }
       
        if(up.startsWith("app") && !up.startsWith("apple")) return skipappNotapple(up.substring(3));
        
        else return up.charAt(0) + skipappNotapple(up.substring(1));
    }
}
