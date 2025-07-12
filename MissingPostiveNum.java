import java.util.HashSet;
public class MissingPostiveNum {
    
    
    public static int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }

        int smallest = 1;
        while (true) {
            if (!set.contains(smallest)) {
                return smallest;
            }
            smallest++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int missing = firstMissingPositive(arr);
        System.out.println("First missing positive: " + missing);
    }
}