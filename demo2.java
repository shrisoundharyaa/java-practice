// public class demo2 {
//     public static void main(String args[]){
//         int num = 23;
//         if(num>35){
//             System.out.println("num grater than 35");
//         }
//         else{
//             System.out.println("num is less than 35");
//         }
//     }
// }

// pr-2
// import java .util.Scanner;
// public class demo2{
//     public static void main(String args[]){
//       Scanner scan = new Scanner(System.in);
//       String meghna = scan.nextLine();
//       if(meghna.equals("dead")){
//         System.out.println("surya meets ramya");
//       }
//       else{
//         System.out.println("surya weds meghna");
//       }

// }

// // pr-3

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int income = scan.nextInt();
//         if(income>7000){
//             System.out.println("eligible for scholorship");
//         }
//         else{
//             System.out.println("Not eligible for scholorship");
//         }
//     }
// }

// pr-4

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
        
//         if((num%3==0) && (num%5==0)){
//             System.out.println("num divisible by 3 and 5");

//         }
//         else{
//             System.out.println("number is not divisible by 3 and 5");
//         }
//     }
// }

// 
// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         if(num%2==0){
//             System.out.println("divisible by 2");
//         }
//         else{
//             System.out.println("not divisible by 2");
//         }
//     }
// }

// import java.util.Scanner;
// class demo2{
//     public static void main (String args[]){
//         Scanner scan = new Scanner(System.in);
//         int score = scan.nextInt();
//         if(score<50){
//             System.out.println("you need to improve");
//         }
//         else if(score>=50 && score<=70){
//             System.out.println("good job!");
//         }
//         else if(score>70){
//             System.out.println("excellent");
//         }
//     }
// }

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//        int num3 = scan.nextInt();
//        int num4 = scan.nextInt();
//        int num5 = scan.nextInt();
//        int avg = (num1+num2+num3+num4+num5) / 5;
//        if(avg<35){
//         System.out.println("Additional class required");
//        }
//        else{
//         System.out.println("you are good to go");
//        }
//     }
// }

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         String word = scan.nextLine();
//         if(word.equals("red")){
//                 System.out.println("Stop");
//         }
//         else if(word.equals("yellow")){
//             System.out.println("Get ready");
//         }
//         else{
//             System.out.println("Go");
//         }
//     }
// }

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int salary = scan.nextInt();
//         int age = scan.nextInt();
       
//         if(salary>=20000 || age<=25){
//             System.out.println("eligible for loan")
//             int loanamt = scan.nextInt();
//            if(loanamt<=50000){
//             System.out.println(" loan available");
//            }
//            else{
//             System.out.println("maximun loan amount is 50000");
//            }
//         }
//         else{
//             System.out.println("you are not eligible for loan");
//         }
//     }
// }
// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]) {
//         Scanner scan = new Scanner(System.in);
//         int num1 = scan.nextInt();
//         int num2  = scan.nextInt();
//         System.out.println(num1>num2?"num1 grater than num2":"num2 greater than num1");
//     }
// }
// import java.util.Scanner;
// class demo2{
//     public static void main (String args[]){
//           Scanner scan = new Scanner(System.in);
//           int num = scan.nextInt();
//           for(int i=num;i>=1;i--){
//             System.out.println(i);
//           }  
//     }
// }

// import java.util.Scanner;
// class demo2{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int start = scan.nextInt();
//         int end = scan.nextInt();
//         int evencount =0;
//         int oddcount =0;
//         for(int i = start;i<=end;i++){
//             if(i%2==0){
//              evencount++;
//         }
//         else{
//             oddcount++;
//         }
//     }
//     System.out.println("Even count: "+evencount);
//     System.out.println("Odd number count: "+oddcount);
//     }
// }

import java.util.Scanner;
class demo2{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("number divisible by 3 and 5 : "+i);
            }
        }
    }
}