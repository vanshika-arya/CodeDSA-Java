import java.util.Stack;

public class CheckParanthesis {
     public static void main(String[] args) {
        String str = "(()())";

        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // more closing than opening
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // true if all matched
    }
}
