import java.util.*;
import java.util.stream.*;

public class FreqOfWords {
     public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> frequency = words.stream()
                                           .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        frequency.forEach((word, count) -> System.out.println(word + " -> " + count));
     }
}

