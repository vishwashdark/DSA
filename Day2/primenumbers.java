import java.util.*;
public class primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
            }
            else{
                System.out.println("prime");
            }
        }

    }
}
