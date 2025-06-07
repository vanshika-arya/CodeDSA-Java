import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class streamApi {
    public static void main(String[] args) {
        
        List <Integer> list= Arrays.asList(10,30,87,6);
        List <Integer> evenlist=list.stream()
                                .filter(n-> n%2==0)
                              .map(n->n*5)
                                .collect(Collectors.toList());
                  System.out.println(evenlist);   
    } 
    
    
}
