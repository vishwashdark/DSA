public class naturals {
    public static void nnaturals(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        nnaturals(i+1, n, sum);
    }
    public static void main(String[] args) {
        nnaturals(1, 5, 0);
    }
}
