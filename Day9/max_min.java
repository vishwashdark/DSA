package Day9;
public class max_min {
    public static void main(String[] args) {
        int [] a = {5, 3, 2, 6, 1, 10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
            if(a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.println("max value: " + max);
        System.out.println("min value: " + min);
    }
}
