import java.util.*;
public class Day8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int [] marks = new int[10];
        for(int i=0;i<size;i++){
            int n=0;
            System.out.println("Enter the marks");
            n=sc.nextInt();
            marks[i]=n;
        }
        System.out.println("what number you finding");
        int x=sc.nextInt();
        for(int i=0;i<size;i++){
            if(marks[i]==x){
                System.out.println(i);
            }
        }
    }
}
