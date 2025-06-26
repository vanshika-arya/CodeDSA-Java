import java.util.*;
public class NxtGrtElement {
    public static int[] nextGreater(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] ans = nextGreater(arr);

        System.out.print("Next Greater Elements: ");
        for (int num : ans)
            System.out.print(num + " ");
    }
}
