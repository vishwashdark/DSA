package Day6;
public class numbertriangle {
    public static void main(String[] args) {
        int n=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }

}
