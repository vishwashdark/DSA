package Day3;
import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height of your recantgle");
        int a = sc.nextInt();
        System.out.println("Enter the Width of your recantgle");
        int b= sc.nextInt();
        for(int i = 1; i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || j==1 || i==a || j== b){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
