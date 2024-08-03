// import java.util.Scanner;

// class array{
//     public static void main(String args[]){
//      int[] scores  = new int[5];
//      Scanner scan = new Scanner(System.in);
//      scores[0] = scan.nextInt();
//      scores[1] = scan.nextInt();
//      scores[2] = scan.nextInt();
//      scores[3] = scan.nextInt();
//      scores[4] = scan.nextInt();
     

//      System.out.println(scores[0]+scores[1]+scores[2]+scores[3]+scores[4]);
//     }
// }

import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        for(int i=0;i<5;i++){
            num[i]= scan.nextInt();

        }
        for(int i=0;i<5;i++){
            System.out.println(num[i]);
        }
    }
}