import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouper {
    
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"bat", "tab", "tap", "pat", "cat"};
        List<List<String>> result = groupAnagrams(words);
        System.out.println("Grouped Anagrams: " + result);
    }
    
}
