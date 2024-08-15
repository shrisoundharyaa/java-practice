// integert to hexadecimal and octal

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String hexadecimal = Integer.toHexString(number).toUpperCase();
        String oct = Integer.toOctalString(number);
        System.out.println(hexadecimal);
        System.out.println(oct);
    }
}

