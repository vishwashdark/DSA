import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows=sc.nextInt();
        System.out.println("enter columns");
        int cols=sc.nextInt();
        int [][] num = new int[rows][cols];
        int x = 4;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("enter the array value");
                num[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(num[i][j]==x){
                    System.out.println(i+""+j);
                }
                System.out.println(num[i][j]);
            }
        }
    }
}
