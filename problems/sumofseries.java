package problems;


class sumofseries {
    public static long seriesSum(int n) {
       long sum =0;
       for(int i=1;i<=n;i++){
           sum += i;
       }
       return sum;
    }
}
