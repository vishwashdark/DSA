public class selectionsort {
    
    // Method to print the array
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();  // Add a newline at the end for better readability
    }
    
    // Main method
    public static void main(String[] args) {
        int[] a = {7, 8, 3, 2, 1};
        
        // Selection sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }
        
        // Print the sorted array
        printArray(a);
    }
}
