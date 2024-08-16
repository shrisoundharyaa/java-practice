class question{
    static int x = 10;
    static{
        System.out.println(x);
        m1();
    }
    public static void main(String[] args){
        m1();
         System.out.println("main");
    }

    public static void m1(){
        System.out.println(y);
    }
    static{
        System.out.println("ssd");
    }
    static int  y = 20;
    
}