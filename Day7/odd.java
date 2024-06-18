public class odd {
    public static void ODD(int a){
        for(int i=0;i<=a;i++){
            if(i%2!=0){
                System.out.print(i);
            }
            else{
                System.out.print("");
            }
        }
    }
    public static void main(String[] args) {
        ODD(9);
    }

}
