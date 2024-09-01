package level1;
import java.util.*;

public class EMI {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     double principal = scan.nextDouble();
     double rate = scan.nextDouble();
     double time = scan.nextDouble();
     rate = rate/(12 * 100);
     time = time * 12;
     double emi = (principal*rate*Math.pow(1 + rate,time))/(Math.pow(1 + rate,time) - 1);
     System.out.println(emi);
    }
}
