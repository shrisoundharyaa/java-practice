package practice;
import java.util.Scanner;

class practice{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
      String name = scan.nextLine();
      double score = scan.nextDouble();
      scan.nextLine();
      String depart = scan.nextLine();
      System.out.println("my name is "+name);
      System.out.println("my scaore is "+score/10 +"/10");
      System.out.println("my department is "+depart);
    }
}