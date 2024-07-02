public class recfac {
    public static int fac(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fac_nm1=fac(n-1);
        int fact_n = n*fac_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int n=5;
        int a=fac(n);
        System.out.println(a);
    }

}
