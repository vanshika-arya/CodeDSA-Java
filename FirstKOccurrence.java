public class FirstKOccurrence {
    public static int firstElementToOccurKTimes(int[] arr, int k) {
        int[] freq = new int[10001]; 
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

            if (freq[arr[i]] == k) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        System.out.println("First element to occur " + k + " times: " + firstElementToOccurKTimes(arr, k));
    }
}
