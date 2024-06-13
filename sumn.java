import java.util.*;
public class sumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int a = sc.nextInt();
        int d=0;
        for(int i=0;i<a;i++){
            d=d+i;
            System.out.println(d);
        }
    }

}
