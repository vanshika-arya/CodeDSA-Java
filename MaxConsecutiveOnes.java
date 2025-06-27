public class MaxConsecutiveOnes {
     public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zeroCount = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeroCount++;

            while (zeroCount > 1) {
                if (nums[left] == 0)
                    zeroCount--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    
}
