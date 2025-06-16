import java.util.Arrays;

public class Min_MaxForm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] res = new int[arr.length];
        int start = 0, end = arr.length - 1, i = 0;

        while (start <= end) {
            if (i % 2 == 0) res[i++] = arr[end--];
            else res[i++] = arr[start++];
        }

        System.out.println("Rearranged array:");
        System.out.println(Arrays.toString(res));
    }
    
}
