import java.util.Scanner;
import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    
}
