package Day6;
public class traingle01 {
    int n=1;
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                int r=i+j;
                if(r%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

}
