import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number a");
        int a = sc.nextInt();
        System.out.println("enter number b");
        int b = sc.nextInt();
        System.out.println("What do you wanna do Press");
        System.out.println("1 for addition");
        System.out.println("2 for multiplication");
        System.out.println("3 for division ");
        System.out.println("4 for subraction");
        int c= sc.nextInt();
        switch(c){
            case 1: System.out.println("addition"+(a+b));
            break;
            case 2: System.out.println("multiplication"+(a*b));
            break;
            case 3: System.out.println("Division"+a/b);
            break;
            case 4: System.out.println("subraction"+(a-b));
            default: System.out.println("wrong input");
        }
    }
}
