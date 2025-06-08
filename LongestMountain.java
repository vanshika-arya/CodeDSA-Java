public class LongestMountain {
   public static int longestMountain(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            // Check if current is peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                int right = i + 1;

                // Go left (strictly increasing)
                while (left > 0 && arr[left - 1] < arr[left]) {
                    left--;
                }

                // Go right (strictly decreasing)
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                }

                i = right; // optimization to skip already counted part
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        System.out.println("Longest mountain length: " + longestMountain(arr)); // Output: 5
    }
}