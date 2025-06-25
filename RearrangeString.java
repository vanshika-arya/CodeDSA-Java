 import java.util.*;
public class RearrangeString {
    public static void main(String[] args) {
        String str = "aaabbc";
        String result = rearrange(str);
        System.out.println(result.isEmpty() ? "Not possible" : result);
    }

    public static String rearrange(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) freq[c - 'a']++;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) pq.add(new int[]{i, freq[i]});
        }

        StringBuilder sb = new StringBuilder();
        int[] prev = {-1, 0};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            sb.append((char) (curr[0] + 'a'));

            if (prev[1] > 0) pq.add(prev);

            curr[1]--;
            prev = curr;
        }

        return sb.length() == str.length() ? sb.toString() : "";
    }
}

    

