public class PeakPointCount {
    public static int countPeaks(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 1, 5, 3};
        System.out.println("Peak Points: " + countPeaks(arr));
    }
}
