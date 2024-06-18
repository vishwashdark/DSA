import java.util.*;
public class Functions {
    public static void printname(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        printname(a);
        sc.close();
    }

}
