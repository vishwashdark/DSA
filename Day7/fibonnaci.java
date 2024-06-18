public class fibonnaci {
    public static void fibonnaci_number(int a){
        int n=0;
        int q=1;
        for(int i=0;i<=a;i++){
            System.out.print(q+" ");
            int temp = q;
            q=n+q;
            n=temp;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        fibonnaci_number(5);
    }
}
