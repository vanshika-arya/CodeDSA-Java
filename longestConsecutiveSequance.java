import java.util.*;
public class longestConsecutiveSequance {
    public static int longestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);

        int maxLen = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Sequence Length: " + longestSequence(arr));
    }
}

    

