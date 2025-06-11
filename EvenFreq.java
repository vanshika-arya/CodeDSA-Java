 import java.util.*;
public class EvenFreq {
    public static void main(String[] args) {
        String s = "aabbccd";
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int count = 0;
        for (int f : freq) {
            if (f > 0 && f % 2 == 0) {
                count++;
            }
        }

        System.out.println("Characters with even frequency: " + count);
    }
}
    
    

