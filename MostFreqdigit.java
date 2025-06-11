public class MostFreqdigit {
    public static void main(String[] args) {
        int[] arr = {12, 121, 34, 56};
        int[] digitFreq = new int[10];

        for (int num : arr) {
            while (num > 0) {
                int digit = num % 10;
                digitFreq[digit]++;
                num /= 10;
            }
        }

        int maxDigit = 0;
        for (int i = 1; i < 10; i++) {
            if (digitFreq[i] > digitFreq[maxDigit]) {
                maxDigit = i;
            }
        }

        System.out.println("Most frequent digit: " + maxDigit);
    }
}
