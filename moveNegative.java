public class moveNegative {
    public static void main(String[] args) {
        
    
        int[] arr = {1, -2, 3, -4, -1, 5, -6};
        int n = arr.length;

        // Temporary array to store result
        int[] temp = new int[n];
        int index = 0;

        // First add negative numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Then add positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    

