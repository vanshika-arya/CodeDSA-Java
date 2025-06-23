
    import java.util.*;
import java.util.stream.*;
public class UniqueElementsBycollectionFramework {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> unique = list.stream()
                                   .distinct()
                                   .collect(Collectors.toList());

        System.out.println("Unique elements: " + unique);
    }
}
    

