package level1;
import java.util.*;

public class Temperatureprecsion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double cel = scan.nextDouble();

        double faher = (cel * 9/5) + 32;
          System.out.println(faher);
    }
}
