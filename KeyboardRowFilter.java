import java.util.*;

public class KeyboardRowFilter {
    public static List<String> filterWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            String row = "";

            if (row1.indexOf(lower.charAt(0)) != -1) row = row1;
            else if (row2.indexOf(lower.charAt(0)) != -1) row = row2;
            else row = row3;

            boolean valid = true;
            for (char c : lower.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }
            if (valid) result.add(word);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"dad", "quiz", "type", "pop", "gas"};
        System.out.println("Valid words: " + filterWords(words));
    }
    
}
