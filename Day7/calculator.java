
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class calculator {
    public static void add(int a,int b){
        int c=0;
        c=a+b;
        System.out.println("addition of two number is"+c);
        return;
    }
    public static void subract(int a,int b){
        int c=0;
        c=a-b;
        System.out.println("Subraction of two number is"+c);
        return;
    }
    public static void product(int a,int b){
        int c=0;
        c=a*b;
        System.out.println("multiplication of two numbers"+c);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a");
        int a =sc.nextInt();
        System.out.println("Enter number b");
        int b= sc.nextInt();
        System.out.println("What do you wanna do ");
        System.out.println("1. for addition");
        System.out.println("2. subraction");
        System.out.println("3 for multiplication");
        System.out.println("enter your choice");
        int c= sc.nextInt();
        if(c==1){
            add(a,b);
        }
        else if(c==3){
            product(a, b);
        }
        else{
            subract(a,b);
        }
    }

}
