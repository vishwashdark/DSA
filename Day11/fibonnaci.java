public class fibonnaci {
    public static void fib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c =a+b;
        System.out.println(c);
        fib(b,c,n-1);
    }
    public static void main(String[] args) {
        fib(0,1,5);
    }

}
