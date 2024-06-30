import java.util.*;
public class name_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        String [] name= new String[size];
        for(int i=0;i<size;i++){
            System.out.println("enter the name");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<size;i++){
            System.out.println(name[i]);
        }

    }
}
