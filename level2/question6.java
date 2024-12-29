import java.util.*;
class question6
{
   
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int sum =0;
        
         for(int i=1;i<n;i++){
            if(i%3==0){
                if(i%5!=0) sum +=i;
            }
            else{
                if(i%5==0){
                    if(i%3!=0) sum +=i;
                }
            }
         }
         System.out.println(sum);
	}
}
