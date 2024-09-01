package level1;
import java.util.Scanner;

public class Numabsolute {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        double absolutenum = Math.abs(num);
        
        System.out.println(absolutenum);
        int cast =(int)absolutenum;
        System.out.println(cast);
        
    }
}
