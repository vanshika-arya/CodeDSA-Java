public class MajorityElement {
    public static int findMajority(int[] nums) {
        int count = 0;
        int candidate = -1;

        // Phase 1: Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = findMajority(arr);
        if (result != -1)
            System.out.println("Majority element is: " + result);
        else
            System.out.println("No majority element found.");
    }
}
