public class missingNum {

    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;  // Sum of 1 to n
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return total - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; 
        int n = 8;
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }
}