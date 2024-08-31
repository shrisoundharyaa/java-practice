import java.util.Scanner;

class  Calculator{
    public int add(int n1,int n2){
        int r = n1 + n2;
      return r;

    }
}



class Co {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        Calculator calc = new Calculator();
        int result =  calc.add(num1,num2);
        System.out.println(result);

  scan.close();
    }
}
