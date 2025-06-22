public class LengthOFLongestHill {
     public static int longestHill(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 1; i < n - 1; i++) {
            
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i;
                int right = i;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int len = right - left + 1;
                if (len >= 3) {
                    maxLen = Math.max(maxLen, len);
                }
                i = right;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 7, 3, 2, 5};
        int res = longestHill(arr);
        System.out.println("Longest hill length = " + res);
    }
    
}
