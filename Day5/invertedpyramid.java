package Day5;
public class invertedpyramid {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) { // Change condition to i >= 1
            for (int j = 1; j < i; j++) { // Change inner loop to print decreasing number of elements
                System.out.print(j); // Using * to represent the pyramid shape
            }
            System.out.println(); // New line after each row
        }
    }
}
