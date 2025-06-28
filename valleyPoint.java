public class valleyPoint {
    public static int countValleys(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 6, 1, 7};
        System.out.println("Valley Points: " + countValleys(arr));
    }
    
}
