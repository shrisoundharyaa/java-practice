package recursion;

public class factorial {
         
        public static void main(String[] args){
            System.out.println(fact2(5));
            System.out.println(fact1(5));
        }
        static int fact1(int n){
            if(n == 0){
                return 1;
            }
            return n * fact1(n - 1);
         }

        static int fact2(int n){
            int dp[] = new int [n +  1];
            dp[0] = 1;
            for(int i=1;i<=n;i++){
                /*
                 i = 1; i<= 5
                 dp[1] = 1 * dp[5 - 1] = 1 * dp[4]
                 */
               dp[i] = i * fact2(n - 1);
            }
            return dp[n];
        }
}
