public class DuplicateFind {
    
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);
    }

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Step 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Step 2: Find entry point (duplicate)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
    
}
