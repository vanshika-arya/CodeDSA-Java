public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        char[] arr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    System.out.println("" + arr[i] + arr[j] + arr[k]);
                }
            }
        }
    }
}


       